package br.com.glandata.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping()
public class StartController {
	
	private static String codigoPagina = "HS-001";
	
	@GetMapping()	
	public ModelAndView start() {
		
		ModelAndView model = new ModelAndView("pages-starter");
		
		model.addObject("codigoPagina", codigoPagina);
		
		return model;
		
	}
	

}