package br.com.payment;

import java.time.LocalDateTime;

public class Payment {
	
	private Integer days;
	private Integer valor;
	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	public int getTotal () {
		return days * valor;
	}

}
