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
	public kingdom searchList(String kingdomname)
	{
	
		kingdom fkingdom = null;
		for(kingdom kking:kingdomlist)
		{
			if(kking.getKingdomname().equalsIgnoreCase(kingdomname))
							return kking;
		}
		return fkingdom;
		
		
	}
	public kingdomlist()
	{
		kingdomlist= new ArrayList<kingdom>();
		kingdomlist.add(new kingdom("Air","Owl"));
		kingdomlist.add(new kingdom("Land","Panda"));
		kingdomlist.add(new kingdom("Water","Octopus"));
		kingdomlist.add(new kingdom("Fire","Dragon"));
		kingdomlist.add(new kingdom("Space","Mammoth"));
		
	}
	
}
