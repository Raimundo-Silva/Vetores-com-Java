package prova;

public class VetorConta {
	
	private Conta[] conta;
	private int qnt;
	
	public VetorConta() {
		this.conta = new Conta[1];
	}
	
	public void aumentaEspaco() {
		if(this.qnt == this.conta.length) {
			Conta[] NovaConta = new Conta[this.conta.length * 2];
			for(int i = 0;i<this.qnt;i++) {
				NovaConta[i] = this.conta[i];
			}
			this.conta = NovaConta;
		}
	}
	public void adicionaFinal(Conta conta){
		this.aumentaEspaco();
		this.conta[this.qnt] = conta;
		this.qnt++;
	}
	public void adiciona(int posicao, Conta conta) {
		if(this.qnt==posicao) {
			this.adicionaFinal(conta);
		}else {
			this.aumentaEspaco();
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
	public void remove(int posicao){
		if(posicao==this.qnt-1){
			this.removeFinal();	
		}else{
			for(int i=posicao;i<this.qnt-1;i++){
				this.conta[i] = this.conta[i+1];	
			}
			this.conta[this.qnt-1] = null;
			this.qnt--;
		}
	}
	public boolean existeBool(VetorConta vetor, int numConta){
		//int j = 0;
		for(int i=0;i<vetor.qnt;i++){
			if(vetor.conta[i].getNumConta() == numConta){
				//j = i;
				return true;
			}
		}	
		//if(j == this.qnt-1) {
		return false;
		//}
	}
	public void existePrinta(VetorConta vetor, int numConta){
		if(this.existeBool(vetor, numConta)) {
			System.out.println("Esta conta existe na lista");
		}
		else {
			System.out.println("Esta conta não existe na lista");
		}
	}
	//public void existeString(vetorConta vetor, int numConta){
		//int j = 0;
		//for(int i=0;i<vetor.qnt;i++){
			//if(vetor.conta[i].getNumConta() == numConta){
				//System.out.println("Esta conta existe na lista");
				//j = i;
				//break;
			//}
			//else{
				//j=i;
				//continue;
			//}
		//}	
		//if(j == this.qnt-1) {
			//System.out.println("Esta conta N�o existe na lista");
		//}else {
			//System.out.print("");
		//}
	//}
	public void listar() {
		System.out.println("___lista de contas cadrastadas___" + "\n");
		for(int i = 0;i<this.conta.length;i++){
			if(this.conta[i] != null) {
				System.out.println(this.conta[i] + ", ");
			}
		}
	}
}
