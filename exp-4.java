// PO-4: Conduct Investigations of Complex Problems
// Using experimentation, data analysis, and interpretation

import java.util.Random;

public class AlgorithmInvestigation {

    // Bubble Sort (for experimental study)
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] sizes = {500, 1000, 2000, 4000};
        Random random = new Random();

        System.out.println("Array Size | Execution Time (ms)");

        // Design of experiment
        for (int size : sizes) {

            int[] data = new int[size];
            for (int i = 0; i < size; i++) {
                data[i] = random.nextInt(10000);
            }

            long startTime = System.currentTimeMillis();
            bubbleSort(data);
            long endTime = System.currentTimeMillis();

            long timeTaken = endTime - startTime;
            System.out.println(size + "        | " + timeTaken);
        }

        // Research-based conclusion
        System.out.println("\nConclusion:");
        System.out.println("Execution time increases rapidly with input size,");
        System.out.println("confirming the O(n^2) time complexity of Bubble Sort.");
    }
}
