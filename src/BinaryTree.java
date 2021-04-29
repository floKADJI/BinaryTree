public class BinaryTree {
    protected Node root;

    public BinaryTree(int value){
        this.root = new Node(value);
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
