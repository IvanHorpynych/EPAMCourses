package ua.homework.taskflowcontrol.flow3.TaskTwo;

import java.util.Scanner;

public class Engine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Counter counter = new Counter();
        boolean flag = true;
        String temp;
        double newNumber;
        while (flag) {
            System.out.print("Write the new number: ");
            temp = in.next();
            if (temp.equals("quit")) {
                flag = false;
                System.out.println("count: " + counter.getCount() + ";");
                System.out.println("average: " + (counter.getSum() / counter.getCount()) + ";");
                System.out.println("maxValue: " + counter.getMaxValue());
                System.out.println("minValue: " + counter.getMinValue());
                continue;
            } else {
                try {
                    newNumber = Double.parseDouble(temp.trim());
                    System.out.println("New number is added to counter!");
                    counter.setCount();
                    counter.setSum(newNumber);
                    counter.checkMaxValue(newNumber);
                    counter.checkMinValue(newNumber);
                } catch (NumberFormatException e) {
                    System.out.println("Wrong number! Try again!");
                }
            }
        }
    }
}
