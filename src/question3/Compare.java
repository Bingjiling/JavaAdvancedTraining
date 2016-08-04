package question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.Stack;

public class Compare {
	List<Integer> list;
	Map <String, String> map;
	
	public Compare(List<Integer> list, Map<String, String> map) {
		this.list = list;
		this.map = map;
	}
	
	public List<Integer> findDiff() {
		List<Integer> outcome = new ArrayList<Integer>();
	    for(Integer i : list){
	    	if(!map.containsValue(Integer.toString(i))){
	    		outcome.add(i);
	    	}
	    }
	    return outcome;
	}
	
	public static void main(String[] args){
		List<Integer> list = Arrays.asList(1,2,3,4,10);
	    Map <String, String> map = new HashMap<String, String>();
	    map.put("a","1");
	    map.put("b","2");
	    map.put("c","10");
		Compare compare = new Compare(list, map);
		System.out.println(compare.findDiff());
	}
	
}
