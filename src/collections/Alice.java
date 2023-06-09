package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Alice {
    public static void main(String[] args) {
        List allLines = loadTextFile("src/collections/alice30.txt");
        Set words = divideIntoWordsAndClean(allLines);
        System.out.println("Liczba różnych wyrazów w książce: " + words.size());

        Map<Character, Integer> startLetterStats = createStartLetterStats(words);
        System.out.println(startLetterStats);

        Map.Entry<Character, Integer> startLetterEntry = findStartLetter(startLetterStats);
        System.out.println("Litera na jaką zaczyna się najwięcej wyrazów to: \"" + startLetterEntry.getKey() + "\", jest ich " + startLetterEntry.getValue() + "." );
    }

    public static List loadTextFile(String textFileName){
        try {
            return Files.readAllLines(Paths.get(textFileName));
        } catch (IOException e) {
            System.out.println("Coś poszło nie tak przy wczytywaniu pliku! " + e.getMessage());
        }
        return null;
    }

    public static void showAllLines(List<String> allLines) {
        for (String line : allLines) {
            System.out.println(line);
        }
    }

    public static Set divideIntoWordsAndClean(List<String> allLines) {
        Set words = new TreeSet<>(); //treeset ma domyslne sortowanie alfabetyczne
        for (String line : allLines) {
            String[] lineWords = line.split(" |--");
            for (String word : lineWords) {
                word = cleanWord(word);
                if (!word.isEmpty()) {
                    words.add(word.toLowerCase());
                }
            }
        }
        return words;
    }

    public static String cleanWord(String word) {
        return word.replaceAll("\\p{Punct}|\\d", "");
    }

    public static Map<Character, Integer> createStartLetterStats (Set<String> words){
        Map<Character, Integer> startLetterStats = new TreeMap<>();
        for (String word : words) {
            Character startLetter = word.charAt(0);
            if (startLetterStats.containsKey(startLetter)) {
                startLetterStats.put(startLetter, startLetterStats.get(startLetter) + 1);
            } else {
                startLetterStats.put(startLetter, 1);
            }
        }
        return startLetterStats;
    }

    public static Map.Entry<Character, Integer> findStartLetter(Map<Character,Integer> startLetterStats) {
        Map.Entry<Character, Integer> startLetterEntry = null;
        for (Map.Entry<Character, Integer> entry : startLetterStats.entrySet()){
            if (startLetterEntry == null || entry.getValue() > startLetterEntry.getValue()) {
                startLetterEntry = entry;
            }
        }
        return startLetterEntry;
    }
}