package springcloud.Feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springcloud.Feign.service.HellowService;

@RestController
public class HellowController {
	@Autowired
	HellowService hellowService;
	 @GetMapping("/helloWord")
	    public String sayHi(@RequestParam String name) {
		 	name="feign";
	        return hellowService.sayHiFromClientOne( name );   
	    }

}
