package br.com.DesafioItau.mapper;

import org.springframework.stereotype.Component;

import br.com.DesafioItau.domain.model.Transacao;
import br.com.DesafioItau.web.dto.TransacaoDTO;

@Component
public class TransacaoMapper {

	public Transacao toModel(TransacaoDTO dto) {
		return new Transacao(dto.valor(), dto.dataHora());
	}
	
}
