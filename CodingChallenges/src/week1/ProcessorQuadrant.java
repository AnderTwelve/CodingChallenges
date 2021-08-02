package week1;

import java.util.HashMap;
import java.util.Map;

public class ProcessorQuadrant {
	public String code(String toCode) { 
		Map Code = new HashMap(); 
		
		//I wanted to write some loops to make this automatically but I was 
		//struggling with the logic. I knew how to make it so I just did this, 
		//but I plan to revisit and update this part with some loop logic after
		//I figure out how to write it. 
		
		Code.put('A', "A1"); 
		Code.put('B', "B1"); 
		Code.put('C', "C1"); 
		Code.put('D', "D1");
		Code.put('E', "E1"); 
		Code.put('F', "F1C2"); 
		Code.put('G', "G1");
		Code.put('H', "D2H1");
		Code.put('I', "C3I1");
		Code.put('J', "E2J1");
		Code.put('K', "K1");
		Code.put('L', "C4D3F2");
		Code.put('M', "M1");
		Code.put('N', "G2");
		Code.put('O', "C5E3");
		Code.put('P', "D4H2");
		Code.put('Q', "Q1");
		Code.put('R', "C6F3I2");
		Code.put('S', "S1");
		Code.put('T', "D5E4J2");
		Code.put('U', "C7G3");
		Code.put('V', "K2");
		Code.put('W', "W1");
		Code.put('X', "C8D6F4H3");
		Code.put('Y', "E5");
		Code.put('Z', "M2");
		
		
		String coded = ""; 
		String insert = new String(); 
		int rand = 0; 
		toCode = toCode.toUpperCase();
		for (int i = 0; i<toCode.length(); i++) { 
			 insert = (String) Code.get(toCode.charAt(i)); 
			 rand = (int)Math.floor(Math.random()*((insert.length()/2)))*2;
			 insert = String.format("%c%c", insert.charAt(rand), insert.charAt(rand+1));  
			 coded+=insert; 
		}
		return coded; 
	}
}
