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
public class cliente implements imprime{
    private String ruta;
    private String nombre;
    
    public cliente(String r, String n){
        this.ruta = r;
        this.nombre = n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String n){
        nombre = n;
    }
    public String getRuta(){
        return ruta;
    }
    public void setRuta(String r){
        ruta = r;
    }

    @Override
    public String prese() {
        return this.nombre + "-" +this.ruta;
        
    }
    
}
