
public class SearchSubString {
	public static void main(String[] args) {
		SearchSubString obj = new SearchSubString();
		System.out.println(obj.strStr("b", "b"));
		StringBuffer str = new StringBuffer();
		StringBuffer word = new StringBuffer();
		str.append(word);
		
		
	}
	
	public int strStr(final String haystack, final String needle) {
	    int k = 0, j =0, size = 0;
	    while(k < haystack.length() && haystack.charAt(k) == ' '){
	    	k++;
	    }
	    if(k == haystack.length())
	    	return -1;
	    for(j = k; j < haystack.length(); j++){
	    	if(haystack.charAt(j) == ' ') {
	    		break;
	    	}
	    }
		size = j - needle.length();
	    for(int i = k; i <= size; i++){
	    	
	        if(haystack.charAt(i) == needle.charAt(0)){
	            for(j = 0; j < needle.length(); j++){
	                if(haystack.charAt(i) == ' ')
	    	        	return -1;
	                if((i < haystack.length()) && (haystack.charAt(i) == needle.charAt(j))){
	                    if(j == needle.length() - 1)
	                        return i - j;
	                } else {
	                    break;
	                }
	                i++;
	            }
	            i = i - j;
	        }
	    }
	    return -1;
	}
}
