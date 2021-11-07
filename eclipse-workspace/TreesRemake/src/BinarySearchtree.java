import java.util.ArrayList;
import java.util.List;

public class BinarySearchtree {
	
	private class node
	{
		 node right;
		 node left;
	       int val;
		
		public node(int value)
		{
			val= value;
			
		}

		public void findrecursion(int value) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
  node root;
private Object left;
  
  public void inset(int val)
  {
	  var current = root;
	  var node = new node(val);
	   if(current == null)
	   {
		   root = node;
	   }
	   else
	   {
		 while(current!=null)
		 { 
			 if(node.val>current.val)
			 {
				 if(current.right==null)
				 {
					 current.right = node;
					 break;
				 }
				 else
				 {
					  current = current.right;
			 }
			 }
			 else  if(node.val<current.val)
			 {
				 if(current.left==null)
				 {
					 current.left = node;
					 break;
				 }
				 else
				 {
					  current =  current.left;
				 }
				 
			 }
		 }
			 
		 }

	

}
  
   public boolean find(int val)
   {
	  var current =  root;
	  while(current!=null)
	  {
		  if(val>current.val)
		  {
			  current = current.right;
		  }
		  else if(val<current.val)
		  {
			  current = current.left;
		  }
		  else   
		  {
			  return  true;
		  }
	  }
	   
	   
	   return false;
	   
   }  
   private  void preordertraversal(node root)
   {
	   if(root== null)
		   return;
	   
	  
	   
		      System.out.print(root.val);
		    preordertraversal(root.left);
		    preordertraversal(root.right);
	
	    
   }
   public  void inordertraversal()
   {
	   inordertraversal(root);
   }
   private  void inordertraversal(node root)
   {
	   if(root== null)
		   return;
	   
	  
	         inordertraversal(root.left);
		      System.out.print(root.val);
		    inordertraversal(root.right);
	
	    
   }
   public  void preordertraversal()
   {
	   preordertraversal(root);
   }
   public  void postordertraversal()
   {
	   postordertraversal(root);
   }
   private  void postordertraversal(node root)
   {
	   if(root== null)
		   return;
	   
	  
	         inordertraversal(root.left);
	         inordertraversal(root.right);
		      System.out.print(root.val);
	
   }
   public  int height()
   {
	   return height(root);
   }
   private  int  height(node root)
   {
	   if(root.left== null&&root.right == null)
		   return 0;
	   
	  
	          var leftheight = height(root.left);
	          var rightheight = height(root.right);
	          return 1+Math.max(leftheight, rightheight);
	
   }
   
   
   private int min(node root)
  
   {
	   if(root.left == null&& root.right == null)
	   {
		   return root.val;
	   }
	   var leftmin = min(root.left);
	   var rightmin = min(root.right);
	   
	   return Math.min(leftmin, rightmin);
	   
   }
   
   public  int min()
   {
	   return min(root);
   }
   
   private boolean equals(node  first ,node second)
   {
	  if(first == null&&second == null)               
		  return true;
	   
	  return first.val == second.val&& equals(first.left,second.left)&&equals(first.right,first.right);
   
   }
   public  boolean equals( BinarySearchtree tree )
   {
	
	   
	    return equals(root,tree.root);
   
   }
   
   
   private  boolean isvalid(node root, int max, int min)
   {
	   if(root == null)
	   {
		   return true;
	   }
	
	   if(root.val > max || root.val < min)
		   return false;
	   
	   
	   
	    return  isvalid(root.left,root.val-1,min) && isvalid(root.right,max,root.val);
	   
   }
   
   public  boolean isvalid()
   {
	    return isvalid(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
   }
   
   private   void kdistacefromroot(int k, node root)
   {
      if(k ==0)
      {

          System.out.println(root.val);
      }
      
      else
      {
    	    kdistacefromroot(k-1,root.left);
          kdistacefromroot(k-1,root.right); 
      }
   }
   
   public  void   kdistancefromroot(int k )
   {
	     kdistacefromroot( k ,root);
   }
   
   public void levelordertraversal(int distance)
   {
	   levelordertraversal(root,distance);
   }
   private  void levelordertraversal(node root,int distance)
   {
	    for(int i =0;i<=height();i++)
	    {
	        kdistacefromroot(i, root);
	    }
	    
   }
   
   
    private  int size(node root)
    {
        if(root == null)
        {
        	return 0;
        }
        else
        {
        	
        	  var leftsize = size(root.left);  
               var rigtsize = size(root.right);
        
               return  1+leftsize+rigtsize;
        }
        
        
    	
    }
    public   int size()
    {
    	 return size(root);
    }
    
    
    private int countleaves(node root)
    {
    	int count =0;
    	
    	if(root == null)
    		return 0;
    	
    	
    	if(root.left == null&& root.right == null)
       {
    	    return 1;
       }
    	else
    	{
    		var  leavesleft = countleaves(root.left);
    	     var leavesright = countleaves(root.right);
    	       count = leavesright + leavesleft;
    		
    	}
    	return count;
    	
    }
    public int countleaves()
    {
    	return countleaves(root);
    }
    
    private  int treemax(node  root) {
    	
    	 // set up arbitary min value Integer.minvalue
    	  // traverse through left and right subtree until you 
    	// root.right = null and root.left = null
    	    // return max of two values
    	
	while(root != null) {
     if(root.right == null&&root.left== null)
    {
    	 return root.val;
    }
     else
    	 
     {

    	  var maxright =  treemax(root.right);
    	    var maxleft = treemax(root.left);
    	    if(root.val<Math.max(maxright, maxleft))
    	   return Math.max(maxright, maxleft);
    	    else
    	    {
    	    	 return root.val;
    	    }
     }
    }
	return 0;
    }
    public   int treemax() 
    {
    	return treemax(root);
    }
   
 private boolean findrecursion(node root,int value) {
	  if (root == null)
	      return false;

	    if (root.val == value)
	      return true;

	    return findrecursion(root.left, value) || findrecursion(root.right, value);
 }
 public boolean findrecursion1(int k)
 {
	 return findrecursion(root,k);
 }
 private  boolean issiblings(node root, int  first, int  second)
 
 {
	if(root== null)
	{
		return false;
	} 
	 
		 if(root.left !=null &&root.right!=null)
        if(root.left.val == first&&root.right.val == second||root.right.val == first &&root.left.val == second)	
        {
        	return true;
        }
        else
        {
            return issiblings( root.left,  first, second)||issiblings( root.right,  first, second)|| issiblings( root.right,  second, first)||issiblings( root.left,  second, first);
        }
	return false;
 }
public   boolean issiblings( int  first, int  second)
 
 {
          return issiblings(root,first,second);
 }

private List<Integer> getancestor(node root, int val)
{
	ArrayList<Integer>ancestors = new ArrayList<>();
ancestors.add(root.val);
	
	
 if(root.left.val==val|| root.right.val == val)
 {
	  
	  ancestors.add(root.val);
 }
 else if(root.val> val)
 { 
	 
	 return getancestor(root.left, val);
 }
 else if(root.val<val)
 {
	 return getancestor(root.right, val);
 }
	return ancestors;
}
public  List<Integer> getancestor( int val)
{
	return getancestor(root,val);
}

 
 }


