public class StrPalind {
	public static void main(String[] args) {
		StrPalind obj = new StrPalind();
		System.out.println(obj.isPalindrome(".,"));
	}

	public int isPalindrome(String a) {
		char[] str = a.toCharArray();
		int right = a.length() - 1;
		int left = 0;

		while (left < right) {
			if (!((str[left] >= 48 && str[left] <= 57) || (str[left] >= 65 && str[left] <= 90) || (str[left] >= 97 && str[left] <= 122))) {
				while ((left < right) && !((str[left] >= 48 && str[left] <= 57) || (str[left] >= 65 && str[left] <= 90) || (str[left] >= 97 && str[left] <= 122))) {
					left++;
				}
			}

			if (!((str[right] >= 48 && str[right] <= 57) || (str[right] >= 65 && str[right] <= 90) || (str[right] >= 97 && str[right] <= 122))) {
				while ((right > left) && !((str[right] >= 48 && str[right] <= 57) || (str[right] >= 65 && str[right] <= 90) || (str[right] >= 97 && str[right] <= 122))) {
					right--;
				}
			}
			
			//if (left <= right) {
				if ((str[left] == str[right]) || ((str[right] >= 65 && str[right] <= 90) && (str[left] == str[right] + 32))
						|| ((str[left] >= 65 && str[left] <= 90) && (str[right] == str[left] + 32))) {
					left++;
					right--;
				} else {
						return 0;
				}
			//}
		}
		return 1;
	}
}
