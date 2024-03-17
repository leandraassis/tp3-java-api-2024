package br.edu.infnet.leandraassispn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.leandraassispn.model.domain.Cliente;

@SpringBootTest
class ClienteTests {

	private Cliente cliente;
	private final String NOME = "Leandra";
	
	@BeforeEach
	void setUp() {
		cliente = new Cliente();
		cliente.setNome("Leandra");
		cliente.setCpf("12345");
	}

	@Test
	void retornarDados() {
		assertEquals(NOME, cliente.getNome());
		assertEquals("12345", cliente.getCpf());
	}

}
