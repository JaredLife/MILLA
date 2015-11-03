package is.ru.MILLA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class BusinessLogicTest {


	
	@Test
        public void testToString()
        {	
		Player player1 = new Player(1, "Morgan");
		Player player2 = new Player(2, "Nicolas");

                BusinessLogic bl = new BusinessLogic(player1, player2);

                String compareString = "-------------\n| 1 | 2 | 3 |\n-------------\n| 4 | 5 | 6 |\n-------------\n| 7 | 8 | 9 |\n-------------\n";


                assertEquals(compareString, bl.getGrid());
        }
	
	@Test
        public void testValidInputOne()
        {
		Player player1 = new Player(1, "Morgan");
                Player player2 = new Player(2, "Nicolas");

                BusinessLogic bl = new BusinessLogic(player1, player2);

        	assertEquals(true, bl.isValidInput(1));

        }



        @Test
        public void testValidInputNine()
        {
		Player player1 = new Player(1, "Morgan");
                Player player2 = new Player(2, "Nicolas");

                BusinessLogic bl = new BusinessLogic(player1, player2);

        	assertEquals(true, bl.isValidInput(9));

        }


        @Test
        public void testWrongInputZero()
        {
		Player player1 = new Player(1, "Morgan");
                Player player2 = new Player(2, "Nicolas");

                BusinessLogic bl = new BusinessLogic(player1, player2);

        	assertEquals(false, bl.isValidInput(0));
        }


        @Test
        public void testWrongInputTen()
        {
		Player player1 = new Player(1, "Morgan");
                Player player2 = new Player(2, "Nicolas");

                BusinessLogic bl = new BusinessLogic(player1, player2);

        	assertEquals(false, bl.isValidInput(10));
        }

        @Test
        public void testWrongInputNegative()
        {
		Player player1 = new Player(1, "Morgan");
                Player player2 = new Player(2, "Nicolas");

                BusinessLogic bl = new BusinessLogic(player1, player2);

        	assertEquals(false, bl.isValidInput(-1));
        }
	
	
}




