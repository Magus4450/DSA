from bintree import *

def treeIncludesR(root, target):

    if not root: return False
    if root.val == target: return True

    return treeIncludesR(root.left, target) or treeIncludesR(root.right, target)

print(treeIncludesR(a, 'k'))