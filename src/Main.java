import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        
        MyClass fileExample = new MyClass(fileName);
        
    	
    	System.out.print("\nEnter the content to write: ");
        String contentToWrite = scanner.nextLine();
        fileExample.writeToFile(contentToWrite);

        String fileContent = fileExample.readFromFile();
        if (fileContent != null) {
            System.out.println("\nFile content: \n" + fileContent);
        }
        
        System.out.print("\nEnter the content to append: ");
        String contentToAppend = scanner.nextLine();
        fileExample.appendToFile(contentToAppend);
        
        scanner.close();
        
        String fileContent1 = fileExample.readFromFile();
        if (fileContent1 != null) {
            System.out.println("\nFinal file content: \n" + fileContent1);
        }
    }
}