package x.trident.modular.dwb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import x.trident.modular.dwb.entity.DwDesignRecord;
import x.trident.modular.dwb.mapper.DwDesignRecordMapper;
import x.trident.modular.dwb.model.params.SDTxt2ImgParam;
import x.trident.modular.dwb.model.results.SDTxt2ImgResult;
import x.trident.modular.dwb.service.DwDesignRecordService;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.Exchanger;

/**
 * <p>
 * 文生图记录表，包括param，页面录入的信息，document，result及记录本身的一些信息 服务实现类
 * </p>
 *
 * @author guyuL
 * @since 2023-10-20 09:05:12
 */
@Service
public class DwDesignRecordServiceImpl extends ServiceImpl<DwDesignRecordMapper, DwDesignRecord> implements DwDesignRecordService {

    // 从配置中读取相关的参数
    @Value("${stable-diffusion.address}")
    private String address;

    @Value("${stable-diffusion.account}")
    private String account;

    @Value("${stable-diffusion.password}")
    private String password;


    // SD 文生图接口路径
    private static final String TXT2IMG_ENDPOINT = "/sdapi/v1/txt2img";

    @Override
    public SDTxt2ImgResult txt2Img(SDTxt2ImgParam param) {
        return sendTxt2ImgRequest(param);
    }

    /**
     * 发送文生图请求
     *
     * @param param 请求的参数
     * @return SDTxt2ImgResult 返回结果
     */
    private SDTxt2ImgResult sendTxt2ImgRequest(SDTxt2ImgParam param) {
        HttpEntity<SDTxt2ImgParam> requestEntity = buildRequestEntity(param);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<SDTxt2ImgResult> response = restTemplate.exchange(address + TXT2IMG_ENDPOINT, HttpMethod.POST, requestEntity, SDTxt2ImgResult.class);
        return response.getBody();
    }

    /**
     * 构建请求实体，可用于不同的请求参数类型
     *
     * @param <T> 要发送的请求体的类型
     * @param body 要发送的请求体对象
     * @return 构建好的请求实体
     */
    private <T> HttpEntity<T> buildRequestEntity(T body) {
        HttpHeaders headers = createHeaders();
        return new HttpEntity<>(body, headers);
    }

    /**
     * 创建请求头，配置basic auth和内容类型
     *
     * @return 已配置的HttpHeaders
     */
    private HttpHeaders createHeaders() {
        String auth = account + ":" + password;
        byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(StandardCharsets.US_ASCII));
        String authHeader = "Basic " + new String(encodedAuth);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", authHeader);

        return headers;
    }
}
