import java.util.ArrayList;


public class Pascal1 {
	public static void main(String args[]){
		Pascal1 obj = new Pascal1();
		obj.generate(5);
	}
	public ArrayList<ArrayList<Integer>> generate(int a) {
	    ArrayList<ArrayList<Integer>> finalArr = new ArrayList<ArrayList<Integer>>();
	    for(int i = 1; i <= a; i++){
	        ArrayList<Integer> arr = new ArrayList<Integer>(i);
	        if(i == 1){
	            arr.add(1);
	        } 
	        if(i >= 2){
	            arr.add(0, 1);
	            if(i > 2){
	                for(int j = 1; j < i - 1; j++)
	                arr.add(j, finalArr.get(i - 2).get(j - 1) + finalArr.get(i - 2).get(j));
	            }
	            arr.add(i - 1, 1);
	        }
	        finalArr.add(arr);
	    }
	    return finalArr;
	}
}
