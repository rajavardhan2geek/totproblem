import java.util.List;


public class kingdom {
	public String name;
	public String emblem;
	public String message;
	List<universe> allies;
	public int count=0;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public kingdom(String name,String emblem) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.emblem=emblem;
	}
	public void send(kingdom to,String message)
	{
		allies.add(new universe(this, to, message));
	}

}
