import java.util.ArrayList;
import java.util.Collections;


public class ClosestNumber {
	public static void main(String[] args) {
		ClosestNumber obj = new ClosestNumber();
		String str = obj.closestNumbers(10, "-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854");
		System.out.println(str);
	}
	private class pair{
        int a;
        int b;
        pair(int a, int b){
            this.a = a;
            this.b = b;
        }
    }
	public String closestNumbers(int len, String s) {
        ArrayList<Integer> nums = new ArrayList<Integer>(len);
        ArrayList<pair> result = new ArrayList<pair>();
        StringBuilder res = new StringBuilder();
        int minDiff = Integer.MAX_VALUE;
        String[] strNums = s.split(" ");
        for(String str : strNums){
            nums.add(Integer.parseInt(str));
        }
        Collections.sort(nums);
        for(int i = 1; i < len; i++){
            int diff = nums.get(i) - nums.get(i - 1);
            Math.abs(diff);
            if(diff < minDiff) {
                minDiff = diff;
                result.clear();
                result.add(new pair(nums.get(i - 1), nums.get(i)));
            } else if(diff == minDiff){
                result.add(new pair(nums.get(i - 1), nums.get(i)));
            }
        }
        for(pair p : result) {
            res.append(p.a+" "+p.b+" ");
        }
        return res.toString().trim();
    }
}
