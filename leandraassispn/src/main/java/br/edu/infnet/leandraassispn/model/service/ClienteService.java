package br.edu.infnet.leandraassispn.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.leandraassispn.model.domain.Cliente;

@Service
public class ClienteService {
private static Map<String, Cliente> clientes = new HashMap<String, Cliente>(); 
	
	public void incluir(Cliente cliente) {
		clientes.put(cliente.getCpf(), cliente);
	}
	
	public void excluir(String cpf) {
		clientes.remove(cpf);
	}
	
	public Collection<Cliente> obterLista(){
		return clientes.values();
	}
	
	public Cliente obter(String cpf){
		return clientes.get(cpf);
	}
}
