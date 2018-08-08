package pl.piterpti.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {

	@RequestMapping(value = "/")
	public String index() {
		return "forward:/index.html";
	}
	
	@RequestMapping("/resource")
	@ResponseBody
	public Map<String, Object> getFinances() {
		Map<String, Object> model = new HashMap<>();
		
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "Hello finances!");
		
		return model;
	}
}
