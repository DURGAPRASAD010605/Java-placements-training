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

class inhertance1{
    public static void main(String args[]){
        b ob=new b();
        ob.first();
        ob.second();
    }
    
}