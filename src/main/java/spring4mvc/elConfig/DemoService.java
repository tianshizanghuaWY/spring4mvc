package spring4mvc.elConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

	//注入为普通的字符串
	@Value("其他类的属性")
	private String another;


	public String getAnother() {
		return another;
	}

	public void setAnother(String another) {
		this.another = another;
	}

}
