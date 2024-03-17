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

import br.edu.infnet.leandraassispn.model.domain.Assinatura;
import br.edu.infnet.leandraassispn.model.service.AssinaturaService;

@RestController
@RequestMapping("/api/assinaturas")
public class AssinaturaController {

	@Autowired
	private AssinaturaService assinaturaService;
	
	@PostMapping(value = "/criar")
	public void incluir(@RequestBody Assinatura assinatura) {
		assinaturaService.criar(assinatura);
	}
	
	@DeleteMapping(value = "{registro}/excluir")
	public void excluir(@PathVariable int registro) {
		assinaturaService.excluir(registro);
	}
	
	@GetMapping(value = "/{registro}/lista")
	public Assinatura obterCliente(@PathVariable int registro) {
		return assinaturaService.obter(registro);
	}
	
	 @GetMapping("/lista")
	    public Collection<Assinatura> obterListaAssinatura() {
	        return assinaturaService.obterLista();
	    }
	
}
