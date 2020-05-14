import java.util.*;

class Program {
//my code here
  public static int nodeDepths(BinaryTree root) {
    // Write your code here.
		
	 // int maxDistance = root.value;
		return nodeDepthsProcess(root, 0);
  }
  
	public static int nodeDepthsProcess(BinaryTree root, int level){
		if(root == null){
			return 0;
		}
		return level + nodeDepthsProcess(root.left, level+1) + nodeDepthsProcess(root.right, level+1);
		
		
	}
  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
