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
public class Admins implements imprime {
    private String usuario;
    private String pans;
    
    public Admins(String u, String p){
        this.usuario = u;
        this.pans = p;
    }
    public String getPans(){
        return pans;
    }
    public void setPans(String n){
        pans = n;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String r){
        usuario = r;
    }

    @Override
    public String prese() {
       return this.usuario + "-" + this.pans;
    }
    
    
}
