package com.kingdom.model;

public class kingdom {

	public static int i=10;
	private String name;
	private String animal;
	private String message;
	
	public kingdom(){
		
	}
	public kingdom(String name,String animal){
		this.name=name;
		this.animal=animal;
		
	}
	public kingdom(String name,String animal,String message){
		this.name=name;
		this.animal=animal;
		this.message=message;
		
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
