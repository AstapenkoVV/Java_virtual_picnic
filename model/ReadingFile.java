package org.example.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class ReadingFile {
    public String getString(String fileName) {
        final Pattern CLEAR_PATTERN = Pattern.compile("[\\s]+");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String str = reader.readLine();
            while (str == null) {
                str = reader.readLine();
            }
            reader.close();
            str = CLEAR_PATTERN.matcher(str).replaceAll(" ").trim();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Integer getCountWords(String str) {
        Integer counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') counter++;
        }
        return counter;
    }

    public Integer getMaxLengthWord(String str) {
        String[] words = str.split(" ");
        Integer maxLengthWord = 1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= maxLengthWord) {
                maxLengthWord = words[i].length();
            }
        }
        return maxLengthWord;
    }

    public String getLengthWord(String str, Integer length) {
        String[] words = str.split(" ");
        String word = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == length) {
                word = words[i];
                if (word.equals(words[i])) {
                    stringBuilder.append(words[i] + " ");
                }
            }
        }
        return stringBuilder.toString();
    }

    public HashMap getWordFrequency(String str) {
        HashMap<String, Integer> wordFrequency = new HashMap<>();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (wordFrequency.containsKey(words[i])) {
                wordFrequency.put(words[i], wordFrequency.get(words[i]) + 1);
            } else {
                wordFrequency.put(words[i], 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        return wordFrequency;
    }
}
