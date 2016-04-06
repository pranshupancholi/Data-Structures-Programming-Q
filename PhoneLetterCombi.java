import java.util.ArrayList;
import java.util.HashMap;


public class PhoneLetterCombi {
	public static void main(String[] args) {
		PhoneLetterCombi obj = new PhoneLetterCombi();
		ArrayList<String> res = obj.letterCombinations("23");
		for(String str : res)
			System.out.println(str);
	}
	
	public ArrayList<String> letterCombinations(String a) {
	    HashMap<Integer, String> map = new HashMap<Integer, String>();
	    map.put(0,"0");
	    map.put(1,"1");
	    map.put(2,"abc");
	    map.put(3,"def");
	    map.put(4,"ghi");
	    map.put(5,"jkl");
	    map.put(6,"mno");
	    map.put(7,"pqrs");
	    map.put(8,"tuv");
	    map.put(9,"wxyz");
	    ArrayList<String> result = new ArrayList<String>();
	    StringBuilder temp = new StringBuilder();
	    combination(a, 0, map, temp, result);
	    return result;
	}
	public void combination(String digitStr, int digitIdx, HashMap<Integer, String> map, 
	StringBuilder temp, ArrayList<String> result){
	    if(digitStr.length() == digitIdx){
	        result.add(temp.toString());
	        return;
	    } else {
	        String letters = map.get(Character.getNumericValue(digitStr.charAt(digitIdx)));
	        for(int i = 0; i < letters.length(); i++){
	            temp.append(letters.charAt(i));
	            combination(digitStr, digitIdx + 1, map, temp, result);
	            temp.deleteCharAt(temp.length() - 1);
	        }
	    }
	}
}
