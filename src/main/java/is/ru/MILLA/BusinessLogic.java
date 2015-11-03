package is.ru.MILLA;


public class BusinessLogic
{
	private Player player1;
	private Player player2;
	private Grid grid;


   
	public BusinessLogic(Player newPlayer1, Player newPlayer2)
        {
                player1 = newPlayer1;
                player2 = newPlayer2;
		grid = new Grid();
 	}	

   	public String getGrid()
   	{
		return grid.toString();
   	}

	public boolean isValidInput(int input)
        {
                Node[] nodes = grid.getNodes();

		if(input < 1 || input > 9){
			return false;
                }else if(nodes[input-1].isEmpty()){
                        return true;
                }else{
                        return false;
                }
        }	
	
	public void markNode(int input, int turnNum)
        {
                if(turnNum % 2 == 0){
                        grid.changeNodeOwnerInGrid(player1, input);
                }else{
                        grid.changeNodeOwnerInGrid(player2, input);
                }
        }

	
	public boolean bingo()
        {
                return grid.isWinner();
        }


}
