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
public class Item {
    
    private String ITEMNUMBER;
    private String DESCRIPTION;
    private int ONHANDQUANTITY;
    private double COST;
    private double PRICE;
    private double GROSSMARGIN;
    
    /**
     * Constructor for creating a new Item.
     * 
     * You MUST pass in a unique item number, a description, an on hand quantity, a cost, and a price.
     * Passing in each of these parameters will create a complete Item object that other applications
     * can use. Gross margins will automatically be calculated.
     * @param itemNumber : String
     * @param description : String
     * @param quantity : int
     * @param cost : double
     * @param price : double
     */
    public Item(String itemNumber, String description, int quantity, double cost, double price) {
        constructItem(itemNumber, description, quantity, cost, price);
    }
    
    /**
     * Copy constructor for creating a new Item from an existing one.
     * 
     * This constructor takes in an existing Item object and creates a deep copy of it
     * that other applications can use. Creates a carbon copy.
     * @param i : Item
     */
    public Item(Item i) {
        ITEMNUMBER = i.getItemNumber();
        DESCRIPTION = i.getDescription();
        ONHANDQUANTITY = i.getQuantity();
        COST = i.getCost();
        PRICE = i.getPrice();
        GROSSMARGIN = i.getGMPercent();
    }
    
    /**
     * No argument constructor.
     * 
     * Creates a completely blank item.
     * WARNING! Not a good idea to call this method unless you plan on immediately 
     * assigning its fields. Otherwise bad things will happen.
     */
    public Item() {
        //Created!
    }
    
    /**
     * Accessor for the item number.
     * Returns the item number for the current Item as a string.
     * @return String
     */
    public String getItemNumber() {
        String s = ITEMNUMBER;
        return s;
    }
    
    /**
     * Accessor for the item description.
     * Returns the description for the current Item as a string.
     * @return String
     */
    public String getDescription() {
        String s = DESCRIPTION;
        return s;
    }
    
    /**
     * Accessor for the item's on hand quantity.
     * Returns the current on hand quantity for the current Item as an integer.
     * @return int
     */
    public int getQuantity() {
        int i = ONHANDQUANTITY;
        return i;
    }
    
    /**
     * Accessor for the cost of the current Item.
     * Returns the cost of production for the current Item object as a double.
     * @return double
     */
    public double getCost() {
        double d = COST;
        return d;
    }
    
    /**
     * Accessor for the price of the current Item.
     * Returns the charged price of the current Item object as a double.
     * @return double
     */
    public double getPrice() {
        double d = PRICE;
        return d;
    }
    
    /**
     * Accessor for the gross margin percent of the current Item.
     * Returns the gross margin percent of the current Item as a double.
     * @return double
     */
    public double getGMPercent() {
        double d = GROSSMARGIN;
        return d;
    }
    
    /**
     * Mutator for the item number of the current Item.
     * WARNING! Calling this method will change the item number associated with the current Item.
     * The item number for the current Item will be set to the value passed in as a parameter. This
     * has severe consequences for data integrity, so this method should NOT be called outside of creating
     * a new Item for inventory.
     * @param s : String
     */
    public void setItemNumber(String s) {
        ITEMNUMBER = s;
    }
    
    /**
     * Mutator for the description of the current Item.
     * Sets the current Item's description to the value passed in as a parameter.
     * @param s : String
     */
    public void setDescription(String s) {
        DESCRIPTION = s;
    }
    
    /**
     * Mutator for the on hand quantity of the current Item.
     * Sets the current Item's on hand quantity to the value passed in as a parameter.
     * @param i : int
     */
    public void setQuantity(int i) {
        ONHANDQUANTITY = i;
    }
    
    /**
     * Mutator for the cost of the current Item.
     * WARNING! This method may have severe consequences on inventory and finance data integrity. This method
     * should be called VERY CAREFULLY outside of new Item creation. 
     * Sets the cost of production for the current Item to the value passed in as a parameter.
     * @param d : double
     */
    public void setCost(double d) {
        COST = d;
    }
    
    /**
     * Mutator for the charged price of the current Item.
     * WARNING! This method may have severe consequences on inventory and finance data 
     * integrity. This method should be called VERY CAREFULLY outside of new Item creation.
     * Sets the charged price for the current Item to the value passed in as a parameter.
     * @param d : double
     */
    public void setPrice(double d) {
        PRICE = d;
    }
    
    /**
     * Mutator for the gross margin percent of the current Item.
     * WARNING! This method may have severe consequences on inventory and finance data integrity. 
     * This method should be called VERY CAREFULLY outside of new Item creation. The security level 
     * of this method is private so that outside applications cannot affect an automatically  
     * calculated field.
     * Sets the gross margin percent of the current Item to the value passed in as a parameter.
     * @param d : double
     */
    private void setGMPercent(double d) {
        GROSSMARGIN = d;
    }
    
    /**
     * constructItem
     * Called by the constructor to build the Item. Prevents the constructor from being an override
     * for the mutators.
     * @param itemNumber : String
     * @param description : String
     * @param quantity : int
     * @param cost : double
     * @param price : double
     */
    private void constructItem(String itemNumber, String description, int quantity, double cost, double price) {
        setItemNumber(itemNumber);
        setDescription(description);
        setQuantity(quantity);
        setCost(cost);
        setPrice(price);
        
        //call business logic to calculate GM%
        double difference = price - cost;
        double gmp = difference / cost;
        setGMPercent(gmp);
        
    }
}
