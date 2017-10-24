package spring4mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("spring4mvc")
public class Config {

}

//@Configuration 标识该类为配置类
//@ComponentScan 自动扫描包下所有使用 @Servive @Componet @Repository @Controller 注解的类
//并注册为Bean