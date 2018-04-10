package ua.homework.taskflowcontrol.flow8;

import java.util.ArrayList;

public class Task2 {
    ArrayList<Integer> args;

    Task2() {
        args = new ArrayList();
        for (int i = 0; i < 20; i++)
            if ((int) (Math.random() * 10) == 3)
                args.add(null);
            else args.add(i);
    }

    private boolean checkList() throws Exception {
        boolean flag = true;
        int position = 1;
        for (Integer number : args) {
            if (number == null) throw new Exception("Position: "+position);
            position++;
        }
        return flag;
    }

    public void runCheckList() {
        try {
            checkList();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("The exception was intercepted.");
        }
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.runCheckList();
    }
}
