/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCTemplates;

import java.util.ArrayList;

/**
 *
 * @author cestuby
 */
public class Shipment {
    
    private ArrayList<Item> ITEMS;
    private double PAYMENT;
    private String SHIPTO;
    private String ORDERNUMBER;
    private String INSTRUCTIONS;
    
    /**
     * Overloaded Constructor.
     * 
     * Call this method when you have all of the data necessary to instantiate a completely filled out 
     * shipment. This requires all of the parameters to be passed in order to construct the fleshed 
     * out object. Possibly resource intensive.
     * @param items : ArrayList of Items
     * @param payment : double
     * @param shipToAddress : String
     * @param OrderNumber : String
     * @param deliveryInstructions : String 
     */
    public Shipment(ArrayList<Item> items, double payment, String shipToAddress, String OrderNumber, String deliveryInstructions) {
        constructShipment(items, payment, shipToAddress, OrderNumber, deliveryInstructions);
    }
    
    /**
     * Copy Constructor.
     * 
     * Makes a deep copy of the passed in Shipment. Literally clones an existing Shipment, so care must be taken
     * to ensure data integrity. Will only populate fields that are populated on the passed in Shipment.
     * @param ship : Shipment
     */
    public Shipment(Shipment ship) {
        setItems(ship.getItems());
        PAYMENT = ship.getPayment();
        SHIPTO = ship.getShipToAddress();
        ORDERNUMBER = ship.getOrderNumber();
        INSTRUCTIONS = ship.getDeliveryInstructions();
    }
    
    /**
     * No argument constructor.
     * 
     * Creates a totally blank Shipment object. 
     * WARNING! Creating an orphaned shipment (a shipment with no associated Order Number) can 
     * have negative consequences on data integrity. Creating a blank shipment devoid of items 
     * and an Order number may have negative effects on Shipping data integrity.
     */
    public Shipment() {
        //created!
    }
    
    /**
     * getItems
     * Accessor for the list of Items on the current Shipment.
     * @return An ArrayList that contains all of the items on the current Shipment. 
     */
    public ArrayList getItems() {
        ArrayList<Item> list = new ArrayList<>(ITEMS.size());
        //for each item in the ITEMS list
        ITEMS.forEach((item) -> {
            //add that item to the new list
            list.add(new Item(item));
        }); //End for loop
        return list;
    }
    
    /**
     * Destroys the current list of Items on the Shipment and rebuilds the list 
     * based off of the list passed in as a parameter. This method acts as a complete 
     * restore, it DOES NOT append.
     * @param list : ArrayList of Item objects
     */
    private void setItems(ArrayList<Item> list) {
        
        if (ITEMS.isEmpty()) {
          ITEMS = new ArrayList<>();
        } else {
            ITEMS.clear();
        }
        
        list.forEach((item) -> {
            ITEMS.add(new Item(item));
        });
    }
    
    /**
     * getPayment
     * Accessor for the payment applied to the current Shipment.
     * @return The amount of money that has been paid towards the current Shipment (double)
     */
    public double getPayment() {
        double d = PAYMENT;
        return d;
    }
    
    /**
     * getShipToAddress
     * Accessor for the shipment destination address.
     * @return The address for the current Shipment to be delivered to (String)
     */
    public String getShipToAddress() {
        String s = SHIPTO;
        return s;
    }
    
    /**
     * getOrderNumber
     * Accessor for the order number that the current Shipment belongs to.
     * @return The order number of the order that the Shipment was created for (String)
     */
    public String getOrderNumber() {
        String s = ORDERNUMBER;
        return s;
    }
    
    /**
     * getDeliveryInstructions
     * Accessor for the delivery instructions for the current Shipment.
     * @return The delivery instructions for the current Shipment (String)
     */
    public String getDeliveryInstructions() {
        String s = INSTRUCTIONS;
        return s;
    }
 
    /**
     * setPayment
     * Mutator for the payment of the current Shipment
     * WARNING! This method may have severe consequences for financial data integrity.
     * Extreme caution should be exercised when calling this method.
     * This method sets payment applied to a shipment.
     * @param d : double
     */
    protected void setPayment(double d) {
        if (d > 0) {
          PAYMENT = d;
        }
    }
    
    /**
     * setShipToAddress
     * Mutator for the delivery address of the current Shipment.
     * This method sets the Shipment delivery address to the string passed in as a parameter.
     * @param s : String
     */
    public void setShipToAddress(String s) {
        if (s.isEmpty() == false) {
            SHIPTO = s;
        }
    }
    
    /**
     * setOrderNumber
     * Mutator for the order number associated with this shipment.
     * WARNING! Severe consequences may occur if this method is misused.
     * Extreme caution should be taken when using this method outside of Shipment creation.
     * @param s : String
     */
    protected void setOrderNumber(String s) {
        ORDERNUMBER = s;
    }
    
    /**
     * setDeliveryInstructions
     * Mutator for the delivery instructions for the current Shipment.
     * Sets the current Shipment's delivery instructions to the String passed in as a parameter.
     * @param s : String
     */
    public void setDeliveryInstructions(String s) {
        if (s.isEmpty() == false) {
            INSTRUCTIONS = s;
        }
    }
    
    /**
     * constructShipment
     * @param items
     * @param payment
     * @param shipToAddress
     * @param OrderNumber
     * @param deliveryInstructions 
     */
    private void constructShipment(ArrayList<Item> items, double payment, String shipToAddress, String OrderNumber, String deliveryInstructions) {
        setItems(items);
        setPayment(payment);
        setShipToAddress(shipToAddress);
        setOrderNumber(OrderNumber);
        setDeliveryInstructions(deliveryInstructions);
    }
    
}//End class
