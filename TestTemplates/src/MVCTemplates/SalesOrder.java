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
public class SalesOrder {
    
    private Customer CUST;
    private ArrayList<Item> ITEMS;
    private ArrayList<Shipment> SHIPMENTS;
    private String ORDERNUMBER;
    private double ORDERTOTAL;
    private boolean isPaid;
    private double BALANCE;
    
    /**
     * 
     * @param c
     * @param i
     * @param s
     * @param o 
     */
    public SalesOrder(Customer c, ArrayList<Item> i, ArrayList<Shipment> s, String o) {
        constructSalesOrder(c, i, s, o);
    }
    
   
    /**
     * 
     * @param order 
     */
    public SalesOrder(SalesOrder order) {
        
      constructSalesOrder(order.getCustomer(), order.getItems(), order.getShipments(), order.getOrderNumber());
        
    }
    
    /**
     * 
     * @param orderNumber
     */
    public SalesOrder(String orderNumber) {
        setOrderNumber(orderNumber);
    }
    
    /**
     * 
     * @return 
     */
    public Customer getCustomer() {
        Customer c = new Customer(CUST);
        return c;
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<Item> getItems() {
        ArrayList<Item> list = new ArrayList<>(ITEMS.size());
        //for each item in the ITEMS list
        ITEMS.forEach((item) -> {
            //add that item to the new list
            list.add(new Item(item));
        }); //End for loop
        return list;
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<Shipment> getShipments() {
        ArrayList<Shipment> list = new ArrayList<>(SHIPMENTS.size());
        //for each item in the ITEMS list
        SHIPMENTS.forEach((shipment) -> {
            //add that item to the new list
            list.add(new Shipment(shipment));
        }); //End for loop
        return list;
    }
    
    /**
     * 
     * @return 
     */
    public String getOrderNumber() {
        String s = ORDERNUMBER;
        return s;
    }
    
    /**
     * 
     * @return 
     */
    public double getOrderTotal() {
        double d = ORDERTOTAL;
        return d;
    }
    
    /**
     * 
     * @param c 
     */
    public void setCustomer(Customer c) {
        CUST.setAccountNumber(c.getAccountNumber());
        CUST.setAddress(c.getAddress());
        CUST.setCustomerName(c.getCustomerName());
        CUST.setCredit(c.getCredit());
    }
    
    /**
     * 
     * @param list 
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
     * 
     * @param list 
     */
    private void setShipments(ArrayList<Shipment> list) {
        
        if (SHIPMENTS.isEmpty()) {
            SHIPMENTS = new ArrayList<>();
        } else {
            SHIPMENTS.clear();
        }
        
        list.forEach((shipment) -> {
            SHIPMENTS.add(new Shipment(shipment));
        });
    }
    
    /**
     * 
     * @param s 
     */
    private void setOrderNumber(String s) {
        
        ORDERNUMBER = s;
    }
    
    /**
     * 
     * @return 
     */
    public double determineTotal() {
        double price = 0;
        
        for (int i = 0; i < ITEMS.size(); i++) {
            price =+ ITEMS.get(i).getPrice();
        }
        
        return price;
    }
    
    /**
     * 
     * @param c
     * @param i
     * @param s
     * @param o 
     */
    private void constructSalesOrder(Customer c, ArrayList<Item> i, ArrayList<Shipment> s, String o) {
        setCustomer(c);
        setItems(i);
        setShipments(s);
        setOrderNumber(o);
        ORDERTOTAL = determineTotal();
    }
    
    /**
     * 
     * @return 
     */
    public boolean isOrderPaidFor() {
        double d = getOrderBalance();
        isPaid = d <= 0;
        boolean b = isPaid;
        return b;
    }
    
    /**
     * 
     * @return 
     */
    public double getOrderBalance() {
        double orderTotal = 0;
        double balance = 0;
        double paymentTotal = 0;
        
        orderTotal = determineTotal();
        
        for (int i = 0; i < SHIPMENTS.size(); i++) {
            paymentTotal =+ SHIPMENTS.get(i).getPayment();
        }
        
        balance = orderTotal - paymentTotal;
        
        return balance;
    }
    
    /**
     * 
     */
    private void setBalance() {
        double d = getOrderBalance();
       
        BALANCE = d;
    }
    
}
