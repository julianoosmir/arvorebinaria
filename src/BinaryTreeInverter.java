public class BinaryTreeInverter {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // inverte as subárvores esquerda e direita
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // troca as subárvores esquerda e direita
        root.left = right;
        root.right = left;

        return root;
    }
}
