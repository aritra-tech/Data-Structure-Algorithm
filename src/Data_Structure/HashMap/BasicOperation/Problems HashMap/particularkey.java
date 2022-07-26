// java program to check if a particular
// key exists in HashMap

import java.util.*;

class particularkey {

	// declaring the method
	// the parameter keyToBeChecked is the
	// key to be checked
	boolean checkForKey(String keyToBeChecked)
	{

		// initializing the hashmap
		HashMap<String, Integer> hashMap =
		new HashMap<>();

		// filling the key - value pairs in hashmap
		hashMap.put("first", 1);
		hashMap.put("second", 2);
		hashMap.put("third", 3);
		hashMap.put("fourth", 4);

		// variable to store the boolean value
		// for result
		boolean result
			= hashMap.containsKey(keyToBeChecked);

		// returning the result
		return result;
	}

	// Driver Code
	public static void main(String[] args)
	{

		// instantiating the class
		particularkey ob = new particularkey();

		// displaying and calling the checkForKey()
		// method
		System.out.println(ob.checkForKey("fourth"));
	}
}

