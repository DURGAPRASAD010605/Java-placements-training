import java.util.*;
public class constructor3{
    
    public static void main(String args[]){
        emp_master ob=new emp_master();
        emp_master t;
        t=ob;
        System.out.println("K references");
        System.out.println(ob);
        System.out.println(t);
        
    }
}
public class emp_master{
    int ep;
   String name;
   public emp_master(){
    ep=90;
    name="rdp";

   }
}
