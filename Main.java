package org.example;

import org.example.controller.Controller;
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
        Controller controller = new Controller();
        controller.start();
    }
}