package principal;

import fabricadeflores.FlorFactory;
import fabricadeflores.FlorIF;

public class App {
  // tem como objetivo principal definir uma interface
	// de criação de objetos e cada subclasse fica 
	// responsável pela criação do objeto
	
	
	public static void main(String[] args) {
		FlorFactory flor = new FlorFactory();
		
		FlorIF minhaFlor = flor.gerarFlor("margarida");
		
		minhaFlor.criarFlor();
	}
}
