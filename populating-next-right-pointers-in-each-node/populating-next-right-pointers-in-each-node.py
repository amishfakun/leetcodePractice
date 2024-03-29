"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""

class Solution:
    def connect(self, root: 'Optional[Node]') -> 'Optional[Node]':
        
        def bfs(node):
            PROCESS = []
            if node is None: return PROCESS
            queue = deque([node])
            while len(queue) > 0:
                currLevel = []
                n = len(queue)
                for i in range(n):
                    currNode = queue.popleft()
                    currLevel.append(currNode)

                    if currNode.left:
                        queue.append(currNode.left)
                    
                    if currNode.right:
                        queue.append(currNode.right)
                PROCESS.append(currLevel)
            
            return PROCESS
        
        res = bfs(root)
        

        for item in res:
            for i in range(len(item)):
                if i == len(item) - 1:
                    item[i].next = None
                else:
                    item[i].next = item[i+1]
        

        return root

        


                
    



    '''
    First idean -> BFS
    QUEUE:

    2 3 

    PROCESSED : 1
    well necessarily if it is a perfect binary tree the only time where queue.size == 1 is for the root
    root.next == NULL

    Q: [[2,3], [4,5,6,7]]
    for item in list:
        for i in range(len(item)):

            if i == len(item) - 1:
                item[i].next = NULL
            else:
                item[i].next = item[i+1]
    
    
    '''
        