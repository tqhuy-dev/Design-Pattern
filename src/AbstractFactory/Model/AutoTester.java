/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory.Model;

import AbstractFactory.Employee;

/**
 *
 * @author DELL
 */
public class AutoTester implements Employee{

    @Override
    public void mission() {
        System.out.print("Tester");
    }
    
}
