package br.com.domain.mensagem;

public class MensagemEmail implements Mensagem{

	@Override
	public void enviarMensagem(String msg) {
		System.out.println("Email: " + msg);
		
	}

}
