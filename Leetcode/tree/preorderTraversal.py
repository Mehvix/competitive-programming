# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
#        TreeNode{val: 1, left: None, right: TreeNode{val: 2, left: TreeNode{val: 3, left: None, right: None}, right: None}}


class Solution:
    def preorderTraversal(self, root: TreeNode) -> List[int]:
        if root:
            return [root.val] + Solution.preorderTraversal(self, root.left) + Solution.preorderTraversal(self, root.right)
        else:
            return []
