interface Airtel{
    void airtel_sim();
}
class interfaces2{
    public static void main(String[] args) {
        Airtel a = new jio();
        a.airtel_sim();
    }

}

class jio implements Airtel{
    public void airtel_sim(){
        System.out.println("3GB free");
    }
}