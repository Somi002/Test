package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args) {
		//List<Integer> even = new ArrayList<Integer>();
		//even.add(1);
		//even.add(2);
		//even.add(3);
		//even.add(4);
		//even.add(5);
		//even.add(6);
		//even.add(7);
		//List<Integer>list1 = even.stream().filter(i->i%2==0).collect(Collectors.toList());
		//System.out.println(list1);
		int [] even = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		for(int i=0;i<even.length;i++) {
			if(even[i]%2==0) {
				System.out.println(even[i]);
				
			}
			
		}
	}

}
