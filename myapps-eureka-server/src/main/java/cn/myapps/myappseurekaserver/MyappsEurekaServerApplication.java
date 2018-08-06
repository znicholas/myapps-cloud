package cn.myapps.myappseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyappsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappsEurekaServerApplication.class, args);
	}
}
