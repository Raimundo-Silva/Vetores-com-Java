package prova;

public class VetorConta {
	
	private Conta[] conta;
	private int qtd;

	public VetorConta() {
		this.conta = new Conta[1];
	}
	public Conta[] getConta() {
		return conta;
	}
	public void setConta(Conta[] conta) {
		this.conta = conta;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public void aumentaEspaco() {
		if(this.qtd == this.conta.length) {
			Conta[] NovaConta = new Conta[this.conta.length * 2];
			for(int i = 0;i<this.qtd;i++) {
				NovaConta[i] = this.conta[i];
			}
			this.conta = NovaConta;
		}
	}
	public void adicionaFinal(Conta conta){
		this.aumentaEspaco();
		this.conta[this.qtd] = conta;
		this.qtd++;
	}
	public void adiciona(int posicao, Conta conta) {
		if(this.qtd==posicao) {
			this.adicionaFinal(conta);
		}else {
			this.aumentaEspaco();
			int cont = qtd-1;
			while(cont>=posicao) {
				this.conta[cont + 1] = this.conta[cont];
				cont--;
			}
			this.conta[posicao] = conta;
			qtd++;
		}	
	}
	public void removeFinal() {
		this.conta[this.qtd-1] = null;
		this.qtd--;
	}
	public void remove(int posicao){
		if(posicao==this.qtd-1){
			this.removeFinal();	
		}else{
			for(int i=posicao;i<this.qtd-1;i++){
				this.conta[i] = this.conta[i+1];	
			}
			this.conta[this.qtd-1] = null;
			this.qtd--;
		}
	}
	public boolean existeBool(VetorConta vetor, int numConta){
		for(int i=0;i<vetor.qtd;i++){
			if(vetor.conta[i].getNumConta() == numConta){
				return true;
			}
		}	
		return false;
	}
	public void existePrinta(VetorConta vetor, int numConta){
		if(this.existeBool(vetor, numConta)) {
			System.out.println("Esta conta existe na lista");
		}
		else {
			System.out.println("Esta conta não existe na lista");
		}
	}
	public void listar() {
		System.out.println("___lista de contas cadrastadas___" + "\n");
		for(int i = 0;i<this.conta.length;i++){
			if(this.conta[i] != null) {
				System.out.println(this.conta[i] + ", ");
			}
		}
	}
}