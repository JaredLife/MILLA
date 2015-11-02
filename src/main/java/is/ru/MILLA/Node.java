package is.ru.MILLA;

public class Node {
	
	private static Player owner;
	private static int number;
	
	public Node(int num)
	{
		owner = null;
		number = num; 
	}
	
	public void setOwner(Player player)
	{
		owner = player;
	}
	
	
	public boolean isEmpty()
	{
		if(owner == null){
			return true;
		}else{
			return false;
		}
	}
	
	public Player getOwner()
	{
		if(!isEmpty()){
			return owner;
		}else{
			return null;
		}
	}
	
	public int getNumber()
	{
		return number;
	}
		
}
