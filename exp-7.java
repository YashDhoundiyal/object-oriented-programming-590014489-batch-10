// Demonstration of Environment and Sustainability using Java

class SustainableEngineering {

    // Method to calculate carbon emission
    static double calculateCarbonEmission(double energyUsed) {
        // emission factor (kg CO2 per unit energy)
        double emissionFactor = 0.85;
        return energyUsed * emissionFactor;
    }

    // Method to check sustainability
    static void checkSustainability(double emission) {
        if (emission <= 50) {
            System.out.println("✅ Sustainable Solution: Low environmental impact.");
        } else {
            System.out.println("❌ Unsustainable Solution: High environmental impact.");
        }
    }

    public static void main(String[] args) {

        // Energy consumption by an engineering system
        double energyUsed = 40; // units of energy

        // Calculate environmental impact
        double carbonEmission = calculateCarbonEmission(energyUsed);

        System.out.println("Energy Used: " + energyUsed + " units");
        System.out.println("Carbon Emission: " + carbonEmission + " kg CO2");

        // Analyze sustainability
        checkSustainability(carbonEmission);

        System.out.println("\nEngineering solutions must minimize resource usage");
        System.out.println("and reduce pollution for sustainable development.");
    }
}
