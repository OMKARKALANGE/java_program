package in.ashokit;
import java.util.*;

public class ColllectionDemo1 {
	
	public static void main(String[] args) {
		
	
	HashSet hs = new HashSet();
	hs.add(23);
	hs.add(12);
	hs.add(25);
	hs.add(3);
	hs.add(63);
	hs.add("omkar");
	hs.remove("omkar");
	System.out.println(hs);
	
	hs.clear();
	System.out.println(hs);
}
}
