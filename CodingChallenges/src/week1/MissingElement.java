package week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
	public int missingElement(int[] numbers) { 
		
		List<Integer> numberList = new ArrayList<Integer>(); 
		for (int i = 0; i<numbers.length; i++) { 
			numberList.add(numbers[i]); 
		}
		
		Collections.sort(numberList);
		
		for (int i = 0; i<numberList.size()-1; i++) { 
			if (numberList.get(i+1)-numberList.get(i) > 1) { 
				return numberList.get(i+1)-1; 
			}
		}
		return 0; 
	}
}
