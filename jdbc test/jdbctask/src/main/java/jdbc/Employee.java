package jdbc;

public class Employee {
    private int empno;
    private String empname;
    private String address;
    private String city;

    public Employee(int empno, String empname, String address, String city) {
        this.empno = empno;
        this.empname = empname;
        this.address = address;
        this.city = city;
    }

    public int getEmpno() { return empno; }
    public String getEmpname() { return empname; }
    public String getAddress() { return address; }
    public String getCity() { return city; }
}