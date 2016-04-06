import java.util.ArrayList;
import java.util.List;


public class FindRepeatedMissing {
	public static void main(String[] args) {
		FindRepeatedMissing obj = new FindRepeatedMissing();
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(3);
		result.add(5);
		result.add(1);
		result.add(2);
		result.add(3);
		ArrayList<Integer> out = new ArrayList<Integer>();
		out = obj.repeatedNumber(result);
		
		System.out.print(out.get(0)+" "+out.get(1));
	}
	
	public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    
	    int sum = 0;
	    int sumFor1 = ((a.size() + 1) * a.size()) / 2;
	    for(int i = 0; i < a.size(); i++)
	        sum += a.get(i);
	    
	    int subs = Math.abs(sum - sumFor1);
	    
	    int sqSum = 0;
	    int sumFor2 = ((2 * a.size() + 1) * (a.size() + 1) * a.size()) / 6;
	    for(int i = 0; i < a.size(); i++){
	        sqSum += a.get(i) * a.get(i);
	    }
	    int adn = (sumFor2 - sqSum) / subs;
	    
	    result.add((adn + subs) / 2);
	    result.add((adn - subs) / 2);
	    
	    return result;
	}
}
