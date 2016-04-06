
public class GCD {
	public static void main(String[] args) {
		GCD obj = new GCD();
		System.out.println(obj.gcd(6, 4));
	}
	
	public int gcd(int a, int b) {
	    if(a < b){
	        int temp = a;
	        a = b;
	        b =temp;
	    }
	    return findGCD(a, b);
	}
	
	public int findGCD(int a , int b){
	    int rem = -1, div = 0;
	    while(rem != 0){
	    div = a / b;
	    rem = a - div * b;
	    a = b;
	    b = rem;
	    }
	    return a;
	}
}
