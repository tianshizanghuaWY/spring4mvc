package spring4mvc;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {

	public String sayHello(String word){
		return "Hello " + word;
	}
}

//@Service 注解声明 FunctionService 是Spring 管理的一个Bean
//和 Component Respository Controller是等效的