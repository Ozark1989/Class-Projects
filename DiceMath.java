//importing the Random class
import java.util.Random;
// Create Dice Math class
class DiceMath {

// Create Dice Math class
	 int diceNum(int sides)
	 {
		 Random randomGenerator = new Random();
		 
		 //This could have returned the value directly
		 //return = randomGenerator.nextInt (sides) + 1
		 int randomInt = randomGenerator.nextInt (sides) +1;
	    
		// returns random int
		return randomInt;
	
	}
}