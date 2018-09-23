package cn.myapps.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaServer
public class MyappsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappsEurekaServerApplication.class, args);
	}
}
