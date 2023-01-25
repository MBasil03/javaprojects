package projects; 

import java.util.Random;
import java.util.Scanner;

public class Muhammad_Basil_Project3 { // Name. Section is ITSS 3311.003

	public static void main(String[] args) {

		
		//Declare variables.
		String name;
		int die1 = 0;
		int die2 = 0;
		int sum;
		int pairBonus = 0;
		int seven11Bonus = 0;
		int total;
		int tempDie = 0; // Use this var when sorting the dice before displaying
		int turns;
		String playAgain;
		
		
		//Create objects for Scanner (input) and Random (random) classes.
		Scanner input = new Scanner(System.in);
		
		
		//Prompt for and read-in user’s name and chosen operation using Scanner.
		System.out.println("Please enter your name: ");
		name = input.nextLine();
		

		//Print the welcome message and rules of the game.
		prtIntro(name);
		
		
		//Prompt for player to roll the dice using Scanner by entering any character.
		input.nextLine();
		
			// Prompt player to input number of turns 
			do { 
			System.out.println("How many turns would you like to have?");
			turns = input.nextInt();
			
				// For loop which runs the program as many times as the user inputs.
				for (int count = 1; count <= turns; count++) { // Incrementer is count++
					System.out.println(" "); 
					System.out.println("*** Turn " + count + " ****"); // Keeps tracks of turns
					pairBonus = 0;
					seven11Bonus = 0;
					//Generate the dice values using Random. and display the dice values in sequence from low to high.
				
					die1 = getDieValue(die1);
					die2 = getDieValue(die2);
					if (die1 > die2) {
						 tempDie = die2;
						 System.out.println("Dice Roll: " + tempDie + "," + die1 + " ");
					}
					else {
						System.out.println("Dice Roll: " + die1 + "," + die2 + " ");
					}
					//Calculate and display the dice sum, the bonus points, and the total points.
					// Dice sum
					sum = die1 + die2;
					System.out.println("Dice Sum: " + sum + " ");
						
					// 7-11 Bonus points 
					getSeven11Bonus(die1,die2, seven11Bonus);
					
					// Pair Bonus points
					getPairBonus(pairBonus,die1,die2);
					
					//Total points
					total = sum + pairBonus + seven11Bonus;
					System.out.println("Total Points: " + total + " ");
					
					} // connects to for loop
				
					System.out.println(" ");
					// Prompt player to play again
					System.out.println("Would you like to play DieGame again? Enter Y or N:");
					
					playAgain = input.next();
					playAgain = playAgain.toUpperCase();
				
			} while(playAgain.equals("Y"));
			
		
		//Print a message, thanking the user by name, for playing the Dice Game.
		prtOutro(name);
		input.close();	
	} // End of main method
	
	// Name: prtIntro
	// Description: when invoked, it prints the Intro message.
	// Return Type: String
	// Parms: String name
	
	public static void prtIntro(String name) {
		System.out.println("				  Hi " + name +". Welcome to the 3311 Dice Game!");
		System.out.println("		Playing the game is easy - just roll the dice and the computer does the rest.");
		System.out.println("		  The sum of the dice is worth points. You earn 5 bonus if you roll a 7 or 11.");
		System.out.println("				You earn 6 bonus points if you roll doubles.");
		System.out.println("			     Now let's begin - enter any character key to begin.");
		return;
		
	} 
	
	// Name: getDieValue
	// Description: when invoked, it rolls the dice.
	// Return Type: int
	// Parms: int die
	public static int getDieValue(int die) {
	
		Random random = new Random();
		die = random.nextInt(6) + 1; //Assigns random value 1-6 to die
		return die;
	}
	
	// Name: get PairBonus
	// Description: When invoked, the program calculates the pairBonus
	// Return: Type: integer
	// Parms: int pairBonus, int die1, int die2 
	public static int getPairBonus(int pairBonus, int die1, int die2) {
		pairBonus = 0;
		if (die1 == die2) {
			pairBonus = 6; 
			System.out.println("Pair Bonus: " + pairBonus + " ");
		}
		else {
			if  (die1 != die2) {
				pairBonus = 0;
				System.out.println("Pair Bonus: " + pairBonus + " ");
				
			}
				
		}	return pairBonus;
		
		
	}
	
	// Name: Get seven11Bonus
	// Description: When invoked, the program calculates the seven11Bonus
	// Return: Type: integer
	// Parms: int seven11Bonus, int die1, int die2 
	public static int getSeven11Bonus(int die1, int die2, int seven11Bonus) {
	
		if (die1 + die2 == 7) {
			seven11Bonus = 5;
		}
		if (die1 + die2 == 11) {
			seven11Bonus = 5;
		}
		System.out.println("7-11 Bonus: " + seven11Bonus + " ");
	return (seven11Bonus);
	}
	
	// Name: prtOutro
	// Description: when invoked, it prints the Outro message.
	// Return Type: String
	// Parms: String name
	public static void prtOutro(String name) {
		System.out.println("					Thank you for playing 3311 Dice Game, " + name + ".");
		System.out.println("				            Come back and play again any time!"); // Prints outro message
	}

} 

