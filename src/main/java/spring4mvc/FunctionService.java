package spring4mvc;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {

	public String sayHello(String word){
		return "Hello " + word;
	}
}

//@Service ע������ FunctionService ��Spring �����һ��Bean
//�� Component Respository Controller�ǵ�Ч��