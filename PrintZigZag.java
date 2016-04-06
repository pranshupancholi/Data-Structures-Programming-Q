
public class PrintZigZag {
	public static void main(String[] args) {
		PrintZigZag obj = new PrintZigZag();
		System.out.println(obj.convert("PAYPALISHIRING", 3));
	}
	
	public String convert(String a, int b) {
		
		if(b == 1)
			return a;
	    boolean first = true;
	    StringBuffer result = new StringBuffer();
	    
	    for(int i = 0; i < b; i++){
	        first = true;
	        for(int j = i; j < a.length();){
	            
	            if(i == 0 || i == b - 1) {
	                result.append(a.charAt(j));
	                j += (b * 2 - 2);
	            } else {
	                if(first) {
	                    result.append(a.charAt(j));
	                    j += (b - 1 - i) * 2;
	                    first = false;
	                } else {
	                    result.append(a.charAt(j));
	                    j += ((b * 2 - 2) - ((b - 1 - i) * 2));
	                    first = true;
	                }
	            }
	        }
	    }
	    return result.toString();
	}
}
