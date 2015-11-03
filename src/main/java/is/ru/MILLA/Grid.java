package is.ru.MILLA;


public class Grid {
	
	private Node[] nodes = new Node[9];
	

	public Grid()
	{
		for(int i = 0; i < 9; i++)
		{
			Node node = new Node(i+1);
			nodes[i] = node;
		}
	}

	public Node[] getNodes()
	{
		return nodes;
	}

	public void changeNodeOwnerInGrid(Player owner, int nodeNumber)
	{
		nodes[nodeNumber-1].setOwner(owner);
	}

			
	public String toString()
        {
    	int counter = 0;
    	
        String grid = "-------------\n|";
            
        for(int k = 0; k < 3; k++)
        {
              for(int j = 0; j < 3; j++)
              {                  
		String symbol = " ";


                  if(nodes[counter].getOwner() == null)
                  {
                          symbol += nodes[counter].getNumber();
                  }
                  else
                  {
                          symbol += nodes[counter].getOwner().getSymbol();
                  }
                  grid += symbol + " |";
                  counter++;
              }
        
              if(k < 2)
              {
            	  grid += "\n-------------\n|";
              }
              else
              {
            	  grid += "\n-------------\n";
              }
              
        }
            

            return grid;
        }

	public boolean isWinner()
	{
		if(nodes[0].getOwner() ==  nodes[1].getOwner() && nodes[1].getOwner() ==  nodes[2].getOwner() && nodes[1].getOwner() != null){
			return true;
		}else if(nodes[3].getOwner() ==  nodes[4].getOwner() && nodes[4].getOwner() ==  nodes[5].getOwner() && nodes[3].getOwner() != null){
                        return true;
		}else if(nodes[6].getOwner() ==  nodes[7].getOwner() && nodes[7].getOwner() ==  nodes[8].getOwner() && nodes[6].getOwner() != null){
                        return true;
		}else if(nodes[0].getOwner() ==  nodes[3].getOwner() && nodes[3].getOwner() ==  nodes[6].getOwner() && nodes[0].getOwner() != null){
                        return true;
		}else if(nodes[1].getOwner() ==  nodes[4].getOwner() && nodes[4].getOwner() ==  nodes[7].getOwner() && nodes[1].getOwner() != null){
                        return true;
		}else if(nodes[2].getOwner() ==  nodes[5].getOwner() && nodes[5].getOwner() ==  nodes[8].getOwner() && nodes[2].getOwner() != null){
                        return true;
		}else if(nodes[0].getOwner() ==  nodes[4].getOwner() && nodes[4].getOwner() ==  nodes[8].getOwner() && nodes[0].getOwner() != null){
                        return true;
		}else if(nodes[2].getOwner() ==  nodes[4].getOwner() && nodes[4].getOwner() ==  nodes[6].getOwner() && nodes[2].getOwner() != null){
                        return true;
		}else{
			return false;
		}
	}

}
