package br.edu.infnet.leandraassispn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.leandraassispn.model.domain.Assinatura;


@SpringBootTest
class AssinaturaTests {
	private Assinatura assinatura;
	private final String INSUFICIENTE = "Erro ao efetuar o pagamento";
	private final String SUFICIENTE = "Pagamento efetuado";

	@BeforeEach
	void setUp() {
		assinatura = new Assinatura();
		assinatura.setSaldo(100);
		assinatura.setVip(false);
		assinatura.setDivida(50);
	}

	@Test
	void dividaComVIP() {
		assinatura.setVip(true);
		assertEquals(45, assinatura.calcularDivida());
	}
	
	@Test
	void dividaSemVIP() {
		assertEquals(50, assinatura.calcularDivida());
	}
	
	@Test
	void saldoComVIP() {
		assinatura.setVip(true);
		assertEquals(55, assinatura.calcularSaldo());
	}
	
	@Test
	void saldoSemVIP() {
		assertEquals(50, assinatura.calcularSaldo());
	}
	
	@Test
	void saldoInsuficiente() {
		assinatura.setSaldo(20);
		assertEquals(INSUFICIENTE, assinatura.verificacaoSaldo());
	}
	
	@Test
	void saldoSuficiente() {
		assertEquals(SUFICIENTE, assinatura.verificacaoSaldo());
	}
	
	@Test
	void retornarDados() {
		assertEquals(50, assinatura.getDivida());
		assertEquals(false, assinatura.isVip());
		assertEquals(100, assinatura.getSaldo());
	}

}
