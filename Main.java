package sorting;

import java.util.*;

public class Main {

    public static void main(final String[] args) {
            String parsedArgument = args[1]; //save the parsed argument, ready to be looked at

        //
        switch (parsedArgument) {
            case "long":
                longActions();
                break;
            case "line":
                lineActions();
                break;
            case "word":
                wordActions();
                break;
        }
    }
    public static void longActions() {
        Scanner scanner = new Scanner(System.in); // scanner
        List<Integer> longNumbers = new ArrayList<>(); // make an array
        //
        while (scanner.hasNext()) {
            longNumbers.add(scanner.nextInt()); // add values to the array
        }
        int totalNumbers = longNumbers.size();
        Collections.sort(longNumbers); // sort the array
        //
        int greatestNumber = longNumbers.get(longNumbers.size() - 1);
        int greatestNumberAppears = 0;
        //
        for (Integer number : longNumbers) {
            if (number == greatestNumber) {
                greatestNumberAppears++;
            }
        }
        //
        int greatestPercentage = greatestNumberAppears  * 100 / 100;
        //
        System.out.printf("Total numbers: %d \n", longNumbers.size());
        System.out.printf("The greatest number: %d (%d time(s), %d%%.)",
                greatestNumber, greatestNumberAppears, greatestPercentage);

    }
    //
    public static void lineActions() {
        Scanner scanner = new Scanner(System.in); // scanner
        List<String> lineStrings = new ArrayList<>();
        //
        while (scanner.hasNextLine()) {
            lineStrings.add(scanner.nextLine());
        }
        //
        int totalLines = lineStrings.size();
        //
        int maxLength = 0;
        String longestString = "";
        for (String line : lineStrings) {
            if (line.length() > maxLength) {
                maxLength = line.length();
                longestString = line;
            }
        }
        //
        int longestLineAppears = 0;
        for (String line : lineStrings) {
            if (line.equals(longestString)) {
                longestLineAppears++;
            }
        }
        //
        int longestPercentage = longestLineAppears * 100 / totalLines;
        //
        System.out.printf("Total lines: %d.\n", totalLines );
        System.out.println("The longest line:");
        System.out.println(longestString);
        System.out.printf("(%d time (s), %d%%).", longestLineAppears, longestPercentage);

    }
    //
    public static void wordActions() {
        Scanner scanner = new Scanner(System.in);
        List<String> allWords = new ArrayList<>();
        while (scanner.hasNext()) {
            allWords.add(scanner.next());
        }
        //
        int numberOfWords = allWords.size();
        int longestWordLength = 0;
        String longestWord = "";
        //
        for (String word : allWords) {
            if (word.length() > longestWordLength) {
                longestWordLength = word.length();
                longestWord = word;
            }
        }
        //
        int longestWordAppears = 0;
        for (String word : allWords) {
            if (word.equals(longestWord)) {
                longestWordAppears++;
            }
        }
        //
        int longestPercentage = longestWordAppears * 100 / numberOfWords;
        //
        System.out.printf("Total words: %d.\n", numberOfWords);
        System.out.printf("The longest word: %s (%d time(s), %d%%).", longestWord, longestWordAppears, longestPercentage);

    }
}
