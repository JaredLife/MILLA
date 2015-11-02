package is.ru.MILLA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest {

	@Test
	public void testGetNumber()
	{
		Player TestPlayer = new Player(1, "MorganFreeman");		
		assertEquals(1, TestPlayer.getNumber()); 
	}
	
	@Test
	public void testGetName()
	{
		Player TestPlayer = new Player(1, "MorganFreeman");
		assertEquals("MorganFreeman", TestPlayer.getName());
	}

	@Test
	public void testGetSymbolForP1()
	{
		Player TestPlayer = new Player(1, "MorganFreeman");
		assertEquals("O", TestPlayer.getSymbol());
	}

        @Test
        public void testGetSymbolForP2()
        {
                Player TestPlayer = new Player(2, "MorganFreeman");
                assertEquals("X", TestPlayer.getSymbol());
        }

}
