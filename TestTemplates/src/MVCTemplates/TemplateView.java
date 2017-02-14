/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCTemplates;



/**
 * Part of MVCTemplates package, designed to provide skeletons for MVC components. 
 * TemplateView provides a skeleton for the View component. 
 * Provides a method to create a shell GUI and stubs for data and request processing
 * @author cestuby
 */
public interface TemplateView {
   
    
    
    //Initialize the View
    abstract public void Initialize();
    //Process user request
    abstract public void Process();
    //Update from business logic
    abstract public <E> void Update(E element);
    
    
}//End template
