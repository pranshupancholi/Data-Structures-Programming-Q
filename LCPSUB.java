
public class LCPSUB {
	public static void main(String[] args) {
		LCPSUB obj = new LCPSUB();
		System.out.println(obj.longestPalindrome("cbbcd"));
	}
	
	public String longestPalindrome(String s) {
		if (s.isEmpty()) {
			return null;
		}
	 
		if (s.length() == 1) {
			return s;
		}
	 
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {
			// get longest palindrome with center of i
			String tmp = helper(s, i, i);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
	 
			// get longest palindrome with center of i, i+1
			tmp = helper(s, i, i + 1);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
		}
	 
		return longest;
	}
	 
	// Given a center, either one letter or two letter, 
	// Find longest palindrome
	public String helper(String s, int begin, int end) {
		while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		return s.substring(begin + 1, end);
	}
	
	/*public String longestPalindrome(String a) {
	    int size = a.length(), maxLen = 1, startIdx = 0;
	    boolean[][] isPalindrome = new boolean[size][size];
	    
	    for(int i = 0; i < size; i++)
	       isPalindrome[i][i] = true;
	    
	    for(int i = 0; i < size - 1; i++){
	            if(a.charAt(i) == a.charAt(i + 1)) {
	                isPalindrome[i][i+1] = true;
	                if(maxLen != 2)
	                    maxLen = 2;
	                    startIdx = i;
	            }
	    }
	    for(int k = 3; k < size; k++){
	        for(int i = 0; i < size - k + 1; i++) {
	        	int j = i + k - 1;
	            if(a.charAt(i) == a.charAt(j) && isPalindrome[i+1][j-1]) {

            		isPalindrome[i][j] = true;
	            	if(maxLen != k) {
	            		maxLen = k;
	            		startIdx = i;
	            	}
	            }
	        }
	    }
	    
	    return a.substring(startIdx, startIdx + maxLen);
	}*/
}
