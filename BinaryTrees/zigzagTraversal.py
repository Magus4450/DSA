# https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1
from bintree import *


def zigzagTraversal(root):
    if root is None: return []
    queue = [root]
    result = []
    rev = False
    while len(queue) > 0:
        level_res = []
        for _ in range(len(queue)):
            curr = queue.pop()
            level_res.append(curr.val)
            if curr.left:
                queue.insert(0, curr.left)
            if curr.right:
                queue.insert(0, curr.right)

        if rev:
            level_res.reverse()
            rev = False
        else:
            rev = True
        result = [*result, *level_res]
    return result

print(zigzagTraversal(a))

