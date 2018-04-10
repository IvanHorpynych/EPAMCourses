package ua.homework.taskflowcontrol.flow3.TaskTwo;

public class Counter {
    private double maxValue;
    private double minValue;
    private double average;
    private int count;

    public double getMaxValue() {
        return maxValue;
    }

    public double getMinValue() {
        return minValue;
    }

    public int getCount() {
        return count;
    }

    public double getSum() {
        return average;
    }

    public void setCount() {
        this.count++;
    }

    public void setSum(double average) {
        this.average = this.average + average;
    }

    public void checkMaxValue(double value) {
        if (value > getMaxValue()) this.maxValue = value;
    }

    public void checkMinValue(double value) {
        if (value < getMinValue() || getCount() == 1) this.minValue = value;
    }

}