import java.util.Scanner;
class DiceRoll extends DiceMath {
	public static void main(String[] args)
	{	
	Scanner input = new Scanner (System.in);
	System.out.println ( "Enter how many number of sides that the dice has:");
	int sides = input.nextInt();
	DiceMath dice= new DiceMath();
	System.out.println ("Please enter the number of dice you would like to roll:");
	int numDice = input.nextint();
	
	
	for (int i=0, i<numOfDice; i++)
	{
		int num = dice.diceNum(sides);

	
	System.out.println(num);}
	}
}
	
