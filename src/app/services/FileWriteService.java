package app.services;

import app.utils.Constants;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {

    public static void handleFile (String fileName, String content) {
        try {
            FileOutputStream fout =
                    new FileOutputStream(Constants.BASE_URL + fileName + ".txt");
            byte[] byteArr = content.getBytes();
            fout.write(byteArr, 0, byteArr.length);
            fout.close();
            System.out.println("File created successfully!");
        } catch (IOException e) {
            System.out.println("Something went wrong...: " + e.getMessage());
        }
    }
}