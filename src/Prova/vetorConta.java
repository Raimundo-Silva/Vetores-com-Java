package Prova;
import java.util.Arrays;
public class vetorConta {
	Conta[] conta;
	public vetorConta() {
		this.conta = new Conta[20];	
	}
	public void adiciona(Conta conta){
		for(int i = 0;i < this.conta.length;i++) {
			if(this.conta[i]==null) {
				this.conta[i] = conta;
				break;
			}
		}
	}
	public String toString() {
		return Arrays.toString(this.conta);	
	}
}