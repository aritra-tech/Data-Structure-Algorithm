package Data_Structure.Stack.Basic_Operations.Stack_using_LL;/*
 * Java Program to Implement Stack using Linked List
 */
 
import java.util.*;
 
/*  Class Node  */
class ListNode
{
    protected int data;
    protected ListNode link;
 
    /*  Constructor  */
    public ListNode()
    {
        link = null;
        data = 0;
    }    
    /*  Constructor  */
    public ListNode(int d,ListNode n)
    {
        data = d;
        link = n;
    }    
    /*  Function to set link to next Node  */
    public void setLink(ListNode n)
    {
        link = n;
    }    
    /*  Function to set data to current Node  */
    public void setData(int d)
    {
        data = d;
    }    
    /*  Function to get link to next node  */
    public ListNode getLink()
    {
        return link;
    }    
    /*  Function to get data from current Node  */
    public int getData()
    {
        return data;
    }
}
 
/*  Class linkedStack  */
class linkedStack
{
    protected ListNode top ;
    protected int size ;
      /*  Constructor  */
      public linkedStack()
      {
          top = null;
          size = 0;
      }    
      /*  Function to check if stack is empty */
      public boolean isEmpty()
      {
          return top == null;
      }    
      /*  Function to get the size of the stack */
      public int getSize()
      {
          return size;
      }    
      /*  Function to push an element to the stack */
      public void push(int data)
      {
          ListNode nptr = new ListNode (data, null);
          if (top == null)
              top = nptr;
          else
          {
              nptr.setLink(top);
              top = nptr;
        }
        size++ ;
    }    
    /*  Function to pop an element from the stack */
    public int pop()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception") ;
        ListNode ptr = top;
        top = ptr.getLink();
        size-- ;
        return ptr.getData();
    }    
    /*  Function to check the top element of the stack */
    public int peek()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception") ;
        return top.getData();
    }    
    /*  Function to display the status of the stack */
    public void display()
    {
        System.out.print("\nStack = ");
        if (size == 0) 
        {
            System.out.print("Empty\n");
            return ;
        }
        ListNode ptr = top;
        while (ptr != null)
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getLink();
        }
        System.out.println();        
    }
}
 
/* Class LinkedStackImplement */
public class stackusingLL
{    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);   
        /* Creating object of class linkedStack */   
        linkedStack ls = new linkedStack();          
        /* Perform Stack Operations */  
        System.out.println("Linked Stack Test\n"); 
        char ch;     
        do 
        {
            System.out.println("\nLinked Stack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");            
            int choice = scan.nextInt();
            switch (choice) 
            {
            case 1 :
                System.out.println("Enter integer element to push");
                ls.push( scan.nextInt() ); 
                break;                         
            case 2 : 
                try
                {
                    System.out.println("Popped Element = "+ ls.pop());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }    
                break; 
            case 3 : 
                try
                {
                    System.out.println("Peek Element = "+ ls.peek());
                }
                catch (Exception e)
                {
                    System.out.println("Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                System.out.println("Empty status = "+ ls.isEmpty());
                break;                
            case 5 : 
                System.out.println("Size = "+ ls.getSize()); 
                break;                
            case 6 : 
                System.out.println("Stack = "); 
                ls.display();
                break;                        
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }           
            /* display stack */    
            ls.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);       
 
        } while (ch == 'Y'|| ch == 'y');                 
    }
}