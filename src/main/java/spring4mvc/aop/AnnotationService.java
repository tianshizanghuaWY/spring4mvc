package spring4mvc.aop;

import org.springframework.stereotype.Service;

@Service
public class AnnotationService {
	@Action(name="注解式拦截 add 操作")
	public void add(){}
}

//使用注解的被拦截类
