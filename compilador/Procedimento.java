/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author 9713759
 */
public class Procedimento extends Categoria{
    private Integer nParametros = null;
    private final ArrayList<Descritor> parametros = new ArrayList<>();      
    @Override
    public boolean set(String field, Object value) {
        switch(field.toUpperCase()){
            case "NPARAMS":
                this.nParametros = (Integer) value;
                return true;
            default:
                    field = field.toUpperCase();       
                    for(int i=0;i<parametros.size();i++)
                        if((parametros.get(i).getId()).compareToIgnoreCase(field)==0)
                            return false; 
                    this.parametros.add((Descritor)value); 
                    return true;              
        }
        //return false;
    }

    @Override
    public Object get(String field) {
        switch(field.toUpperCase()){
            case "NPARAMS":
                return this.nParametros;
            default:
                if(Integer.parseInt(field)<nParametros)
                   return parametros.get(Integer.parseInt(field));
                return null;
        }
    }
    
}
