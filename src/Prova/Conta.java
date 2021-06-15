package Prova;
public class Conta {
	private String nome;
	private int numConta;
	private int agencia;
	private int cpf;
	private int cnpj;
	private float saldo;
	
	public Conta(String nome, int numConta, int agencia) {
		setNome(nome);
		setNumConta(numConta);
		setAgencia(agencia);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public String toString() {
		return "Nome: " + this.getNome() + "," + " Agencia: " + this.getAgencia() + "," + " Nº da Conta: " + this.getNumConta();
	}
}