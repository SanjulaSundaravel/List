package Assignment.week3.list;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,9,7};
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(9);
		list2.add(7);
		
		for(int i=0; i<list1.size();i++) {
			for(int j=0; j<list2.size(); j++) {
				if(list1.get(i)==list2.get(j)) {
					System.out.println("Intersection no is : "+list1.get(i));
				}
			}
		}
	}

}
