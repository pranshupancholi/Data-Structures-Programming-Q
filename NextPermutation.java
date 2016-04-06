import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class NextPermutation {
	public static void main(String[] args) {
		NextPermutation obj = new NextPermutation();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(444);	
		a.add(8);
		a.add(23);
		a.add(54);
		a.add(66);
		obj.nextPermutation(a);
		
		for(int elem : a) {
			System.out.print(elem+" ");
		}
		
	}
	
	public void nextPermutation(ArrayList<Integer> a) {
	    long number = createNum(a);
	    if(a.size() >= 2)
	        Collections.swap(a, a.size() - 1, a.size() - 2);
	    long flipNum = createNum(a);
	    if(flipNum <= number)
	        Collections.sort(a);
	}
	
	public long createNum(ArrayList<Integer> a){
	    long num = 0;
	    int j = 0;
	    for(int i = a.size() - 1; i >= 0; i--){
	    	int idxVal = a.get(i);
	    	while(idxVal > 0){
	    		num = num + (long)(idxVal % 10 * Math.pow(10, j));
	    		idxVal = idxVal / 10;
	    		j++;
	    	}
	    }
	    return num;
	}
}
