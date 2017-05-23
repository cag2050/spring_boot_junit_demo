* 右击 src/test/java/com/cag/spring_boot_junit_demo/HelloServiceTest.java，Debug As => JUnit Test，在窗口 JUnit 会显示相应的信息（Runs、Errors、Failures），窗口下部的 Failure Trace 子窗口会显示失败提示信息。  

* 无论项目是否在运行，都可以进行 JUnit 测试。

* spring boot 1.3 和 1.4 版本写法差别：

```
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
```