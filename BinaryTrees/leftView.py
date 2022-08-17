# https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1

from bintree import *


root = Node(4)
r1 = Node(5)
r2 = Node(2)
root.left = r1
root.right = r2
r3 = Node(3)
r4 = Node(1)
r2.left = r3
r2.right = r4
r5 = Node(6)
r6 = Node(7)
r3.left = r5
r3.right = r6


from levelOrderTraversal import levelOrderTraversal
def leftView(root):

    level_order = levelOrderTraversal(root)
    return [l[0] for l in level_order]
    

print(leftView(root))

