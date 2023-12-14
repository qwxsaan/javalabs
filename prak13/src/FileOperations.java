import java.io.*;
public class FileOperations {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Write to file
            FileWriter writer = new FileWriter("file.txt");
            System.out.print("Enter text to write to file: ");
            String text = reader.readLine();
            writer.write(text);
            writer.close();

            // Read from file
            FileReader reader2 = new FileReader("file.txt");
            int character;
            System.out.println("Text in file: ");
            while ((character = reader2.read()) != -1) {
                System.out.print((char) character);
            }
            reader2.close();

            // Replace text in file
            FileWriter writer2 = new FileWriter("file.txt");
            System.out.print("\nEnter text to replace in file: ");
            String replaceText = reader.readLine();
            writer2.write(replaceText);
            writer2.close();

            // Append text to file
            FileWriter writer3 = new FileWriter("file.txt", true);
            System.out.print("Enter text to append to file: ");
            String appendText = reader.readLine();
            writer3.write(appendText);
            writer3.close();

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
