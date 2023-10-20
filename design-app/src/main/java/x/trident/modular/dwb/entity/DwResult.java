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
 * DwResult对象
 *
 * @author Bryan.liang
 * @since 2023-10-20 09:05:12
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("dw_result")
@ApiModel(value = "DwResult对象", description = "")
public class DwResult implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("dw_design_record_id")
    private Integer dwDesignRecordId;

    @ApiModelProperty("输入的请求体")
    @TableField("parameters")
    private String parameters;

    @ApiModelProperty("返回的图片的信息")
    @TableField("info")
    private String info;

    @ApiModelProperty("插入用户的ID")
    @TableField("insert_user")
    private Integer insertUser;

    @ApiModelProperty("插入时间")
    @TableField("insert_time")
    private LocalDate insertTime;


}
