package com.kingdom.views;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kingdom.controller.KingdomMsgProblem;
import com.kingdom.controller.competentrulers;
import com.kingdom.controller.kingdomlist;
import com.kingdom.controller.universe;
import com.kingdom.model.kingdom;
import com.kingdom.process.Processmessages;

public class SendMessagestoKingdom {


	public static List<String> readfromfile(String path)
	{
		List<String> messages = new ArrayList<String>();
		FileReader fr;
		try {
			fr = new FileReader(path);
			BufferedReader br= new BufferedReader(fr);
			int i;
			while((i=br.read())!=-1)
			{
				String str =br.readLine();
				messages.add(str);
				
			}
		
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return messages;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> messages;

		kingdomlist kingdomlist = new kingdomlist();
		System.out.println("Enter ruler");
		String ruler=sc.nextLine();
		KingdomMsgProblem problem1 = new KingdomMsgProblem();
		if(!ruler.equalsIgnoreCase("None"))
		{
			System.out.println(ruler+"wants to send messages to allies ");
			System.out.println("to stop input press ctrl+Z ");
			messages = new ArrayList<String>();
			while(sc.hasNextLine())
			{
				messages.add(sc.nextLine());
			}
			
			
			List<kingdom> allies =problem1.DecodeMessage(messages,kingdomlist);
			System.out.println("Allies of kingdom:");
			for(kingdom akingdom:allies)
				System.out.println(akingdom.getKingdomname());
		
		}
		else
		{
			messages=readfromfile("src/boc-messages.txt");
			Processmessages processmsg = new Processmessages(problem1);
						
			for(kingdom kingdom:kingdomlist.getKingdomlist())
				System.out.println(kingdom.getKingdomname());
				System.out.println("Enter the kingdoms competing to be the ruler or press ctrl+z to quit");
				competentrulers crulers = new competentrulers();
				String kingdomname="continue";
				while(sc.hasNextLine())
				{
					 kingdomname = sc.nextLine();
					 System.out.println(kingdomname);
					kingdom fkingdom = (kingdomlist.searchList(kingdomname));
					 System.out.println(fkingdom);
					if(fkingdom!=null)
						crulers.competentrulers.add(fkingdom);
				
				}
				
				processmsg.setMessages(messages);
				List<universe> ballotrulers = processmsg.assignmessagesrandomly(kingdomlist, crulers);
				 
				System.out.println("round ***************");
				for(universe univ:ballotrulers)
				{
					System.out.println("Sender name"+univ.getSender().getKingdomname()+" count"+univ.getReceiver().getMessage());
					System.out.println("receiver name"+univ.getReceiver().getKingdomname());
				}
		System.out.println("competent rulers***************");
		for(kingdom ckingdom: crulers.getCompetentrulers())
			System.out.println(ckingdom.getKingdomname());
		
		
		/*System.out.println("messages**********************");
		for(String message : messages)
			System.out.println(message);*/
		
	  }
	}

}
