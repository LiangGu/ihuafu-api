package x.trident.modular.dwb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;
import x.trident.modular.dwb.entity.DesignRecord;
import x.trident.modular.dwb.model.params.SDTxt2ImgParam;
import x.trident.modular.dwb.model.results.SDTxt2ImgResult;


/**
 * 设计工作台服务类
 *
 * @author Bryan.liang
 * @since 2023-10-08
 */
@Service("DesignWBService")
public interface DesignWBService extends IService<DesignRecord> {

    /**
     * SD 文生图
     * @author Bryan.liang
     * @since 2023/10/08 10:59
     */
    SDTxt2ImgResult txt2Img (SDTxt2ImgParam param);

}
