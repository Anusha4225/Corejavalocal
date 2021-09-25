package Test;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue1 = new PriorityQueue<String> ();
		
		queue1.add("name1");
		queue1.add("name2");
		queue1.add("name3");
		queue1.add("name4");
		
		System.out.println(queue1);
		System.out.println(queue1.peek());
		
		String first = queue1.poll();
		
		System.out.println(queue1);
		
		ArrayDeque<String> queue2 = new ArrayDeque <String> ();
		queue2.add("name5");
		queue2.add("name6");
		queue2.add("name7");
		queue2.addFirst("name8");
		queue2.addLast("name9");
		
		System.out.println(queue2);

	}

}
