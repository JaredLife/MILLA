package is.ru.MILLA;

public class Player {	
	private int PlayerNumber;	
	private String PlayerName;
	
	public Player(final int number, final String name) {
		PlayerNumber = number;
		PlayerName = name;
	}
	
	public int getNumber(){
		return PlayerNumber;
	}
	
	public String getName(){
		return PlayerName;
	}
}
