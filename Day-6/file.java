import java.io.*;
public class file {
    public static void main(String[] args) {
        try{
            FileWriter writer=new FileWriter("c:\\Users\\Ganesh\\OneDrive\\Desktop\\file\\myfile.docx");
            writer.write("hello world");
            writer.close();
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
}