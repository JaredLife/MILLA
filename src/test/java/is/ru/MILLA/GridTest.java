
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

	
	
		
	@Test
	public void testToString()
	{
		Grid testGrid = new Grid();
		
		String compareString = "-------------\n| 1 | 2 | 3 |\n-------------\n| 4 | 5 | 6 |\n-------------\n| 7 | 8 | 9 |\n-------------\n";


		assertEquals(compareString, testGrid.toString());
	}
		
	
	@Test
	public void testToStringWithOwner()
	{
		Grid testGrid = new Grid();
		
		Player testPlayer = new Player(1, "Morgan");

		testGrid.changeNodeOwnerInGrid(testPlayer, 1);

		String compareString = "-------------\n| O | 2 | 3 |\n-------------\n| 4 | 5 | 6 |\n-------------\n| 7 | 8 | 9 |\n-------------\n";

		assertEquals(compareString, testGrid.toString());
	}



	@Test
	public void testIsWinnerCond1()
	{
		Grid testGrid = new Grid();
		Player player1 = new Player(1, "MorganFreeman");
		
		testGrid.changeNodeOwnerInGrid(player1, 1);
		testGrid.changeNodeOwnerInGrid(player1, 2);
		testGrid.changeNodeOwnerInGrid(player1, 3);
		
		assertEquals(true, testGrid.isWinner());
	}
		
        @Test
        public void testIsWinnerCond2()
        {
                Grid testGrid = new Grid();
                Player player1 = new Player(1, "MorganFreeman");

                testGrid.changeNodeOwnerInGrid(player1, 4);
                testGrid.changeNodeOwnerInGrid(player1, 5);
                testGrid.changeNodeOwnerInGrid(player1, 6);

                assertEquals(true, testGrid.isWinner());
        }

	@Test
        public void testIsWinnerCond3()
        {
                Grid testGrid = new Grid();
                Player player1 = new Player(1, "MorganFreeman");

                testGrid.changeNodeOwnerInGrid(player1, 7);
                testGrid.changeNodeOwnerInGrid(player1, 8);
                testGrid.changeNodeOwnerInGrid(player1, 9);

                assertEquals(true, testGrid.isWinner());
        }

	@Test
        public void testIsWinnerCond4()
        {
                Grid testGrid = new Grid();
                Player player1 = new Player(1, "MorganFreeman");

                testGrid.changeNodeOwnerInGrid(player1, 1);
                testGrid.changeNodeOwnerInGrid(player1, 4);
                testGrid.changeNodeOwnerInGrid(player1, 7);

                assertEquals(true, testGrid.isWinner());
        }

	@Test
        public void testIsWinnerCond5()
        {
                Grid testGrid = new Grid();
                Player player1 = new Player(1, "MorganFreeman");

                testGrid.changeNodeOwnerInGrid(player1, 2);
                testGrid.changeNodeOwnerInGrid(player1, 5);
                testGrid.changeNodeOwnerInGrid(player1, 8);

                assertEquals(true, testGrid.isWinner());
        }

	@Test
        public void testIsWinnerCond6()
        {
                Grid testGrid = new Grid();
                Player player1 = new Player(1, "MorganFreeman");

                testGrid.changeNodeOwnerInGrid(player1, 3);
                testGrid.changeNodeOwnerInGrid(player1, 6);
                testGrid.changeNodeOwnerInGrid(player1, 9);

                assertEquals(true, testGrid.isWinner());
        }

	@Test
        public void testIsWinnerCond7()
        {
                Grid testGrid = new Grid();
                Player player1 = new Player(1, "MorganFreeman");

                testGrid.changeNodeOwnerInGrid(player1, 1);
                testGrid.changeNodeOwnerInGrid(player1, 5);
                testGrid.changeNodeOwnerInGrid(player1, 9);

                assertEquals(true, testGrid.isWinner());
        }

	@Test
        public void testIsWinnerCond8()
        {
                Grid testGrid = new Grid();
                Player player1 = new Player(1, "MorganFreeman");

                testGrid.changeNodeOwnerInGrid(player1, 3);
                testGrid.changeNodeOwnerInGrid(player1, 5);
                testGrid.changeNodeOwnerInGrid(player1, 7);

                assertEquals(true, testGrid.isWinner());
        }

	@Test
        public void testIsWinnerCondNoWinnerEmptyGrid()
        {
                Grid testGrid = new Grid();

                assertEquals(false, testGrid.isWinner());
        }

	@Test
        public void testIsWinnerNoWinnerNonEmptyGrid()
        {
                Grid testGrid = new Grid();
                Player player1 = new Player(1, "MorganFreeman");
		Player player2 = new Player(2, "NicholasCage");

	        testGrid.changeNodeOwnerInGrid(player2, 1);
                testGrid.changeNodeOwnerInGrid(player1, 2);
                testGrid.changeNodeOwnerInGrid(player2, 3);
                testGrid.changeNodeOwnerInGrid(player1, 4);
                testGrid.changeNodeOwnerInGrid(player1, 5);
                testGrid.changeNodeOwnerInGrid(player2, 6);               
		testGrid.changeNodeOwnerInGrid(player1, 7);
                testGrid.changeNodeOwnerInGrid(player2, 8);
                testGrid.changeNodeOwnerInGrid(player1, 9);

                assertEquals(false, testGrid.isWinner());
        }

} 

