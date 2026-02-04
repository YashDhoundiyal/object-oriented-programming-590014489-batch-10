// Engineering Knowledge Example in Java
// Applying mathematics (linear regression),
// science (statistics),
// and engineering fundamentals (data modeling)

public class LinearRegressionExample {

    // Method to calculate mean
    static double mean(double[] arr) {
        double sum = 0;
        for (double val : arr) {
            sum += val;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {

        // Input data: house area (sq ft)
        double[] x = {800, 1000, 1200, 1500, 1800, 2000};

        // Output data: price (in lakhs)
        double[] y = {30, 40, 50, 65, 80, 90};

        int n = x.length;

        double meanX = mean(x);
        double meanY = mean(y);

        // Calculating slope (m) and intercept (c)
        double numerator = 0;
        double denominator = 0;

        for (int i = 0; i < n; i++) {
            numerator += (x[i] - meanX) * (y[i] - meanY);
            denominator += (x[i] - meanX) * (x[i] - meanX);
        }

        double m = numerator / denominator;   // slope
        double c = meanY - m * meanX;          // intercept

        // Predict price for a new house
        double newArea = 1600;
        double predictedPrice = m * newArea + c;

        System.out.println("Slope (m): " + m);
        System.out.println("Intercept (c): " + c);
        System.out.println("Predicted price for " + newArea + " sq ft: "
                + predictedPrice + " lakhs");
    }
}
