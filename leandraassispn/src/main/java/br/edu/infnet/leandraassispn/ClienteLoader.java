package br.edu.infnet.leandraassispn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.leandraassispn.model.domain.Assinatura;
import br.edu.infnet.leandraassispn.model.domain.Cliente;
import br.edu.infnet.leandraassispn.model.domain.Endereco;
import br.edu.infnet.leandraassispn.model.service.ClienteService;
import br.edu.infnet.leandraassispn.model.service.EnderecoService;

@Component
public class ClienteLoader implements ApplicationRunner {
	
	@Autowired
	private EnderecoService enderecoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Endereco enderecoInfnet = enderecoService.obterPorCep("22241330");
		
		ClienteService clienteService = new ClienteService();
		
		clienteService.incluir(new Cliente()); //cliente padrão
		clienteService.incluir(new Cliente("Ellie", "67643978511", enderecoInfnet, new Assinatura(200.0, 23, true, true, 26585)));
		clienteService.incluir(new Cliente("Joel", "97458721330", enderecoService.obterPorCep("01001000"), new Assinatura()));
		clienteService.incluir(new Cliente("Alison", "02736364128", enderecoService.obterPorCep("22241900"), new Assinatura(350.0, 43, true, false, 99878)));
		
		System.out.println("- " + clienteService.obter("33958822135")); //cliente padrão
		System.out.println("- " + clienteService.obter("67643978511"));
		System.out.println("- " + clienteService.obter("97458721330"));
		System.out.println("- " + clienteService.obter("02736364128"));
		
	
	
	}

}
