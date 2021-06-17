package prova;

public class TesteConta {

	public static void main(String[] args) {
		Conta c1 = new Conta("Andre", 123, 567, "343-000-348-01", 0.0);
		Conta c2 = new Conta("Joao", 4500, 789, "136-765-789-02", 0.0);
		Conta c3 = new Conta("Lucas", 5678, 5687, "250-450-769-03", 0.0);
		Conta c4 = new Conta("Pedro", 1236, 67, "123-456-789-01", 0.0);
		VetorConta vet = new VetorConta();
		
		vet.adicionaFinal(c1);
		vet.adicionaFinal(c2);
		vet.adicionaFinal(c3);
		vet.listar();
		vet.adiciona(1, c4);
		vet.listar();
		vet.removeFinal();
		vet.listar();
		vet.remove(1);
		vet.listar();
		System.out.println();
		vet.existePrinta(vet, 123);
		vet.existePrinta(vet, 789);
	}
}