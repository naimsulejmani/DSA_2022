package cacttus.education.tree;

public class BinarySearchTreeTest {
    public static void main(String[] args) throws NoElementException {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(70);
        bst.insert(50);
        bst.insert(80);
        bst.insert(55);
        bst.insert(44);
        bst.insert(100);

        System.out.println("INORDER");

        bst.inorderTraversal();
        System.out.println("-----------");
        System.out.println(bst.minimum());
        System.out.println(bst.maximum());
        System.out.println("------------");
        System.out.println("PREORDER");
        bst.preorderTraversal();

        System.out.println("POST ORDER");
        bst.postorderTraversal();

        System.out.println("---------");
        System.out.println(bst.existsKey(100));
        System.out.println(bst.existsKey(101));
    }
}
