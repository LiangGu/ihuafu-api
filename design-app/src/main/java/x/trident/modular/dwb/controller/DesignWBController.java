package x.trident.modular.dwb.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import x.trident.core.pojo.response.SuccessResponseData;
import x.trident.core.scanner.api.annotation.ApiResource;
import x.trident.core.scanner.api.annotation.PostResource;
import x.trident.modular.dwb.model.params.SDTxt2ImgParam;
import x.trident.modular.dwb.model.results.SDTxt2ImgResult;
import x.trident.modular.dwb.service.DesignWBService;

import javax.annotation.Resource;

/**
 * 设计工作台
 *
 * @author Bryan.liang
 * @since 2023-10-08
 */
@RestController
//@Api(tags = "Design Workbench")
@ApiResource(name = "Design-Workbench")
public class DesignWBController {

    @Resource
    private DesignWBService designWBService;

    /**
     * 文生图 txt2Img
     *
     * @param param param
     * @return ResponseData
     * @author Bryan.liang
     * @since 2023/10/08 10:59
     */
    @ApiOperation("文生图 txt2Img")
    @PostResource(name = "文生图 txt2Img", path = "/txt2Img")
    public SuccessResponseData<SDTxt2ImgResult> queryListPageByKeyword(@RequestBody SDTxt2ImgParam param) {
        SDTxt2ImgResult pageBySpec = designWBService.txt2Img(param);
        return new SuccessResponseData<>(pageBySpec);
    }

}
