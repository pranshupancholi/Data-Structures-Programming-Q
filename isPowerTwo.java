
public class isPowerTwo {
	public static void main(String[] args) {
		isPowerTwo obj = new isPowerTwo();
		System.out.println(obj.power("1"));
	}
	
	public int power(String a) {
		if(a.equals("1"))
			return 0;
	    int size = 0, carry = 0;
	    
	    StringBuffer newNo = new StringBuffer();
	    while(!a.equals("1")) {
	    	boolean hadOne = true;
	        size = a.length();
	        newNo.setLength(0);
	        if(a.charAt(size - 1) % 2 == 0) {
	        for(int i = 0; i < size; i++) {
	        	if(hadOne == true && a.charAt(0) == '1'){
	        		String no = a.charAt(i) + "" + a.charAt(i + 1);
	        		if(Integer.parseInt(no) % 2 != 0)
	                    carry = 1;
	                else
	                    carry = 0;
	        		newNo.append(Integer.parseInt(no) / 2);
	        		hadOne = false;
	        		i = i + 2;
	        	}
	        	if(i < size) {
	            if(carry == 0) {
	                if(Character.getNumericValue(a.charAt(i)) % 2 != 0)
	                    carry = 1;
	                else
	                    carry = 0;
	                newNo.append(Character.getNumericValue(a.charAt(i)) / 2);
	            } else {
	                String no = String.valueOf(carry) + a.charAt(i);
	                if(Integer.parseInt(no) % 2 != 0)
	                    carry = 1;
	                else
	                    carry = 0;
	                newNo.append(Integer.parseInt(no) / 2);
	            }
	        	}
	        }
	        } else {
	            return 0;
	        }
	        a = newNo.toString();
	    }
	    return 1;
	}
}
