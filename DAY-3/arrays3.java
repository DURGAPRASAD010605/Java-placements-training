import java.util.*;
public class arrays3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size=sc.nextInt();
        int k[]=new int[size];
        for(int i=0;i<size;i++){
            k[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(k[i]);

        }
        
}}