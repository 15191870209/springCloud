package springcloud.Feign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements HellowService {

	@Override
	public String sayHiFromClientOne(String name) {
		// TODO Auto-generated method stub
		return "error:"+name;
	}

}
