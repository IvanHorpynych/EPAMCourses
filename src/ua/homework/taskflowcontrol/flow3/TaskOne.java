package ua.homework.taskflowcontrol.flow3;

class TaskOne {

    public static int countNumberOccurFirstMethod(int number, int castNumber) {
        String temp = Integer.toString(number);
        int count = 0;
        for (int i = 0; i < temp.length(); i++)
            if (temp.charAt(i) - '0' == castNumber) count++;
        return count;
    }

    public static int countNumberOccurSecondMethod(int number, int castNumber) {
        String temp = Integer.toString(number);
        char castNumberInChar = Integer.toString(castNumber).charAt(0);
        int count = 0;
        for (int i = 0; i < temp.length(); i++)
            if (temp.charAt(i)  == castNumberInChar) count++;
        return count;
    }

    public static int countNumberOccurThirdMethod(int number, int castNumber) {
        double temp = number;
        int count = 0;
        while (temp>10) {
            if ((int)temp % 10 == castNumber) count++;
            temp /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(TaskOne.countNumberOccurFirstMethod(12223, 2));
        System.out.println(TaskOne.countNumberOccurSecondMethod(12223, 2));
        System.out.println(TaskOne.countNumberOccurThirdMethod(12223,2));
    }
}