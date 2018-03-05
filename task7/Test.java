package task7;

import java.util.List;

public class Test {

    public static void main(String[] args) {


        try {
            BinaryTree binaryTree = new BinaryTree();

            binaryTree.add(7);
            binaryTree.add(8);
            binaryTree.add(12);
            binaryTree.add(10);
            binaryTree.add(8);
            binaryTree.add(8);
            binaryTree.add(9);
            binaryTree.add(11);

            View.print("" + binaryTree.contains(8));
            View.print("" + binaryTree.size());
            binaryTree.delete(8);
            View.print("" + binaryTree.contains(8));

            View.print("" + binaryTree.size());

            List list1 = binaryTree.inOrderTree();
            List list2 = binaryTree.preOrderTree();
            List list3 = binaryTree.postOrderTree();

            System.out.println(list1.toString());
            System.out.println(list2.toString());
            System.out.println(list3.toString());

        } catch (EmptyTreeException e) {
            e.printStackTrace();
        }


    }
}
