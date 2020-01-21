package com.mpc;

import com.mpc.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: mi
 * @Date: 2019/12/30
 * @Description: com.mpc
 * @version: 1.0
 */
@EnableAspectJAutoProxy
public class Test {
	public static void main(String[] args) {
		//把spring所有的前提环境准备好
		AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(Config.class);
		TestService bean = cxt.getBean(TestService.class);
		String s = bean.returnAndSout();
		System.out.println(s);
	}
}
