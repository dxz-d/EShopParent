package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Description: TODO
 * CreateTime: 2022/4/12 20:24
 * @author: dxz
 */
@SpringBootApplication
@RefreshScope
public class ConfigDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigDemoApplication.class);
    }
}
