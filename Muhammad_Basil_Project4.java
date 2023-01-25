package projects;

import java.util.Random;
import java.util.Scanner;

public class Muhammad_Basil_Project4 { // Name. Section is ITSS 3311.003

	public static void main(String[] args) {
		// Declare vars
		int[] sea = new int[20];
		int[] hit = new int[20];
		//int ship1;
		int guess;
		int guesses = 0;
		int sum = 0;
		String intro = null;
		
		//Create objects for Scanner (input) and Random (random) classes.
		Scanner input = new Scanner(System.in);
		Random random = new Random(); // Creates the random class object random
				
		// Print Intro Message 
		prtIntro(intro); 

		// Print Sea and Hit Array
		 
		int ship1 = random.nextInt(20) - 3;
		
		for (int i =ship1; i<ship1+4; i++) {
			sea[i]=1;
			
		}
		// Print status of the board
		prtArray(sea, "Sea");
		System.out.println(" ");
		prtArray(hit, "Hit");
		
		// Calculate amount of guesses 
		while(sum<4) {
			System.out.println();
			System.out.println("Enter an integer index value (0-19) to try to hit the battleship: ");
			guess = input.nextInt();
			while(guess<0 && guess>19) {
				System.out.println("Enter an integer index value (0-19) to try to hit the battleship: ");
				sea[guess] = input.nextInt();
			}
			guesses++;
			if(sea[guess]==1) {
				System.out.print("HIT! ");
				hit[guess]=1;
			}
			else {
				System.out.print("MISS!");
				
			}
			sum = 0;
			for(int n = 0; n<20; n++) {
				if(hit[n]==1)
					sum++;
			}
		} 
		
		// Print Response messages
		System.out.println("SUNK! ");
		prtArray(sea,"Sea");
		System.out.println();
		prtArray(hit, "Hit");
		System.out.println(" ");
		System.out.print("Congratulations on sinking the battleship! ");
		System.out.println("it took: " +guesses+ " guesses.");
	
	} // End of main method 
	
	// Name: prtIntro
	// Description: when invoked, it prints the Intro message.
	// Return Type: String
	// Parms: String intro

	public static void prtIntro(String intro) {
		System.out.println("Welcome to the great game of MiniBattleship! Guess the location of the battleship until you have sunk it!");
		return; 
		
	// Name: prtArray
	// Description: When invoked, the program prints the Array
	// Return: Type: integer
	// Parms: int [] array, String arrayName
	}
	public static void prtArray(int[] array, String arrayName) {
		System.out.print(arrayName+ ": ");
		for(int i = 0; i <array.length; i++) {
			System.out.print(array[i]+ " ");
			
		}
	}
	

}

