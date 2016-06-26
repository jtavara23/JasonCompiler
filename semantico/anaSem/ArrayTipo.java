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
public class ArrayTipo extends Categoria {
    private String rotulo=null;
    private Integer nbytes = null;
    private Integer size = null;
    private Descritor elemTipo = null; // entero ou real ou string ou identifier  

    @Override
    public boolean set(String field, Object value) {
        switch(field.toUpperCase())
        {
            case "SIZE":
                this.size = (Integer) value;
                if(elemTipo != null && elemTipo.getCategoria() != null && elemTipo.getCategoria().get("nbytes") != null && size != null)
                    this.nbytes = ((Integer) elemTipo.getCategoria().get("nbytes"))*this.size;
                else
                    this.nbytes = 0;
                return true;
            case "ELEMTYPE":
                this.elemTipo = (Descritor) value;
                this.rotulo = elemTipo.getId();  
                if(elemTipo != null && elemTipo.getCategoria() != null && elemTipo.getCategoria().get("nbytes") != null && size != null)
                    this.nbytes = ((Integer) elemTipo.getCategoria().get("nbytes"))*this.size;
                else
                    this.nbytes = 0;
                return true;
        }
        return false;
    }

    @Override
    public Object get(String field) {
        field = field.toUpperCase();
        switch(field.toUpperCase())
        {
            case "ROTULO":
                return this.rotulo;             
            case "SIZE":
                return this.size;
            case "ELEMTYPE":
                return this.elemTipo;
            case "NBYTES":
                return this.nbytes;
            default:
                return null;
        }
    }
}
