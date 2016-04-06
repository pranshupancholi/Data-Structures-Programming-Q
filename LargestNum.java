import java.util.ArrayList;
import java.util.List;


public class LargestNum {
	public static void main(String[] args) {
		LargestNum obj = new LargestNum();
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(0);
		a.add(0);
		a.add(0);
		
		System.out.println(obj.largestNumber(a));
	}
	
	public String largestNumber(final List<Integer> a) {
	    int temp = 0;
	    List<Integer> b = new ArrayList<Integer>(a);
	    for(int i = 0; i < b.size(); i++){
	        for(int j = 0; j < b.size() - i - 1; j++){
	            if(compare(b.get(j), b.get(j + 1)) == 1){
	               temp = b.get(j);
	               b.set(j, b.get(j + 1));
	               b.set(j + 1, temp);
	            }
	        }
	    }
	    StringBuffer sb = new StringBuffer();
	    int count = 0;
	    for(int k = b.size() - 1; k >= 0; k--) {
	        if(b.get(k) == 0) {
	        	count++;
	        	sb.append(b.get(k));
	        } else {
	        	sb.append(b.get(k));
	        } 
	    }
	    if(count == b.size()){
	    	sb.setLength(0);
	    	sb.append(0);
	    }
	    return sb.toString();
	}
	
	public int compare(int x, int y) {
	    int ret = 0;
	    
	    String StrXY = Integer.toString(x) + Integer.toString(y);
	    String StrYX = Integer.toString(y) + Integer.toString(x);
	    if(Long.parseLong(StrXY) >= Long.parseLong(StrYX)){
	        ret = 1;
	    }
	    return ret;
	}
}
