package entities.concretes;

import entities.abstracts.Entities;

public class Producer implements Entities{
	
	private int producerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public Producer(int producerId, String firstName, String lastName, String email, String password) {
		this.producerId = producerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public int getProducerId() {
		return producerId;
	}


	public void setProducerId(int producerId) {
		this.producerId = producerId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
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