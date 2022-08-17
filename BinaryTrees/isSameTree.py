from bintree import *


def isSameTree(root1, root2):

    if not root1 and not root2:
        return True

    if root1 and root2 and root1.val == root2.val:
        return isSameTree(root1.left, root2.left) and isSameTree(root1.right, root2.right)
    else:
        return False
    
print(isSameTree(a,a))