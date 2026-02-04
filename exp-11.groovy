// Demonstration of Project Management and Finance using Java

class ProjectManagement {

    // Calculate total project cost ..
    static double calculateCost(double materialCost, double laborCost, double miscCost) {
        return materialCost + laborCost + miscCost;
    }

    // Role of a team member
    static void teamMember(String role) {
        System.out.println(role + " completed assigned tasks responsibly.");
    }

    // Role of a project leader
    static void projectLeader(double budget, double totalCost) {
        System.out.println("\nProject Leader Review:");
        if (totalCost <= budget) {
            System.out.println("✅ Project completed within budget.");
        } else {
            System.out.println("❌ Project exceeded budget. Cost control required.");
        }
    }

    public static void main(String[] args) {

        // Project budget
        double budget = 100000;  // in currency units

        // Project expenses
        double materialCost = 45000;
        double laborCost = 40000;
        double miscCost = 8000;

        // Cost calculation
        double totalCost = calculateCost(materialCost, laborCost, miscCost);

        System.out.println("Total Project Cost: " + totalCost);

        // Multidisciplinary team members
        teamMember("Software Engineer");
        teamMember("AI/ML Engineer");
        teamMember("Mechanical Engineer");

        // Leadership and financial management
        projectLeader(budget, totalCost);

        System.out.println("\nEffective project management requires");
        System.out.println("planning, budgeting, teamwork, and leadership.");
    }
}
