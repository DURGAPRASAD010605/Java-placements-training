interface A{
    void show();
}
class Main12{
    public static void main(String[] args) {
        A a = new B();
        a.show();
    }

}

class B implements A{
    public void show(){
        System.out.println("Hello from B");
    }
}