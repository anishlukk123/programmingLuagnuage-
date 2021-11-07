

public class Avltree {
	
	
	private class avlnode{
		
		private  int value;
		 avlnode left;
		 avlnode right;
		 private int height;
		
		 
		 
		 public avlnode(int value)
		 {
			 
              height =0;
			  this.value = value;
			  left = null;
			  right =null;
		 }
	}
	
	
 avlnode root;
 
 private   avlnode  insert(avlnode root,int val) {

	 if(root == null)
	 {
		 
			root =  new avlnode(val);
			return root;
	 }
	 else if(val<root.value)
	 {
		root.left = insert(root.left,val);
	 }
	 else 
	 {
		 root.right =insert(root.right,val);
	 }
	 
	 root.height = Math.max(height(root.left),height(root.right))+1;
	 
	 if( isleftheavyroot))
	 {
		 System.out.println(root.value+"is left heavy");
	 }
	 
	 else if(isrightheavy(root))
	 {
		 System.out.println(root.value+ "is right heavy");
			
	 }
	 
	 
	return root;

	 
 }
 private boolean isrightheavy(avlnode node) {
	
	 return height(root.left) - height(root.right)<-1;
	
}
private boolean isleftheavy(avlnode node) {
	return height(root.left) - height(root.right)>1;
	
}
public   void insert(int val) {
	root = insert( root, val);
}
 
private int height(avlnode root )
{
	if(root ==null)
	{
		return -1;	
	}
	return root.height;
	
}
public  int height()
{
	
	return height(root);
}
 
}
