import java.util.*;
public class constructor2{
    
    public static void main(String args[]){
        emp_master ob=new emp_master();
        System.out.println(ob.ep);
        System.out.println(ob.name);
        
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
