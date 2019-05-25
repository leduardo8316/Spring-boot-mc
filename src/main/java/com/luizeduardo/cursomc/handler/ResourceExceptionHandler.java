package com.luizeduardo.cursomc.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.luizeduardo.cursomc.exceptions.ObjectNotFoundException;

/*anotação para indicar que minha classe vai servir como interceptadora e tratar os erros*/
@ControllerAdvice
public class ResourceExceptionHandler {

	/* Anotação para indicar a classe que vai pegar a excessão e tratar */
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {

		StandardError standardError = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(),
				System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standardError);
	}
}
