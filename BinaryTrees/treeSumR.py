from turtle import right
from bintree import *

def treeSumR(root):
    if root is None: return 0

    return treeSumR(root.left) + treeSumR(root.right) + root.val

print(treeSumR(a))

