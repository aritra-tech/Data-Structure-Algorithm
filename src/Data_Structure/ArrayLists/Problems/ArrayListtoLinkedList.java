package Data_Structure.ArrayLists.Problems;// Java program to convert ArrayList
// to LinkedHashMap

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

class ArrayListtoLinkedList {
	public static void main(String[] args)
	{
		LinkedHashMap<Integer, Integer> l = new LinkedHashMap<>();

		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(4);

		int i = 0;
	
		// Adding one by one the elements
		// of ArrayList to LinkedHashMap
		while (i < l1.size())
		{

			l.put(i + 1, l1.get(i));
			i++;
		}
		
		System.out.println("Key | Value");
		
		// .entrySet() method gives us the list of all
		// mappings reference of the map
		for (Map.Entry<Integer, Integer> it :l.entrySet()) {
			
			System.out.println(" " + it.getKey() + " | "
							+ it.getValue());
			
		}
	}
}

