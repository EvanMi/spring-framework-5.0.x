package com.mpc.service;

import org.springframework.stereotype.Service;

/**
 * @Auther: mi
 * @Date: 2019/12/30
 * @Description: com.mpc.service
 * @version: 1.0
 */
@Service
public class TestService {
	public String returnAndSout(){
		String x = "hello";
		System.out.println(x);
		return x;
	}
}
