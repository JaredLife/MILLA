package is.ru.Db.java;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PlayerTest {
	
	Player TestPlayer = new Player(1, "MorganFreeman");

	@Test
	public void testGetNumber()
	{		
		assertEquals(1, TestPlayer.getNumber()); 
	}
	
	@Test
	public void testGetName()
	{
		assertEquals("MorganFreeman", TestPlayer.getName());
	}
	

