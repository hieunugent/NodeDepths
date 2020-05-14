# code start here
def nodeDepths(root):    
    return nodeDepthsProcess(root, 0)
def nodeDepthsProcess(root, level):
	if (root is None ):
		return 0;
	return level + nodeDepthsProcess(root.left, level+1)+ nodeDepthsProcess(root.right, level+1)
# code end here
# This is the class of the input binary tree.
class BinaryTree:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
