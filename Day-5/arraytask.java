import java.util.*;
public class arraytask{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        System.out.print("Enter number: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result=summ(arr);
        System.out.println("SUM ="+ result);
    }
     static int summ(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

}