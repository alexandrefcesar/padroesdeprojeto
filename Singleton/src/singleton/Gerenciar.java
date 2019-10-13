package singleton;

public class Gerenciar {
	
	
	// 1: Deixar o construtor privado, assim evitando qualquer criar um NEW.
   //  2: Atributos privados e Estatico do mesmo tipo da classe instance
   // 3: Metodo getInstance();
	
	private static Gerenciar gerenciarPrint;
	
	private Gerenciar() {
		
	}
	public static Gerenciar getInstance() {
		if(gerenciarPrint==null) {
		gerenciarPrint = new Gerenciar();
		}
		return gerenciarPrint;
	}

}
