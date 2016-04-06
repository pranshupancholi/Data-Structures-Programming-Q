import java.util.ArrayList;
import java.util.Stack;


public class EvalExpr {
	public static void main(String[] args) {
		EvalExpr obj = new EvalExpr();
		ArrayList<String> a = new ArrayList<String>();
		a.add("5");
		a.add("1");
		a.add("2");
		a.add("-");
		a.add("4");
		a.add("-");
		a.add("-");
		a.add("1");
		a.add("+");
		System.out.println(obj.evalRPN(a));
	}
	
	public int evalRPN(ArrayList<String> a) {
	    Stack<Integer> stk = new Stack<Integer>();
	    int result = 0;
	    for(int i = 0; i < a.size(); i++){
	        if(a.get(i).equals("+")){
	            result = stk.pop() + stk.pop();
	            stk.push(result);
	        } else if(a.get(i).equals("-")) {
	            result = stk.pop() - stk.pop();
	            stk.push(result);
	        }  else if(a.get(i).equals("*")) {
	            result = stk.pop() * stk.pop();
	            stk.push(result);
	        }  else if(a.get(i).equals("/")) {
	            int c = stk.pop();
	            int d = stk.pop();
	            result = d / c;
	            stk.push(result);
	        } else {
	            stk.push(Integer.parseInt(a.get(i)));
	        }
	    }
	    return Math.abs(stk.pop());
	}
}
