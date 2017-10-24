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
	
	//��ʽ2
	/*@Bean
	public UseFunctionService useFunctionService(FunctionService functionService){
		System.out.println(functionService);
		UseFunctionService useFunctionService = new 
				UseFunctionService();
		useFunctionService.setFunctionService(functionService);
		
		return useFunctionService;
	}*/
}

//@Configuration ��ʶ����Ϊ������, �൱��Spring ���õ�xml�ļ�
//java ������ͨ��Configuration �� Bean ���ʵ�ֵ�
//@Bean ע���ڷ����ϣ�������ǰ�������ص���һ�� Bean, Bean�������Ƿ�����
//��FunctionService Beanע�� IOC������ʱ��ֱ�ӵ���functionService(),����ֻ�����һ��

//��һ��ע�뷽ʽ��ֱ�ӽ�FunctionService ��Ϊ��������useFunctionService() ��Ҳ��Spring�����ṩ�ļ��õĹ���
//��Spring ������ֻҪ����ĳ��Bean �Ϳ�������һ��Bean�����������Ĳ�����ע��



//��ʱʹ��java���ã���ʱʹ��ע������
//ԭ��ȫ������ʹ��java����(���ݿ�����, MVC��ص�����)
//    ҵ��Bean������ʹ��ע������(@Service @Component @Repository @Controller)  


