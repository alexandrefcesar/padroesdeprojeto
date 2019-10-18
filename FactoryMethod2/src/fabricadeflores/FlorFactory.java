package fabricadeflores;

public class FlorFactory {

	public FlorIF gerarFlor(String flor) {
		//System.out.println("fabrica"+flor);
		if (flor == "" || flor == null) {
			return null;
		} 
		
		if (flor.toUpperCase().equals("ROSA")) {
			return new Rosa();
		} else if (flor.toUpperCase().equals("ORQUIDEA")) {
			return new Orquidea();
		} else if (flor.toUpperCase().equals("MARGARIDA")) {
			//System.out.println("aqui de novo");
			return new Margarida();
		} 
			return null;
	
	}

}
