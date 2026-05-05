
import java.util.ArrayList;

class student
{
    String name;
    int adno;
    public student(String name,int adno )
    {
    this.name = name;
    this.adno = adno;
    }
}
class arr3{
    public static void main(String[] args) {
        ArrayList<student> x = new ArrayList<>();
        int i;
        x.add(new student("raj", 101));
        x.add(new student("raja", 102));
        x.add(new student("rajan", 103));
    for( student k : x){
    System.out.println(k.adno);
    System.out.println(k.name);
    }
    }
}