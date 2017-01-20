public class TTTplayer{
	
	//declare properties
	private String name;
	private String xo;
	private boolean hasWon;

	//constructor with default values
	public TTTplayer(){
		String name = "player 1";
		String xo = "x";
		boolean hasWon = false;
	}
	
	//getters and setters
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		name = newName;
	}
	
	public String getxo(){
		return xo;
	}
	
	public void setxo(String newxo){
		xo = newxo;
	}
	
	public String gethasWon(){
		return hasWon;
	}
	
	public void sethasWon(String newhasWon){
		name = newhasWon;
	}
	
	public String toString(){
		return name + " " + xo + " " + hasWon;
	}
	
}
