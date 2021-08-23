package Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class creditCardValidation {
	public static boolean validate (String number) { 
		 
		List<Integer> card = new ArrayList<Integer>(); 
		
		for (int i=0; i<number.length(); i++) { 
			card.add((int) number.charAt(i) - 48);
		}
		System.out.println(card); 
		
		int checknum = card.get(card.size()-1); 
		System.out.println("Checknum: " + checknum); 
		
		Collections.reverse(card);
		int sum = 0; 
		int current = 0; 
		for (int i = 1; i<=card.size()-1; i++) { 
			if (i%2 == 1 || i == 1 ) { 
				current = card.get(i)*2; 
			} else { 
				current = card.get(i); 
			}
			
			if (current > 9) { 
				sum += 1; 
				sum += current%10; 
			} else { 
				sum+=current; 
			}
			
		}
		System.out.println("Sum: " + sum); 
		
		int validate = 10- sum%10; 
		System.out.println("Validation: " + validate); 
		
		if (validate == checknum) { 
			return true; 
		} else {
			return false; 
		}
		
	}
	
	public static void main(String[] args) { 
		
		Scanner in = new Scanner(System.in);
		System.out.println("Type in a card number: "); 
		String card = in.nextLine(); 
		boolean result = validate(card);
		
		System.out.println("Result of card validation = " + result); 
	}
}
