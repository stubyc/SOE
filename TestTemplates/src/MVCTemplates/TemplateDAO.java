/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCTemplates;

/**
 * Part of MVCTemplates package, designed to provide skeletons for MVC components. 
 * Provides a template for a DAO component of the Model. 
 * Use TemplateController for File DAO Logics, Business Logics are standalone objects. 
 * Will need to set up your database connection, this only provides method stubs. 
 * @author cestuby
 */
public interface TemplateDAO {
    //Send a search criteria and perform an SQL GET operation
    <E> boolean Get(E object);
    //Send the new record and perform an SQL INSERT operation
    <E> boolean Insert(E object);
    //Send the new record and perform an SQL UPDATE operation
    <E> boolean Update(E object);
    //Send a search criteria and perform an SQL DELETE operation
    <E> boolean Delete(E object);
}
