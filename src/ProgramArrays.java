
public class ProgramArrays {
	
public static String students(int num){
	String [] students = new String[10];
	students[0] =  "Lisa";
	students[1] = "Jeff";
	students[2] = "Mary";
	students[3] = "Liz";
	students[4] = "Mark";
	students[5] = "Ben";
	students[6] = "Don";
	students[7] = "Amy";
	students[8] = "Susan";
	students[9] = "Mike";
	
	String studentName = students[num];
			return studentName;

	}	//end student array method

public static String food(int option){
	String[] food = new String[10];
	food[0] = "salad";
	food[1] = "cake";
	food[2] = "pizza";
	food[3] = "gyros";
	food[4] = "fish";
	food[5] = "burgers";
	food[6] = "chicken";
	food[7] = "fruit";
	food[8] = "lasagna";
	food[9] = "oranges";
	
	String favoriteFood = food[option];
		return favoriteFood;
	}//end food method

public static String town(int option){
	String[] town = new String[10];
	town[0] = "detroit";
	town[1] = "dearborn";
	town[2] = "livonia";
	town[3] = "troy";
	town[4] = "canton";
	town[5] = "westland";
	town[6] = "saline";
	town[7] = "ann arbor";http://javadevnotes.com/java-string-array-exampleshttp://javadevnotes.com/java-string-array-examples
	town[8] = "ypsilanti";
	town[9] = "taylor";
	
	String hometown = town[option];
		return hometown;
}
}//end class
