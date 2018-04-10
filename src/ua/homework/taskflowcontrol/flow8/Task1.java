package ua.homework.taskflowcontrol.flow8;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {
    File file;

    public File getFile() {
        return file;
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Main");
        Task1 task1 = new Task1();

        try {
            task1.getFile().length();
        } catch (NullPointerException e){
            logger.log(Level.WARNING,"Be inform, we found empty link to file!");
        }
    }
}
