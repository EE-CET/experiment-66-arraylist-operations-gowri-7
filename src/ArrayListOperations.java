import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // read full line

        ArrayList<String> list = new ArrayList<>();

        String[] items = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            list.add(items[i]);
        }

        String searchItem = scanner.nextLine();

        Collections.sort(list);

        System.out.println("Sorted Items: " + list);

        if (list.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}
