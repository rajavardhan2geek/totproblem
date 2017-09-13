import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public  class Problem52Solution {

	/**
	 * @param args
	 */
	public static List<String> messages;
	public static List<universe> ballotlist;
	public static void fileread(String filename)
	{
		messages = new ArrayList<String>();
		FileReader fr;
		try {
			fr = new FileReader(filename);
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
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		kingdomlist kingdomlist = new kingdomlist();
		kingdomlist.fivekingdoms.add(new kingdom("Land", "Panda"));
		kingdomlist.fivekingdoms.add(new kingdom("Ice", "Mammooth"));
		kingdomlist.fivekingdoms.add(new kingdom("Air", "owl"));
		kingdomlist.fivekingdoms.add(new kingdom("Fire", "Dragon"));
		kingdomlist.fivekingdoms.add(new kingdom("Water", "Octopus"));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Who is ruler of southeros");
		String ruler =scanner.nextLine();
		System.out.println("Allies of Ruler?");
		String allies =scanner.nextLine();
		fileread("C:\\Users\\512351\\git\\totproblem\\TotProblem5\\src\\boc-messages.txt");
		System.out.println("Enter the kingdoms competing to be the ruler:");
		String name = scanner.nextLine();
		
		while(!name.isEmpty())
		{
		
			kingdomlist.competentrulers.add(kingdomlist.searchList(name));
			
			name = scanner.nextLine();
			
		}
		 ballotlist =Assignmessagesrandomly(kingdomlist);
		for(universe univ : ballotlist)
		{
			System.out.println("Sender kingdom name"+univ.sender.name+"Count"+univ.sender.getCount());
		}
		 
		scanner.close(); 
		
	}
	public static List<universe> Assignmessagesrandomly(kingdomlist kingdomlist)
	
	{
		int noofmessages =0,i=0;
		universe universe;
		List<universe> ballotlist = new ArrayList<universe>();
		 while(noofmessages<6)
		{
			i=i%kingdomlist.competentrulers.size();
			kingdom sendruler=kingdomlist.competentrulers.get(i);
			++i;
			for(kingdom receiveruler : kingdomlist.fivekingdoms )
			{
				if(sendruler !=receiveruler &&  noofmessages<6 )
				{
					String msg =messages.get(GeneraterandomIndex());
					universe univ = new  universe(sendruler, receiveruler, msg);
					System.out.println(msg+" sender"+sendruler.name+" receive "+receiveruler.name+" count"+sendruler.getCount());
					if(univ.CompareStrings())
						univ.sender.setCount(univ.sender.getCount()+1);
						
					else
						univ.sender.setCount(univ.sender.getCount());
					noofmessages++;
					
					ballotlist.add(univ);
					
				}
			}
		}
	return ballotlist;	
		
	}
	public static  int GeneraterandomIndex()
	{
		int max=messages.size();
		
		int index = (int) (Math.random()*max);
	//	System.out.println("max "+max+"index "+index);
		return index;
		
	}

}
