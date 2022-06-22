package com.nowcoder.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//表明配置类
public class CommunityApplication {

	public static void main(String[] args) {
		//启动tomcat，创建spring容器
		//容器自动扫描配置类所在包以及子包下的带controller、service、repository、component注解的bean
		SpringApplication.run(CommunityApplication.class, args);
	}

}
