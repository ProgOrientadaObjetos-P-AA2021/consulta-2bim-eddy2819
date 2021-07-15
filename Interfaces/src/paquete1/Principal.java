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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cliente c = new cliente("44-77","Pedro");
        Admins a = new Admins("457hh", "romeo45");
        
        princip p = new princip(c);
         princip p1 = new princip(a);
        p.imprimirobjeto();
        p1.imprimirobjeto();
    }
    
}
