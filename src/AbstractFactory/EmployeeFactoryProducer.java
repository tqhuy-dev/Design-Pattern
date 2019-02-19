/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.Abstract.Developer;
import AbstractFactory.Abstract.Position;
import AbstractFactory.Abstract.Tester;

/**
 *
 * @author DELL
 */
public class EmployeeFactoryProducer {
    public static Position getPosition(String position){
        if(position.equals("Developer")){
            return new Developer();
        } else {
            return new Tester();
        }
    }
}
