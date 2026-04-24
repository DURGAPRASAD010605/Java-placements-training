class staticex1{
    public static void main(String[] args) {
        st k=new st();
        k.access();
    }
}
class st{
    static int k=10;
    public  void access(){
        System.out.print(k);
    }
}
