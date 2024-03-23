package org.example;

import org.example.model.ReadingFile;

/**
 * 1. Осуществить подсчет слов:
 *    Напишите программу, которая подсчитывает количество слов в
 *    файле `input.txt`.
 * 2. Найти самое длинное слово:
 *    Создайте программу, которая находит самое длинное слово в
 *    файле.
 * 3. Вычислить частоту слов:
 *    Напишите программу, которая анализирует, сколько раз каждое
 *    слово встречается в файле. Подумайте об этом как о подсчете того,
 *    какие фрукты и овощи самые популярные на вашем пикнике!
 */

public class Main {
    public static void main(String[] args) {
        ReadingFile readingFile = new ReadingFile();
        System.out.println("readingFile.getString(\"input.txt\") = " +
                readingFile.getString("input.txt"));
        System.out.println("readingFile.getCountWord(readingFile.getString(\"input.txt\")) = " +
                readingFile.getCountWords(readingFile.getString("input.txt")));
        System.out.println("readingFile.getMaxLengthWord(readingFile.getString(\"input.txt\")) = " +
                readingFile.getMaxLengthWord(readingFile.getString("input.txt")));
        readingFile.getWordFrequency(readingFile.getString("input.txt"));
        System.out.println("readingFile.getLengthWord = " +
                readingFile.getLengthWord(readingFile.getString("input.txt"),
                        readingFile.getMaxLengthWord(readingFile.getString("input.txt"))));
    }
}