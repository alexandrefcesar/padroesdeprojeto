package singleton;

public class Gerenciar {
	
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
