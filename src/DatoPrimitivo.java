/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 9713759
 */
public class DatoPrimitivo extends Categoria{
    private Integer nBytes;
    private final String  tipoDato;

    public DatoPrimitivo(String tDato) {
        this.tipoDato=tDato;
        switch (tipoDato) 
        {
            case "INTEGER":
                this.nBytes=4;
                break;
            case "REAL":
                nBytes=8;
                break;
            case "STRING":
                nBytes=256;
                break;
        }
    }
    
    @Override
    public boolean set(String field, Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
    @Override
    public Object get(String field) {
        if(field.toUpperCase().equals("NBYTES"))
            return this.nBytes;
        else if(field.toUpperCase().equals("TIPODATO"))
            return this.tipoDato;
        else
            return null;
    }
}
