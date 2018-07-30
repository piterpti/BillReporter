package pl.piterpti;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@RequestMapping("api/hi")
	public Map<String, String> sayHello(@RequestParam(name = "name") String name) {
		System.out.println(name);
	    HashMap<String, String> map = new HashMap<>();
	    map.put("key", "value");
	    map.put("foo", "bar");
	    map.put("aa", "bb");
	    map.put("name", name);
	    return map;
	}
	
}
