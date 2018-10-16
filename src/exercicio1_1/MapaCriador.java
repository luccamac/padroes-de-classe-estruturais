package exercicio1_1;

import java.util.HashMap;
import java.util.Map;

public class MapaCriador implements MapaAdapter {

	private String primeiraLinha;
	private String segundaLinha;
	private Map<String, String> mapaResposta;
	
	public MapaCriador(String[] linhas) {
		primeiraLinha = linhas[0];
		segundaLinha = linhas[1];
	}

	@Override
	public Map<String, String> processaMapa() {
		mapaResposta = new HashMap<String, String>();
		mapaResposta.put(primeiraLinha, segundaLinha);
		return mapaResposta;
	}

}
