package br.com.confidesbank.model;

public class Account {
	
	private Double balance;
	private Integer number;
	private Integer agency;
	private Client holder;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(Integer number, Integer agency) {
		super();
		
		this.number = number;
		this.agency = agency;
		
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getAgency() {
		return agency;
	}

	public void setAgency(Integer agency) {
		this.agency = agency;
	}

	public Client getHolder() {
		return holder;
	}

	public void setHolder(Client holder) {
		this.holder = holder;
	}
	
	public void deposit(Double value) {
		balance += value;	
	}

}
