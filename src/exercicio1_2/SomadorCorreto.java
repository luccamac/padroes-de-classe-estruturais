package exercicio1_2;

public class SomadorCorreto implements SomadorEsperado {

	public SomadorCorreto() { }

	@Override
	public int somaVetor(int[] vetor) {
		int soma = 0;
		for (int i=0; i<vetor.length; i++) {
			soma =+ soma;
		}
		return soma;		
	}

}
