package org.example.model;

public class CountWords {
    public Integer getCountWords(String str) {
        Integer counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') counter++;
        }
        return counter;
    }
}
