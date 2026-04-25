class access{
    public static void main(String[] args) {
        int acno=4023;
        bank t=new bank();
        t.input(acno);
    }
}
class bank{
    private int accno;
    public void input(int account) {
        accno=account;
        System.out.println(accno);
        
    }
}