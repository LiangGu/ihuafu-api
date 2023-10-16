package x.trident.modular.dwb.model.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * ControlNet参数
 *
 * @author Bryan.liang
 * @since 2023-10-08
 */
@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel
@Accessors(chain = true)
@ToString
public class ControlNetParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "控制模式")
    private Integer control_mode;

    @ApiModelProperty(value = "是否启用")
    private Boolean enabled;

    @ApiModelProperty(value = "指导结束值")
    private Double guidance_end;

    @ApiModelProperty(value = "指导起始值")
    private Double guidance_start;

    @ApiModelProperty(value = "输入图像的base64编码")
    private String input_image;

    @ApiModelProperty(value = "是否低显存模式")
    private Boolean lowvram;

    @ApiModelProperty(value = "使用的模型名称")
    private String model;

    @ApiModelProperty(value = "使用的模块名称")
    private String module;

    @ApiModelProperty(value = "是否像素完美")
    private Boolean pixel_perfect;

    @ApiModelProperty(value = "处理器分辨率")
    private Integer processor_res;

    @ApiModelProperty(value = "调整大小的模式")
    private Integer resize_mode;

    @ApiModelProperty(value = "阈值A")
    private Double threshold_a;

    @ApiModelProperty(value = "阈值B")
    private Double threshold_b;

    @ApiModelProperty(value = "权重")
    private Double weight;

}

