package mini;

public class Engine {

    private int horsePower;

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void start() {
        System.out.println("Engine HP: " + horsePower);
    }
}