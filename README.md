# NodeDepths
- Distance between a node in a binary tree and the tree's root is called the node's depth
- write a function take a binary tree and return the node's depth.
# Solution
- At each level of node should remember level and increase the level of node
- the result should be all level of nodes sum up 
- pseduecode:
  - process level add each time, sum curent level with the left and right childrean
  - when current node in null return 0
  
  
