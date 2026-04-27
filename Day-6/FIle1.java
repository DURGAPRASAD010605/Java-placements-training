
import java.io.FileWriter;
import java.util.Scanner;
public class File1 {
    public static void main(String[] args) {
    try{
    Scanner sc = new Scanner(System.in);
    System.out.println("EMP name:");
    String name = sc.nextLine();
    System.out.println("EMP id:");
    String id = sc.nextLine();
    FileWriter fw=new FileWriter("c:\\Users\\Ganesh\\OneDrive\\Desktop\\file\\myfile3.txt");
    fw.write("EMP name: " + name);
    fw.write("\nEMP id: " + id);
    fw.write("\nWelcome to Java programming");
    fw.close(); 
    System.out.println("File created successfully");
    }
    catch(Exception e){
        System.out.println("An error occurred: " + e.getMessage());
    }
}
}
