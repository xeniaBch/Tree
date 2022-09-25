public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(4);
        tree.insert(7);
        tree.insert(6);

        //tree.passIterative();
        //tree.pass();

        tree.passBfs();

        /*System.out.println(tree.search(5));
        System.out.println(tree.search(7));
        System.out.println(tree.search(9));
        System.out.println(tree.search(3));
        System.out.println(tree.search(8));
        System.out.println(tree.search(2));
        System.out.println(tree.search(10));*/

    }
}
