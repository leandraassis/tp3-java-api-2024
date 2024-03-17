package br.edu.infnet.leandraassispn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.leandraassispn.model.domain.Endereco;

@SpringBootTest
class EnderecoTests {
	
	Endereco endereco = new Endereco();
	
	@Test
	void recuperarDados() {
		assertEquals("20010020", endereco.getCep());
		assertEquals("Rua São José", endereco.getLogradouro());
		assertEquals("4º andar", endereco.getComplemento());
		assertEquals("Centro", endereco.getBairro());
		assertEquals("Rio de Janeiro", endereco.getLocalidade());
		assertEquals("RJ", endereco.getUf());
	}
}
