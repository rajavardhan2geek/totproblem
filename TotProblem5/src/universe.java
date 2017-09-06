import java.util.Set;
import java.util.TreeMap;


public class universe {

		kingdom sender;
		kingdom receiver;
		String message;
		public universe(kingdom sender,kingdom receiver,String message)
		{
			this.sender = sender;
			this.receiver =receiver;
			this.message=message;
			
		}
		
		private TreeMap<Character,Integer> GenerateCountforCharacters(String message)
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
		public Boolean CompareStrings()
		{
			//compare  user message with  receiver animal 
			//returns true if user message contains receiver animal
			
			TreeMap<Character,Integer> user_msg_char_cnt =GenerateCountforCharacters(this.message);
		//	System.out.println(" receiver msg in univ "+ this.message+" receiver emblem"+receiver.emblem);
			TreeMap<Character,Integer> animal_char_cnt =GenerateCountforCharacters(this.receiver.emblem);
			Set<Character> keysinusermap = user_msg_char_cnt.keySet();
			Set<Character> keysinanimalmap=animal_char_cnt.keySet();
		   
			return keysinusermap.containsAll(keysinanimalmap);	
			
		}
		
	
}
