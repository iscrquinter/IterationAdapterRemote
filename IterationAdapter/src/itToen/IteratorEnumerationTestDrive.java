package itToen;

import java.util.*;

public class IteratorEnumerationTestDrive {
	public static void main (String args[]) {
		ArrayList l = new ArrayList();
		
		l.add("Ricardo");
		l.add("Rafael");
		l.add("Quintero");
		l.add("Meza");
		
		Enumeration enumeration = new IteratorEnumeration(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
