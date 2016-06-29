
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 9713759
 */
public class RecordTipo extends Categoria {
    private Integer nbytes = null;
    private final HashMap<String,Descritor> fields = new HashMap<>();        
    @Override
    public boolean set(String field, Object value) {
        field = field.toUpperCase();       
        if(fields.containsKey((String) field)){
            return false;
        }
        fields.put(field,(Descritor)value);
        if(value == null)
        {
            this.nbytes = 0;
        }else{
            Categoria t = ((Descritor)value).getCategoria();
            if(t.get("nbytes") != null)
                this.nbytes = ((this.nbytes == null)? (Integer)t.get("nbytes") : this.nbytes + (Integer)t.get("nbytes"));
        }
        return true;
    }

    @Override
    public Object get(String field) {
        field = field.toUpperCase();
        switch(field){
            case "NBYTES":
                return this.nbytes;
            default:
                if(!fields.containsKey(field))
                    return null;
                return fields.get(field);
        }
    }
    
}
