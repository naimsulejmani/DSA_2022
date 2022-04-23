package cacttus.education.tree;

public class BinarySearchTree {
    private Node root; //pointer root
    private int counter;

    public boolean isEmpty() {
        return root == null;
    }

    public int size() {
        return counter;
    }

    public void insert(int key) {
        Node newNode = new Node(key);

        if (isEmpty()) {
            root = newNode;
        } else {
            Node iter = root; //fillo prej root
            while (iter != null) { // perderisa nuk je null
                //nese vlera e root eshet me e madhe se key -
                if (iter.getData() > key) {
                    //atehere nese ana e majt e saj eshte null vendose aty
                    if (iter.getLeft() == null) {
                        iter.setLeft(newNode);
                        break;
                    } else iter = iter.getLeft(); //perndryshe shko ne anen e majte te nenpemes
                } else {
                    //perndryshe nese vlera e root eshte me e vogel se key
                    if (iter.getRight() == null) {
                        //dhe nuk kemi element ne anen e djatht vendose aty
                        iter.setRight(newNode);
                        break;

                    } else iter = iter.getRight(); //perndryshe shko ne anen e djath te nenpemes
                }
            }
        }
    }

    public int minimum() throws NoElementException {
        if (isEmpty()) {
            throw new NoElementException("BST has no elements on it!");
        }
        Node iter = root;
        while (iter.getLeft() != null) {
            iter = iter.getLeft();
        }
        return iter.getData();
    }

    public int maximum() throws NoElementException {
        if (isEmpty()) {
            throw new NoElementException("BST has no elements on it!");
        }
        Node iter = root;
        while (iter.getRight() != null) {
            iter = iter.getRight();
        }
        return iter.getData();
    }

    private void inorder(Node root) {
        if (root == null) return; //nese root eshte null nuk ki cka me vizitu
        inorder(root.getLeft()); //go to left subtree
        System.out.println(root.getData()); // visit the node
        inorder(root.getRight());
    }

    public void inorderTraversal() {
        inorder(root);
    }

    private void preorder(Node root) {
        if (root == null) return;
        System.out.println(root.getData());
        preorder(root.getLeft());
        preorder(root.getRight());
    }

    public void preorderTraversal() {
        preorder(root);
    }

    private void postorder(Node root) {
        if (root == null) return;
        postorder(root.getLeft());
        postorder(root.getRight());
        System.out.println(root.getData());
    }

    public void postorderTraversal() {
        postorder(root);
    }

    private Node search(int key, Node root) {
        if (root == null || root.getData() == key) return root;
        if (root.getData() > key)
            return search(key, root.getLeft());
        else return search(key, root.getRight());
    }

    public boolean existsKey(int key) {
        Node searchKeyNode = search(key, root);
        return searchKeyNode != null;
    }


}
