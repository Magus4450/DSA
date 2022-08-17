from asyncore import loop
from bintree import *


def levelOrderTraversal(root):

    if root is None: return []
    queue = [root]
    result = []
    while len(queue) > 0:
        level_res = []
        for _ in range(len(queue)):
            curr = queue.pop()
            level_res.append(curr.val)
            if curr.left:
                queue.insert(0, curr.left)
            if curr.right:
                queue.insert(0, curr.right)

            
        result.append(level_res)
    return result

print(levelOrderTraversal(a))    

        
