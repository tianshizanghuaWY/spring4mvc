package spring4mvc.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] a){
		AnnotationConfigApplicationContext context 
		   = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		UseFunctionService service = context.getBean(UseFunctionService.class);
		System.out.println(service.sayHello("java config"));
		
		//��ִ��һ��
		//���Խ��, 2��service ��ֻ�ᴴ��һ�θ���ʵ�������������������ұ����������ȳ�ʼ��
		service = context.getBean(UseFunctionService.class);
		System.out.println(service.sayHello("java config again"));
		
		context.close();
	}
	
	//AnnotationConfigApplicationContext ��Ϊspring ����
}
