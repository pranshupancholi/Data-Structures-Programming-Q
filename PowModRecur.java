
public class PowModRecur {
	public static void main(String[] args) {
		PowModRecur obj = new PowModRecur();
		System.out.println(obj.Mod(71045970, 41535484, 64735492));
	}
	public int Mod(int a, int b, int c) {
	    if(a == 0 && b == 0){
	        return 0;
	    } else if(b == 0) {
	        return 1;
	    } else if(b % 2 == 0) {
	        //if(a < 0)
	        //    a = a+c;
	        long d = Mod(a, b/2, c);
	        return (int) ((d % c) * (d % c))% c;
	    } else {
	        if(a < 0)
	            a = a+c;
	        return ((a % c) * Mod(a, b - 1, c)) % c;
	    }
	}
}
