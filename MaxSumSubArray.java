import java.util.ArrayList;


public class MaxSumSubArray {
	public static void main(String[] args) {
		MaxSumSubArray obj = new MaxSumSubArray();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(-1);
		a.add(-1);
		a.add(-1);
		a.add(-1);
		a.add(-1);
		a.add(-1);
		//System.out.println(obj.maxset(a));
		obj.maxset(a);
	}
	
	public int maxset(ArrayList<Integer> a) {
		int curSum = 0, maxSum = 0, i = 0;
		int curMin = 0, maxMax = 0, maxMin = 0;
		ArrayList<Integer> result =  new ArrayList<Integer>();
	    for(i = 0; i < a.size(); i++){
	        if(a.get(i) > 0){
	           curSum = curSum + a.get(i);
	           if(curSum >= maxSum){
	        	   maxSum = curSum;
	        	   maxMin = curMin;
	        	   maxMax = i;
	           }
	        } else {
	            curSum = 0;
	            curMin = i + 1;
	        }
	    }
	    
	    for(int j = maxMin; j <= maxMax; j++){
	    	result.add(a.get(j));
	    	System.out.println(a.get(j));
	    }
	    return maxSum;
	}
}
