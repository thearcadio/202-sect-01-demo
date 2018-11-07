import java.util.Scanner;

public class RecursiveDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String to concatenate to itself. ");
		String input = sc.nextLine();
		System.out.print("How many time should I concatenate it to itself? ");
		int count = sc.nextInt();
		String output = concatMe(input, count);
		System.out.println("\rThe resulting String is: " + output);
		System.out.println("\rEnter a number to calculate it's factorial ");
		int factorial = sc.nextInt();
		System.out.println(factorial + "! = " + factorial(factorial));
		sc.close();
	}//end of main method
	
	private static String concatMe(String original, int n){
		if(n<=1) return original;
		else return original.concat(concatMe(original, n-1));
	}//end of concatMe method
	
	private static int factorial(int n){
		if(n >= 1) return n * factorial(n-1);
		else return 1;
	}//end of factorial method
}//end of RecursiveDemo