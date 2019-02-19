package FactoryMethod;

public class Demo {
        public static void main(String[] args) {
            CarFactory carFactory = new CarFactory();
            Car carTmp = carFactory.getEngine("Sport");
            carTmp.Engine();
            Car carTmp2 = carFactory.getEngine("Truck");
            carTmp2.Engine();
    }
}
