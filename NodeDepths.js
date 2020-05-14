// code here
function nodeDepths(root) {
	return nodeDepthsProcess(root, 0);
}
function nodeDepthsProcess (root, level){
	if(root === null){ return 0;}
	return level + nodeDepthsProcess(root.left, level+1)+nodeDepthsProcess(root.right, level+1);
}
// This is the class of the input binary tree.
class BinaryTree {
  constructor(value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }
}
//end of edit
// Do not edit the line below.
exports.nodeDepths = nodeDepths;
