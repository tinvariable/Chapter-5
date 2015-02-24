package pp1;
import java.util.Scanner;


public class Coin 
{
	private final int HEADS = 0;
	private int face;
	Scanner scan = new Scanner(System.in);
	
	public boolean choose()
	{
		int choice;
		System.out.println("Do you want to flip the coin? Type 1 for yes or 0 for no");
		choice = scan.nextInt(); 
		if (choice == 1)
		{
			flip();
			return true;
		}
		else
		{
			System.exit(0);
			return false;
		}
	}
	public Coin()
	{
		
		flip();
		
	}
	public void flip()
	{
		
		face = (int) (Math.random() * 2);
		
		
	}
	public boolean isHeads()
	{
		return (face == HEADS);
	}
	public String toString()
	{
		return (face == HEADS) ? "HEADS" : "Tails";
	}

}
