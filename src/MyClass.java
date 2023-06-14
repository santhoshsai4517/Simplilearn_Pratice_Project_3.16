import java.io.*;

public class MyClass {
    private String fileName;
    
    public MyClass(String fileName) {
        this.fileName = fileName;
    }
    
    public void writeToFile(String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Successfully wrote to the file "+fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
    
    public String readFromFile() {
        try (FileReader reader = new FileReader(fileName)) {
            int character;
            StringBuilder content = new StringBuilder();
            
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            
            System.out.println("File content: " + content);
            return content.toString();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
            return null;
        }
    }
    
    public void appendToFile(String content) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("\n" + content);
            System.out.println("Successfully appended to the file "+fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}