package br.edu.infnet.leandraassispn.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.leandraassispn.model.domain.Assinatura;

@Service
public class AssinaturaService {
private static Map<Integer, Assinatura> assinaturas = new HashMap<Integer, Assinatura>(); 
	
	public void criar(Assinatura assinatura) {
			assinaturas.put(assinatura.getRegistro(), assinatura);
	}
	
	public void excluir(int registro) {
		assinaturas.remove(registro);
	}
	
	public Collection<Assinatura> obterLista(){
		return assinaturas.values();
	}
	
	public Assinatura obter(int registro){
		return assinaturas.get(registro);
	}
}
