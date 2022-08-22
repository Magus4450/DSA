#https://www.geeksforgeeks.org/create-a-mirror-tree-from-the-given-binary-tree/

from bintree import *
from levelOrderTraversal import levelOrderTraversal
def mirrorTree(root):
    if root is None: return root

    left = mirrorTree(root.left)
    right = mirrorTree(root.right)
    root.right = left
    root.left = right

    return root


print(levelOrderTraversal(a))
mir = mirrorTree(a)
print(levelOrderTraversal(mir))

 