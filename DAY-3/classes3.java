import java.util.*;
public class classes3{
    public static void main(String args[]){
        emp_master ob=new emp_master();
        ob.input(101,"rdp");
        ob.output();
    }
}
public class emp_master{
    static int ep;
    static String name;
    public void input(int eno,String ename){
        ep=eno;
        name=ename;
    }
    public void output(){

        System.out.println(ep);
        System.out.println(name);
    }
    
}