package Assignment.week3.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java session in java week1";
		
		
		List<String> list = new ArrayList<String>();
		
		list.add("We");
		list.add("learn");
		list.add("java");
		list.add("basics");
		list.add("as");
		list.add("part");
		list.add("of");
		list.add("java");
		list.add("session");
		list.add("in");
		list.add("java");
		list.add("week1");
		
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
		
				if(list.get(i).equals("java")) {
					list.remove(i);
				}
			}
		
	
		System.out.println(list);
		
	}

}
