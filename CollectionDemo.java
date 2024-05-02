package in.ashokit;
import java.util.*;
public class CollectionDemo {
	
	public static void main(String[] args) {
		HashMap<String,Float> hm = new HashMap<>();
		hm.put("Omkar", 50000000.00f);
		hm.put("tejas", 40000000.00f);
		hm.put("Omkar", 50000000.00f);
		hm.put("sukesh", 40000000.00f);
		hm.put("kaka", 50000000.00f);
		hm.put("kisna", 40000000.00f);
		hm.put("sankya", 80000000.00f);
		System.out.println(hm);
		
		hm.remove("sankya");
		System.out.println(hm);
		
		hm.clear();
		System.out.println(hm);
		
	}

}
