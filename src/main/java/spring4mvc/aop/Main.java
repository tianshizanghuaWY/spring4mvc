package spring4mvc.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] s){
		//不加AopConfig.class,会报错
		//org.springframework.context.annotation.AnnotationConfigApplicationContext@25230534 has not been refreshed yet
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AopConfig.class);
		
		AnnotationService annotationService = context.getBean(AnnotationService.class);
		MethodAopService methodAopService = context.getBean(MethodAopService.class);
		
		annotationService.add();
		methodAopService.add();

		context.close();
	}
}
