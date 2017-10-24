package spring4mvc.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	@Pointcut("@annotation(spring4mvc.aop.Action)")
	public void annotationPointCut(){
		
	}
	
	//ʹ��after����һ������,����ʹ��PointCut����Ľڵ�
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		
		Action action = method.getAnnotation(Action.class);
		
		System.out.println("ע��ʽ���أ� " + action.name());
	}
	
	//����һ�����ԣ�ֱ��ʹ�����ع�����Ϊ����
	/*@Before("excution(* spring4mvc.aop.MethodAopService.*(..))")
	public void before(JoinPoint joinPoint){
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		Method method = methodSignature.getMethod();
		System.out.println("����ʽ���أ�" + method.getName());
	}*/
}

//@Aspect �������Ǹ�����
//@Component �ô������ΪSpring ���������һ��Bean
//@PointCut ע�������е�
//