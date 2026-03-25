import java.util.*;

public class sec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Insert 2.Delete 3.Search 4.Display 5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    list.add(val);
                    break;

                case 2:
                    System.out.print("Enter value to delete: ");
                    val = sc.nextInt();
                    list.remove(Integer.valueOf(val));
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    val = sc.nextInt();
                    if (list.contains(val))
                        System.out.println("Found");
                    else
                        System.out.println("Not Found");
                    break;

                case 4:
                    System.out.println("List: " + list);
                    break;

                case 5:
                    return;
            }
        }
    }
}