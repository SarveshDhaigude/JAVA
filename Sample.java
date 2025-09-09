class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class Linkedlist
{
	Node head;
	public void insert(int data)
	{
		Node n1=new Node(data);
		if(head==null)
		{
		   head=n1;
		   return;
		}
		Node temp=head;
	      while(temp.next!=null)
		{
		   temp=temp.next;
		}
		temp.next=n1;
	}
	public void show()
	{
		Node temp=head;
		while(temp!=null)
		{
		     System.out.print(temp.data +"->");
		     temp=temp.next;
		}
		System.out.println("null");      
	}
}
class Sample
{
	public static void main(String s[])
	{
		Linkedlist l1=new Linkedlist();				
			l1.insert(10);
			l1.insert(20);
			l1.insert(30);
			l1.insert(40);
			l1.insert(50);
			l1.insert(100);
			System.out.print("Linkedlist is");
			l1.show();
	}
}		   
		   
