/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Abstract;

import AbstractFactory.Employee;
import AbstractFactory.Model.AutoTester;

/**
 *
 * @author DELL
 */
public class Tester extends Position {

    @Override
    public Employee getPosition(String position) {
        if(position.equals("AutoTest")){
            return new AutoTester();
        }
        return null;
    }
    
}
