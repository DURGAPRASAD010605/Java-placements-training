import java.io.*;
public class FileSystemApp {
    public static void readFile(String path) throws IOException {
        FileReader file = new FileReader(path);
        BufferedReader reader = new BufferedReader(file);
        
        System.out.println(reader.readLine());
        reader.close();
    }

    public static void main(String[] args) {
        try {
            readFile("config.txt");
        } catch (IOException e) {
            System.out.println("Critical error: file not found or unreadable");
        }
    }
}
