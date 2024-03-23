package org.example.view;

import java.util.HashMap;
import java.util.Map;

public class PrintAnswers {
    public void printAnswersMaxLengthWord(String word, Integer length){
        System.out.println("Самое длинное слово: " + word + ", длинна слова: " + length + " символов.");
    }

    public void printCountWordsInFile(Integer count){
        System.out.println("Максимальное количество слов в файле: " + count);
    }

    public void printWordFrequency(HashMap<String, Integer> wordFrequency){
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println("Продукт: " + entry.getKey() + " в количестве: " + entry.getValue());
        }
    }
}
