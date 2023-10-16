package x.trident.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置mapper包扫描
 *
 * @author Seven
 * @date 2020/12/13 16:11
 */
@Configuration
@MapperScan(basePackages = {"x.trident.**.mapper"})
public class MapperScanConfiguration {

}
