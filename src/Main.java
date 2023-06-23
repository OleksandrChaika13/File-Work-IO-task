import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {

        System.out.println("My app for creating and reading files!");
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
}
