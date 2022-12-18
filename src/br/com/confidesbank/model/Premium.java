package br.com.confidesbank.model;

import java.time.LocalDateTime;

public class Premium extends Client{

	Double rate = 20.00;

	public Premium() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Premium(String name, String address, String cpf, LocalDateTime dtBirth) {
		super(name, address, cpf, dtBirth);
		// TODO Auto-generated constructor stub
	}

	public Double getRate() {
		return rate;
	}
	
	
}
