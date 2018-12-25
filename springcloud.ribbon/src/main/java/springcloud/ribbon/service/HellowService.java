package springcloud.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class HellowService {
	    @Autowired
	    RestTemplate restTemplate;
	    
	    @HystrixCommand(fallbackMethod = "hiError") //制定熔断方法
	    public String hiService(String name) {
	        return restTemplate.getForObject("http://EURKA-CLIENT/helloWord?name=ribbon",String.class);
	    }
	    
	    public String hiError(String name){	    	
	    	return "error:"+name;
	    }
}
