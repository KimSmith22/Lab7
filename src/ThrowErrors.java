
import java.util.*;

/**
 * 
 */

/**
 * @author Kimberli
 *
 */
public class ThrowErrors {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variables
		int num;
		String choice = "y";
		String option;

		Scanner k = new Scanner(System.in);

		// outputs etc.....
		System.out.println("Welcome to our Java class.");

		do {
			System.out.println("Which student would you like to learn more about?  Pick a number from 1 to 10:  ");
			num = k.nextInt();
			while (num < 0 || num > 10) {// begin if statement to prompt input
											// error correction
				System.out.println("That student does not exist.  Please try again. (enter a number from 1 to 10):  ");
				num = k.nextInt();
			}
			System.out.println(ProgramArrays.students(num - 1));

			System.out.println("What else would you like to know? (enter 'hometown' or 'favorite food')");
			k.nextLine();
			option = k.nextLine();
				if(option.equals("favorite food")){
					System.out.println(ProgramArrays.food(num - 1) );
				}else {
					if(option.equals("hometown")){
						System.out.println(ProgramArrays.town(num - 1));
					}
				}
			
			System.out.println("Continue? y/n");
			choice = k.nextLine();
		} while (choice.equals("y"));
	}// psvm

}// end class ThrowErrors
