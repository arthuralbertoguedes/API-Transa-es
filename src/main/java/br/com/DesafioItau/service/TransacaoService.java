package br.com.DesafioItau.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.DesafioItau.domain.model.Transacao;

@Service
public class TransacaoService {
	
	public List<Transacao> transacoesEmMemoria = new ArrayList<>();
	
	
	public void adicionarTransacao(Transacao transacao) {
		this.transacoesEmMemoria.add(transacao);
	}	
	
	public List<Transacao> getTransacoes(){
		return this.transacoesEmMemoria;
	}
}
