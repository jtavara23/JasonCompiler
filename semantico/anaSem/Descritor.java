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
public class Descritor {
    private final String id;
    private final String rotulo;
    private Categoria categoria;
    public Descritor(String id, String rot) {
        this.id = id.toUpperCase();
        this.rotulo = rot;
        
        if(this.rotulo.compareTo("INTEGER")==0||this.rotulo.compareTo("REAL")==0 ||this.rotulo.compareTo("STRING")==0 ) //Variavel
        {       
            categoria=new DatoPrimitivo(rotulo);
        }
        else if(this.rotulo.compareTo("TYPE")==0)//TYPE  (ARRAY | RECORD)
        {
            categoria=new Tipo();
        }     
        else if(this.rotulo.compareTo("VARIABLE")==0)
        {
            categoria=new Variavel();
        }     
        else if(this.rotulo.compareTo("PROCEDURE")==0)
        {
            categoria=new Procedimento();
        }
        else if(this.rotulo.compareTo("FUNCTION")==0 )
        {
            categoria=new Function();
        }  
        else if(this.rotulo.compareTo("PARAM")==0)
        {
            categoria=new Parametro();
        }     
        else
            categoria = null;       
    }
    public String getId() {
        return id;
    }
    public String getRotulo() {
        return rotulo;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    
}
