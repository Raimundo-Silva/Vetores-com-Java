package Prova;

public class Conta {
	private String nome;
	private int NumConta;
	private int agencia;
	
	public Conta(String nome, int numConta, int agencia) {
	this.nome = nome;
	this.NumConta = numConta;
	this.agencia = agencia;
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

	public String toString() {
		return "Nome: " + this.getNome() + "," + " Agencia: " + this.getAgencia() + "," + " Nº da Conta: " + this.getNumConta();
	
	}
		
	

}
