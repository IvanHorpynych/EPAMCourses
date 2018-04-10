package ua.homework.taskflowcontrol.flow7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringAnalyzer {

    //1
    public int letterCounter(String line) {
        int count = 0;

        for (int i = 0; i < line.length(); i++)
            if (Character.isLetter(line.charAt(i)))
                ++count;

    //    line.chars().filter(Character::isLetter).collect(..)
        return count;
    }

    //2
    public boolean equalsLinesEgnoreCase(String firstLine, String secondLine) {
        return firstLine.equalsIgnoreCase(secondLine);
    }

    //3
    public String lineToUpperCase(String line) {
        return line.toUpperCase();
    }

    public String lineToLowerCase(String line) {
        return line.toLowerCase();
    }

    //4
    public ArrayList<Integer> dongIndex(String line) {
        ArrayList<Integer> positions = new ArrayList<>();

        int lastIndex = 0;
        int currentIndex;
        while (true) {
            currentIndex = line.indexOf("dong", lastIndex);
            if (currentIndex == -1) break;
            positions.add(currentIndex);
            lastIndex = currentIndex + "dong".length();
        }
        return positions;
    }

    //5
    public String replaceWords(String line, String oldWord, String newWord) {
        return line.replace(oldWord, newWord);
    }

    //6
    public HashMap<String, Integer> wordCounter(String line) {
        String[] words = line.split("\\W");

        HashMap<String, Integer> counter = new HashMap<>();
        for (String word : words) {
            if (counter.keySet().contains(word)) {
                counter.put(word, counter.get(word) + 1);
            } else {
                counter.put(word, 1);
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String specifiedLine = "Dong-ding-dong";
        StringAnalyzer dongAnalyzer = new StringAnalyzer();

        System.out.println("1. Count of letter in line: "+dongAnalyzer.letterCounter(specifiedLine));
        System.out.println("2. Equals to lines(current and \"test\"): "+dongAnalyzer.equalsLinesEgnoreCase(specifiedLine,"test"));
        System.out.println("   Equals to lines(current and current): "+dongAnalyzer.equalsLinesEgnoreCase(specifiedLine,specifiedLine));
        System.out.println("3. To upper case: "+dongAnalyzer.lineToUpperCase(specifiedLine));
        System.out.println("   To lower case: "+dongAnalyzer.lineToLowerCase(specifiedLine));
        System.out.println("4. Start indexes of word \"dong\":"+ dongAnalyzer.dongIndex(specifiedLine));
        System.out.println("5. Replace words \"dong\" on \"bong\": "+dongAnalyzer.replaceWords(specifiedLine,"dong","bong"));
        System.out.println("6. Count of equal words in line: ");
        for (Map.Entry<String, Integer> entry : dongAnalyzer.wordCounter(specifiedLine).entrySet()) {
            System.out.println("Word \""+entry.getKey() +"\": "+ entry.getValue());
        }
    }
}
