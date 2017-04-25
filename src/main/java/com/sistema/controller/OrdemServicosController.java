package com.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ordemservicos")
public class OrdemServicosController {
	
	@RequestMapping("/novo")
	public String novo() {
		return "ordemServico/CadastroOrdemServico";
	}
}
