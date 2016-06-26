/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 9713759
 */
package anaSem;

public class Parametro extends Categoria{
    private String classParam = null;
    private Descritor elemTipo = null;
    @Override
    public boolean set(String field, Object value) {
        switch(field.toUpperCase()){
            case "TCLASS":
                this.classParam = ((String) value).toUpperCase();
                return true;
            case "ELEMTYPE":
                this.elemTipo = (Descritor) value;
                return true;
        }
        return false;
    }

    @Override
    public Object get(String field) {
        switch(field.toUpperCase()){
            case "TCLASS":
                return this.classParam;
            case "ELEMTYPE":
                return this.elemTipo;
            default:
                return null;
        }
    }
}
