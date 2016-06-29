/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 9713759
 */
public class Tipo extends Categoria{
    private String rotulo=null; //array ou record
    private Integer nBytes = null;   
    private Categoria elemTipo = null;
    @Override
    public boolean set(String field, Object value) 
    {
        switch(field.toUpperCase())
        {
             case "ELEMTYPE":
                this.rotulo = (String) value;      
                if(rotulo.compareTo("ARRAY")==0)
                    this.elemTipo=new ArrayTipo();
                else if(rotulo.compareTo("RECORD")==0)
                    this.elemTipo=new RecordTipo();
                return true;
        }
        return false;
    }

    @Override
    public Object get(String field) 
    {
        field = field.toUpperCase();
        switch(field.toUpperCase())
        {
            case "ROTULO":
                return this.rotulo;            
            case "ELEMTYPE":
                return this.elemTipo;
            case "NBYTES":
                return this.nBytes;
            default:
                return null;
        }
    }
    
}
