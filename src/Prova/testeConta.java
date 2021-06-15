package Prova;

public class testeConta {

	public static void main(String[] args) {
		Conta c1 = new Conta("andre",123,567, 123-456-789-01, 123-456-789-012-34, 0.0);
		Conta c2 = new Conta("joao",4500,789, 123-456-789-01, 123-456-789-012-34, 0.0);
		Conta c3 = new Conta("lucas",5678,5687, 123-456-789-01, 123-456-789-012-34, 0.0);
		Conta c4 = new Conta("pedro",123,567, 123-456-789-01, 123-456-789-012-34, 0.0);
		vetorConta vet = new vetorConta();
		
		vet.adicionaFinal(c1);
		vet.adicionaFinal(c2);
		vet.adicionaFinal(c3);
		vet.adiciona(1, c4);
		System.out.print(vet);
			
			
			
	 
			

	

}
}