import java.util.*;

public class sortedsec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();

        while (true) {
            System.out.println("\n1.Insert 2.Delete 3.Search 4.Display 5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    set.add(val);
                    break;

                case 2:
                    System.out.print("Enter value to delete: ");
                    val = sc.nextInt();
                    set.remove(val);
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    val = sc.nextInt();
                    if (set.contains(val))
                        System.out.println("Found");
                    else
                        System.out.println("Not Found");
                    break;

                case 4:
                    System.out.println("Sorted Set: " + set);
                    break;

                case 5:
                    return;
            }
        }
    }
}