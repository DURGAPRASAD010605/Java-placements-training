import java.util.*;
public class anaoms{
    public static void main(String[] args) {
        emp ob=new emp();
        ob.input(101,"rdp");
        ob.output();
    }
}
class emp{
    int empno;
    String empname;
    public void input(int emp,String name){
        empno=emp;
        empname=name;
    }
    public void output(){
        System.out.println(empno);
        System.out.println(empname);
    }
}