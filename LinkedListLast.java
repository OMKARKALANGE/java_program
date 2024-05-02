package lab43;
import java.util.LinkedList;

public class LinkedListLast {
	
		public static void main(String[] args)
		{
			LinkedList<Integer> l1 = new LinkedList<>();
			l1.add(5);
			l1.add(15);
			l1.add(2);
			l1.add(6);
			l1.add(36);
			l1.add(63);
			
			//getFirst
			System.out.println("First Element is :" + l1.getFirst());
			
			//getLast
			System.out.println("Last Element : " + l1.getLast());
		
	}

}
