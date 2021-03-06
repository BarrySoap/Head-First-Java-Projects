import java.util.ArrayList;

public class SimpleDotCom 
{
	private ArrayList<String> locationCells;
	private String name;
	private int numOfHits = 0;
	
	public void setLocationCells(ArrayList<String> loc) 
	{
		locationCells = loc;
	}
	
	public String checkGuess(String userInput) 
	{
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		
		if (index >= 0) 
		{
			locationCells.remove(index);
			
			if (locationCells.isEmpty()) 
			{
				result = "kill";
			} else 
			{
				result = "hit";
			}
		}
		return result;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String input) 
	{
		name = input;
	}
}
