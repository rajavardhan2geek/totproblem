package com.kingdom.controller;

import java.util.Set;
import java.util.TreeMap;

import com.kingdom.model.kingdom;

public class universe {
	kingdom sender;
	public kingdom getSender() {
		return sender;
	}
	public void setSender(kingdom sender) {
		this.sender = sender;
	}
	public kingdom getReceiver() {
		return receiver;
	}
	public void setReceiver(kingdom receiver) {
		this.receiver = receiver;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	kingdom receiver;
	String message;
	public universe(kingdom sender,kingdom receiver,String message)
	{
		this.sender = sender;
		this.receiver =receiver;
		this.message=message;
		
	}
	
	


}
