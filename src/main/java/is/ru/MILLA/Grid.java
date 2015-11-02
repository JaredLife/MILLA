package is.ru.MILLA;


public class Grid {
	
	private Node[] nodes = new Node[9];
	
	
	public Grid()
	{
		for(int i = 0; i < 9; i++){
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
		String grid = "-------------\n| ";
		for(Node i : nodes){
			for(int k = 0; k < 3; k++){			
				for(int j = 0; j < 3; j++){
					String symbol = "";
					
					if(i.getOwner() == null){
						symbol = Integer.toString(i.getNumber());	
					}else{
						symbol = i.getOwner().getSymbol();
					}
					grid += symbol + " |";   
				}

				grid += "------------- \n";
			}
		}
		
		return grid;
	}

	public bool isWinner()
	{
		if(nodes[0].getOwner() ==  nodes[1].getOwner() && nodes[1].getOwner() ==  nodes[2].getOwner()){
			return true;
		}else if(nodes[3].getOwner() ==  nodes[4].getOwner() && nodes[4].getOwner() ==  nodes[5].getOwner()){
                        return true;
		}else if(nodes[6].getOwner() ==  nodes[7].getOwner() && nodes[7].getOwner() ==  nodes[8].getOwner()){
                        return true;
		}else if(nodes[0].getOwner() ==  nodes[3].getOwner() && nodes[3].getOwner() ==  nodes[6].getOwner()){
                        return true;
		}else if(nodes[1].getOwner() ==  nodes[4].getOwner() && nodes[4].getOwner() ==  nodes[7].getOwner()){
                        return true;
		}else if(nodes[2].getOwner() ==  nodes[5].getOwner() && nodes[5].getOwner() ==  nodes[8].getOwner()){
                        return true;
		}else if(nodes[0].getOwner() ==  nodes[4].getOwner() && nodes[4].getOwner() ==  nodes[8].getOwner()){
                        return true;
		}else if(nodes[2].getOwner() ==  nodes[4].getOwner() && nodes[4].getOwner() ==  nodes[6].getOwner()){
                        return true;
		}else{
			return false;
		}
	}

}
