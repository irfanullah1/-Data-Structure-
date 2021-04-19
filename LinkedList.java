package SL;

public class LinkedList {
	Node head;
	public void InsertAtFirst(int data)
	{
		Node NewNode = new Node(data);
		if(head==null)
		{
			head=NewNode;
		}
		else 
		{
			NewNode.Next=head;
			head=NewNode;
			
		}
		
		
	}
	
	
	public void Print()
	{
		Node CurrNode=head;
		while(CurrNode.Next!=null)
		{
			System.out.println(CurrNode.data);

			CurrNode=CurrNode.Next;
			
		}
		System.out.println(CurrNode.data);
	}
	
	
	
	

}
