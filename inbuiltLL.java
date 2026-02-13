public class inbuiltLL
{
	public static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
		}
	}
	
	
	public static class linkedlist
	{
		Node head = null;
		Node tail = null;
		
		void insertAtEnd(int val)
		{
			Node temp = new Node(val);
			if(head == null)
			{
				head = temp;
				tail = temp;
			}
			else
			{
				tail.next = temp;
				tail = temp;
			}
		}
		void insertAtBeg(int val)
		{
			Node temp = new Node(val);
			if(head ==  null)
			{
				head = temp;
				tail = temp;
			}
			else
			{
				temp.next = head;
				head = temp;
			}
		}
		void insertAtpos(int idx, int val)
		{
			Node t = new Node(val);
			Node temp = head;
			if(idx == size())
			{
				insertAtEnd(val);
				return;
			}
			else if(idx==0)
			{
				insertAtBeg(val);
				return;
			}
			for(int i = 0; i<=idx-1; i++)
			{
				temp = temp.next;
			}
			t.next = temp.next;
			temp.next = t;
			
		}
		void display()
		{
			Node temp = head;
			while(temp!=null)
			{
				System.out.print(temp.data +  " ");
				temp = temp.next;
			}
			System.out.println(); 
		} 
		int size()
		{
			Node temp = head; // we will start from head travelling
			int count = 0;
			while(temp!=null)
			{
				count++;
				temp = temp.next;
			}
			return count;
		}
		int getElt(int idx)
		{
			Node temp = head;
			for(int i=0; i<idx; i++)
			{
				temp=temp.next;
			}
			return temp.data;
		}
		void delAtpos(int idx)
		{
			Node temp = head;
			if(idx == 0)
			{
				head = head.next;
				return;
			}
			else if(idx == size()-1)
			{
				tail = temp;
			}
			for(int i=1; i<idx-1; i++)
			{
				temp = temp.next;
			}
			temp.next = temp.next.next;
			
		}
		int LinearSearch(int key)
		{
			Node temp = head;
			int pos = 1;
			while(temp != null)
			{
				if(temp.data == key)
					return pos;
				temp = temp.next;
				pos++;
			}
			return -1;
		}	
	}
	
	public static void main(String args[])
	{
		linkedlist ll = new linkedlist();
		ll.insertAtEnd(4);
		ll.insertAtEnd(6);
		ll.insertAtEnd(7);
		ll.display();
		System.out.println(ll.size());
		System.out.println(ll.getElt(2));
		System.out.println(ll.LinearSearch(6));
		
	}
	
		
}