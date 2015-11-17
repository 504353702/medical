package comdemo.quartz;
import javax.annotation.Resource;

import com.demo.utils.SendMail;

public class QuartzTest {

	
	@Resource
	private  SendMail sendMail;
	
	public void doScan(){
		 String flag=sendMail.sendMail("taoyan", "fuxinzhong", "1990747641@qq.com");
		 System.out.println(flag);
	}
}
