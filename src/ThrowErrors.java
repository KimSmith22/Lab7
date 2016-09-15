import java.util.Scanner;

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
				String name;
				String favColor;
				String town;
				String food;
				String choice = "y";
				//outputs etc.....
				System.out.println("Welcome to our Java class.")  ;
		do{
				System.out.println("Which student would you like to learn more about?  Pick a number from 1 to 20:  ");
				Scanner k = new Scanner(System.in);
				num = k.nextInt();
				
				
				System.out.println("Student "+num+"is "+ name + ".  What would you like to know about " + name + "?");
				System.out.println("(enter or hometown or favorite food): )");
				k.nextLine();
				
				System.out.println(name + " is from " + town +".  Would you like to know more? (y/n): ");
				choice = k.nextLine();
	}while (choice.equals("y"));
				
	}

}
