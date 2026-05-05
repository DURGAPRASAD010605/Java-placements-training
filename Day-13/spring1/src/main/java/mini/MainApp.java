package mini;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed: ");
        int speed = sc.nextInt();
        System.out.print("Enter horsepower: ");
        int hp = sc.nextInt();
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) context.getBean("car");
        Engine engine = (Engine) context.getBean("engine");
        engine.setHorsePower(hp);
        car.setSpeed(speed);
        car.drive();
    }
}