# Video Tutorials:
+ ### Kunal's [Introduction to Recursion - Learn In The Best Way](https://youtu.be/M2uO2nMT0Bk)

# Recursion basics

What is Recursion?

The process in which a function calls itself directly or indirectly is called recursion and the corresponding function is called a recursive function. Using a recursive algorithm, certain problems can be solved quite easily. Examples of such problems are Towers of Hanoi (TOH), Inorder/Preorder/Postorder Tree Traversals, DFS of Graph, etc. A recursive function solves a particular problem by calling a copy of itself and solving smaller subproblems of the original problems. Many more recursive calls can be generated as and when required. It is essential to know that we should provide a certain case in order to terminate this recursion process. So we can say that every time the function calls itself with a simpler version of the original problem.

Need of Recursion:

Recursion is an amazing technique with the help of which we can reduce the length of our code and make it easier to read and write. It has certain advantages over the iteration technique which will be discussed later. A task that can be defined with its similar subtask, recursion is one of the best solutions for it. For example; The Factorial of a number.

Properties of Recursion:

Performing the same operations multiple times with different inputs.
In every step, we try smaller inputs to make the problem smaller.
Base condition is needed to stop the recursion otherwise infinite loop will occur.
A Mathematical Interpretation

Let us consider a problem that a programmer has to determine the sum of first n natural numbers, there are several ways of doing that but the simplest approach is simply to add the numbers starting from 1 to n. So the function simply looks like this,

approach(1) – Simply adding one by one

`
f(n) = 1 + 2 + 3 +……..+ n
`

but there is another mathematical approach of representing this,

approach(2) – Recursive adding 

`
f(n) = 1                  n=1

f(n) = n + f(n-1)    n>1
`

There is a simple difference between the approach (1) and approach(2) and that is in approach(2) the function “ f( ) ” itself is being called inside the function, so this phenomenon is named recursion, and the function containing recursion is called recursive function, at the end, this is a great tool in the hand of the programmers to code some problems in a lot easier and efficient way.

How are recursive functions stored in memory?

Recursion uses more memory, because the recursive function adds to the stack with each recursive call, and keeps the values there until the call is finished. The recursive function uses LIFO (LAST FILL FIRST OUT) Structure just like the stack data structure. https://www.geeksforgeeks.org/stack-data-structure/
 

What is the base condition in recursion? 
In the recursive program, the solution to the base case is provided and the solution to the bigger problem is expressed in terms of smaller problems. 
 
```
int fact(int n)
{
    if (n < = 1) // base case
        return 1;
    else    
        return n*fact(n-1);    
}
```

* In the above example, the base case for n < = 1 is defined and the larger value of a number can be solved by converting to a smaller one till the base case is reached.

How a particular problem is solved using recursion? 
The idea is to represent a problem in terms of one or more smaller problems, and add one or more base conditions that stop the recursion. For example, we compute factorial n if we know the factorial of (n-1). The base case for factorial would be n = 0. We return 1 when n = 0. 

Why Stack Overflow error occurs in recursion? 
If the base case is not reached or not defined, then the stack overflow problem may arise. Let us take an example to understand this.
```
int fact(int n)
{
    // wrong base case (it may cause
    // stack overflow).
    if (n == 100) 
        return 1;

    else
        return n*fact(n-1);
}
```
If fact(10) is called, it will call fact(9), fact(8), fact(7), and so on but the number will never reach 100. So, the base case is not reached. If the memory is exhausted by these functions on the stack, it will cause a stack overflow error. 

What is the difference between direct and indirect recursion? 
A function fun is called direct recursive if it calls the same function fun. A function fun is called indirect recursive if it calls another function say fun_new and fun_new calls fun directly or indirectly. The difference between direct and indirect recursion has been illustrated in Table 1. 

// An example of direct recursion
```
void directRecFun()
{
    // Some code....

    directRecFun();

    // Some code...
}
```

// An example of indirect recursion
```
void indirectRecFun1()
{
    // Some code...

    indirectRecFun2();

    // Some code...
}
```
```
void indirectRecFun2()
{
    // Some code...

    indirectRecFun1();

    // Some code...
}
```
**What is the difference between tailed and non-tailed recursion?** 
```
A recursive function is tail recursive when a recursive call is the last thing executed by the function. Please refer tail recursion article for details. 
```

**How memory is allocated to different function calls in recursion?**
```
When any function is called from main(), the memory is allocated to it on the stack. A recursive function calls itself, the memory for a called function is allocated on top of memory allocated to the calling function and a different copy of local variables is created for each function call. When the base case is reached, the function returns its value to the function by whom it is called and memory is de-allocated and the process continues.
```
* An Example Of Java:

// A Java program to demonstrate working of
// recursion
```
class Aritra {
	static void printFun(int test)
	{
		if (test < 1)
			return;
		else {
			System.out.printf("%d ", test);
			printFun(test - 1); // statement 2
			System.out.printf("%d ", test);
			return;
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		int test = 3;
		printFun(test);
	}
}
```
