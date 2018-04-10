package ua.homework.taskflowcontrol.flow3;

public class TaskFourth {

    public static String printNumberTriagle(int minValue, int maxValue, boolean formAscending, boolean rowAscending) {
        StringBuilder triangle = new StringBuilder();
        int temp;
        for (int i = minValue; i <= maxValue; i++) {
            if (formAscending)
                for (int countSpace = minValue; countSpace < maxValue - i; countSpace++)
                    triangle.append("  ");
            if (rowAscending)
                for (temp = minValue; temp <= i; temp++)
                    triangle.append(temp + " ");
            else
                for (temp = i; temp >= minValue; temp--)
                    triangle.append(temp + " ");

            triangle.append('\n');
        }
        return triangle.toString();
    }

    public static void main(String[] args) {
        System.out.println(printNumberTriagle(0, 3, true, false));
    }
}
