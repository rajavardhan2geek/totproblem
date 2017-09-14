package com.kingdom.process;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.kingdom.controller.KingdomMsgProblem;
import com.kingdom.controller.competentrulers;
import com.kingdom.controller.kingdomlist;
import com.kingdom.controller.universe;
import com.kingdom.model.kingdom;

public class Processmessages  {

	KingdomMsgProblem problem1;
	private static int count;
	private List<String> messages;
	public List<String> getMessages() {
		return messages;
	}
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	public Processmessages(KingdomMsgProblem problem1)
	{
		this.problem1=problem1;
	}
	public Processmessages()
	{
		
	}
	public List<universe> assignmessagesrandomly(kingdomlist kingdomlist,competentrulers competentruler)
	{
		
		List<universe> ballotlist =new ArrayList<universe>();
		List<kingdom> kingdomlistd = kingdomlist.getKingdomlist();
		List<kingdom> crulers =competentruler.getCompetentrulers();
		int noofmessages=6;
		int i=0;
		while(noofmessages>0)
		{
				kingdom sender =crulers.get(GeneraterandomIndex(crulers.size()));
			    kingdom receiver = kingdomlistd.get(GeneraterandomIndex(kingdomlistd.size()));
			   if(sender!=receiver)
			   {
			    String msg= messages.get(GeneraterandomIndex(messages.size()));
			 //   System.out.println(msg+"  "+receiver.getKingdomname());
			    receiver.setMessage(msg);
			    ballotlist.add(new universe(sender, receiver, msg));
				noofmessages--;
			   }
		}
		return ballotlist;
		
		
	}
	
	public void checkmessages(List<universe> listuniverse)
	{
		
		KingdomMsgProblem problem1 = new KingdomMsgProblem();
		
		for(universe univ : listuniverse)
		{
			kingdom receiver =univ.getReceiver();
			kingdom sender = univ.getSender();
			if(problem1.CompareStrings(receiver.getMessage(), receiver.getAnimal()))
			{
			//	System.out.println("matches");
			//	System.out.println(sender.getKingdomname() + "  "+receiver.getKingdomname()+"  "+receiver.getMessage());
				sender.setCount(sender.getCount()+1);
				
			}
					
		}
		
	}
	
	private int GeneraterandomIndex(int size)
	{
		int max=size;
		
		int index = (int) (Math.random()*max);
		if(max==25)
		System.out.println("max "+max+"index "+index);
		return index;
		
	}
	
	
}
