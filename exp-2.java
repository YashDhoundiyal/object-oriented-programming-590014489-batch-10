// Problem Analysis (PO-2) Demonstration
// Using mathematics + natural science (physics) + engineering science

public class StressAnalysis {

    public static void main(String[] args) {

        // Step 1: Identify the problem
        // Given force and cross-sectional area, find stress

        double force = 10000;      // Force in Newtons
        double area = 0.005;       // Area in square meters
        double allowableStress = 3_000_000; // Material limit (Pa)

        // Step 2: Formulate the problem using first principles
        // Stress = Force / Area
        double stress = force / area;

        // Step 3: Analyze the result
        System.out.println("Applied Force: " + force + " N");
        System.out.println("Cross-sectional Area: " + area + " m^2");
        System.out.println("Calculated Stress: " + stress + " Pa");

        // Step 4: Reach substantiated conclusion
        if (stress <= allowableStress) {
            System.out.println("Conclusion: The material is SAFE.");
        } else {
            System.out.println("Conclusion: The material is NOT SAFE.");
        }
    }
}
