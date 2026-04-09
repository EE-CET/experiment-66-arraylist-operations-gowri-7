import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.next());
        }

        String searchItem = scanner.next();

        // Sort the list
        Collections.sort(list);

        // Print sorted list
        System.out.println("Sorted Items: " + list);

        // Check if item exists
        if (list.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}
