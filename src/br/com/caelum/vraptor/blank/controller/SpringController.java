package br.com.caelum.vraptor.blank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.caelum.vraptor.blank.service.TesteService;

@Controller
public class SpringController {
	
	@Autowired
	private TesteService service;
	
	@GetMapping("/spring")
	public String main(ModelMap modelMap){
		modelMap.put("variable", service.getVariableSpring());
		return "index/index";
	}
}
