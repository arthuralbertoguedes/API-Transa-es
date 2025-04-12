package br.com.DesafioItau.web.dto;

import java.time.LocalDateTime;
import java.util.List;

public class ResponseErrorDTO {

	private List<String> mensagem;
	
	private LocalDateTime timeStamp;
	
	public ResponseErrorDTO(List<String> mensagem) {
		this.mensagem = mensagem;
		this.timeStamp = LocalDateTime.now();
	}

	
	public List<String> getMensagem() {
		return mensagem;
	}


	public void setMensagem(List<String> mensagem) {
		this.mensagem = mensagem;
	}


	public LocalDateTime getTimeStamp() {
		return timeStamp;
	};

	
}
