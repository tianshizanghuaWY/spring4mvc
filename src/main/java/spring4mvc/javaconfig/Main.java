package spring4mvc.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] a){
		AnnotationConfigApplicationContext context 
		   = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		UseFunctionService service = context.getBean(UseFunctionService.class);
		System.out.println(service.sayHello("java config"));
		
		//再执行一次
		//测试结果, 2个service 都只会创建一次各自实力，并被容器管理，并且被依赖的优先初始化
		service = context.getBean(UseFunctionService.class);
		System.out.println(service.sayHello("java config again"));
		
		context.close();
	}
	
	//AnnotationConfigApplicationContext 作为spring 容器
}
