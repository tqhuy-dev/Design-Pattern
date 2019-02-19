/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractFactory.Abstract.Position;


/**
 *
 * @author DELL
 */
public class Demo {
    public static void main(String[] args) {
        Position factory = EmployeeFactoryProducer.getPosition("Developer");
        Employee tmp1 = factory.getPosition("Android");
        tmp1.mission();
        Employee tmp2 = factory.getPosition("Web");
        tmp2.mission();
        
        Position factory1 = EmployeeFactoryProducer.getPosition("Test");
        Employee tmp3 = factory1.getPosition("AutoTest");
        tmp3.mission();
    }
}
