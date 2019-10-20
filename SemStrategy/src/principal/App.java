package principal;

import java.util.Scanner;

import service.Frete;
import service.TipoDoFrete;

public class App {
   public static void main(String[] args) {
	try (Scanner entrada =  new Scanner(System.in)){
		System.out.println("Informe a distancia");
		int distancia = entrada.nextInt();
		System.out.println("Qual o tipo de frete 1 - normal 2 - sedex:");
		int	opcaoFrete = entrada.nextInt();
		//Values retorna uma array de todos os enums 
		TipoDoFrete tipo = TipoDoFrete.values()[opcaoFrete - 1];
		Frete  frete = new Frete(tipo);
		double preco = frete.calculaFrete(distancia);
		//retornar a saida do calculo 
		System.out.printf("O valor total é de R$ %.2f",preco);
		
	}
}
}
