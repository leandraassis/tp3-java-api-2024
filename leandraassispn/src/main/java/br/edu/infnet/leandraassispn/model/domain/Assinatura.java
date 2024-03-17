package br.edu.infnet.leandraassispn.model.domain;

public class Assinatura {

	private double saldo;
	private double divida;
	private boolean assAtiva;
	private boolean vip;
	private int registro;


	public Assinatura() {
		this.setSaldo(100);
		this.setDivida(32);
		this.setAssAtiva(false);
		this.setVip(false);
		this.setRegistro(94853);
	}
	
	public Assinatura(double saldo, double divida, boolean assAtiva, boolean vip, int registro) {
		this();
		this.saldo = saldo;
		this.divida = divida;
		this.assAtiva = assAtiva;
		this.vip = vip;
		this.registro = registro;
	}

	@Override
	public String toString() {
		return " saldo " + saldo + " - divida " + divida + " - situação " + assAtiva + " - vip " + vip;
	}
	
	public double calcularDivida() {
		return vip ? divida - (divida*0.1) : divida;
	}
	
	public double calcularSaldo() {
		return saldo - calcularDivida();
	}
	
	public String verificacaoSaldo() {
		if(calcularSaldo() < 0) {
			return "Erro ao efetuar o pagamento";
		}
		return "Pagamento efetuado";
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getDivida() {
		return divida;
	}

	public void setDivida(double divida) {
		this.divida = divida;
	}

	public boolean isAssAtiva() {
		return assAtiva;
	}

	public void setAssAtiva(boolean assAtiva) {
		this.assAtiva = assAtiva;
	}
	
	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}
}
