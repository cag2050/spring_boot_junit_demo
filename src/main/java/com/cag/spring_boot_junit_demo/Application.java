package com.cag.spring_boot_junit_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//写了 @RestController，就不用写 @Controller 和 下面每个路由的 @ResponseBody 了。 @RestController = @Controller + @ResponseBody。
//@RestController
@Controller
// @SpringBootApplication注解等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan
// @SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World! spring_boot_junit_demo";
	}

	public static void main(String[] args) {
		// 运行 Application.java 来启动Spring Boot项目，下面3种写法中选择一种
		// 写法1：
		// SpringApplication.run(Application.class, args);
		// 写法2：
		SpringApplication application = new SpringApplication(Application.class);
		application.run(args);
		// 写法3：
		// new
		// SpringApplicationBuilder().showBanner(false).sources(Application.class).run(args);
	}

}
