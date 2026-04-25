class access1{
    public static void main(String[] args) {
        int acno=4023;
        bank t=new bank();
        t.input(acno);
    }
}
class bank{
    private int accno;
    private String name;
    private String address;
    public void input(int account) {
        this.accno=account;   
    }
    public void Stringname(Stringtring name) {
        this.name=name;   
    }
}