package com.luizeduardo.cursomc.handler;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer status;
	private String mensagem;
	private Long timestamp;

	public StandardError() {

	}

	/*construtor para pegar o status da mensagem, o corpo e a data/hora*/
	public StandardError(Integer status, String mensagem, Long time) {
		this.status = status;
		this.mensagem = mensagem;
		this.timestamp = time;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

}
