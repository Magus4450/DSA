
class Node:

    def __init__(self, val) -> None:
        self.val = val
        self.left = None
        self.right = None



a = Node(5)
b = Node(11)
c = Node(3)
d = Node(4)
e = Node(2)
f = Node(1)



a.left = b
a.right = c
b.left = d
b.right = e
c.right = f

