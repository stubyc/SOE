/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCTemplates;

/**
 *
 * @author cestuby
 */
public class Customer {
    
    private String BILLTOACCOUNT;
    private String NAME;
    private String ADDRESS;
    private double CREDIT;
    
    /**
     * Constructor for Customer object.
     * You MUST pass in an account number, a name, an address and a credit limit.
     * Calling this constructor and supplying the necessary parameters creates a complete customer
     * object that can be used by other applications.
     * @param accountNumber : String
     * @param name : String
     * @param address : String
     * @param credit : double
     */   
    public Customer(String accountNumber, String name, String address, double credit) {
        constructCustomer(accountNumber, name, address, credit);
    }
    
    /**
     * Copy constructor for creating a new Customer cloned from an existing Customer.
     * Calling this constructor and providing an existing Customer object as a parameter creates
     * a complete Customer clone of the existing one that can be used by other applications.
     * @param c : Customer 
     */
    public Customer(Customer c) {
       BILLTOACCOUNT = c.getAccountNumber();
       NAME = c.getCustomerName();
       ADDRESS = c.getAddress();
       CREDIT = c.getCredit();
    }
    
    /**
     * getAccountNumber
     * Accessor for the current Customer's account number
     * @return String representing the Customer account number.
     */
    public String getAccountNumber() {
        String s = BILLTOACCOUNT;
        return s;
    }
    
    /**
     * getCustomerName
     * Accessor for the current Customer's name
     * @return String representing the Customer name
     */
    public String getCustomerName() {
        String s = NAME;
        return s;
    }
    
    /**
     * getAddress
     * Accessor for the current Customer's address
     * @return String representing the Customer address
     */
    public String getAddress() {
        String s = ADDRESS;
        return s;
    }
    
    /**
     * getCredit
     * Accessor for the current Customer's credit
     * @return double representing the Customer credit limit
     */
    public double getCredit() {
        double d = CREDIT;
        return d;
    }
    
    /**
     * setAccountNumber
     * Mutator for the current Customer's account number
     * WARNING! This method may have severe consequences.
     * Extreme caution should be used when calling this method.
     * @param s : String to be new account number for the current Customer.
     */
    public void setAccountNumber(String s) {
        BILLTOACCOUNT = s;
    }
    
    /**
     * setCustomerName
     * Mutator for the current Customer's name
     * WARNING! This method may have severe consequences.
     * Extreme caution should be used when calling this method.
     * 
     * @param s : String to be the new name for the current Customer
     */
    public void setCustomerName(String s) {
        NAME = s;
    }
    
    /**
     * setAddress
     * Mutator for the current Customer's address
     * WARNING! This method may have severe consequences for shipping data integrity.
     * Caution should be taken when calling this method.
     * @param s : String to be the current Customer's new address.
     */
    public void setAddress(String s) {
        ADDRESS = s;
    }
    
    /**
     * setCredit
     * Mutator for the current Customer's credit
     * WARNING! This method may have severe consequences for order and financial data integrity.
     * Extreme caution should be taken when calling this method.
     * @param d : double to be the new credit limit for the current Customer.
     */
    protected void setCredit(Double d) {
        CREDIT = d;
    }
    
    /**
     * constructCustomer
     * Constructs the Customer object from the constructor method. 
     * @param accountNumber : String
     * @param name : String
     * @param address : String
     * @param credit : double
     */
    private void constructCustomer(String accountNumber, String name, String address, double credit) {
        setAccountNumber(accountNumber);
        setCustomerName(name);
        setAddress(address);
        setCredit(credit);
    }
    
}
