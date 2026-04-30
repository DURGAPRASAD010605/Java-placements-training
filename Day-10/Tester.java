class vehicle{
    private String vin;
    public String getvin(){
        return vin;
    }
    public void setvin(String vin){
        this.vin=vin;
    }
}
class Speed{
    private double max;
    public double getmax(){
        return max;
    }
    public void setMax(double max){
        this.max=max;
    }
}
class van extends vehicle{
    private Speed speed;
    public Speed getSpeed() {
        return speed;
    }
    public void setSpeed(Speed speed) {
        this.speed = speed;
    }
    public void print(){
        
        System.out.println("vin: "+this.getvin()+" max speed: "+speed.getmax());
    }
}
public class Tester{
    public static void main(String[] args) {
        van v=new van();
        v.setvin("520");
        Speed s=new Speed();
        s.setMax(120);
        v.setSpeed(s);
        v.print();
    }
}