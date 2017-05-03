package enToit;

import java.util.*;

public class EnumerationIteratorTestDrive {
	public static void main (String args[]) {
		Vector v = new Vector(Arrays.asList(args));
		
		v.add("Ricardo");
		v.add("Rafael");
		v.add("Quintero");
		v.add("Meza");
		
		Iterator iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
