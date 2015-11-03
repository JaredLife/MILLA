package is.ru.MILLA;


public class BusinessLogic
{
	private Grid BlGrid;

	public BusinessLogic()
	{
	   BlGrid = new Grid();
	}

	public String printGrid()
	{
	   return BlGrid.toString();
	}
}
