package x.trident.modular.dwb.model.params;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * SD文生图参数
 *
 * @author Bryan.liang
 * @since 2023-10-08
 */
@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel
@Accessors(chain = true)
@ToString
public class SDTxt2ImgParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主提示词")
    private String prompt;

    @ApiModelProperty(value = "反向提示词")
    private String negative_prompt;

    @ApiModelProperty(value = "生成步数")
    private Integer steps;

    @ApiModelProperty(value = "采样方法的索引")
    private String sampler_index;

    @ApiModelProperty(value = "关键词相关性")
    private Integer cfg_scale;

    @ApiModelProperty(value = "随机数种子")
    private Integer seed;

    @ApiModelProperty(value = "每次生成的图像数量")
    private Integer batch_size;

    @ApiModelProperty(value = "生成批次")
    private Integer n_iter;

    @ApiModelProperty(value = "生成图像的宽度")
    private Integer width;

    @ApiModelProperty(value = "生成图像的高度")
    private Integer height;

    @ApiModelProperty(value = "是否进行脸部修复")
    private Boolean restore_faces;

    @ApiModelProperty(value = "是否可平埔")
    private Boolean tiling;

    @ApiModelProperty(value = "是否启用高分辨率")
    private Boolean enable_hr;

    @ApiModelProperty(value = "高分辨率的放大器")
    private String hr_upscaler;

    @ApiModelProperty(value = "用于修改本次的生成图片的stable diffusion 模型")
    private Map<String, String> override_settings;

    @ApiModelProperty(value = "控制网络参数，用于存放ControlNet的参数")
    private Map<String, Scripts> alwayson_scripts;

    @Data
    public static class Scripts {
        @ApiModelProperty(value = "ControlNet参数列表")
        private List<ControlNetParam> args;
    }

    @ApiModelProperty(value = "采样方法的名称")
    private String sampler_name;

    @ApiModelProperty(value = "子种子")
    private Integer subseed;

    @ApiModelProperty(value = "子种子强度")
    private Double subseed_strength;

    @ApiModelProperty(value = "种子从高度调整")
    private Integer seed_resize_from_h;

    @ApiModelProperty(value = "种子从宽度调整")
    private Integer seed_resize_from_w;

    @ApiModelProperty(value = "是否不保存样本")
    private Boolean do_not_save_samples;

    @ApiModelProperty(value = "是否不保存网格")
    private Boolean do_not_save_grid;

    @ApiModelProperty(value = "ETA值")
    private Integer eta;

    @ApiModelProperty(value = "最小无条件s值")
    private Double s_min_uncond;

    @ApiModelProperty(value = "s churn值")
    private Double s_churn;

    @ApiModelProperty(value = "s最大时间")
    private Double s_tmax;

    @ApiModelProperty(value = "s最小时间")
    private Double s_tmin;

    @ApiModelProperty(value = "s噪声")
    private Double s_noise;

    @ApiModelProperty(value = "是否在之后恢复覆盖设置")
    private Boolean override_settings_restore_afterwards;

    @ApiModelProperty(value = "脚本名称")
    private String script_name;

    @ApiModelProperty(value = "是否发送图像")
    private Boolean send_images;

    @ApiModelProperty(value = "是否保存图像")
    private Boolean save_images;

    @ApiModelProperty(value = "去噪强度")
    private Double denoising_strength;

    @ApiModelProperty(value = "第一阶段宽度")
    private Integer firstphase_width;

    @ApiModelProperty(value = "第一阶段高度")
    private Integer firstphase_height;

    @ApiModelProperty(value = "高分辨率的缩放比例")
    private Integer hr_scale;

    @ApiModelProperty(value = "高分辨率的第二遍步骤")
    private Integer hr_second_pass_steps;

    @ApiModelProperty(value = "高分辨率的x方向调整大小")
    private Integer hr_resize_x;

    @ApiModelProperty(value = "高分辨率的y方向调整大小")
    private Integer hr_resize_y;

    @ApiModelProperty(value = "高分辨率的采样方法名称")
    private String hr_sampler_name;

    @ApiModelProperty(value = "高分辨率的提示词")
    private String hr_prompt;

    @ApiModelProperty(value = "高分辨率的反向提示词")
    private String hr_negative_prompt;

    @ApiModelProperty(value = "样式")
    private List<String> styles;

}

