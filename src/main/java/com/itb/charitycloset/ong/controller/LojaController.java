package com.itb.charitycloset.ong.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.charitycloset.ong.model.Produto;

@Controller
@RequestMapping("/ong/produto")
public class LojaController {
	
	List<Produto> listaDeProdutos = new ArrayList<Produto>(); 
	
	@GetMapping("/listar")
	
	public String listarProduto() {
		Produto p1 = new Produto();
		p1.setId (20l);
		p1.setNome("Maquina de Lavar Brastemp 15 l");
		p1.setCodigoBarras("15844489FJFDFYGU8");
		p1.setDescricao("Produto Linha Branca com painel digital");
		p1.setPreco(3215.89);
		
		Produto p2 = new Produto();
		p1.setId (50l);
		p1.setNome("Maquina de Ensaboar");
		p1.setCodigoBarras("1584448GHYGU8");
		p1.setDescricao("Produto Linha Branca com painel digital");
		p1.setPreco(3855.79);
		
		
		return "produtos";
		
		
	}
	
	

}
