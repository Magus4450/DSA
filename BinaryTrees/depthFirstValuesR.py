from bintree import *

def depthFirstValuesR(root):

    if not root:
        return []
    
    leftValues = depthFirstValuesR(root.left)
    rightValues = depthFirstValuesR(root.right)
    
    return[root.val, *leftValues, *rightValues]

print(depthFirstValuesR(a))