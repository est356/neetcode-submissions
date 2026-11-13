# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        result = []
        s = deque()
        s.append(root)

        while s:
            sLen = len(s)
            if s[-1]:
                result.append(s[-1].val)
            for i in range(sLen):
                if s[0] and s[0].left:
                    s.append(s[0].left)
                if s[0] and s[0].right:
                    s.append(s[0].right)
                s.popleft()
            

        return result
