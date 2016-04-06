import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class SubString {
	public static void main(String[] args) {
		SubString obj = new SubString();
		ArrayList<String> str = new ArrayList<String>();
		str.add("bar");
		str.add("foo");
		ArrayList<Integer> res = new ArrayList<Integer>();
		res = obj.findSubstring("barfoothefoobarman", str);
		for(int re : res)
			System.out.print(re+" ");
	}
	
	public ArrayList<Integer> findSubstring(String a, final List<String> b) {
	    HashMap<String, Integer> hash = new HashMap<String, Integer>();
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    boolean brk = false, notPresent = false;
	    int sizeStr = b.get(0).length();
	    int searchLen = sizeStr * b.size();
	    
	    for(int i = 0; i <= (a.length()-searchLen); i++){
	        for(String str : b) {
	            if(!hash.containsKey(str))
	                hash.put(str, 1);
	            else
    	            hash.put(str, hash.get(str) + 1);
	        }
	        String sub = a.substring(i, i+searchLen);
	        for(int j = 0; j < sub.length(); j = j + sizeStr) {
	            String subSub = sub.substring(j, j+sizeStr);
	            if(hash.containsKey(subSub)) {
	                if(hash.get(subSub) == 0) {
	                    brk = true;
	                    break;
	                } else {
	                    hash.put(subSub, hash.get(subSub) - 1);
	                }
	            } else {
	            	notPresent = true;
	            }
	        }
	        if(!brk && !notPresent)
	            result.add(i);
	        brk = false;
	        notPresent = false;
	        hash.clear();
	    }
	    
	    return result;
	}
}
