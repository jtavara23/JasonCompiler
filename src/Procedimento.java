/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 9713759
 */
public class Procedimento extends Categoria{
    private Integer nParametros = null;
    @Override
    public boolean set(String field, Object value) {
        switch(field.toUpperCase()){
            case "NPARAMS":
                this.nParametros = (Integer) value;
                return true;
        }
        return false;
    }

    @Override
    public Object get(String field) {
        switch(field.toUpperCase()){
            case "NPARAMS":
                return this.nParametros;
            default:
                return null;
        }
    }
    
}
