# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        copy = []
        ptr = head
        while ptr != None:
            copy.append(ptr.val)
            ptr = ptr.next
        copy.reverse()
        curr = head;
        for i in range(len(copy)):
            curr.val = copy[i]
            curr = curr.next
        return head

