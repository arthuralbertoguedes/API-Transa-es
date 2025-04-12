package br.com.DesafioItau.exceptions;

public class ValorNaoPositivoException extends RuntimeException{

	private String mensagem;
	
	public ValorNaoPositivoException() {
		this.mensagem = "O valor informado deve ser positivo.";
	}
	
	public ValorNaoPositivoException(String mensagem) {
		super(mensagem);
	}
}
