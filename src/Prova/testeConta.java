package Prova;
public class testeConta {
	public static void main(String[] args) {
		Conta c1 = new Conta("andre",123,567);
		vetorConta vet = new vetorConta();
		vet.adiciona(c1);
		System.out.print(vet);
	}
}