from bintree import *
from isSameTree import isSameTree

def isSubTree(root, subRoot):
    if not subRoot: return True
    if not root: return False

    if isSameTree(root, subRoot):
        return True
    else:
        return isSubTree(root.left, subRoot) or isSubTree(root.right, subRoot)
    

print(isSubTree(c,a))
    
    