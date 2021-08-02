package week1;

public class Week1 {
	public static void main(String[] args) { 
		LargestCommonSubstring lcs = new LargestCommonSubstring(); 
		MaxAndMin mm = new MaxAndMin(); 
		MissingElement me = new MissingElement(); 
		ProcessorQuadrant pq = new ProcessorQuadrant(); 
		
		System.out.println("String1 = 'Minneapolis'"); 
		System.out.println("String2 = 'Minnesota'"); 
		System.out.println("The length of the longest common substring between the two strings is: " + lcs.lcsLength("Minneapolis", "Minnesota")); 
		System.out.println(); 
		
		int[] numbers = {12,42,53,13,34,63,23,87,72,71,5,38};
		int[] result = mm.findMaxAndMin(numbers);
		System.out.println("Set provided = '{12,42,53,13,34,63,23,87,72,71,5,38}'"); 
		System.out.println("The maximum of the set is: " + result[0]); 
		System.out.println("The minimum of the set is: " + result[1]); 
		System.out.println(); 
		
		int[] sequence = {8,2,4,3,6,1,7};  
		System.out.println("The sequence = '{8,2,4,3,6,1,7}'");
		System.out.println("The missing element is: " + me.missingElement(sequence)); 
		System.out.println(); 
		
		System.out.println("Word to code = 'Quadrant'");
		String coded = pq.code("Quadrant"); 
		System.out.println("Quadrant would become " + coded);
	}
	
}
