public class ThisExample {
     int x;
// this is a keyword , it is predefined in java and it is used alternative  refernce variable  to the current object of the class
// we can access it through the member varibale and menmber object for the correct onject
// it is mainly used for to show the difference between the local variable and the member  variable when they have the same name    
    public ThisExample(int x) {
        this.x = x;
    }
    public void input(int x) {
        this.x = x;
        this.output();
    }
    public void output() {
        System.out.println(x);
    }
    public static void main(String[] args) {
        ThisExample obj = new ThisExample(10);
        obj.input(20);
    }
}