package x.trident.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * StableDiffusion Config
 *
 * @author Bryan.liang
 * @since 2023/10/10 14:49
 */
@Configuration
@ConfigurationProperties(prefix = "stable-diffusion")
@Data
public class StableDiffusionConfig {

    private String address; //API 网关地址

    private String account; //账号

    private String password; //密码

}
