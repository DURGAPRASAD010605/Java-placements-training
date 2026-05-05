package mini;
public class Car {
    private Engine engine;
    private int speed;
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void drive() {
        System.out.println("Car speed: " + speed);
        engine.start();
    }
}