
public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  var tree =  new BinarySearchtree();
		   tree.inset(7);     //   7
		                     //  4   9
		                  // 1  6 8 10
		  tree.inset(4);
		  tree.inset(9);
		  tree.inset(1);
		  tree.inset(6);
		   tree.inset(8);
		  tree.inset(10);  
		       // System.out.println(tree.isvalid()); 
		      // tree.levelordertraversal(2);
		    //  System.out.print(tree.size());
		    //System.out.println(tree.countleaves());
		   // System.out.println(tree.treemax());
		   //  System.out.println(tree.findrecursion1(10));
		   // System.out.println(tree.issiblings(7, 6));
		    System.out.println(tree.getancestor(1));
		  
		 
		  
		 
	}

}
