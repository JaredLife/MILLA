package is.ru.MILLA;

public class Player {
	
	private int PlayerNumber;	
	private String PlayerName;
	private String PlayerSymbol;
	
	public Player(int number, String name)
	{
		PlayerNumber = number;
		PlayerName = name;
		
		if(number == 1){
			PlayerSymbol = "O";
		}else{
			PlayerSymbol = "X";
		}
	}
	
	public int getNumber()
	{
		return PlayerNumber;
	}
	
	public String getName()
	{
		return PlayerName;
	}
	

	public String getSymbol()
	{
		return PlayerSymbol;
	}

}
