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
 * <p>
 * 
 * </p>
 *
 * @author guyuL
 * @since 2023-10-20 09:05:12
 */
@Getter
@Setter
  @Accessors(chain = true)
  @TableName("dw_images")
@ApiModel(value = "DwImages对象", description = "")
public class DwImages implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    @TableField("dw_result_id")
    private Integer dwResultId;

      @ApiModelProperty("base64格式的图片数据")
      @TableField("image_base64")
    private String imageBase64;

      @ApiModelProperty("插入用户的ID")
      @TableField("insert_user")
    private Integer insertUser;

      @ApiModelProperty("插入时间")
      @TableField("insert_time")
    private LocalDate insertTime;


}
