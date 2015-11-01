public class Player {
	
	private static int PlayerNumber;	
	private static String PlayerName;
	
	public Player(int number, String name)
	{
		PlayerNumber = number;
		PlayerName = name;
	}
	
	public int getNumber()
	{
		return PlayerNumber;
	}
	
	public String getName()
	{
		return PlayerName;
	}

}
