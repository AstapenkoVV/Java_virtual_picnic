package org.example.model;

import java.util.HashMap;
import java.util.HashSet;

public class WordFrequency {
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
        return wordFrequency;
    }
}
