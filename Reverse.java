
public class Reverse {
	public static void main(String[] args) {
		Reverse obj = new Reverse();
		System.out.println(obj.reverse(2147483645));
	}
	public int reverse(int a) {
	    boolean flag = false;
	    
	    if(a < 0){
	        flag = true;
	        a = a * -1;
	    }
	    
	    int rem = 0, num = 0;
	    long detect = 0L;
	    while(a > 0){
	        rem = a % 10;
	        a = a / 10;
	        detect = (long) num * 10;
	        if(detect == num * 10){
	            num = num * 10 + rem;
	        } else{
	            return 0;
	        }
	    }
	    if(flag){
	        num = num * -1;
	    }
	    return num;
	}
}
