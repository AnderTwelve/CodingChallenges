package week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessorQuadrant {
	public String encode(String toCode) { 
		List<String> Cypher = makeCode(); 
		
		String coded = ""; 
		String insert = new String(); 
		String sub = new String(); 
		int rand = 0; 
		toCode = toCode.toUpperCase();
		for (int i = 0; i<toCode.length(); i++) { 
			 insert = (String) Cypher.get((int)(toCode.charAt(i)-65));
			 if (insert.length() > 2) { 
				 sub = insert.substring(2, insert.length()); 
				 if (sub.length() > 6 && sub.length()%2 != 0) { 
					 insert = String.format("%c%c",  sub.charAt(3), sub.charAt(4)); 
				 } else { 
					 insert = String.format("%c%c", sub.charAt(0), sub.charAt(1));  
				 }
				 
			 } 
			 //rand = (int)Math.floor(Math.random()*((insert.length()/2)))*2;
			 //insert = String.format("%c%c", insert.charAt(rand), insert.charAt(rand+1));  
			 coded+=insert; 
		}
		return coded; 
	}
	
	public boolean isPrime(int index) { 
		if (index < 2) { 
			return true; 
		}
		for (int i = 2; i < index; i++) { 
			if (index%i == 0) { 
				return false; 
			}
		}
		return true; 
	}
	
	public List<Integer> getFactors(int index) { 
		List<Integer> factors = new ArrayList<Integer>(); 
		
		for (int i = 2; i <= Math.floor(index/2); i++) { 
			if (index%i == 0) { 
				factors.add(i); 
			}
		}
		return factors; 
	}
	
	public List<String> makeCode() { 
		int charValue = 65; 
		StringBuilder insert = new StringBuilder(); 
		int multiple = 1; 
		int factor = 0; 
		List<Integer> factors = new ArrayList<Integer>(); 
		List<String> code = new ArrayList<String>(); 
		
		for (int i = 1; i<=26; i++) { 
			insert.delete(0, insert.length());  
			multiple = 1; 
			insert.append((char)charValue); 
			insert.append(multiple);
			if (isPrime(i)) { 
				code.add(insert.toString()); 
				charValue+=1; 
				continue; 
			} else { 
				factors = getFactors(i); 
				for (int j = 0; j < factors.size(); j++) { 
					insert.append((char)(64+factors.get(j))); 
					insert.append(factors.get(factors.size()-1-j)); 
				}
				code.add(insert.toString()); 
				charValue+=1; 
			}
			
		}
		System.out.println(code); 
		return code; 
	}
	
	
}
