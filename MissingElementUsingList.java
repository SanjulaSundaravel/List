package Assignment.week3.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementUsingList {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8,9};
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(6);
		list.add(8);
		list.add(9);
		
		Collections.sort(list);
		System.out.println(list);
		
		for(int i=0; i<list.size()-1;i++) {
			
				if(list.get(i)!= i+1) {
					System.out.println("The Missing no is "+(i+1));
					break;
				
		}
	}
	}
	

}
