
public class StringSpaceManipulation {
	public static void main(String[] args) {
		String chr = "Mr John Smith    ";
		char[] str = chr.toCharArray();
		int length = 13, spaceCount = 0;
		
		for(int i=0; i<length;i++){
			if(str[i] == ' ')
				spaceCount++;
		}
		
		int newLength = length + spaceCount * 2;
		//str[newLength] = '\0';
		
		for(int i=length-1; i >= 0; i--) {
			if(str[i] == ' '){
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				str[newLength - 1] = str[i];
				newLength--;
			}
		}
		
		for(int i=0;i<length + spaceCount * 2;i++) {
			System.out.print(str[i]);
		}
			
	}
}
