import java.util.*;
public class constructor{
    // it is special member function . it will call the compiler automatically itself at the time of object creation.
    //to assign the default value in that object 
     
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

   }
}
