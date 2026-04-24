import java.util.*;
public class stringcode1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        emp[] ob=new emp[3];
        int empno;
        String empname;
        for(int i=0;i<3;i++){
            System.out.print("ENtER EMP NO: ");
            empno=sc.nextInt();
            sc.nextLine();
            System.out.print("ENter emp name: ");
            empname=sc.nextLine();
            ob[i]=new emp(empno,empname);
        }
        for(int i=0;i<3;i++){
        System.out.println(ob[i].empno);
        System.out.println(ob[i].empname);  
    }}
}
class emp{
    int empno;
    String empname;
    public emp(int emp,String name){
        empno=emp;
        empname=name;
    }
    
}