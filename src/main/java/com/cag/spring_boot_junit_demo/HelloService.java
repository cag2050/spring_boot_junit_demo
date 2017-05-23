package com.cag.spring_boot_junit_demo;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	public String getName() {
		return "hello";
	}
}
