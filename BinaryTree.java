package Tree;

public class BinaryTree {
	Tree Root;
	public void Insert(int k) {

		
		Tree NewNode=new Tree(k);
		if(Root==null) 
			Root=NewNode;
		else {
			
		TraversAndAddNode(Root,NewNode);
		
		}
		
	}
	

	public void TraversAndAddNode(Tree Node,Tree NewNode) 
	{
		if(NewNode.Data<Node.Data)
		{
			if(Node.left==null)
			{
				Node.left=NewNode;
				//System.out.println("Data Inserted Left:"+Node.left.Data);
			}else {
				TraversAndAddNode(Node.left,NewNode);
			}
		}else if(NewNode.Data> Node.Data) 
		{
			if(Node.right==null)
            {
				Node.right=NewNode;
			//	System.out.println("Data Inserted Right:"+Node.right.Data);
			}else
			{
				TraversAndAddNode(Node.right,NewNode);
			}
		}
		
	}


	public void Serch(int key)
	{
		Tree Node=Root;
		
		while(Node.Data !=key)
		{
			
			if(Node.Data>key)
			{
				Node=Node.left;
			}
			else
			{
				Node=Node.right;
			}
		}
			System.out.println("Key finded: "+Node.Data);
		
	}
	
	public void Travers() {
		if(Root!=null)
		{
		  Tree Node=Root;
		  if(Node.left==null) {
			  System.out.println("Root"+Node.Data);
		  }else
		  {
			  System.out.println("Node Visted: "+Node.Data);
			  if(Node.left !=null)
			  {
				  Traversal(Node.left);
				  
			  }
		
			  /////////////////////////Irfanullah/////////////////
			
			  if(Node.right !=null)
			  {
				  Traversal(Node.right);
				  
			  }
		  }	
		}
	}

	private void Traversal(Tree Node)
	{
		
		if(Node.left !=null)
		{
		     Traversal(Node.left);
		}
	//	System.out.println("Node Visted: "+Node.Data);
		if(Node.right !=null)
		{
			Traversal(Node.right);
		}
		 System.out.println("Node Visted: "+Node.Data);
	}
////////////////Delete Methode//////////////////////////
	public void deleteKey(int key) 
	    { 
	       Root = deleteRec( Root, key); 
	    } 
	  
	    /* A recursive function to insert a new key in BST */
	    Tree deleteRec(Tree Node, int key) 
	    { 
	        /* Base Case: If the tree is empty */
	        if (Node == null)  return null; 
	  
	        /* Otherwise, recur down the tree */
	        if (key < Node.Data) 
	           Node.left = deleteRec(Node.left, key); 
	        else if (key > root.Data) 
	            Node.right = deleteRec(Node.right, key); 
	  
	        // if key is same as root's key, then This is the node 
	        // to be deleted 
	        else
	        { 
	            // node with only one child or no child 
	            if (Node.left == null) 
	                return Node.right; 
	            else if (root.right == null) 
	                return Node.left; 
	  
	            // node with two children: Get the inorder successor (smallest 
	            // in the right subtree) 
	            Node.Data = minValue(Node.left); 
	  
	            // Delete the inorder successor 
	            Node.left = deleteRec(Node.left, Node.Data); 
	        } 
	  
	        return root; 
	    } 
	    
	    int minValue(Tree Node) 
	    { 
	        int minv = Node.Data; 
	        while (Node.right != null) 
	        { 
	            minv = Node.right.Data; 
	            Node = Node.right; 
	        } 
	        return minv; 
	    } 
}
