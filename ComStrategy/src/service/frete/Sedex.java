package service.frete;

import service.Frete;

public class Sedex implements Frete {

	public double calculaFrete(int distancia) {

		return distancia * 1.45 + 12;

	}

}
