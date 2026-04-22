import java.util.*;
public class classes2{
    public static void main(String args[]){
        emp_master ob=new emp_master();
        ob.input();
        ob.output();
    }
}
public class emp_master{
    int ep;
    String name;
    public void input(){
        emp_master ob=new emp_master();
        ob.name="rdp";
        ob.ep=10;
    }
    public void output(){
        System.out.println(ep);
        System.out.println(name);
    }
    
}