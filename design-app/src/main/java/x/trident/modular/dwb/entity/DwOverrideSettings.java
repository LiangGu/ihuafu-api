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
 * DwOverrideSettings对象
 *
 * @author Bryan.liang
 * @since 2023-10-20 09:05:12
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("dw_override_settings")
@ApiModel(value = "DwOverrideSettings对象", description = "")
public class DwOverrideSettings implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("dw_param_id")
    private Integer dwParamId;

    @ApiModelProperty("stable diffusion 模型")
    @TableField("sd_model_checkpoint")
    private String sdModelCheckpoint;

    @ApiModelProperty("插入用户的ID")
    @TableField("insert_user")
    private Integer insertUser;

    @ApiModelProperty("插入时间")
    @TableField("insert_time")
    private LocalDate insertTime;


}
