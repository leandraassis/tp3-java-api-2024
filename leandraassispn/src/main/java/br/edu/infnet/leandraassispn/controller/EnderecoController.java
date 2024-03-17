package br.edu.infnet.leandraassispn.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.leandraassispn.model.domain.Endereco;
import br.edu.infnet.leandraassispn.model.service.EnderecoService;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping(value = "/{cep}/consultar")
	Endereco obterPorCep(@PathVariable String cep) {
		return enderecoService.obterPorCep(cep);
	}
}
