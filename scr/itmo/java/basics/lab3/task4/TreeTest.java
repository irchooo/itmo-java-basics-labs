package itmo.java.basics.lab3.task4;

public class TreeTest {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree tree2 = new Tree("Вишня", 1);
        Tree tree3 = new Tree("Пальма", 2, true);

        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
    }
}
