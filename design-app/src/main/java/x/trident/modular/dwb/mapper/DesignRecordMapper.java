package x.trident.modular.dwb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import x.trident.modular.dwb.entity.DesignRecord;
import x.trident.modular.dwb.model.params.SDTxt2ImgParam;

/**
 * 设计记录表 Mapper 接口
 *
 * @author Bryan.liang
 * @since 2023-10-08
 */
@Mapper
public interface DesignRecordMapper extends BaseMapper<DesignRecord> {

    Page<DesignRecord> customPageList(@Param("page") Page page, @Param("paramCondition") SDTxt2ImgParam paramCondition);

    /**
     * 根据关键字分页查询设计记录列表
     *
     * @author Bryan.liang
     * @since 2023/10/08 10:59
     */
    Page<DesignRecord> findPageByKeyword(@Param("page") Page page, @Param("keyword") String keyword);


}