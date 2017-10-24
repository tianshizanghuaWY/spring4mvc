package spring4mvc.elConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ElConfig.class);
		
		ElConfig elConfig = context.getBean(ElConfig.class);
        elConfig.outputResource();
        
        context.close();
 	}

}
