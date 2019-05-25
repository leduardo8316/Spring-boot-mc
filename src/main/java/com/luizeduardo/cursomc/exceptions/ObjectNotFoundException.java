package com.luizeduardo.cursomc.exceptions;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String mensagem) {
		super(mensagem); // repassa a mensagem de erro para a classe RuntimeExcection aproveitando a
							// estrutura da classe
	}

	public ObjectNotFoundException(String mensagem, Throwable cause) {
		super(mensagem, cause);
	}
}
