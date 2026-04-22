public class Functions{
    public static void main(String [] args){
        int fact1=factorial(5);
        int fact2=factorial(4);
        int total=fact1/fact2;
        System.out.println("fact1/fact2= "+total);
    }
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
}