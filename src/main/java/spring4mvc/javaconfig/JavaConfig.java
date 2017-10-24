package spring4mvc.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public FunctionService functionService(){
		System.out.println("-----> get functionService");
		return new FunctionService();
	}
	
	@Bean
	public UseFunctionService useFunctionService(){
		System.out.println("-----> get useFunctionService");
		UseFunctionService useFunctionService = new 
				UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		
		return useFunctionService;
	}
	
	//方式2
	/*@Bean
	public UseFunctionService useFunctionService(FunctionService functionService){
		System.out.println(functionService);
		UseFunctionService useFunctionService = new 
				UseFunctionService();
		useFunctionService.setFunctionService(functionService);
		
		return useFunctionService;
	}*/
}

//@Configuration 标识该类为配置类, 相当于Spring 配置的xml文件
//java 配置是通过Configuration 和 Bean 组合实现的
//@Bean 注解在方法上，表明当前方法返回的是一个 Bean, Bean的名称是方法名
//将FunctionService Bean注入 IOC容器的时候，直接调用functionService(),而且只会调用一次

//另一种注入方式，直接将FunctionService 作为参数传给useFunctionService() 这也是Spring容器提供的极好的功能
//在Spring 容器中只要存在某个Bean 就可以在另一个Bean的声明方法的参数中注入



//何时使用java配置，何时使用注解配置
//原则：全局配置使用java配置(数据库配置, MVC相关的配置)
//    业务Bean的配置使用注解配置(@Service @Component @Repository @Controller)  


