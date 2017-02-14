/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCTemplates;

/**
 * Part of MVCTemplates package, designed to provide skeletons for MVC components. 
 * Provides a skeleton for implementing a Controller component.
 * @author cestuby
 */
public interface TemplateController {
    //send a command or data structure to be handled
    /**
     * Process
     * Called by an external object looking to utilize business logics.
     * This method takes in some object representing a user action from the View 
     * and determines what business logic should handle the request.
     * @param <E>
     * @param element : any object to represent a user request
     */
    <E> void Process(E element);
    //send a/the View the new Model state
    /**
     * UpdateView
     * Called by the controller after the user request has been processed. 
     * This method takes in some object representing a Model state and sends 
     * that data to the View.
     * @param <E>
     * @param element : any object to represent a Model state
     */
    <E> void UpdateView(E element);   
}
