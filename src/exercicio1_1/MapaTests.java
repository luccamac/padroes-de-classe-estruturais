package exercicio1_1;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MapaTests {
	
	private String[] arranjo;
	private Map<String, String> mapaEsperado;
	private MapaCriador mapaCriador;

	@BeforeEach
	void setUp() throws Exception {
		mapaEsperado = new HashMap<String, String>();
		mapaEsperado.put("chave", "valor");
		arranjo = new String[2];
		arranjo[0] = "chave";
		arranjo[1] = "valor";
	}

	@Test
	void testaMapa() {
		mapaCriador = new MapaCriador(arranjo);
		Map<String, String> mapaResposta = mapaCriador.processaMapa();
		assertEquals(mapaEsperado, mapaResposta);
	}

}
