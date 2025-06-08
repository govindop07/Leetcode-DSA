class Solution {
    public double[] convertTemperature(double celsius) {
        double first = celsius + 273.15;
        double second = celsius * 1.80 + 32.00;
        return new double[]{first, second};
    }
}