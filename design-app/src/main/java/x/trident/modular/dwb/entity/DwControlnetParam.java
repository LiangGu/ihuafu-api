package x.trident.modular.dwb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * DwControlnetParam对象
 *
 * @author Bryan.liang
 * @since 2023-10-20 09:05:12
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("dw_controlnet_param")
@ApiModel(value = "DwControlnetParam对象", description = "")
public class DwControlnetParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("dw_param_id")
    private Integer dwParamId;

    @ApiModelProperty("控制模式")
    @TableField("control_mode")
    private Integer controlMode;

    @ApiModelProperty("是否启用")
    @TableField("enabled")
    private Boolean enabled;

    @ApiModelProperty("指导结束值")
    @TableField("guidance_end")
    private Float guidanceEnd;

    @ApiModelProperty("指导起始值")
    @TableField("guidance_start")
    private Float guidanceStart;

    @ApiModelProperty("输入图像的base64编码")
    @TableField("input_image")
    private String inputImage;

    @ApiModelProperty("是否低显存模式")
    @TableField("lowvram")
    private Boolean lowvram;

    @ApiModelProperty("使用的模型名称")
    @TableField("model")
    private String model;

    @ApiModelProperty("使用的模块名称")
    @TableField("module")
    private String module;

    @ApiModelProperty("是否像素完美")
    @TableField("pixel_perfect")
    private Boolean pixelPerfect;

    @ApiModelProperty("处理器分辨率")
    @TableField("processor_res")
    private Integer processorRes;

    @ApiModelProperty("调整大小的模式")
    @TableField("resize_mode")
    private Integer resizeMode;

    @ApiModelProperty("阈值A")
    @TableField("threshold_a")
    private Float thresholdA;

    @ApiModelProperty("阈值B")
    @TableField("threshold_b")
    private Float thresholdB;

    @ApiModelProperty("权重")
    @TableField("weight")
    private Float weight;

    @ApiModelProperty("插入用户的ID")
    @TableField("insert_user")
    private Integer insertUser;

    @ApiModelProperty("插入时间")
    @TableField("insert_time")
    private LocalDate insertTime;


}
