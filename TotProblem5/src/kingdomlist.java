import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class kingdomlist {

	List<kingdom> competentrulers;
	List<kingdom> fivekingdoms;
	public kingdomlist()
	{
		fivekingdoms = new ArrayList<kingdom>();
		competentrulers = new  ArrayList<kingdom>();
	}
	
	public kingdom searchList(String name)
	{
		kingdom ele = null;
		for(kingdom temp:fivekingdoms)
		{
			
		
			if(temp.name.equalsIgnoreCase(name))
				{
				System.out.print(temp.name);
					ele= temp;
					break;
				}
			
		}
		System.out.println(ele);
		return ele;
	}
	
}
