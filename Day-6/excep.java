public class excep {
    public static void main(String[] args) {
    int a=5;
    int b=6;
    try{
    System.out.print(a/0);
    }
    catch(Exception e){
        System.out.println(e);
    }
    System.out.println("Over");
    }
}