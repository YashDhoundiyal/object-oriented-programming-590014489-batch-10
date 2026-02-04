// PO-5: Modern Tool Usage
// Using modeling and prediction with awareness of limitations

public class PerformancePrediction {

    public static void main(String[] args) {

        // Training data (study hours vs marks)
        double[] hours = {2, 4, 6, 8, 10};
        double[] marks = {35, 50, 65, 80, 90};

        int n = hours.length;

        // Linear regression modeling
        double sumX = 0, sumY = 0, sumXY = 0, sumXX = 0;

        for (int i = 0; i < n; i++) {
            sumX += hours[i];
            sumY += marks[i];
            sumXY += hours[i] * marks[i];
            sumXX += hours[i] * hours[i];
        }

        double slope = (n * sumXY - sumX * sumY) /
                       (n * sumXX - sumX * sumX);
        double intercept = (sumY - slope * sumX) / n;

        // Prediction
        double studyHours = 7;
        double predictedMarks = slope * studyHours + intercept;

        System.out.println("Predicted marks for " + studyHours +
                           " hours of study: " + predictedMarks);

        // Understanding limitations
        System.out.println("\nLimitations:");
        System.out.println("- Model assumes linear relationship");
        System.out.println("- Small dataset reduces accuracy");
        System.out.println("- External factors not considered");
    }
}
