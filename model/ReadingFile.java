package org.example.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
}
