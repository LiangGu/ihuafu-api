package x.trident;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import x.trident.core.db.starter.TridentDataSourceAutoConfiguration;

/**
 * SpringBoot方式启动类
 *
 * @author Seven
 * @date 2020/12/1 17:50
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"x.trident"}, exclude = {FlywayAutoConfiguration.class, TridentDataSourceAutoConfiguration.class})
public class TridentApplication {

    public static void main(String[] args) {
        SpringApplication.run(TridentApplication.class, args);
        log.info(TridentApplication.class.getSimpleName() + " is success!");
        log.info("http://localhost:8080");
    }
}

