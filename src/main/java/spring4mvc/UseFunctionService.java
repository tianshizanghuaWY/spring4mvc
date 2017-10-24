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

//@Autowired 将 functionService 实例Bean注入到当前实例中
//@Inject(基于JSR-330) 和 @Resource（基于JSR-250）同效