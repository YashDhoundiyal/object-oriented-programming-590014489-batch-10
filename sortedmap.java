import java.util.*;

public class sortedmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> map = new TreeMap<>();

        while (true) {
            System.out.println("\n1.Insert 2.Delete 3.Search 4.Display 5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    int key = sc.nextInt();
                    System.out.print("Enter value: ");
                    String value = sc.next();
                    map.put(key, value);
                    break;

                case 2:
                    System.out.print("Enter key to delete: ");
                    key = sc.nextInt();
                    map.remove(key);
                    break;

                case 3:
                    System.out.print("Enter key to search: ");
                    key = sc.nextInt();
                    if (map.containsKey(key))
                        System.out.println("Value: " + map.get(key));
                    else
                        System.out.println("Not Found");
                    break;

                case 4:
                    System.out.println("Sorted Map: " + map);
                    break;

                case 5:
                    return;
            }
        }
    }
}