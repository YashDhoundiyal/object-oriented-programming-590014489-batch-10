// PO-6: The Engineer and Society
// Considering safety, legal compliance, and societal responsibility

public class SpeedMonitoringSystem {

    public static void main(String[] args) {

        int vehicleSpeed = 95;      // km/h
        int speedLimit = 80;        // Legal speed limit

        System.out.println("Vehicle Speed: " + vehicleSpeed + " km/h");
        System.out.println("Speed Limit: " + speedLimit + " km/h");

        // Societal & legal reasoning
        if (vehicleSpeed <= speedLimit) {
            System.out.println("Status: Speed is within legal limits.");
        } else {
            System.out.println("Warning: Speed limit exceeded!");
            System.out.println("Risk: High accident probability.");
            System.out.println("Action: Issue fine / alert driver.");
        }

        // Professional responsibility
        System.out.println("\nEngineer Responsibility:");
        System.out.println("- Ensure road safety");
        System.out.println("- Follow traffic laws");
        System.out.println("- Protect human life");
    }
}
