# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution():
    def diameterOfBinaryTree(self, root: TreeNode) -> int:
        """
        :type root: TreeNode
        :rtype: int
        """
        if root is None:
            return 0

        diameter = [-1]  # has to be a list because lists reference memory, unlike ints
        self.height(root, diameter)

        return diameter[0]

    def height(self, root, diameter):
        if root is None:  # bottom of tree
            return 0

        lheight = self.height(root.left, diameter)
        rheight = self.height(root.right, diameter)

        diameter[0] = max(diameter[0], lheight + rheight)  # diameter is sum of both heights

        return 1 + max(lheight, rheight)