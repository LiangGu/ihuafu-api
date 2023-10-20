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
 * 文生图记录表，包括param，页面录入的信息，document，result及记录本身的一些信息
 *
 * @author Bryan.liang
 * @since 2023-10-20 09:05:12
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("dw_design_record")
@ApiModel(value = "DwDesignRecord对象", description = "文生图记录表，包括param，页面录入的信息，document，result及记录本身的一些信息")
public class DwDesignRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("插入用户的ID")
    @TableField("insert_user")
    private Integer insertUser;

    @ApiModelProperty("插入时间")
    @TableField("insert_time")
    private LocalDate insertTime;


}
