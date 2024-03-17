package br.edu.infnet.leandraassispn.model.domain;

public class Cliente {
	private String nome;
	private String cpf;
	private Endereco endereco;
	private Assinatura assinatura;

	public Cliente() {
		this.setNome("Wynonna");
		this.setCpf("33958822135");
		this.setEndereco(new Endereco("20010020", "Prof Rua São José", "Prof 4º andar", "Prof Centro", "Prof Rio de Janeiro", "UF"));
		this.setAssinatura(new Assinatura(121.50, 100.0, true, false, 12345));
	}
	
	public Cliente(int cpf) {
		this();
		this.setCpf("8822");
	}
	
	public Cliente(Endereco endereco) {
		this();
		this.setEndereco(endereco);
	}
	

	public Cliente(String nome, String cpf, Endereco endereco) {
		this();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public Cliente(String nome, String cpf, Endereco endereco, Assinatura assinatura) {
		this(nome, cpf, endereco);
		this.assinatura = assinatura;
	}

	@Override
	public String toString() {
		return "CLIENTE: " + nome + " | CPF: " + cpf + " | ENDEREÇO: " + endereco + " | ASSINATURA: " + assinatura;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Assinatura getAssinatura() {
		return assinatura;
	}

	public void setAssinatura(Assinatura assinatura) {
		this.assinatura = assinatura;
	}
}
