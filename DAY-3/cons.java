import java.util.*;
public class cons{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int b=sc.nextInt();
        Maths ob=new Maths();
        ob.fact(b);
    }
}
 class Maths{
     static void fact(int num){
        int fac=1;
        for(int i=1;i<=num;i++){
            fac*=i;
        }
        System.out.println("factorial "+fac);
    }
 }