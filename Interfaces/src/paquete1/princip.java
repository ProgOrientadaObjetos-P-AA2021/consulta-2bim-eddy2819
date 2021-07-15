/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author DELL
 */
public class princip {
    private imprime ob;
    
    public princip (imprime o){
        this.ob = o;
    }
    public void imprimirobjeto(){
        System.out.println(this.ob.prese());
    }
}
