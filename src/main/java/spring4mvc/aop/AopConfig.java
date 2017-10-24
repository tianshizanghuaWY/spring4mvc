package spring4mvc.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring4mvc.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}

//@EnableAspectJAutoProxy ����Spring ��Ascpect ��֧��
