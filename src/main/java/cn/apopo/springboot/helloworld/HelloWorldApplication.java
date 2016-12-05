package cn.apopo.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // 开启组件扫描和自动配置
public class HelloWorldApplication {

	public static void main(String[] args) {
		// 负责启动引导应 用程序
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}
