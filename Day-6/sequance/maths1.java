package sequance;
public class maths1{
    public int fact(int num){
        int temp=1;
        for(int i=1;i<=num;i++){
            temp*=i;
        }
        return temp;
    }
}