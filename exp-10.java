// Demonstration of Communication in Engineering using Java

class EngineeringCommunication {

    // Writing an engineering report
    static void writeReport(String topic) {
        System.out.println("Engineering Report:");
        System.out.println("Topic: " + topic);
        System.out.println("Status: Analysis completed with documented results.\n");
    }

    // Design documentation
    static void designDocument(String system) {
        System.out.println("Design Documentation:");
        System.out.println("System: " + system);
        System.out.println("Includes architecture, components, and workflow.\n");
    }

    // Presentation communication
    static void makePresentation(String audience) {
        System.out.println("Presentation:");
        System.out.println("Presented technical concepts clearly to " + audience + ".\n");
    }

    // Giving and receiving instructions
    static void instructions(String task) {
        System.out.println("Instructions:");
        System.out.println("Task Assigned: " + task);
        System.out.println("Feedback received and clarification provided.\n");
    }

    public static void main(String[] args) {

        writeReport("Energy Efficient Smart System");
        designDocument("AI-based Traffic Control System");
        makePresentation("Engineering Community and Society");
        instructions("Implement safety features");

        System.out.println("Effective communication is essential for");
        System.out.println("successful engineering practice.");
    }
}
