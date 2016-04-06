
public class Uniqpath {
	public static void main(String[] args) {
		Uniqpath obj = new Uniqpath();
		System.out.println(obj.uniquePaths(15, 9));
	}
	
	public int uniquePaths(int a, int b) {
	    return choose(a + b - 2, b - 1);
	}
	
	public int choose(int exp, int denoB){
        int denoA = exp - denoB;
        int factPart = 1;
        if(denoA < denoB) {
            int temp = denoB;
            denoB = denoA;
            denoA = temp;
        }
        int j = 1;
	    for(int i = exp; i > denoA; i--){
            factPart = factPart * i;
            factPart = factPart / j;
            j++;
	    }

	    return factPart;
	}
}
