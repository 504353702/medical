package junitTest;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.demo.utils.SendMail;

public class SendMailTest {
	@Resource
	private SendMail mail;
	
	@Ignore
	@Transactional
	@Rollback(true)
	@Test
	public void testSendMail() {
		mail.sendMail("taoyan", "fuxinzhong", "572358423@qq.com");
	}

}
