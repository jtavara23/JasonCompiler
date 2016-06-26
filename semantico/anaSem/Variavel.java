/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anaSem;
/**
 *
 * @author 9713759
 */
public class Variavel extends Categoria{
    private Integer nbytes = null;
    private Descritor elemTipo = null;
    @Override
    public boolean set(String field, Object value) {
        switch(field.toUpperCase()){
            case "ELEMTYPE":
                this.elemTipo = (Descritor) value;
                /*if(elemTipo == null || elemTipo.getType() == null)
                    this.nbytes = 0;
                else
                    this.nbytes = (Integer) elemTipo.getType().get("nbytes");*/
                return true;
        }
        return false;
    }

    @Override
    public Object get(String field) {
        switch(field.toUpperCase()){
            case "ELEMTYPE":
                return this.elemTipo;
            case "NBYTES":
                return this.nbytes;
            default:
                return null;
        }
    }
    
}