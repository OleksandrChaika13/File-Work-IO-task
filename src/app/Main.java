package app;

import app.services.FileReadService;
import app.services.FileWriteService;
import app.utils.Constants;
import app.utils.OptionValidator;

import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {

        System.out.println("My app for creating and reading files!");
        runOption(getOption());
    }

    private static int getOption() {

        scanner = new Scanner(System.in);

        System.out.print("""
                Choose an option:
                1 - Create and write a file
                2 - Read a file
                0 - Close the app
                """);
        return OptionValidator.validateOptionInput(scanner);
    }

    private static void runOption(int option) {
        scanner.nextLine();

        switch (option) {
            case 1 -> {
                System.out.print("Enter the file name (without extension): ");
                String createFileName = scanner.nextLine();
                System.out.print("Enter a text: ");
                String text = scanner.nextLine();
                FileWriteService.handleFile(createFileName, text);
            }
            case 2 -> {
                System.out.print("Enter the file name (without extension): ");
                String readFileName = scanner.nextLine();
                FileReadService.readFromFile(readFileName);
            }
            case 0 -> {
                String output = Constants.APP_CLOSED_MSG;
                getOutput(output, option);
            }
        }
    }

    private static void getOutput(String output, int choice) {
        if (choice == 0) System.out.println(output);
        scanner.close();
        System.exit(0);
    }
}
