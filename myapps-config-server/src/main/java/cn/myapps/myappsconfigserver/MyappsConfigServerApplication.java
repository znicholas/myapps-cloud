package cn.myapps.myappsconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigServer
public class MyappsConfigServerApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MyappsConfigServerApplication.class, args);
		System.out.println(context.getEnvironment().getProperty("user.dir"));
	}
}
