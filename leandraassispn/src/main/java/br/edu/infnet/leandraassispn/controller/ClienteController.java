package br.edu.infnet.leandraassispn.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.leandraassispn.model.domain.Cliente;
import br.edu.infnet.leandraassispn.model.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Cliente cliente) {
		clienteService.incluir(cliente);
	}
	
	@DeleteMapping(value = "{cpf}/excluir")
	public void excluir(@PathVariable String cpf) {
		clienteService.excluir(cpf);
	}
	
	@GetMapping(value = "/{cpf}/lista")
	public Cliente obterCliente(@PathVariable String cpf) {
		return clienteService.obter(cpf);
	}
	
	 @GetMapping("/lista")
	    public Collection<Cliente> obterListaClientes() {
	        return clienteService.obterLista();
	    }
	
}
