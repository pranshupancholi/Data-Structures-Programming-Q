import java.util.ArrayList;


public class BinarySearchNInsert {
	public static void main(String[] args) {
		BinarySearchNInsert obj = new BinarySearchNInsert();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(17);
		a.add(30);
		a.add(32);
		a.add(94);
		a.add(96);
		a.add(106);
		a.add(118);
		System.out.println(obj.searchInsert(a, 104));
	}
	
public int searchInsert(ArrayList<Integer> a, int b) {
	    
	    int low = 0, high = a.size() - 1, mid = 0;
	    
	    while(low <= high){
	        mid = (low + high) / 2;
	        if(a.get(mid) == b)
	            return mid;
	        if(b > a.get(mid)){
	            low = mid + 1;
	        } else{
	            high = mid - 1;
	        }
	    }
	    
	    //if(b > a.get(mid)) {
	    	return low;
	    //} else {
	    //	return high;
	    //}
	}
}
