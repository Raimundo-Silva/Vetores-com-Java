package Prova;

import java.util.Arrays;

public class vetorConta {
	
	private Conta[] conta;
	private int qnt;
	
	public vetorConta() {
		this.conta = new Conta[3];
	}
	
	
	public void almentaEspaco() {
		if(this.qnt == this.conta.length) {
			Conta[] NovaConta = new Conta[this.conta.length * 2];
			for(int i = 0;i<this.qnt;i++) {
				NovaConta[i] = this.conta[i];
			}
			this.conta = NovaConta;
		}
	}
	public void adicionaFinal(Conta conta){
		this.almentaEspaco();
		this.conta[this.qnt] = conta;
		this.qnt++;
	}
	public void adiciona(int posicao, Conta conta) {
		if(this.qnt==posicao) {
			this.adicionaFinal(conta);
			qnt++;
		}else {
			this.almentaEspaco();
			int cont = qnt-1;
			while(cont>=posicao) {
				this.conta[cont + 1] = this.conta[cont];
				cont--;
			}
			this.conta[posicao] = conta;
			qnt++;
		}
		
	}
	
	public void removeFinal() {
		this.conta[this.qnt-1] = null;
		this.qnt--;
	}
		
	public String toString() {
		return Arrays.toString(this.conta);
		
	}
}
