class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode tempNode = root.right;
            root.right = root.left;
            root.left = tempNode;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}