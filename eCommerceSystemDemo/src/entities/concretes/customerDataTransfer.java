package entities.concretes;

import entities.abstracts.dataTransfer;

public class customerDataTransfer implements dataTransfer {
	
	private String email;
	private String password;
	
	public customerDataTransfer() {
		
	}

	public customerDataTransfer(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
