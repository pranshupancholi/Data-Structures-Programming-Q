
public class AddBinary {
	public static void main(String[] args) {
		AddBinary obj = new AddBinary();
		System.out.println(obj.addBinary("10111", "111"));
	}
	
	public String addBinary(String a, String b) {
	    StringBuffer result = new StringBuffer();
	    int carry = 0, j = 0, sum = 0;
	    if(a.length() >= b.length()) {
	        j = b.length() - 1;
	        for(int i = a.length() - 1; i >= 0; i--){
	            if(j >= 0)
	                sum = a.charAt(i) + b.charAt(j) + carry - 2 * 48;
	            else
	                sum = a.charAt(i) + carry - 48;
	            j--;
	            
	            if(sum == 0){
	                carry = 0;
	                result.insert(0, 0);
	            } else if(sum == 1){
	                carry = 0;
	                result.insert(0, 1);
	            } else if(sum == 2){
	                carry = 1;
	                result.insert(0, 0);
	            } else {
	                carry = 1;
	                result.insert(0, 1);
	            }
	            
	        }
	    } else {
	        j = a.length() - 1;
	        for(int i = b.length() - 1; i >= 0; i--){
	            if(j >= 0)
	                sum = b.charAt(i) + a.charAt(j) + carry - 2 * 48;
	            else
	                sum = b.charAt(i) + carry - 48;
	            j--;
	            
	            if(sum == 0){
	                carry = 0;
	                result.insert(0, 0);
	            } else if(sum == 1){
	                carry = 0;
	                result.insert(0, 1);
	            } else if(sum == 2){
	                carry = 1;
	                result.insert(0, 0);
	            } else {
	                carry = 1;
	                result.insert(0, 1);
	            }
	            
	        }
	    }
	    
	    if(carry == 1)
	        result.insert(0, 1);
	    
	    return result.toString();
	    
	}
}
