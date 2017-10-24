package spring4mvc.javaconfig;

public class FunctionService {

	public String sayHello(String word){
		return "Hello " + word;
	}
}

//没有使用 @Service 注解