import java.util.Arrays;


public class Rank {
	public static void main(String[] args) {
		Rank obj = new Rank();
		System.out.println(obj.findRank("abc"));
	}
	
	public int findRank(String a) {
	    char[] chr = a.toCharArray();
	    int size = chr.length;
	    int rank = 0;
	    Arrays.sort(chr);
	    int i = 0, j = 0;
	    for(i = 0; i < size - 1; i++){
	        for(j = 0; j < size; j++){
	            if(a.charAt(i) == chr[j] ) {
	            	rank = rank + j * factorial(size - i - 1);
	            	break;
	            }
	        }
       
	    }
	    rank++;
	    return rank % 1000003;
	}
	
	public int factorial(int a){
	    if(a == 0)
	        return 1;
	    int fact = 1;
	    for(int i = 2; i <= a; i++)
	        fact = fact * i;
	    return fact;
	}
}
