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

}
