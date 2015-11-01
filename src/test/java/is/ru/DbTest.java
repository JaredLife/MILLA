package is.ru.Db.java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class NodeTest {

	@Test	
	public void testSetOwner()
	{
		
		Node testNode = new Node(1);
		assertEquals(null,  testNode.getOwner());
		
		Player testPlayer = new Player(1, "MorganFreeman");
		testNode.setOwner(testPlayer);
		assertEquals(testPlayer,  testNode.getOwner());
		
	}
	
        @Test
	public void testIsEmpty()
	{
		Node testNode = new Node(1);
		assertEquals(true, testNode.isEmpty());
		
		Player testPlayer = new Player(1, "MorganFreeman");
		testNode.setOwner(testPlayer);
		assertEquals(false, testNode.isEmpty());
	}

}
