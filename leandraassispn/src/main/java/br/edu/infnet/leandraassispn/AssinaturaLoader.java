package br.edu.infnet.leandraassispn;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.leandraassispn.model.domain.Assinatura;
import br.edu.infnet.leandraassispn.model.domain.Cliente;
import br.edu.infnet.leandraassispn.model.service.AssinaturaService;


@Component
public class AssinaturaLoader implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		AssinaturaService assinaturaService = new AssinaturaService();
		
		assinaturaService.criar(new Cliente().getAssinatura()); //cliente padrão
		assinaturaService.criar(new Assinatura(200.0, 23, true, true, 26585));
		assinaturaService.criar(new Assinatura(350.0, 43, true, false, 99878));
		
	}

}
