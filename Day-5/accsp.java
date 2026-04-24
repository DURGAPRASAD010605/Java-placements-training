class accsp{
    public static void main(String args[]){
    maths m=new maths();
     m.sum(100,3);
     m.sum("rr","dd");
     m.sum(3,2,8);
    }
}
class maths{
    public void sum(int a,int b){
       System.out.println(a+b);
    }
    public void sum(int a,int b,int c){
       System.out.println(a+b+c);
    }
    public void sum(String a,String b){
       System.out.println(a+b);
    }
}