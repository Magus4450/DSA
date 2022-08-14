from bintree import *

def depthFirstValues(root):
    result = []
    if not root:
        return result
    stack = [root]
    
    while len(stack) > 0:

        curr = stack.pop()
        result.append(curr.val)

        if curr.right:
            stack.append(curr.right)
        if curr.left:
             stack.append(curr.left)
    
    return result




print(depthFirstValues(a))
print(depthFirstValues(None))
