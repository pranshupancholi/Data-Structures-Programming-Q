
public class ReverseWord {
	public static void main(String[] args) {
		ReverseWord obj = new ReverseWord();
		System.out.print(obj.reverseWords("              "));
	}
	
	public String reverseWords(String a) {
	    int i = 0, size = a.length();
	    StringBuffer result = new StringBuffer();
	    StringBuffer word = new StringBuffer();
	    
	    while(i < size && a.charAt(i) == ' ')
	        i++;
	    
	    for(int j = i; j < size; j++){
	        word.setLength(0);
	        while(j < size && a.charAt(j) != ' ') {
	            word.append(a.charAt(j));
	            j++;
	        }
	            
	        if(result.length() == 0) {
                result.append(word);
            } else {
                word.append(" ");
                result.insert(0, word);
            }
            
            while(j < size && a.charAt(j) == ' ')
	            j++;
            j--;
	    }
	    return result.toString();
	}
}
