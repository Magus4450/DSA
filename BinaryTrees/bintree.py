
class Node:

    def __init__(self, val) -> None:
        self.val = val
        self.left = None
        self.right = None




a = Node(10)
b = Node(20)
c = Node(30)
d = Node(40)
e = Node(60)
f = Node(70)
g = Node(80)



a.left = b
a.right = c
b.left = d
b.right = e
c.left = f
c.right = g

