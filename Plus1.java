import java.util.ArrayList;
import java.util.Collections;


public class Plus1 {
	public static void main(String args[]){
		Plus1 obj = new Plus1();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(3);
		a.add(2);
		a.add(1);
		a.add(1);
		a.add(2);
		a.add(5);
		a.add(9);
		a.add(6);
		a.add(6);
		
		obj.generate(a);
	}
	
	public void generate(ArrayList<Integer> a){
		/*double number = 0;
		for(int i = 0; i < a.size(); i++){
			if(a.get(i) == 0){
				continue;
			} else {
				for(int j = a.size() - 1; j >= i; j--){
					number = number + a.get(j) * Math.pow(10, a.size() - 1 - j);
				}
				number = a.get(a.size() - 1);
				break;
			}
		}
		if(++number > ){
			
		}
		a.clear();
		int i = 1;
		while(number > 0){
			a.add((int) (number % 10));
			number = number / 10;
			i++;
		}
		Collections.reverse(a);*/
		
		if(a.get(a.size() - 1)  == 9) {
			
		} else {
			a.set(a.size() - 1, a.get(a.size() - 1) + 1);
		}
		for(int elem : a){
			System.out.print(elem+" ");
		}
	}
}
