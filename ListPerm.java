import java.util.ArrayList;


public class ListPerm {
	public static void main(String[] args) {
		ListPerm obj = new ListPerm();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		ArrayList<ArrayList<Integer>> res = obj.permute(a);
	}
	
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    permutation(a, 0, result);
	    return result;
	}
	
	public void permutation(ArrayList<Integer> a, int listIdx, ArrayList<ArrayList<Integer>> result){
	    if(listIdx >= a.size()){
	    	ArrayList<Integer> item = new ArrayList<Integer>(a);
	        result.add(item);
	        return;
	    }
	    
	    for(int i = listIdx; i < a.size(); i++){
	        swap(a, listIdx, i);
	        permutation(a, listIdx + 1, result);
	        swap(a, listIdx, i);
	    }
	}
	
	public void swap(ArrayList<Integer> a, int x, int y){
	    Integer temp = a.get(x);
	    a.set(x, a.get(y));
	    a.set(y, temp);
	}
}
