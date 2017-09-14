package com.kingdom.controller;

import java.util.ArrayList;
import java.util.List;

import com.kingdom.model.kingdom;

public class competentrulers {

	public List<kingdom> competentrulers;
	public List<kingdom> getCompetentrulers() {
		return competentrulers;
	}
	public void setCompetentrulers(List<kingdom> competentrulers) {
		this.competentrulers = competentrulers;
	}
	public competentrulers()
	{
		competentrulers = new ArrayList<kingdom>();
	}
	
}
