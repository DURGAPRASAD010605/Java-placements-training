import java.util.*;
public class arraytask1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter number: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        oddeven(arr);
        
    }
     static void oddeven(int arr[]){
        int oddcount=0,evencount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else{ 
                oddcount++;
            }
        }
       System.out.println("Even count "+evencount+" odd count "+oddcount);
    }

}