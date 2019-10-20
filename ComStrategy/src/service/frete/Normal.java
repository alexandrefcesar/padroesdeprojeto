package service.frete;

import service.Frete;

public class Normal implements Frete {

	public double calculaFrete(int distancia) {

		return distancia * 1.25 + 10;

	}
}
