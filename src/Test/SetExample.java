package Test;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String> ();
		set.add("name1");
		set.add("name2");
		set.add("name3");
		set.add("name4");
		set.add("name1");
		set.add(null);
		set.add(null);
		
		
		System.out.println(set);

		
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();
		set1.add("name5");
		set1.add("name6");
		
		System.out.println(set1);
	}

}
