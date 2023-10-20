package x.trident.modular.dwb.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import x.trident.modular.dwb.entity.DwStyles;
import x.trident.modular.dwb.mapper.DwStylesMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * Styles 服务实现类
 *
 * @author Bryan.liang
 * @since 2023-10-20 09:05:12
 */
@Service
public class DwStylesServiceImpl extends ServiceImpl<DwStylesMapper, DwStyles> implements IService<DwStyles> {

}
