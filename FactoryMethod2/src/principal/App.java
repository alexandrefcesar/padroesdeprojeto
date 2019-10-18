package principal;

import fabricadeflores.FlorFactory;
import fabricadeflores.FlorIF;

public class App {
  // tem como objetivo principal definir uma interface
	// de cria��o de objetos e cada subclasse fica 
	// respons�vel pela cria��o do objeto
	
	
	public static void main(String[] args) {
		FlorFactory flor = new FlorFactory();
		
		FlorIF minhaFlor = flor.gerarFlor("margarida");
		
		minhaFlor.criarFlor();
	}
}
