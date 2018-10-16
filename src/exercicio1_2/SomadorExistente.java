package exercicio1_2;

import java.util.List;

// o cliente espera usar uma classe que soma inteiros em um vetor
// mas a classe pronta soma inteiros em uma lista

public class SomadorExistente implements SomadorEsperado {
	
	public int somaLista(List<Integer> lista) {
		int resultado = 0;
		for (int i : lista) resultado += i;
		return resultado;
	}

	@Override
	public int somaVetor(int[] vetor) {
		return 0;
	}
}