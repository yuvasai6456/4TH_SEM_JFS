public class LinkedList
{
	public static void display(Node head)
	{
		while(head != null)   // last node addr is null then loop stops and here we dont need size
		{
			System.out.print(head.data + " ");
			head = head.next; 
		}
	}
	public static void displayr(Node head) // displaying in recursively manner
	{
		if(head == null) return;
		System.out.print(head.data + " ");
		displayr(head.next);
	}
	public static void reversell(Node head) // displaying reverse of LL in recursively manner
	{
		if(head == null) return;
		reversell(head.next);
		System.out.print(head.data + " ");
	}
	
	public static int length(Node head) // to find the length of LL same as displaying 
	                                    // but instead of diplaying we are counting
	{
		int count = 0;
		while(head != null)   
		{
			count++;
			head = head.next; 
		}
		return count;
	}
	public static class Node //creating a user defined data type node which contains data,next 
	{
		int data;  //initializing data
		Node next; // here we use (Node next) because the datatype for addr is not known
		           // so we use Node data type because it has separate data type like @28a418fc 
		Node(int data) // we use this to initializing data by constructor
		{
			this.data=data;
		}
	}
	public static void main(String args[])
	{
		Node a = new Node(4); // we are creating objects of pre defined data type or class 
		                      //and giving value so we get 4
		Node b = new Node(5); // 5
		Node c = new Node(15); // 15
		Node d = new Node(35); // 35
		Node e = new Node(65); // 65
		a.next = b; // Here we are assigning addr of b to a.next (a -> b)
		b.next = c; // a->b->c
		c.next = d; // a->b->c->d
		d.next = e; // a->b->c->d->e
		
		/*displaying values using only first node
		System.out.print(a.data);    
		System.out.print(a.next.data);
		System.out.print(a.next.next.data);
		System.out.print(a.next.next.next.data);
		System.out.print(a.next.next.next.next.data);
		
		// we can also display using for and while loop first assigning a value to temp and increasing next
		Node temp = a; // just assigning a to temp
		for(int i=1; i<=5; i++)
		{
			System.out.print(temp.data);
			temp=temp.next; 			// increasing next 
		}
		*/
		display(a);
		System.out.println();
		displayr(a);
		System.out.println();
		reversell(a);
		System.out.println(length(a));
		
	
	}
}