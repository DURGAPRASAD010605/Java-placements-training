import java.util.Scanner;
public class methods1{
    public static void main(String args[]){
        System.out.print("enter number: ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        methods1 ob=new methods1();
        ob.modify(x);
        System.out.println("x value after calling method "+x);

    }
    public void modify(int x){
        x=x+50;
        System.out.println("values in side the method "+x);
    }
}