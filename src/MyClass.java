import java.io.*;

public class MyClass {
    public static void main(String[] args) {
        String fileName = "example.txt";
        
        // Write to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, World!");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        
        // Read from the file
        try (FileReader reader = new FileReader(fileName)) {
            int character;
            StringBuilder content = new StringBuilder();
            
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            
            System.out.println("File content: " + content);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        
        // Append to the file
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("\nAppended text!");
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}