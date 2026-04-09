import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int itemCount = sc.nextInt();
        List<String> cartItems = readItems(sc, itemCount);
        String searchItem = sc.next();

        Collections.sort(cartItems);

        printSortedItems(cartItems);
        printSearchResult(cartItems, searchItem);

        sc.close();
    }

    private static List<String> readItems(Scanner sc, int count) {
        List<String> items = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            items.add(sc.next());
        }
        return items;
    }

    private static void printSortedItems(List<String> items) {
        System.out.print("Sorted Items: [");
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i));
            if (i < items.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static void printSearchResult(List<String> items, String target) {
        System.out.println(items.contains(target) ? "Found" : "Not Found");
    }
}
