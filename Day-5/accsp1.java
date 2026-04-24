class accsp1{
    public static void main(String[] args){
        tiger t=new tiger();
        t.eat();
    }

}
class animal{
    public void eat(){
        System.out.println("milk");
    }

}
class tiger extends animal{
    public void eat(){
        super.eat();
        System.out.println("meat");
    }
}