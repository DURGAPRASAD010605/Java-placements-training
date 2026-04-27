class bankAccount{
    private double balance;
public setBank(double initialBalance){
    if(initialBalance>0){
        balance=initialBalance;
    }

}
public double getBalance(){
    return balance;
}

public void deposit(double amount){
    if(amount>0){
        balance+=amount;
        System.out.println("deposited:" + amount);
    }
    else{
        System.out.println("invalid deposit amount");
    }
}
}
class encap{
    public static void main(String[] args){
        bankAccount myAccount=new bankAccount(1000);
        myAccount.deposit(500);
        System.out.println("current balance" + myAccount.getBalance());
}
}
