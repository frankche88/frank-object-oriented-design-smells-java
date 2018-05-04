package delegation2;

public class Main {

    public static void main(String[] args) {
        GroceryList list = new GroceryList();
        list.add("Granola");
        list.add("Milk");
        list.add("Eggs");
        printList(list);
        list.remove("Milk");
        printList(list);
    }

    public static void printList(GroceryList items) {
        System.out.println("Grocery List");
        System.out.println("------------\n");
        int index = 1;
        for (String item : items) {
            System.out.println(String.format("%3d. %s", index++, item));
        }
        System.out.println();
    }
}
