package lab43;
import java.util.ArrayList;
import java.util.Iterator;


	public class HashListIterator
	{
		 public static void main(String[] args) 
		 {
		        // Create a hash list (ArrayList)
		        ArrayList<String> hashList = new ArrayList<>();

		        // Add elements to the hash list
		        hashList.add("pinapple");
		        hashList.add("Banana");
		        hashList.add("kivi");
		        hashList.add("Grapes");
		        hashList.add("Mango");

		        // Iterate through the hash list using an Iterator
		        System.out.println("Iterating through the hash list:");
		        Iterator<String> iterator = hashList.iterator();
		        while (iterator.hasNext()) {
		            String element = iterator.next();
		            System.out.println(element);
		        
		    }
	}


}
