
public class StringCompression {
	public static void main(String[] args) {
		String str = "aaabccccdaa";
		StringCompression obj = new StringCompression();
		int size = obj.countCompression(str);
		System.out.println(size);
	}
	
	public int countCompression(String str) {
		int size =0, count=1;
		if(str == null || str.isEmpty())
			return 0;
		char chr = str.charAt(0);
		for(int i=1;i<str.length();i++){
			if(str.charAt(i) == chr){
				count++;
			} else{
				chr = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 1;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}
}
