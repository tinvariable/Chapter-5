package bookExamples;

public class FlipRace 
{

	public static void main(String[] args) 
	{
		final int GOAL = 3;
		int count1 = 0, count2 = 0;
		Coin coin1 = new Coin(), coin2 = new Coin();
		
		while (count1 < GOAL && count2 < GOAL)
		{
			coin1.flip();
			coin2.flip();
			
			System.out.println("Coin 1: " + coin1 + "\tCoin 2: " + coin2);
			
			count1 = (coin1.isHeads()) ? count1+1 : 0;
			count2 = (coin2.isHeads()) ? count2+1 : 0;
		}
		if (count1 < GOAL)
		{
			System.out.println("Coin 1 wins!");
		}
		else
		{
			System.out.println("It's a TIE!");
		}
		

	}

}
