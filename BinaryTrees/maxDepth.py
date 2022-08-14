from bintree import *

def maxDepth(root) -> int:
    if root is None: return 0
    if root.left is None and root.right is None: return 1
    
    return max(maxDepth(root.left)+1, maxDepth(root.right)+1)

print(maxDepth(a))