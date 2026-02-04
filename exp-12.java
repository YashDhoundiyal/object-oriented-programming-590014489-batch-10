// Demonstration of Life-long Learning using Java

class LifelongLearning {

    // Learning a new skill independently
    static void learnSkill(String skill) {
        System.out.println("Learning new technology: " + skill);
    }

    // Upgrading skills due to technological change
    static void upgradeSkill(String oldSkill, String newSkill) {
        System.out.println("Upgrading from " + oldSkill + " to " + newSkill);
    }

    // Applying learned knowledge
    static void applyKnowledge(String application) {
        System.out.println("Applying knowledge in: " + application);
    }

    public static void main(String[] args) {

        learnSkill("Java Programming");
        learnSkill("Machine Learning");

        upgradeSkill("Traditional Programming", "AI-based Systems");

        applyKnowledge("Real-world Engineering Projects");

        System.out.println("\nEngineers must continuously learn");
        System.out.println("to adapt to rapid technological advancements.");
    }
}
