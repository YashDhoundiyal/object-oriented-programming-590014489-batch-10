// Design & Development of Solutions (PO-3)
// Considering public safety, societal need, and environmental impact

public class WaterUsageMonitor {

    // Daily safe water limit per person (in liters)
    static final int SAFE_LIMIT = 135; // WHO recommendation

    public static void main(String[] args) {

        // User data
        int waterUsedToday = 180; // liters

        System.out.println("Daily Water Usage: " + waterUsedToday + " liters");

        // Design decision based on public health & environment
        if (waterUsedToday <= SAFE_LIMIT) {
            System.out.println("Status: Water usage is within safe limits.");
        } else {
            System.out.println("Warning: Excessive water usage detected!");
            System.out.println("Advice: Reduce usage to conserve water and protect resources.");
        }

        // Environmental message
        System.out.println("Environmental Impact: Conserving water helps ensure sustainability.");
    }
}
