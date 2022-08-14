
from bintree import *

def treeIncludes(root, target):
    if not root:
        return False
    queue = [root]

    while len(queue) > 0:
        curr = queue.pop()
        if curr.val == target:
            return True
        if curr.left : queue.insert(0, curr.left)
        if curr.right : queue.insert(0, curr.right)
    
    return False