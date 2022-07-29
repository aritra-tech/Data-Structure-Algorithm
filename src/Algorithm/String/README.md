**Strigns in Java**

**Introduction:**
  
Strings in Java are Objects that are backed internally by a char array. Since arrays are immutable(cannot grow), Strings are immutable as well. Whenever a change to a String is made, an entirely new String is created. 

**Syntax:**

- `<String_Type> <string_variable> = "<sequence_of_string>"; `

**Example:**

- ` String str = "Geeks"; `

**Memory Allocation of Strings:**

Whenever a String Object is created as a literal, the object will be created in String constant pool. This allows JVM to optimize the initialization of String literal.

The string can also be declared using new operator i.e. dynamically allocated. In case of String are dynamically allocated they are assigned a new memory location in heap. This string will not be added to String constant pool.
- For example: `String str = new String("Geeks");`

If you want to store this string in the constant pool then you will need to “intern” it.
`
String internedString = str.intern(); 
// this will add the string to string constant pool.
`

It is preferred to use String literals as it allows JVM to optimize memory allocation.


Code Example:
`
// Java code to illustrate String
import java.io.*;
import java.lang.*;

class Test {
	public static void main(String[] args)
	{
		// Declare String without using new operator
		String s = "GeeksforGeeks";

		// Prints the String.
		System.out.println("String s = " + s);

		// Declare String using new operator
		String s1 = new String("GeeksforGeeks");

		// Prints the String.
		System.out.println("String s1 = " + s1);
	}
}
`

**Output of the above code:**
`
String s = GeeksforGeeks
String s1 = GeeksforGeeks
`

**Interfaces and Classes in Strings in Java**

- CharBuffer: This class implements the CharSequence interface. This class is used to allow character buffers to be used in place of CharSequences. An example of such usage is the regular-expression package java.util.regex.

- String: String is a sequence of characters. In java, objects of String are immutable which means a constant and cannot be changed once created.

**Creating a String:**

There are two ways to create a string in Java: 

String literal
`
String s = “GeeksforGeeks”;
`
Using new keyword
`
String s = new String (“GeeksforGeeks”);
`
StringBuffer is a peer class of String that provides much of the functionality of strings. The string represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences.

Syntax:
`
StringBuffer s = new StringBuffer("GeeksforGeeks");
StringBuilder in Java represents a mutable sequence of characters. Since the String Class in Java creates an immutable sequence of characters, the StringBuilder class provides an alternate to String Class, as it creates a mutable sequence of characters.
`
Syntax:
`
StringBuilder str = new StringBuilder();
str.append("GFG");
StringTokenizer class in Java is used to break a string into tokens. 
`


**stringtokenizer**

A StringTokenizer object internally maintains a current position within the string to be tokenized. Some operations advance this current position past the characters processed. A token is returned by taking a substring of the string that was used to create the StringTokenizer object.

StringJoiner is a class in java.util package which is used to construct a sequence of characters(strings) separated by a delimiter and optionally starting with a supplied prefix and ending with a supplied suffix. Though this can also be with the help of StringBuilder class to append delimiter after each string, StringJoiner provides an easy way to do that without much code to write.

Syntax:
`
public StringJoiner(CharSequence delimiter)
`

Let’s have a look at the concept with a java program and visualize the actual JVM memory structure: 

Program:
`
Java
class StringStorage {
    public static void main(String args[])
    {
        String s1 = "TAT";
        String s2 = "TAT";
        String s3 = new String("TAT");
        String s4 = new String("TAT");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
`
**Output**
`
TAT
TAT
TAT
TAT
`

Note: All objects in Java are stored in a heap. The reference variable is to the object stored in the stack area or they can be contained in other objects which puts them in the heap area also.

 

Example: 

Java
//Construct String from subset of char array
`
class GFG{
 
public static void main(String args[]){
byte ascii[]={71,70,71};
   
  String s1= new String(ascii);
  System.out.println(s1);
   
   String s2= new String(ascii,1,2);
  System.out.println(s2);
}
}
`
**Output**
`
GFG
FG
`
Example:

Java
// Construct one string from another
` 
class GFG{
public static void main(String args[])
{
   
  char c[]={'G','f','g'};
   
  String s1=new String (c);
  String s2=new String (s1);
   
  System.out.println(s1);
  System.out.println(s2);
 
 
}
}
`
**Output**
`
Gfg
Gfg
`
