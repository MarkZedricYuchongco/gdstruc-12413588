public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(52);
        tree.insert(17);
        tree.insert(-91);
        tree.insert(-33);
        tree.insert(78);
        tree.insert(4);
        tree.insert(65);
        tree.insert(20);
        tree.insert(-88);
        tree.insert(-49);

        tree.traverseInOrder();
        System.out.println("\n\n");
        tree.traverseInOrderDescending();

        System.out.println(tree.getMin());
        System.out.println(tree.getMax());
    }
}