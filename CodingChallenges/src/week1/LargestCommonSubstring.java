package week1;

public class LargestCommonSubstring {
	public int lcsLength(String string1, String string2) { 
		char[] one = string1.toCharArray(); 
		char[] two = string2.toCharArray(); 
		
		return solve(one, two, string1.length(), string2.length()); 
	}
	
	public int solve(char[] x, char[]y, int m, int n) { 
		int[][] L = new int[m+1][n+1]; 
		
		for (int i = 0; i<=m; i++) { 
			for (int j = 0; j<=n; j++) { 
				if(i == 0 || j == 0) { 
					L[i][j] = 0;
				} else if (x[i-1] == y[j-1]) { 
					L[i][j] = L[i-1][j-1] + 1; 
				} else { 
					L[i][j] = L[i-1][j] > L[i][j-1] ? L[i-1][j] : L[i][j-1]; 
				}
			}
		}
		
		
		
		
		return L[m][n]; 
	}
}
