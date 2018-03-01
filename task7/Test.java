package task7;

public class Test {

    public static void main(String[] args) {

        try {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.add(7);
        binaryTree.add(8);
        binaryTree.add(9);
        binaryTree.add(10);
        binaryTree.add(9);
        binaryTree.add(9);
        binaryTree.add(11);

        View.print("" + binaryTree.contains(11));
        binaryTree.delete(11);
            View.print("" + binaryTree.contains(11));
            View.print("" + binaryTree.size());
            binaryTree.clear();
            View.print("" + binaryTree.size());

        } catch (ClassCastException e) {
            e.printStackTrace();
            System.out.println("Check type of entered data");
        }
    }
}
