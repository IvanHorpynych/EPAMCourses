package ua.homework.taskflowcontrol.flow3;

public class TaskThree {

    public static int countYearsFirstMethod(int amount, int persent,int finalAmount){
        double currentAmount = amount;
        int countYears = 0;
        while (currentAmount<finalAmount){
            currentAmount+=(currentAmount/100)*persent;
            countYears++;
        }
        return countYears;
    }

    public static int countYearsSecondMethod(int amount, int persent,int finalAmount){
        double currentAmount = amount;
        int countYears = 0;
        label:
        while (true){
            if(currentAmount>=finalAmount) break label;
            currentAmount+=(currentAmount/100)*persent;
            countYears++;
        }
        return countYears;
    }

    public static int countYearsThirdMethod(int amount, int persent,int finalAmount){
        double currentAmount = amount;
        int countYears;
        for(countYears = 0; currentAmount<finalAmount; countYears++)
            currentAmount+=(currentAmount/100)*persent;
        return countYears;
    }

    public static int countYearsFourthMethod(int amount, int persent,int finalAmount){
        double currentAmount = amount;
        int countYears = 0;
        do {
            if(currentAmount>=finalAmount) break;
            currentAmount+=(currentAmount/100)*persent;
            countYears++;
        } while (currentAmount<finalAmount);
        return countYears;
    }


    public static void main(String[] args) {
        int amount = 100;
        int persent =12;
        int finalAmount = 5000;
        System.out.println("Count of Years with start amount "+amount+"$, " +
                "with specified interest rate "+ persent+"%," +
                " and final amount "+finalAmount+"$: "+countYearsThirdMethod(amount,persent,finalAmount));
    }
}
