interface Airtel{
    void airtel_sim();
    void jio_sim();
    
}
interface Vadafone{
    void vodafone();
}
class interfaces3{
    public static void main(String[] args) {
        Airtel a = new jio();
        a.airtel_sim();
        a.jio_sim();
        Vadafone b=new jio();
        b.vodafone();
    }

}

class jio implements Airtel,Vadafone{
    public void airtel_sim(){
        System.out.println("5GB free");
    }
    public void jio_sim(){
        System.out.println("3GB free");
    }
    public void vodafone(){
        System.out.println("15GB free");
    }
}