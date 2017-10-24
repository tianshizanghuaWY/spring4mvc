package spring4mvc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] a){
		AnnotationConfigApplicationContext context 
		   = new AnnotationConfigApplicationContext(Config.class);
		
		UseFunctionService service = context.getBean(UseFunctionService.class);
		System.out.println(service.sayHello("spring_4"));
		context.close();
	}
	
	//AnnotationConfigApplicationContext ×÷Îªspring ÈÝÆ÷
}
