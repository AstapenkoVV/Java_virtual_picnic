package org.example.model;

import java.util.HashSet;

public class MaxLengthWord {
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
        HashSet hashSet = new HashSet();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == length) {
                word = words[i];
                if (word.equals(words[i])) {
                    hashSet.add(words[i]);
                }
            }
        }
        return hashSet.toString();
    }
}
