
public class methods2{
    public static void main(String args[]){
       int arr[]=new int[] {10,20,30};
        methods2 ob=new methods2();
        ob.modify(arr);
        System.out.println("array value after calling method "+arr[0]);

    }
    public void modify(int arr[]){
        arr[0]=100;
    }
}