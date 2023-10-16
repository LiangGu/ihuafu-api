package x.trident.modular.demo;

import org.springframework.web.bind.annotation.RestController;
import x.trident.core.pojo.response.ResponseData;
import x.trident.core.pojo.response.SuccessResponseData;
import x.trident.core.scanner.api.annotation.ApiResource;
import x.trident.core.scanner.api.annotation.GetResource;
import x.trident.core.sequence.api.SequenceApi;

import javax.annotation.Resource;

/**
 * 示例
 *
 * @author 林选伟
 * @date 2022/7/1 16:15
 */
@RestController
@ApiResource(name = "ping-pong")
public class DemoController {
    @Resource
    private SequenceApi sequenceApi;

    @SuppressWarnings("rawtypes")
    @GetResource(name = "这是最简单的测试controller", path = "/ping")
    public ResponseData test() {
        return new SuccessResponseData<String>("pong");
    }

    @SuppressWarnings("rawtypes")
    @GetResource(name = "序号发生器示例", path = "/seq")
    public ResponseData generateSequence() {
        long num = sequenceApi.generate("sequence", false);
        return new SuccessResponseData<Long>(num);
    }
}
