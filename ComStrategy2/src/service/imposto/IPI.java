package service.imposto;

import service.Imposto;

public class IPI implements Imposto{
   private double valor;
   
   public IPI(double valor) {
	   this.valor=valor;
   }
	
	
	
	@Override
	public double calcularImposto() {
		// TODO Auto-generated method stub
		return this.valor*0.20;
	}

}
