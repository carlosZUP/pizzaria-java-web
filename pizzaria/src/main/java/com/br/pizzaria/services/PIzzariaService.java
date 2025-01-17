package com.br.pizzaria.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.br.pizzaria.models.PizzariaModel;

@Service
public class PIzzariaService {
	private Map<Integer, PizzariaModel> pizzas = new HashMap<Integer, PizzariaModel>() {
		{
			put(0, new PizzariaModel("Portuguesa", "fina", "recheada", 28));

		}
	};

	public Collection<PizzariaModel> mostrarPizzas(){
		
		return pizzas.values();
	}
	
	public void cadastrarPizza(PizzariaModel pizza) {
		pizzas.put(pizzas.size(), pizza);
		
	}
	
	public PizzariaModel buscarPorSabor(String saborPedido) {
		for (PizzariaModel pizza : pizzas.values()) {
			if(pizza.getSabor() == saborPedido) {
				return pizza;
			}
		}
		
		return null;
		
	}
}
	