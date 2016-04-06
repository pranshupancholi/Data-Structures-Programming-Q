import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;


public class PrimeSum {
	public static void main(String[] args) {
		PrimeSum obj = new PrimeSum();
		//ArrayList<Integer> result = new  ArrayList<Integer>();
		boolean result = obj.isPalindrome(121);
		
		System.out.println(result);
		
		
	}
	
	public boolean isPalindrome(int a) {
	    int num = 0, copyA = a;
	    if(a < 0)
	        return false;
	    if(a == 0)
	        return true;
	    while(a > 0){
	        int rem = a % 10;
	        a = a / 10;
	        num = num * 10 + rem;
	    }
	    if(num == copyA) {
	        return true;
	    } else{
	        return false;
	    }
	        
	}
}
