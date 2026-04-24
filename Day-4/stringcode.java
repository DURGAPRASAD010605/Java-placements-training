import java.util.*;
public class stringcode{
    public static void main(String[] args) {
        emp[] ob=new emp[3];
        int empno;
        String empname;
        empno=101;
        empname="rdp";
        ob[0]=new emp(empno,empname);
        empno=102;
        empname="rdp1";
        ob[1]=new emp(empno,empname);
        empno=103;
        empname="rdp2";
        ob[2]=new emp(empno,empname);
        System.out.println(ob[0].empno);
        System.out.println(ob[0].empname);
        System.out.println(ob[1].empno);
        System.out.println(ob[1].empname);
        System.out.println(ob[2].empno);
        System.out.println(ob[2].empname);  
    }
}
class emp{
    int empno;
    String empname;
    public emp(int emp,String name){
        empno=emp;
        empname=name;
    }
    
}