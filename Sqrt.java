
public class Sqrt {
	public static void main(String[] args) {
		Sqrt obj = new Sqrt();
		System.out.println(obj.sqrt(175));
	}
	
	public int sqrt(int a) {
	    int low = 0, high = a, mid = 0;
	    /*if(a == 0)
	        return 0;*/
	    while(low <= high){
	        mid = (low + high) / 2;
	        if(mid * mid == a) {
	            return mid;
	        } else if(a > mid * mid){
	            low = mid + 1;
	        } else{
	            high = mid - 1;
	        }
	    }
	    return high;
	}
}
