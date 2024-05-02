
package in.ashokit;
import java.util.*;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
		LinkedHashMap<Integer,String>lhm=new LinkedHashMap<Integer, String>();
		lhm.put(123, "omkar");
		lhm.put(155, "tejas");
		lhm.put(145, "sankya");
		lhm.put(10, "kisna");
		lhm.put(18, "kaka");
		lhm.put(1233, "panya");
		lhm.put(5654,null);
		lhm.put(5893,null);
		lhm.put(798,null);
		lhm.put(null,"ajks");
		lhm.put(null,"aksjdlka");
		


		System.out.println(lhm);
	}

}
