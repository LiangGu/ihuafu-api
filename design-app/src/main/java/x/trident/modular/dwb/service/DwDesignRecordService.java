package x.trident.modular.dwb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import x.trident.modular.dwb.entity.DwDesignRecord;
import x.trident.modular.dwb.model.params.SDTxt2ImgParam;
import x.trident.modular.dwb.model.results.SDTxt2ImgResult;

/**
 * DesignRecord 文生图记录表，包括param，页面录入的信息，document，result及记录本身的一些信息 服务类
 *
 * @author Bryan.liang
 * @since 2023-10-20 09:05:12
 */
public interface DwDesignRecordService extends IService<DwDesignRecord> {

    /**
     * SD 文生图
     * @author Bryan.liang
     * @since 2023/10/08 10:59
     */
    SDTxt2ImgResult txt2Img (SDTxt2ImgParam param);
}
