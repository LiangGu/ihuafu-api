package x.trident.modular.dwb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import x.trident.modular.dwb.entity.DwDesignRecord;

/**
 * 文生图记录表，包括param，页面录入的信息，document，result及记录本身的一些信息 Mapper 接口
 *
 * @author Bryan.liang
 * @since 2023-10-20 09:05:12
 */
@Mapper
public interface DwDesignRecordMapper extends BaseMapper<DwDesignRecord> {

}
