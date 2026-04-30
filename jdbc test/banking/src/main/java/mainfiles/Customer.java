package mainfiles;

public class Customer {
    private int customerId;
    private String name;
    private String address;
    private String city;
    private int pincode;
    private String phoneNo;
    private double initialDeposit;

    public Customer(int customerId, String name, String address,
                    String city, int pincode, String phoneNo, double initialDeposit) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.city = city;
        this.pincode = pincode;
        this.phoneNo = phoneNo;
        this.initialDeposit = initialDeposit;
    }

    public int getCustomerId() { return customerId; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getCity() { return city; }
    public int getPincode() { return pincode; }
    public String getPhoneNo() { return phoneNo; }
    public double getInitialDeposit() { return initialDeposit; }
}