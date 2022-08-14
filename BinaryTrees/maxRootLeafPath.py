from bintree import *

def maxRootLeafPath(root):
    if root is None: return float('-inf')
    if root.left == None and root.right == None: return root.val;

    return root.val + max(maxRootLeafPath(root.left), maxRootLeafPath(root.right))

print(maxRootLeafPath(a))