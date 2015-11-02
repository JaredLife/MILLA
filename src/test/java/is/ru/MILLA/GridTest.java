
package is.ru.MILLA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GridTest {
	
	@Test
	public void testConstructorForNodeOwner()
	{
		Grid testGrid = new Grid();
		
		Node[] testNodes = testGrid.getNodes();
		
		for(int i = 0; i < 9; i++){
			assertEquals(null, testNodes[i].getOwner());
		}
		
	}

        @Test
        public void testConstructorForNodeNumber()
        {
                Grid testGrid = new Grid();

                Node[] testNodes = testGrid.getNodes();

                for(int i = 0; i < 9; i++){
                        assertEquals(i+1, testNodes[i].getNumber());
                }

        }

	
	
	/*	
	@Test
	public void testToString()
	{
		Grid testGrid = new Grid();
		
		String compareString = "-------------\n" 
					+ "| 1 | 2 | 3 |\n" 
					+ "-------------\n" 
					+ "| 4 | 5 | 6 |\n"
					+ "-------------\n" 
					+ "| 7 | 8 | 9 |\n"
					+ "-------------";
		
		assertEquals(compareString, testGrid.toString());
	}
	*/	

	@Test
	public void testIsWinner()
	{
		Grid testGrid = new Grid();
		Player player1 = new Player(1, "MorganFreeman");
		
		testGrid.changeNodeOwnerInGrid(player1, 1);
		testGrid.changeNodeOwnerInGrid(player1, 2);
		testGrid.changeNodeOwnerInGrid(player1, 3);
		
		assertEquals(true, testGrid.isWinner());
	}
		
} 

