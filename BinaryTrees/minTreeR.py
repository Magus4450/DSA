from bintree import *


def minTreeR(root):
    if root is None: return float('inf')

    return min(root.val, minTreeR(root.left), minTreeR(root.right))

print(minTreeR(a))