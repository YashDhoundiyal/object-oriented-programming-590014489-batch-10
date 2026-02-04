// Demonstration of Ethics in Engineering using Java

class EngineeringEthics {

    // Method to validate data ethically
    static boolean validateData(double value) {
        if (value < 0) {
            System.out.println("❌ Ethical Violation: Invalid data detected.");
            return false;
        }
        return true;
    }

    // Method to make ethical engineering decision
    static void makeDecision(double safetyScore) {
        if (safetyScore >= 70) {
            System.out.println("✅ Ethical Decision: System approved for use.");
        } else {
            System.out.println("❌ Ethical Responsibility: System rejected due to safety risks.");
        }
    }

    public static void main(String[] args) {

        // Example engineering data
        double materialStrength = 85;   // tested strength value
        double safetyScore = 65;        // safety evaluation score

        // Ethical data validation
        if (validateData(materialStrength)) {
            System.out.println("Data accepted with honesty and integrity.");
        }

        // Ethical decision-making
        makeDecision(safetyScore);

        System.out.println("\nEngineers must prioritize public safety,");
        System.out.println("follow professional ethics, and act responsibly.");
    }
}
