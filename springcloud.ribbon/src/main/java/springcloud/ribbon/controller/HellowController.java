package springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springcloud.ribbon.service.HellowService;

@RestController
public class HellowController {
	   @Autowired
	   HellowService helloService;

	    @GetMapping(value = "/helloWord")
	    public String hi(@RequestParam String name) {
	        return helloService.hiService( name );
	    }

}
