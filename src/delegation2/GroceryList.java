package delegation2;

import java.util.LinkedList;

public class GroceryList extends LinkedList<String> {

    public GroceryList() {
    }

    public void addItem(String item) {
        this.add(item);
    }

    public void removeItem(String item) {
        this.remove(item);
    }

    public String toString() {
        String result = "Grocery List\n------------\n\n";
        int index = 1;
        for (String item : this) {
            result += String.format("%3d. %s", index++, item) + "\n";
        }
        return result;
    }
}
