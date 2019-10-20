package service;

public class Frete {
	
	private TipoDoFrete tipo;
	
	public Frete(TipoDoFrete tipo) {
		this.tipo=tipo;
	}
	
	public double calculaFrete(int distancia) {
		double preco=0;
		if(TipoDoFrete.NORMAL.equals(tipo)) {
			preco = distancia*1.25+10;
		} else if (TipoDoFrete.SEDEX.equals(tipo)) {
			preco = distancia*1.45+12;
		}
		
		return preco;
	}
	
	

}
