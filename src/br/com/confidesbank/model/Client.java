package br.com.confidesbank.model;

import java.time.LocalDateTime;

public class Client {
	
	String name;
	String address;
	String cpf;
	LocalDateTime dtBirth;
	
	public Client() {
		super();
		
	}
	
	public Client(String name, String address, String cpf, LocalDateTime dtBirth) {
		super();
		this.name = name;
		this.address = address;
		this.cpf = cpf;
		this.dtBirth = dtBirth;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public LocalDateTime getDtBirth() {
		return dtBirth;
	}
	
	public void setDtBirth(LocalDateTime dtBirth) {
		this.dtBirth = dtBirth;
	}
	
	

}
