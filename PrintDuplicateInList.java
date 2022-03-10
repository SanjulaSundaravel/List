package Assignment.week3.list;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicateInList {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count;
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(14);
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(15);
		list.add(14);
		list.add(18);
		list.add(16);
		list.add(17);
		list.add(19);
		list.add(18);
		list.add(17);
		list.add(20);
		
		System.out.println(list);
		
		for(int i=0; i<list.size()-1; i++) {
			count=0;
			for(int j=0; j<list.size();j++) {
				if(list.get(i)==list.get(j)) {
					count++;
				}
			}if(count>1) {
				System.out.println("Duplicate no is: "+list.get(i));
		}
		
		}
	}

}
