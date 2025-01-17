package com.br.pizzaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.pizzaria.models.PizzariaModel;
import com.br.pizzaria.services.PIzzariaService;

@Controller
public class PizzariaController {
	
	@Autowired
	private PIzzariaService pizzariaService;
	
	@GetMapping("/")
	public ModelAndView mostarPizzas() {
		ModelAndView model = new ModelAndView("pizzaria.html");
		model.addObject("pizzas", pizzariaService.mostrarPizzas());
		return model;
	}
	
	@GetMapping("/cadastrar")
	public ModelAndView mostrarCadastro() {
		ModelAndView model = new ModelAndView("cadastrar.html");
		return model;
	}
	
	@PostMapping("/cadastrar")
	public String cadastrarPizza(PizzariaModel pizza) {
		pizzariaService.cadastrarPizza(pizza);
		return "redirect:/";
	}
	
	@GetMapping("/detalhes/{sabor}")
	public ModelAndView sabor(@PathVariable String sabor) {
		ModelAndView model = new ModelAndView("detalhe.html");
		model.addObject("pizza", pizzariaService.buscarPorSabor(sabor));
		return model;
	}
	
}
