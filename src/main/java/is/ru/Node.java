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
	
	public String nodeToString()
	{
		String cell = "___\n|";
		
		if(owner != null){
			if(owner.getNumber() == 1){
				cell += "o|";
			}else{
				cell += "x|";
			}
		}else{
			cell += owner.getNumber() + "|";
		}

		//TODO: add underline
		//cell += "underline";
		
		return cell;
	}
	
}
