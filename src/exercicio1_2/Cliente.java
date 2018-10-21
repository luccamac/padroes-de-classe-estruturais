package exercicio1_2;

public class Cliente {
	
	private SomadorEsperado somador;
	
	public Cliente(SomadorEsperado somador) {
		this.somador = somador;
	}
	
	public Cliente(SomadorCorreto somador) {
		this.somador = somador;
	}
	
	public int executar() {
		int[] vetor = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int soma = somador.somaVetor(vetor);
		return soma;
	}
}
