package br.com.DesafioItau.base;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import br.com.DesafioItau.web.dto.ResponseErrorDTO;

@ControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResponseErrorDTO> valorNaoPositivoExceptionHandler(MethodArgumentNotValidException exception){
		
		 List<String> mensagens = exception.getBindingResult()
									        .getFieldErrors()
									        .stream()
									        .map(error -> String.format("Campo '%s': %s", error.getField(), error.getDefaultMessage()))
									        .toList();
		return ResponseEntity.badRequest().body(new ResponseErrorDTO(mensagens));
	}
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<ResponseErrorDTO> valorNaoPositivoExceptionHandler(HttpMessageNotReadableException exception){
		return ResponseEntity.badRequest().body(new ResponseErrorDTO(List.of("Parâmetros não permitidos.")));
	}
	
	
	
}
