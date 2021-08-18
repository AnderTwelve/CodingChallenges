package Week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bucketize {
	
	public List<String> Bucketize(String words, int size) { 
		List<String> result = new ArrayList<String>(); 
		String toInsert = new String(); 
		String temp = new String(); 
		Boolean inserted = false; 
		int k = 0; 
		int j = 0; 
		int marker = 0; 
		
		outer:
		for (int i = 0; i < words.length(); i++) { 
			marker = 0;
			if (words.charAt(i) != ' ' ) { 
				toInsert+= words.charAt(i); 
			} else if (words.charAt(i) == ' ' && toInsert.length() < size) {
				k = toInsert.length(); 
				j = i + 1; 
				inserted = false; 
				
				inner:
				while(!inserted) { 
					if (j == words.length() - 1) { 
						temp+= words.charAt(j);  
						if (toInsert.length() + temp.length() >= size) { 
							result.add(toInsert); 
							result.add(temp); inserted = true; 
						} else { 
							toInsert += ' '; 
							toInsert += temp; 
							result.add(toInsert); 
							inserted = true;
						}
					}
					
					if (words.charAt(j) != ' ') { 
						temp += words.charAt(j); 
						j+=1; 
						
						if (temp.length() > size) { 
							List<String> empty = new ArrayList<String>();
							return empty; 
						}
					} else { 
						if ((temp.length() + toInsert.length()) <= size-1) {  
							toInsert += ' '; 
							toInsert += temp; 
							temp = ""; 
							j+=1;  
						} else if (temp.length() + toInsert.length() > size-1)  { 
							for(int x = 0; x < result.size(); x++) { 
								marker += result.get(x).length() + 1; 
							}
							i = marker + toInsert.length(); 
							result.add(toInsert); 
							toInsert = "";
							temp = ""; 
							inserted = true;
							break; 
						} 
					}
				}
			}
		}
		return result; 
	}
	
	public static void main(String[] args) { 
		Bucketize wordBucket = new Bucketize(); 
		Scanner in = new Scanner(System.in); 
		System.out.println("Type in a paragraph of text: ");
		String input = in.nextLine(); 
		
		System.out.println("Please provide a size for the buckets: "); 
		int size = in.nextInt(); 
		
		List<String> result = wordBucket.Bucketize(input, size); 
		System.out.println(result); 
		
	}
	
}
