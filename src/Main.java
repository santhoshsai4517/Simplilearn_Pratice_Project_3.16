import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        scanner.close();
        
        MyClass fileExample = new MyClass(fileName);
        
        fileExample.writeToFile("Hello, World!");
        String fileContent = fileExample.readFromFile();
        if (fileContent != null) {
            fileExample.appendToFile("Appended text!");
        }
    }
}