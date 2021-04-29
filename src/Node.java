public class Node {
    protected int value;
    protected Node left;
    protected Node right;

    public Node(int value){
        this.value = value;
    }

    public void addLeftNode(int value){
        this.left = new Node(value);
    }

    public void addRightNode(int value){
        this.right = new Node(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int countUnivalSubTree(){
        int count = 0;
        if (this.getLeft() != null){
            if (this.value == this.getLeft().getValue()){
                count ++;
            }
            count += this.getLeft().countUnivalSubTree();
        }
        if (this.getRight() != null){
            if (this.value == this.getRight().getValue()){
                count ++;
            }
            count += this.getRight().countUnivalSubTree();
        }
        if (this.getLeft() != null && this.getRight() != null){
            if (this.value == this.getLeft().getValue() && this.value == this.getRight().getValue()){
                count ++;
            }
        }
        return count;
    }

    public boolean search(int value){
        if (value == this.value){
            return true;
        }
        if (value < this.value){
            if (left == null){
                return false;
            } else {
                return left.search(value);
            }
        }
        if (value > this.value){
            if (right == null){
                return false;
            } else {
                return right.search(value);
            }
        }
        return false;
    }

    public Node find(int value){
        if (value == this.value){
            return this;
        }
        if (value < this.value){
            if (left == null){
                return null;
            } else {
                return left.find(value);
            }
        }
        if (value > this.value){
            if (right == null){
                return null;
            } else {
                return right.find(value);
            }
        }
        return null;
    }
}
