package br.com.domain.mensagem;

public class MensagemSMS implements Mensagem {

	@Override
	public void enviarMensagem(String msg) {
		System.out.println("SMS: " + msg);
		
	}


}
