/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Abstract;

import AbstractFactory.Employee;
import AbstractFactory.Model.AndroidDeveloper;
import AbstractFactory.Model.WebDeveloper;

/**
 *
 * @author DELL
 */
public class Developer extends Position {

    @Override
    public Employee getPosition(String position){
        if(position.equals("Web")){
            return new WebDeveloper();
        } 
        else if (position.equals("Android")) {
            return new AndroidDeveloper();
        }
        return null;
    }
    
}
