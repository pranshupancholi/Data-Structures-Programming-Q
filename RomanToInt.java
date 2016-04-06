import java.util.Hashtable;


public class RomanToInt {
	public static void main(String[] args) {
		RomanToInt obj = new RomanToInt();
		System.out.println(obj.romanToInt("MMMCCLXXXVII"));
	}
	
	public int romanToInt(String a) {
	    int result = 0;
	    Hashtable<Character, Integer> hash = new Hashtable<Character, Integer>();
	    hash.put('I', 1);
	    hash.put('V', 5);
	    hash.put('X', 10);
	    hash.put('L', 50);
	    hash.put('C', 100);
	    hash.put('D', 500);
	    hash.put('M', 1000);
	    
	    for(int i = 0; i < a.length(); i++) {
	        if(i == a.length() - 1){
	            result += hash.get(a.charAt(i));
	        } else {
	            if(hash.get(a.charAt(i)) >= hash.get(a.charAt(i + 1))) {
	                result += hash.get(a.charAt(i));
	            } else {
	                result += (hash.get(a.charAt(i + 1)) - hash.get(a.charAt(i)));
	                i++;
	            }
	        }
	    }
	    
	    return result;
	}
}
