package com.kingdom.controller;

import java.util.ArrayList;
import java.util.List;

import com.kingdom.model.kingdom;

public class kingdomlist {

	private List<kingdom> kingdomlist;
	
	public List<kingdom> getKingdomlist() {
		return kingdomlist;
	}

	public void setKingdomlist(List<kingdom> kingdomlist) {
		this.kingdomlist = kingdomlist;
	}
	
	
	public void addtokingdomlist(kingdom kingdom)
	{
		if(!kingdomlist.contains(kingdom))
			kingdomlist.add(kingdom);
	}
	public kingdom searchList(kingdom searchkingdom)
	{
	
		kingdom fkingdom = null;
		for(kingdom kking:kingdomlist)
		{
			if(kking.getKingdomname().equals(searchkingdom.getKingdomname()))
				fkingdom= searchkingdom;
			else
				fkingdom= null;
		}
		return fkingdom;
		
		
	}
	public kingdomlist()
	{
		kingdomlist= new ArrayList<kingdom>();
	}
	
}
