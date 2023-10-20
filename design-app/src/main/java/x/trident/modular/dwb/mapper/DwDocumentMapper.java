package x.trident.modular.dwb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import x.trident.modular.dwb.entity.DwDocument;

/**
 * 用户设计时上传的附件表 Mapper 接口
 *
 * @author Bryan.liang
 * @since 2023-10-20 09:05:12
 */
@Mapper
public interface DwDocumentMapper extends BaseMapper<DwDocument> {

}
