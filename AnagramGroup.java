import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;

public class AnagramGroup {
	public static void main(String[] args) {
		AnagramGroup obj = new AnagramGroup();
		ArrayList<String> anaStr = new ArrayList<String>();
		anaStr.add("aab");
		anaStr.add("abc");
		anaStr.add("abb");
		anaStr.add("aba");
		anaStr.add("cab");
		anaStr.add("bab");
		anaStr.add("baa");
		
		anaStr = obj.group(anaStr);
		for(String ana : anaStr){
			System.out.print(ana+" ");
		}
	}
	public ArrayList<String> group(ArrayList<String> anaStr){
		Hashtable<String, LinkedList<String>> hash = new Hashtable<String, LinkedList<String>>();
		for(String ana : anaStr){
			char[] c = ana.toCharArray();
			Arrays.sort(c);
			String key = new String(c);
			
			if(!hash.containsKey(key)){
				hash.put(key, new LinkedList<String>());
			}
			LinkedList<String> anaList = hash.get(key);
			anaList.push(ana);
		}
		anaStr.clear();
		for(String key : hash.keySet()){
			LinkedList<String> anaList = hash.get(key);
			
			for(String ana : anaList){
				anaStr.add(ana);
			}
		}
		return anaStr;
	}
	
}
