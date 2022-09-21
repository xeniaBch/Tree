public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(7);
        tree.insert(5);
        tree.insert(3);
        tree.insert(6);
        tree.insert(8);
        tree.insert(9);


        System.out.println(tree.search(5));
        System.out.println(tree.search(2));

    }
}
