package com.kingdom.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

import com.kingdom.model.kingdom;

public class KingdomMsgProblem {

	Map<String,String> kingdomemblems;
	public TreeMap<Character,Integer> GenerateCountforCharacters(String message)
	{
		char[] usr_msg = message.toCharArray();
		
		TreeMap<Character,Integer> CntCharMsg = new TreeMap<Character,Integer>();
		for(Character c :usr_msg )
		{
			if(CntCharMsg.containsKey(c))
				CntCharMsg.put(c,CntCharMsg.get(c)+1 );
			else
				CntCharMsg.put(c,1);
		}
		return CntCharMsg;
	}
	public Boolean CompareStrings(String usr_message,String animal)
	{
		
		TreeMap<Character,Integer> user_msg_char_cnt =GenerateCountforCharacters(usr_message);
		TreeMap<Character,Integer> animal_char_cnt =GenerateCountforCharacters(animal);
		Set<Character> keysinusermap = user_msg_char_cnt.keySet();
		Set<Character> keysinanimalmap=animal_char_cnt.keySet();
	//	System.out.println(user_msg_char_cnt+"char "+animal_char_cnt);
	//	System.out.println("  "+keysinusermap+"  "+keysinanimalmap+"  "+keysinusermap.containsAll(keysinanimalmap));
		return keysinusermap.containsAll(keysinanimalmap);	
		
	}
	public List<kingdom> DecodeMessage(List<String> msglist,kingdomlist listofkingdoms)
	{
		
	    List<kingdom> allieskingdoms = new ArrayList<kingdom>();
		List<kingdom> processedkingdoms = new ArrayList<kingdom>();
		for(String message:msglist)
		{
			kingdom sendmsg_kingdoms= new kingdom();
			StringTokenizer st = new StringTokenizer(message,", \"");
			sendmsg_kingdoms.setKingdomname((String) st.nextElement());	
			System.out.println("Kingdom "+sendmsg_kingdoms.getKingdomname());
			sendmsg_kingdoms.setMessage(((String) st.nextElement()));
			
			while(st.hasMoreElements())
			{
				sendmsg_kingdoms.setMessage(sendmsg_kingdoms.getMessage().concat( (String) st.nextElement()));
			//System.out.println(str_2nd_msg);		
			
			}
			kingdomlist listkingdoms =listofkingdoms;
			kingdom correct_kingdom=listkingdoms.searchList(sendmsg_kingdoms);
		   String animal_of_kingdom =correct_kingdom.getAnimal();
		   processedkingdoms.add(sendmsg_kingdoms);
		   if(CompareStrings(sendmsg_kingdoms.getMessage().toLowerCase(),animal_of_kingdom.toLowerCase()))
		   {
			 
			 allieskingdoms.add(new kingdom(sendmsg_kingdoms.getKingdomname(),animal_of_kingdom));
		   }
			
		}
			
		return allieskingdoms;
	}
	
}
