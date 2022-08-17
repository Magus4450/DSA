from bintree import *


def invertTree(root):
    if root is None: return root

    left = invertTree(root.left)
    right = invertTree(root.right)

    root.left, root.right = right, left

    return root


inverted = invertTree(a)



