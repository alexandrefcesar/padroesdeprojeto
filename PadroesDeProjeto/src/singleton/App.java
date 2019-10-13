package singleton;

public class App {

	public static void main(String[] args) {
		
		Gerenciar a = Gerenciar.getInstance();
		Gerenciar b = Gerenciar.getInstance();
		Gerenciar c = Gerenciar.getInstance();
		Gerenciar d = Gerenciar.getInstance(); 
		Gerenciar e = Gerenciar.getInstance();
		
		System.out.println(a);
		System.out.println(b);
        System.out.println(c);
	    System.out.println(d);
	    System.out.println(e);
	
	}
}
