
public class PowMod {
	public static void main(String[] args) {
		PowMod obj = new PowMod();
		System.out.println(obj.pow(71045970, 41535484, 64735492));
	}
	
	public int pow(int x, int n, int d) {
		long ans=1;
        long square=x;
        if(n==0 && d==1)
            return 0;
        else if(n==0)
            x = 1;
        
        while(n!=0)
        {
            if(n%2 == 1)
                ans=ans*square;
            square=(square*square)%d;
            n=n/2;
            if(ans>d)
                ans=ans%d;
            if(ans < 0)
                ans = ans + d;
        }
        
    return (int)ans;
	}
}
