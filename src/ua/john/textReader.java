package ua.john;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class textReader {
    List<String> lines = new ArrayList<String>();
    String line = null;

    public void doIt() {
        try {
            File f1 = new File("e:/text.txt");
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                if (line.contains("  "))
                    line = line.replace("  ", " ");
                lines.add(" ");
                lines.add(line);
            }
            fr.close();
            br.close();

            FileWriter fw = new FileWriter(f1);
            BufferedWriter out = new BufferedWriter(fw);
            for (String s : lines)
                out.write(s);
            out.flush();
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String args[]) {
        textReader fr = new textReader();
        fr.doIt();
    }
}
