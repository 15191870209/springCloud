package springcloud.Eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer   //启动服务注册中心
@SpringBootApplication
public class EurekaServerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SpringApplication.run(EurekaServerApplication.class, args);
	}

}
