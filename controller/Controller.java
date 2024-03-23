package org.example.controller;

import org.example.model.CountWords;
import org.example.model.MaxLengthWord;
import org.example.model.ReadingFile;
import org.example.model.WordFrequency;
import org.example.view.PrintAnswers;

public class Controller {
    private ReadingFile readingFile;
    private CountWords countWords;
    private MaxLengthWord maxLengthWord;
    private WordFrequency wordFrequency;
    private PrintAnswers printAnswers;

    private final String fileName = "input.txt";
    public Controller() {
        readingFile = new ReadingFile();
        countWords = new CountWords();
        maxLengthWord = new MaxLengthWord();
        wordFrequency = new WordFrequency();
        printAnswers = new PrintAnswers();
    }

    public void start(){
        String arrayStr = readingFile.getString(fileName);
        Integer maxLength = maxLengthWord.getMaxLengthWord(arrayStr);
        String bigWord = maxLengthWord.getLengthWord(arrayStr, maxLength);
        printAnswers.printCountWordsInFile(countWords.getCountWords(arrayStr));
        printAnswers.printAnswersMaxLengthWord(bigWord, maxLength);
        printAnswers.printWordFrequency(wordFrequency.getWordFrequency(arrayStr));
    }
}
