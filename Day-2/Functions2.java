import java.util.*;
class Functions2{
    public static void main(String args[]){
        int x1=add(19,2);
        int x2=square(2);
        System.out.println("addition "+x1);
        System.out.println("Square "+x2);
    }
    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static int square(int num){
        return num*num;
    }
}