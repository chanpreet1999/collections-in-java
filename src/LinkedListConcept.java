import java.util.*;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> li=new LinkedList<Integer>();
		li.add(32);
		li.add(99);
		li.add(34);
		String a="11";
		int a1=Integer.parseInt(a);
		li.add(a1);
		System.out.printf("Using iterator and printf\n");
		Iterator<Integer> itr=li.iterator();
		while(itr.hasNext()) {
			System.out.printf("%d  ",itr.next());
		}
		
		li.addFirst(1);
		System.out.println("\nUsing for loop");
		for(int i=0;i<li.size();i++)
			System.out.println(li.get(i));
		
		li.addLast(44);
		System.out.println("Using for each loop");
		for(int i:li)
			System.out.println(i);
		
		li.removeLast();
		li.remove(1);
		System.out.println("Finally");
		for(int i:li)
			System.out.println(i);
		
		
	
	}

}
