package Prova;

public class Conta {
	private String nome;
	private int NumConta;
	private int agencia;
	private long cpf;
	private long cnpj;
	private double saldo;
	
	public Conta(String nome, int numConta, int agencia,long cpf, long cnpj, double saldo) {
		setNome(nome);
		setNumConta(numConta);
		setAgencia(agencia);
		setCpf(cpf);
		setCnpj(cnpj);
		setSaldo(saldo);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumConta() {
		return NumConta;
	}
	public void setNumConta(int numConta) {
		NumConta = numConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf2) {
		this.cpf = cpf2;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo2) {
		this.saldo = saldo2;
	}
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj2) {
		this.cnpj = cnpj2;
	}


	public String toString() {
		return "Nome: " + this.getNome() + " -"  + " Nº da Conta: " + this.getNumConta() + " -" + " Agencia: " + this.getAgencia();
	
	}
		
	

}
