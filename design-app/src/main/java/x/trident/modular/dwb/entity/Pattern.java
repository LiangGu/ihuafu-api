package x.trident.modular.dwb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;


/**
 * 版型实体类
 *
 * @author Bryan.liang
 * @since 2023-10-08
 */
@Data
@TableName("pattern")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel("板型实体类")
public class Pattern implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 全称
     */
    @TableField(value = "name_full")
    private String nameFull;

    /**
     * 英文名称
     */
    @TableField(value = "name_en")
    private String nameEn;

    /**
     * 缩写
     */
    @TableField(value = "name_abbr")
    private String nameAbbr;

    /**
     * 所属类型
     */
    @TableField(value = "type")
    private String type;

    /**
     * 代码
     */
    @TableField(value = "code")
    private String code;


    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;
}

