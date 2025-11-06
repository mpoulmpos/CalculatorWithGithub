package JavaCalculator.src;

public class Divide implements Operation {
    @Override
    public double execute(double num1, double num2) {
        return num1 / num2; // optional: add divide-by-zero handling later
    }
}