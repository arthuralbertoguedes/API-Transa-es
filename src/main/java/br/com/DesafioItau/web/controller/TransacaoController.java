package br.com.DesafioItau.web.controller;


import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.DesafioItau.mapper.TransacaoMapper;
import br.com.DesafioItau.service.TransacaoService;
import br.com.DesafioItau.web.dto.TransacaoDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class TransacaoController {


	private final TransacaoService transacaoService;
	private final TransacaoMapper mapper;
    private static final Logger logger = LoggerFactory.getLogger(TransacaoController.class);

    public TransacaoController(TransacaoService transacaoService, TransacaoMapper mapper) {
    	this.transacaoService = transacaoService;
    	this.mapper = mapper;
    }
    
	@PostMapping("/transacao")
	public HttpEntity<TransacaoDTO> salvar(@RequestBody TransacaoDTO dto){
		
		logger.info("Iniciando processo para salvar nova transação...");
		
		
		transacaoService.adicionarTransacao(mapper.toModel(dto));
		
		logger.info("Transações salvas: {}", transacaoService.getTransacoes());
		
		return null;
	}
}
