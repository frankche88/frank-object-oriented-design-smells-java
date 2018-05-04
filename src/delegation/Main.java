package delegation;

import java.util.List;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("Granola");
        list.add("Milk");
        list.add("Eggs");
        printList(list);
        list.remove("Milk");
        printList(list);
    }

    public static void printList(List<String> items) {
        System.out.println("Grocery List");
        System.out.println("------------\n");
        int index = 1;
        for (String item : items) {
            System.out.println(String.format("%3d. %s", index++, item));
        }
        System.out.println();
    }
}
