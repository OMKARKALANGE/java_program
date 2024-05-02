package lab43;
import java.util.ArrayList;
import java.util.Collections;
public class ArraySortList {
	public static void main(String[] args)
		{
			// create arraylist
			ArrayList<String> names = new ArrayList<>();
			names.add("omkar");
			names.add("pranav");
			names.add("Tushar");
			names.add("tejass");
			names.add("Sukesh");
			names.add("krushna");
			
			System.out.println("Unsorted ArrayList : " + names);
			Collections.sort(names);
			
			System.out.println("Sorted ArrayList : " + names);
				
		
	}


}
