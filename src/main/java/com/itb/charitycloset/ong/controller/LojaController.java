package com.itb.charitycloset.ong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.charitycloset.ong.model.Produto;

@Controller
@RequestMapping("/ong/produto")
public class LojaController {
	
	@GetMapping("/listar")
	
	public String listarProduto() {
		Produto p1 = new Produto();
		p1.setId (20l);
		
		return "produtos";
	}
	
	

}
