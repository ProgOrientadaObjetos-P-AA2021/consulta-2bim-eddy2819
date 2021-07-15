/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principiosegregacion;

/**
 *
 * @author DELL
 */
public class vehicleP {
    
    public static Car buildCar(){
        
        Car car = new Car();
        car.setPrice(15.00);
        car.setColor("green");
        car.start();
        return car;
        }
    public static aeroplano buildAeroPlane(){
        aeroplano aeroplane = new aeroplano();
        aeroplane.setPrice(25.00);
        aeroplane.setColor("red");
        aeroplane.start();
        aeroplane.fly();
        return aeroplane;
    }
}

