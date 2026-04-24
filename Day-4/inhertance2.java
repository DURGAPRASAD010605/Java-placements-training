

class a{
    public void first(){
        System.out.println("One");
    }
}
class b extends a{
    public void second(){
        System.out.println("Two");
    }
}
class x extends a{
    public void third(){
        System.out.println("Third");
    }
}
class inhertance2{
    public static void main(String args[]){
        b ob=new b();
        x ob1=new x();
        ob.first();
        ob.second();
        ob1.first();
        ob1.third();
    }
    
}