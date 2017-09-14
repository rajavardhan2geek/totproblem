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
	private List<String> getMessages() {
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
		int noofmessages=6;
		int i=0;
		while(noofmessages>0)
		{
		
			i=i%competentruler.getCompetentrulers().size();
			kingdom sendruler=competentruler.getCompetentrulers().get(i);
			//Collections.shuffle(competentruler.getCompetentrulers());
			++i;
			ballotlist.add(new universe(sendruler, sendruler, sendruler.getMessage()));
					
			Collections.shuffle(competentruler.getCompetentrulers());
				noofmessages--;
		}
		return ballotlist;
		
		
	}
	
	private int GeneraterandomIndex()
	{
		int max=getMessages().size();
		
		int index = (int) (Math.random()*max);
	//	System.out.println("max "+max+"index "+index);
		return index;
		
	}
	
	
}
