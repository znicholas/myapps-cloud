package cn.myapps.myappseurekaserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class MyappsServiceConsumerApplication {

	private static final String PROVIDER_SERVER_URL_PREFIX = "http://myapps-service-provider";

	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	/**
	 * 通过 REST API 代理到服务器提供者
	 */
	@Autowired
	private RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(MyappsServiceConsumerApplication.class, args);
	}

	@GetMapping(value = "/hello")
	@ResponseBody
	public String hello(String name) {
		String returnValue = restTemplate.getForObject(PROVIDER_SERVER_URL_PREFIX+"/hello?name={1}", String.class, name);
		return returnValue;
	}
}
