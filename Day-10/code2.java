class a{
    public void one(){
        System.out.println("one");
    }
}
class b{
    public void two(){
        System.out.println("two");
    }
}


public class code2 {
    a a1;
    b b1;
    public void two(){
        a1=new a();
        b1=new b();
        a1.one();
        b1.two();
    }
}
