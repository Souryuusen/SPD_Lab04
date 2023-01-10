package edu.polsl.lab04;

public class MyNumber {
    private String value;

    public MyNumber(int value) {
        this.value = Integer.toString(value);
    }

    public MyNumber(double value) {
        this.value = Double.toString(value);
    }

    public boolean isOdd() {
        if(value.trim().contains(".")) {
            return false;
        } else {
            return Integer.parseInt(value) % 2 != 0;
        }
    }

    public boolean isEven() {
        if(value.trim().contains(".")) {
            return false;
        } else {
            return Integer.parseInt(value) % 2 == 0;
        }
    }

    public MyNumber sqrt() {
        return new MyNumber(Math.sqrt(Double.parseDouble(value)));
    }

    public MyNumber pow(MyNumber x) {
        return new MyNumber(Math.pow(Double.parseDouble(value), x.valueDouble()));
    }

    public MyNumber add(MyNumber x) {
        return new MyNumber(valueDouble() + x.valueDouble());
    }

    public MyNumber subtract(MyNumber x) {
        return new MyNumber(valueDouble() - x.valueDouble());
    }

    public int valueInt() {
        return Integer.parseInt(value);
    }

    public double valueDouble() {
        return Double.parseDouble(value);
    }
}
