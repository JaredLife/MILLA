package is.ru.MILLA;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class NodeTest {

	@Test	
	public void testSetOwnerNonEmpty()
	{
		Node testNode = new Node(1);
		Player testPlayer = new Player(1, "MorganFreeman");
		testNode.setOwner(testPlayer);
		assertEquals(testPlayer,  testNode.getOwner());	
	}
	
        @Test
	public void testSetOwnerEmpty()
 	{
		Node testNode = new Node(1);
                assertEquals(null, testNode.getOwner());
	}
		
        @Test
	public void testIsEmptyForEmpty()
	{
		Node testNode = new Node(1);
		assertEquals(true, testNode.isEmpty());
	}

	@Test
	public void testIsEmptyForNonEmpty()
	{
		Node testNode = new Node(1);
		Player testPlayer = new Player(1, "MorganFreeman");
                testNode.setOwner(testPlayer);
                assertEquals(false, testNode.isEmpty());
	}


}
