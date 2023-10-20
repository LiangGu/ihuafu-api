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
 * 用户设计时上传的附件表
 * </p>
 *
 * @author guyuL
 * @since 2023-10-20 09:05:12
 */
@Getter
@Setter
  @Accessors(chain = true)
  @TableName("dw_document")
@ApiModel(value = "DwDocument对象", description = "用户设计时上传的附件表")
public class DwDocument implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    @TableField("dw_design_record_id")
    private Integer dwDesignRecordId;

    @TableField("document_url")
    private String documentUrl;

    @TableField("document_type")
    private String documentType;

      @ApiModelProperty("Multipurpose Internet Mail Extensions,例：image/jpeg: 用于JPEG图片。")
      @TableField("document_mime_type")
    private String documentMimeType;

      @ApiModelProperty("文件名称")
      @TableField("document_filename")
    private String documentFilename;

      @ApiModelProperty("插入用户的ID")
      @TableField("insert_user")
    private Integer insertUser;

      @ApiModelProperty("插入时间")
      @TableField("insert_time")
    private LocalDate insertTime;


}
