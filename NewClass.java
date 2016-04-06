import java.util.HashSet;


public class NewClass {
	public static void main(String[] args) {
		NewClass obj = new NewClass();
		/*String S= new String("22:25:24");
		String timeS[] = S.split(":");
        String hrS = timeS[0];
        String minS = timeS[1];
        String secS = timeS[2];
        System.out.println(" "+hrS+" "+minS+" "+secS);
        
        StringBuilder str = new StringBuilder();*/
        
		int[] A= {5, 4, 0, 3, 1, 6, 2};
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
        int maxSize = 0, prev = 0;
        if(A.length == 0)
            return 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < A.length; i++){
            hs.clear();
        for(int k = 0; k < A.length; k++){
            if(k == 0) {
                prev = A[i];
                hs.add(A[i]);
            } else if(!hs.contains(A[prev])) {
            	prev = A[prev];
                hs.add(prev);
            } else {
                maxSize = Math.max(maxSize,hs.size());
                break;
            }
        }
        }
        return maxSize;
    }
}
