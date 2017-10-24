package spring4mvc.javaconfig;

public class UseFunctionService {
	FunctionService functionService;
	
	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}

	public String sayHello(String word){
		return functionService.sayHello(word);
	}
}

//没有使用 @Autowired 注解 