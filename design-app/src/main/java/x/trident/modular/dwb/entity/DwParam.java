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
 * DwParam对象
 *
 * @author Bryan.liang
 * @since 2023-10-20 09:05:12
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("dw_param")
@ApiModel(value = "DwParam对象", description = "")
public class DwParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("dw_design_record_id")
    private Integer dwDesignRecordId;

    @ApiModelProperty("主提示词")
    @TableField("prompt")
    private String prompt;

    @ApiModelProperty("反向提示词")
    @TableField("negative_prompt")
    private String negativePrompt;

    @ApiModelProperty("生成步数")
    @TableField("steps")
    private Integer steps;

    @ApiModelProperty("采样方法的索引")
    @TableField("sampler_index")
    private String samplerIndex;

    @ApiModelProperty("关键词相关性")
    @TableField("cfg_scale")
    private Integer cfgScale;

    @ApiModelProperty("随机数种子")
    @TableField("seed")
    private Integer seed;

    @ApiModelProperty("每次生成的图像数量")
    @TableField("batch_size")
    private Integer batchSize;

    @ApiModelProperty("生成批次")
    @TableField("n_iter")
    private Integer nIter;

    @ApiModelProperty("生成图像的宽度")
    @TableField("width")
    private Integer width;

    @ApiModelProperty("生成图像的高度")
    @TableField("height")
    private Integer height;

    @ApiModelProperty("是否进行脸部修复")
    @TableField("restore_faces")
    private Boolean restoreFaces;

    @ApiModelProperty("是否可平埔")
    @TableField("tiling")
    private Boolean tiling;

    @ApiModelProperty("是否启用高分辨率")
    @TableField("enable_hr")
    private Boolean enableHr;

    @ApiModelProperty("高分辨率的放大器")
    @TableField("hr_upscaler")
    private String hrUpscaler;

    @ApiModelProperty("采样方法的名称")
    @TableField("sampler_name")
    private String samplerName;

    @ApiModelProperty("子种子")
    @TableField("subseed")
    private Integer subseed;

    @ApiModelProperty("子种子强度")
    @TableField("subseed_strength")
    private Float subseedStrength;

    @ApiModelProperty("种子从高度调整")
    @TableField("seed_resize_from_h")
    private Integer seedResizeFromH;

    @ApiModelProperty("种子从宽度调整")
    @TableField("seed_resize_from_w")
    private Integer seedResizeFromW;

    @ApiModelProperty("是否不保存样本")
    @TableField("do_not_save_samples")
    private Boolean doNotSaveSamples;

    @ApiModelProperty("是否不保存网格")
    @TableField("do_not_save_grid")
    private Boolean doNotSaveGrid;

    @ApiModelProperty("ETA值")
    @TableField("eta")
    private Integer eta;

    @ApiModelProperty("最小无条件s值")
    @TableField("s_min_uncond")
    private Float sMinUncond;

    @ApiModelProperty("s churn值")
    @TableField("s_churn")
    private Float sChurn;

    @ApiModelProperty("s最大时间")
    @TableField("s_tmax")
    private Float sTmax;

    @ApiModelProperty("s最小时间")
    @TableField("s_tmin")
    private Float sTmin;

    @ApiModelProperty("s噪声")
    @TableField("s_noise")
    private Float sNoise;

    @ApiModelProperty("是否在之后恢复覆盖设置")
    @TableField("override_settings_restore_afterwards")
    private Boolean overrideSettingsRestoreAfterwards;

    @ApiModelProperty("脚本名称")
    @TableField("script_name")
    private String scriptName;

    @ApiModelProperty("是否发送图像")
    @TableField("send_images")
    private Boolean sendImages;

    @ApiModelProperty("是否保存图像")
    @TableField("save_images")
    private Boolean saveImages;

    @ApiModelProperty("去噪强度")
    @TableField("denoising_strength")
    private Float denoisingStrength;

    @ApiModelProperty("第一阶段宽度")
    @TableField("firstphase_width")
    private Integer firstphaseWidth;

    @ApiModelProperty("第一阶段高度")
    @TableField("firstphase_height")
    private Integer firstphaseHeight;

    @ApiModelProperty("高分辨率的缩放比例")
    @TableField("hr_scale")
    private Integer hrScale;

    @ApiModelProperty("高分辨率的第二遍步骤")
    @TableField("hr_second_pass_steps")
    private Integer hrSecondPassSteps;

    @ApiModelProperty("高分辨率的x方向调整大小")
    @TableField("hr_resize_x")
    private Integer hrResizeX;

    @ApiModelProperty("高分辨率的y方向调整大小")
    @TableField("hr_resize_y")
    private Integer hrResizeY;

    @ApiModelProperty("高分辨率的采样方法名称")
    @TableField("hr_sampler_name")
    private String hrSamplerName;

    @ApiModelProperty("高分辨率的提示词")
    @TableField("hr_prompt")
    private String hrPrompt;

    @ApiModelProperty("高分辨率的反向提示词")
    @TableField("hr_negative_prompt")
    private String hrNegativePrompt;

    @ApiModelProperty("插入用户的ID")
    @TableField("insert_user")
    private Integer insertUser;

    @ApiModelProperty("插入时间")
    @TableField("insert_time")
    private LocalDate insertTime;


}
