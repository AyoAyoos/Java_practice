package day_7;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_map {
	
	public static void main(String[]args) {
		
		Hashtable<Integer, String> hashTableObj= new Hashtable<Integer, String>();
		
		hashTableObj.put(1, "abc");
		hashTableObj.put(2, "bdc");
		hashTableObj.put(3, "iop");
		hashTableObj.put(30, "ops");
		
		
		System.out.println("hashtable" + hashTableObj);
		
		
		
		
		Set<Entry<Integer, String>> entrySet=  hashTableObj.entrySet();

		
		
		for(Entry<Integer, String> entry: entrySet) {
			System.out.println(entry.getValue());
		}
		
	}

}
