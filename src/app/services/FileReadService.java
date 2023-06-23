package app.services;

import app.utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadService {

    public static void readFromFile(String fileName) {
        try (FileInputStream fis =
                     new FileInputStream(Constants.BASE_URL + fileName + ".txt")) {
            StringBuilder content = new StringBuilder();
            int data;
            while ((data = fis.read()) != -1) {
                content.append((char) data);
            }
            System.out.println("There is a text from the file: " + content);
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}