from bintree import *

def reverseLevelOrder(root):
    if root is None: return []
    queue = [root]
    result = []
    while len(queue) > 0:
        curr = queue.pop()
        result.insert(0, curr.val)
        if curr.right:
            queue.insert(0, curr.right)
        if curr.left:
            queue.insert(0, curr.left)
    
    return result



print(reverseLevelOrder(a))