
from bintree import *


def breadthFirstValues(root):

    if not root:
        return []

    queue = [root]
    result = []
    while len(queue) > 0:

        curr = queue.pop()
        result.append(curr.val)

        if curr.left: queue.insert(0, curr.left)
        if curr.right: queue.insert(0, curr.right)
    
    return result

print(breadthFirstValues(a))


        
