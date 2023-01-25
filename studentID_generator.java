package basics_of_java;
import java.util.*;


/**(multi-line comment)
 * project: class_demo1
 * description: this demo review the topic of random class modulo
 * @author ning luo
 * create date
 * last-modified date
 *
 */
public class studentID_generator{

	/**
	 * this demo generates student's ID number and prints out
	 * student's name and last four digit of SSN (assuming the last fourth digit from the right is non-zero)
	 */
	public static void main(String[] args) {
		// (single-line comment)
		Scanner scnr = new Scanner(System.in);
		Random randGen = new Random(); //creates a random number generator named randGen
		Random pseudo_rand = new Random(55); //creates another random number generator with seed 55 
		
		
		//the random generate does not actually generate a random number
		//but having the appearance of generating the random number
		//Random () uses an integer known as seed 
		// random seeds the pseudo random number generator with a number based on 
		//the current time, since time is different for each program, the program will get a unique sequence
		
	
		String firstName;
	    String lastName;
	    int studentID;
	    int studentID_range1_10;
	    int last_4_digits;
	    
 		
		System.out.print("what is your first name? ");
		firstName = scnr.next();
		//String word = scnr.next()
		//String Line = scnr.nextLine()
		//char Character = scnr.next().charAt(0)
		
				
		System.out.print("what is your last name? ");
		lastName = scnr.next();
		
		System.out.print("what is your social security number? ");
		
		int social_num = scnr.nextInt(); //read the 9 digit ssn
		
		last_4_digits = social_num % 10000; //calculate the last four digits
		
		//char randomChar = (char)(random.nextInt(26) + 'a');
		studentID = randGen.nextInt(); //generate the random student number with the range similar to int(it can be negative)
		
		
		int abs_studentID = Math.abs(studentID); 
		//take the absolute value using math function to convert the negative value to positive 
		//Math.sqrt(x)
		//Math.pow()
		
		studentID_range1_10 = randGen.nextInt(10) + 1;
		//randGen.nextInt gives a random number from 0-9; randGen.nextInt(10) + 1 give the range from 1 to 10 

		
		System.out.println(lastName + ", " + firstName);
		System.out.println("your student number is " + studentID);
		
		System.out.println("oh sorry it should be positive " + abs_studentID);
		
		System.out.println("your student number is[1,10] " + studentID_range1_10);

		System.out.println("your next random number is (pseudo_random)" + pseudo_rand.nextInt(10));
		
		System.out.println("your next random number is (pseudo_random)" + pseudo_rand.nextInt(10));
		
		System.out.printf("your last four digits of ssn is %d\n", last_4_digits);
		
		
		System.out.println("closing scanner scnr");
		scnr.close();
		System.out.println("Scanner closed.");

	}

}