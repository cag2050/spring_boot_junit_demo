package com.cag.spring_boot_junit_demo;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

// spring boot 1.3 版本写法：
// SpringJUnit支持，由此引入Spring-Test框架支持
//@RunWith(SpringJUnit4ClassRunner.class)
// 指定我们SpringBoot工程的Application启动类
//@SpringApplicationConfiguration(classes = Application.class)
// 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration
//@WebAppConfiguration

// spring boot 1.4 版本写法：
// 告诉Junit运行使用Spring的单元测试支持；SpringRunner是SpringJunit4ClassRunner新的名称，只是视觉上看起来更简单了。
@RunWith(SpringRunner.class)
// 在一个测试类指定运行Spring Boot为基础的测试
@SpringBootTest(classes = Application.class)

public class HelloServiceTest {

	@Resource
	private HelloService helloService;

	@Test
	public void testGetName() {
		Assert.assertEquals("hello", helloService.getName());
	}

}
