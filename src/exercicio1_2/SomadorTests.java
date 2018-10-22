package exercicio1_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SomadorTests {
	
	private SomadorCorreto somCorreto;
	private Cliente c;

	@BeforeEach
	void setUp() throws Exception {
		somCorreto = new SomadorCorreto();
		c = new Cliente(somCorreto);
	}

	@Test
	void testaSoma() {
		assertEquals(10, c.executar());
	}

}
