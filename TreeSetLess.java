package lab43;
import java.util.TreeSet;

public class TreeSetLess {
	
		public static void main(String[] args) {
	        // Create a TreeSet
	        TreeSet<Integer> ts = new TreeSet<>();

	        // Add elements to the TreeSet
	        ts.add(5);
	        ts.add(2);
	        ts.add(8);
	        ts.add(1);
	        ts.add(3);
	        ts.add(7);
	        ts.add(6);

	        
	        System.out.println("Numbers less than 7 in the TreeSet:");
	        for (Integer num : ts) {
	            if (num < 7) {
	                System.out.println(num);
	            
	        }
	    }
	}


}
