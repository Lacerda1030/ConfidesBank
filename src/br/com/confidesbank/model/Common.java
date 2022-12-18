package br.com.confidesbank.model;

import java.time.LocalDateTime;

public class Common extends Client{

	private Double rate = 5.00;

	public Common() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Common(String name, String address, String cpf, LocalDateTime dtBirth) {
		super(name, address, cpf, dtBirth);
		// TODO Auto-generated constructor stub
	}

	public Double getRate() {
		return rate;
	}
	
	
	
}
