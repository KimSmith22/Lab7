
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
		//variables
				int num;
				String choice = "y";
				int option = 0;
				
				Scanner k = new Scanner(System.in);
				
				//outputs etc.....
				System.out.println("Welcome to our Java class.")  ;

	do{
				System.out.println("Which student would you like to learn more about?  Pick a number from 1 to 5:  ");
				num = k.nextInt();
			while(num < 0 || num > 5){//begin if statement to prompt input error correction
				System.out.println("That student does not exist.  Please try again. (enter a number from 1 to 5):  ");
				num = k.nextInt();
			}
			switch (num){
			case 1:
				System.out.println("Judy is from Livonia and her favorite color is blue.  Want to know more? 1 for yes 2 for no");
				try{
				option = k.nextInt();
				}catch(IllegalArgumentException e){
					System.out.println("Try again.");
				}
					switch (option){
						case 1:
							System.out.println("Judy likes to drink lemonade.");
							break;
						case 2:
							System.out.println("She lives in an apartment.");
							break;
						}
				break;
			case 2:
				System.out.println("Mel is from Detroit and his favorite food is pizza.");
				break;
			case 3:
				System.out.println("Lisa is from Texas, she moved to Detroit two years ago.");
				break;
			case 4:
				System.out.println("Diane is from Pontiac, she has a dog named Boomer.");
				break;
			case 5:
				System.out.println("Jacob is new to the school, he is still making friends.");
				break;
				}
	System.out.println("Continue? y/n");
	k.nextLine();
	choice = k.nextLine();
		}while(choice.equalsIgnoreCase("y"));
	}//psvm

}//end class ThrowErrors
