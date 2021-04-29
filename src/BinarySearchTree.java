import java.util.Scanner;

public class BinarySearchTree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BinaryTree myTree = new BinaryTree(9);
        myTree.getRoot().addLeftNode(7);
        myTree.getRoot().addRightNode(13);
        myTree.getRoot().getLeft().addRightNode(6);
        myTree.getRoot().getLeft().addLeftNode(2);
        //myTree.getRoot().getRight().getLeft().addLeftNode(1);
        //myTree.getRoot().getRight().getLeft().addRightNode(1);

        //System.out.println("Le nombre de sous arbres unival est de " + myTree.getRoot().countUnivalSubTree());
        System.out.println("Saisir le nombre a cherche: ");
        int checkValue = sc.nextInt();

        try {
            System.out.printf("le nombre %d est dans l'arbre.", myTree.getRoot().find(checkValue).getValue());
        } catch (NullPointerException nullPointerException){
            System.out.println("null");
        }
    }
}
