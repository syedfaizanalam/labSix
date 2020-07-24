import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		
		
		int num;
		String input;
		
		do {
		System.out.println("How many sides does your die have?");
		num = scnr.nextInt();
		System.out.print("You've got ");
		System.out.println(generateRandomDie(num) + " and " + generateRandomDie(num) );

		System.out.println("Would you like to play again? [y/n]");
		input = scnr.next();
		} while (input.equals("y"));
		System.out.println("Have a wonderful evening!");
	}
	
	public static int generateRandomDie(int num) {	 
		int die;
		
		die = (int) (Math.random() * ((num)+1));
		
		return die;
	}

}
