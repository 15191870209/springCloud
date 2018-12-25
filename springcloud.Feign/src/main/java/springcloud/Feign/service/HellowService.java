package springcloud.Feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eurka-client",fallback = SchedualServiceHiHystric.class)
public interface HellowService {
	  @RequestMapping("helloWord")
	  String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
