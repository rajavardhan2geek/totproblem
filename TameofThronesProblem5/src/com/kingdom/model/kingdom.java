package com.kingdom.model;

public class kingdom {

	private String name;
	private String animal;
	private int count=0;
	private String message;
	public kingdom(){
		
	}
	public kingdom(String name,String animal){
		this.name=name;
		this.animal=animal;
		
	}
	
	public String getKingdomname() {
		return name;
	}
	public void setKingdomname(String kingdomname) {
		this.name = kingdomname;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int message) {
		this.count = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
