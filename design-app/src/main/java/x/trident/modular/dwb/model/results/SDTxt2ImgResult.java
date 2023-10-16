package x.trident.modular.dwb.model.results;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import x.trident.modular.dwb.model.params.ControlNetParam;

import java.io.Serializable;
import java.util.List;

/**
 * SD文生图返回值类
 *
 * @author Bryan.liang
 * @since 2023-10-08
 */
@Data
@ApiModel
public class SDTxt2ImgResult implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "返回的base64格式的图片字符串数组")
    private List<String> images;

    @ApiModelProperty(value = "输入的body参数")
    private ControlNetParam parameters;

    @ApiModelProperty(value = "返回的图片信息，JSON格式字符串")
    private String info;

}

