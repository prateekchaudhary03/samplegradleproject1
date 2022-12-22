package co.igorski;

public class ScientificCalculator extends SimpleCalculator implements AdvancedCalculator {
    @Override
    public double sin(double value) {
        return Math.sin(value);
    }

    @Override
    public double cos(double value) {
        return Math.cos(value);
    }

    @Override
    public double tan(double value) {
        return Math.tan(value);
    }
}
