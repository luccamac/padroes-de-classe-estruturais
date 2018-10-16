package exercicio1_2;

public class App {

	public static void main(String[] args) {
		SomadorExistente se = new SomadorExistente();
		Cliente c = new Cliente(se);
		
		SomadorCorreto sc = new SomadorCorreto();
		Cliente c2 = new Cliente(sc);
		
		c.executar();
		c2.executar();
		
	}

}
