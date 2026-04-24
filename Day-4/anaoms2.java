import java.util.*;
public class anaoms2{
    public static void main(String[] args) {
        emp ob=new emp(101,"rdp");
        ob.output();
    }
}
class emp{
    int empno;
    String empname;
    public emp(int emp,String name){
        empno=emp;
        empname=name;
    }
    public void output(){
        System.out.println(empno);
        System.out.println(empname);
    }
}