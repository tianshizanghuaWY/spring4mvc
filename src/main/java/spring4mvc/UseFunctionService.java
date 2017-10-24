package spring4mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
	@Autowired
	private FunctionService functionService;
	public String sayHello(String word){
		return functionService.sayHello(word);
	}
}

//@Autowired �� functionService ʵ��Beanע�뵽��ǰʵ����
//@Inject(����JSR-330) �� @Resource������JSR-250��ͬЧ