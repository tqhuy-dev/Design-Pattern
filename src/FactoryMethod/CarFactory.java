/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author DELL
 */
public class CarFactory {
    public Car getEngine(String carType){
        switch(carType){
            case "Sport":{
                return new SportCar();
            }
            
            case "Truck":{
                return new Truck();
            }
        }
        return null;
    }
}
