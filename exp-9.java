// Demonstration of Individual and Teamwork using Java

class TeamworkDemo {

    // Individual task contribution
    static void individualWork(String name) {
        System.out.println(name + " completed assigned task independently.");
    }

    // Teamwork function
    static void teamWork(String[] members) {
        System.out.println("\nTeam Collaboration:");
        for (String member : members) {
            System.out.println(member + " contributed to the project.");
        }
    }

    // Leadership role
    static void teamLeader(String leader) {
        System.out.println("\nTeam Leader:");
        System.out.println(leader + " coordinated the team and ensured task completion.");
    }

    public static void main(String[] args) {

        // Individual contribution
        individualWork("Engineer A");

        // Team members from different disciplines
        String[] teamMembers = {
            "Software Engineer",
            "AI/ML Engineer",
            "Mechanical Engineer",
            "Electronics Engineer"
        };

        // Team collaboration
        teamWork(teamMembers);

        // Leadership
        teamLeader("Project Manager");

        System.out.println("\nEffective engineering requires both");
        System.out.println("individual responsibility and teamwork.");
    }
}

