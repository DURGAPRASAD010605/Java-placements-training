import java.util.Scanner;
public class methods4{
    public static void main(String args[]){
        System.out.print("enter number: ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[] {10,20,30};
        methods4 ob=new methods4();
        ob.modify(x,arr);
        System.out.println("x value after calling method "+x);
        System.out.println("array value after calling method "+arr[0]);
    }
    public void modify(int x,int arr[]){
        arr[0]=100;
        x=x+50;
    }
}