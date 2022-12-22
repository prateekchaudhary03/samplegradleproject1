package co.igorski;

public class SimpleCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int substract(int a, int b) {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public float divide(float a, float b) {
        return a/b;
    }
}
