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
public class aeroplano implements vehicle, Movable, Flyable{
    
    double price;
    String color;

    @Override
    
    public void setPrice(double price) {

        this.price = price;
    }

    @Override
   
    public void setColor(String color) {
     this.color=color;
    }
    @Override
    public void start(){
        // Implementation
    }
    @Override
    public void stop(){
        // Implementation
    }
    @Override
    public void fly(){
        // Implementation
    }
}

