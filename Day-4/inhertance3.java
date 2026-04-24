import java.util.Scanner;

public class inhertance3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Cs s = new Cs();
        s.input(sc);
        s.output();

        Ece e = new Ece();
        e.input(sc);  
        e.output();

        Civil c = new Civil();  
        c.input(sc);
        c.output();

        sc.close();
    }
}

class Student{
    int adno;
    String name, address;

    public void input(Scanner sc){
        System.out.println("Enter the name of the student:");
        name = sc.nextLine();
        System.out.println("Enter the address of the student:");
        address = sc.nextLine();
        System.out.println("Enter the admission number of the student:");
        adno = sc.nextInt();
        sc.nextLine(); // clear buffer
    }
}

class Cs extends Student{
    int java, python;

    public void input(Scanner sc){
        super.input(sc);
        System.out.println("Enter the marks obtained in java:");
        java = sc.nextInt();
        System.out.println("Enter the marks obtained in python:");
        python = sc.nextInt();
        sc.nextLine();
    }

    public void output(){
        System.out.println("\n--- CS Student ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Admission Number: " + adno);
        System.out.println("Marks in Java: " + java);
        System.out.println("Marks in Python: " + python);
    }
}

class Ece extends Student{
    int digital, analog;

    public void input(Scanner sc){
        super.input(sc);
        System.out.println("Enter the marks obtained in digital:");
        digital = sc.nextInt();
        System.out.println("Enter the marks obtained in analog:");
        analog = sc.nextInt();
        sc.nextLine();
    }

    public void output(){
        System.out.println("\n--- ECE Student ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Admission Number: " + adno);
        System.out.println("Marks in Digital: " + digital);
        System.out.println("Marks in Analog: " + analog);
    }
}

class Civil extends Student{
    int building, construction;

    public void input(Scanner sc){
        super.input(sc);
        System.out.println("Enter the marks obtained in building:");
        building = sc.nextInt();
        System.out.println("Enter the marks obtained in construction:");
        construction = sc.nextInt();
        sc.nextLine();
    }

    public void output(){
        System.out.println("\n--- Civil Student ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Admission Number: " + adno);
        System.out.println("Marks in Building: " + building);
        System.out.println("Marks in Construction: " + construction);
    }
}