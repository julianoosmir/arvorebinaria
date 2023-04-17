public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        BinaryTreeInverter inverter = new BinaryTreeInverter();
        TreeNode inverted = inverter.invertTree(root);

        // imprime a árvore invertida
        System.out.println(inverted.val); // 4
        System.out.println(inverted.left.val); // 7
        System.out.println(inverted.right.val); // 2
        System.out.println(inverted.left.left.val); // 9
        System.out.println(inverted.left.right.val); // 6
        System.out.println(inverted.right.left.val); // 3
        System.out.println(inverted.right.right.val); // 1

    }
}
