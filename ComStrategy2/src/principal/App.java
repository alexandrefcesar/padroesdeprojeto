package principal;

import service.CalculadoraDeImposto;
import service.imposto.ICMS;
import service.imposto.IPI;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraDeImposto calc = new CalculadoraDeImposto();
		ICMS icms = new ICMS(100.0);
		IPI ipi = new IPI(100.0);
		System.out.println(calc.calcularImposto(icms));
		System.out.println(calc.calcularImposto(ipi));

	}

}
