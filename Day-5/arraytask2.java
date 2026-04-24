import java.util.*;
public class arraytask2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter number: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int result=maxx(arr);
        System.out.println("max ="+ result);
    }
     static int maxx(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
        return max;
    }

}