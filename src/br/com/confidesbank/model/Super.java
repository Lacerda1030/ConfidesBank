package br.com.confidesbank.model;

import java.time.LocalDateTime;

public class Super extends Client{
	
	private Double rate = 10.00;

	public Super() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Super(String name, String address, String cpf, LocalDateTime dtBirth) {
		super(name, address, cpf, dtBirth);
		// TODO Auto-generated constructor stub
	}

	public Double getRate() {
		return rate;
	}
	
	

}
