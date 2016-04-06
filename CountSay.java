
public class CountSay {
	public static void main(String[] args) {
		CountSay obj = new CountSay();
		System.out.println(obj.countAndSay(2));
	}
	
	public String countAndSay(int a) {
	    int j;
	    String parse = "";
	    if(a == 0)
	        return parse;
        else if(a == 1)
	        return "1";
	    else
	        parse = "11";
	    StringBuffer result = new StringBuffer();
	    result.append(parse);
	    
	    int count = 1;
	    for(int i = 2; i < a; i++) {
	    	result.setLength(0);
	        for(j = 1; j < parse.length(); j++){
	            if(parse.charAt(j) != parse.charAt(j - 1)){
	                result.append(count);
	                result.append(parse.charAt(j - 1));
	                count = 1;
	            } else {
	                count++;
	            }
	        }
	            result.append(count);
	            result.append(parse.charAt(--j));
	            count = 1;
	            parse = result.toString();
	    }
	    return result.toString();
	}
}
