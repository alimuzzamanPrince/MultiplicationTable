package Namta;
import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your number: ");
		double num = userInput.nextDouble();
		
		for (double i = 0; i < 10; i++){
			System.out.println(num+" x "+(i+1)+" = "+num*(i+1));
		}

	}

}
