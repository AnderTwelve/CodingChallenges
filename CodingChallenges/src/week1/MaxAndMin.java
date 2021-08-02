package week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxAndMin {
	public int[] findMaxAndMin(int[] numbers) { 
		int[] maxmin = {0,0};
		List<Integer> numberList = new ArrayList(); 
		for (int i =0; i<numbers.length; i++) { 
			numberList.add(numbers[i]); 
		}
		
		maxmin[0] = Collections.max(numberList); 
		maxmin[1] = Collections.min(numberList); 
		
		return maxmin; 
	}
}
