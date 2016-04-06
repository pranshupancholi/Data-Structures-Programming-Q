
public class RotatedSearch {
	public static void main(String[] args) {
		RotatedSearch obj = new RotatedSearch();
		int[] A = {101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100};
		System.out.println(obj.search(A, 19, 187));
	}
	
	int search(int A[], int n1, int B) {
	    int low = 0;
	    int high = n1 - 1;
	    int result = searchArr(A, low, high, B);
	    return result;
	}

	int searchArr(int A[], int low, int high, int B){
	    int left = low;
	    int right = high;
	    
	        int mid = (left + right) / 2; 
	        if(A[mid] == B){
	            return mid;
	        } else if(A[mid] > A[left]) {
	            if(B < A[mid] && B >= A[left]){
	                return searchArr(A, left, mid - 1, B);
	            } else {
	                return searchArr(A, mid + 1, right, B);
	            }
	        } else if(A[mid] < A[left]){
	            if(B > A[mid] && B <= A[right]){
	                return searchArr(A, mid + 1, right, B);
	            } else {
	                return searchArr(A, left, mid - 1, B);
	            }
	        } else if(A[mid] == A[left]) {
	        	return searchArr(A, mid + 1, right, B);
	        }
	    return -1;
	}
}
