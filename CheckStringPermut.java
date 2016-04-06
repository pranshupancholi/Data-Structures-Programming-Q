public class CheckStringPermut {
	public static void main(String args[]) {
		String str1 = "Praanshu", str2 = "shurPaan";
		CheckStringPermut obj = new CheckStringPermut();
		boolean isPermutation = obj.permutation(str1, str2);
		if (isPermutation) {
			System.out.println("Is Permutation");
		} else {
			System.out.println("Not a Permutation");
		}
	}

	boolean permutation(String str1, String str2) {
		int[] asciiArr = new int[256];
		if (str1.length() != str2.length()) {
			return false;
		}
		for (int i = 0; i < str1.length(); i++) {
			asciiArr[str1.charAt(i)]++;
		}
		for (int i = 0; i < str2.length(); i++) {
			asciiArr[str2.charAt(i)]--;
			if (asciiArr[str2.charAt(i)] < 0) {
				return false;
			}
		}
		return true;
	}
}
