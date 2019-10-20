package service.imposto;

import service.Imposto;

public class ICMS implements Imposto {
	private double valor;
	
	public ICMS(double valor) {
		this.valor= valor ;
	}

	@Override
	public double calcularImposto() {
		// TODO Auto-generated method stub
		return this.valor*0.10;
	}

}
