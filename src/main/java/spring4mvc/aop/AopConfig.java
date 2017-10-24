package spring4mvc.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring4mvc.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}

//@EnableAspectJAutoProxy 开启Spring 对Ascpect 的支持
