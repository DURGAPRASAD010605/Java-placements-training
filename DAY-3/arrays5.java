import java.util.*;
public class arrays5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size=sc.nextInt();
        int k[][]=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
            k[i][j]=sc.nextInt();
        }
        }
        
        for(int i=0;i<size;i++){
            System.out.println(" ");
            for(int j=0;j<size;j++){
            System.out.print(k[i][j]+" ");
            
            
        }
        System.out.println();
        }
        
}}