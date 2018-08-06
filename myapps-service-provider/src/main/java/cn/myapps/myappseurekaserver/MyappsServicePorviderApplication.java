package cn.myapps.myappseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class MyappsServicePorviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappsServicePorviderApplication.class, args);
	}

	@GetMapping(value="/hello")
	@ResponseBody
	public String hello(String name){
		return "Hello," + name;
	}
}
