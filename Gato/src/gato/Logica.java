/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gato;

/**
 *
 * @author Tyrips
 */
public class Logica {
    private String objeto;
    /***
     * Constructor de la clase lógica.
     * @param objeto 
     */
    public Logica(String objeto){
        this.objeto = objeto;
        
    }
    public void SetObjeto(String obj){
        this.objeto = obj;
    }
    
    public String GetObj(){        
        return this.objeto;
    }
}
