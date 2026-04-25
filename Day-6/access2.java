class access2{
    public static void main(String[] args) {
        
        bank t=new bank();
        int accno=t.getaccno();
        String name=t.getname();
        String address=t.getaddress();
        System.out.println("account no "+accno);
        System.out.println("account no "+name);
        System.out.println("account no "+address);
    }
}
class bank{
    private int accno=1020;
    private String name="rdp";
    private String address="gudupalli";
    public int getaccno() {
        return accno;   
    }
    public String getname() {
        return name;   
    }
    public String getaddress() {
        return address;   
    }
}