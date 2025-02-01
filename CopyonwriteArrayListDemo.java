import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonwriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("Initial List: " + list);

        // Modifying the list while iterating
        for (String item : list) {
            System.out.println(item);
            if (item.equals("B")) {
                list.add("D"); // No ConcurrentModificationException
            }
        }

        System.out.println("List after modification: " + list);

        // Removing elements
        list.remove("A");
        System.out.println("List after removal: " + list);

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1));
    }
}
