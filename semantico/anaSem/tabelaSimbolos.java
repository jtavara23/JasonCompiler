package anaSem;
import java.util.ArrayList;
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
public class tabelaSimbolos {
    private final ArrayList<HashMap<String, Descritor>> levelsScope;
    private Integer scopeAtual;
    
    public tabelaSimbolos()
    {
        levelsScope = new ArrayList<>();
        levelsScope.add(new HashMap());
        scopeAtual = 0;
    }
           
    public void addLevelScope()
    {
        levelsScope.add(new HashMap());
        scopeAtual++;       
    }
    
    public void removeLevelScope()
    {
        if(scopeAtual < 0)
            return;
        levelsScope.remove(levelsScope.get(scopeAtual));
        scopeAtual--;
    }
    
    public boolean addDescritor(String id, String rotulo)
    {
         id = id.toUpperCase();
         if(scopeAtual >=0 && !existId(id))
         {
                levelsScope.get(scopeAtual).put(id, new Descritor(id, rotulo));
             return true;
         }
         return false;
    }
    public boolean existId(String id) //Verifica si existe un id en el escope actual
    {
        id = id.toUpperCase();
        if(scopeAtual < 0)
            return false;
        return levelsScope.get(scopeAtual).containsKey(id);
    }
    public boolean existGlobalId(String id) //Verifica se existe um id no escopo global
    {
        id = id.toUpperCase();
        if(scopeAtual < 0)
            return false;
        return levelsScope.get(0).containsKey(id);
    }
    public Descritor searchScopeAtual(String id)// Retorna un descritor ubicado en el scope actual
    {
        id = id.toUpperCase();
        if(levelsScope.get(scopeAtual).containsKey(id))
            return (Descritor) levelsScope.get(scopeAtual).get(id); 
        else
            return null;
    }
    public Descritor searchDataType(String id) // Retorna um descritor do nível atual ou do nivel global
    {
        id = id.toUpperCase();
        for(int scope = scopeAtual; scope >= 0; scope--)
            if(levelsScope.get(scope).containsKey(id))//TYPE
                {
                    Descritor  desTipo = levelsScope.get(scope).get(id);
                    if(desTipo.getId().compareToIgnoreCase(id)==0&&desTipo.getRotulo().compareToIgnoreCase("TYPE")==0)
                        return desTipo;
                }
        return null;
    }
    public Descritor initDataType(String rotulo)//Retorna um descritor do tipo solicitado
    {
        rotulo = rotulo.toUpperCase();
        if(rotulo.compareTo("INTEGER")==0 || rotulo.compareTo("REAL")==0 ||rotulo.compareTo("STRING")==0){
            return new Descritor(rotulo,rotulo);
        }
        else
        {
            int level=scopeAtual;
            while(level >= 0)
            {
                if(levelsScope.get(level).containsKey(rotulo))//TYPE
                {
                    Descritor  desTipo = levelsScope.get(level).get(rotulo);
                    if(desTipo.getId().compareToIgnoreCase(rotulo)==0&&desTipo.getRotulo().compareToIgnoreCase("TYPE")==0)
                        return desTipo;
                }
                level--;
            }
            return null;
        }
    }
    public boolean existType(String rotulo)//Verfica se existe um tipo em todos os escopos
    {
        rotulo = rotulo.toUpperCase();
        if(rotulo.compareTo("INTEGER")==0 || rotulo.compareTo("REAL")==0 ||rotulo.compareTo("STRING")==0)
            return true;
        else
        {
            int level=scopeAtual;
            while(level >= 0)
            {
                if(levelsScope.get(level).containsKey(rotulo))//TYPE
                {
                    Descritor  desTipo=levelsScope.get(level).get(rotulo);
                    if(desTipo.getId().compareToIgnoreCase(rotulo)==0&&desTipo.getRotulo().compareToIgnoreCase("TYPE")==0)
                        return true;
                }
                level--;
            }
            return false;
        }
    }
    public Descritor searchVariable(String id)//Retorna un descritor del varaible solicitado
    {
        id = id.toUpperCase(); 
        int level=scopeAtual;
        while(level >= 0)
        {
                
            if(levelsScope.get(level).containsKey(id))//TYPE
            {
                Descritor  desTipo=levelsScope.get(level).get(id);
                if(desTipo.getRotulo().compareToIgnoreCase("VARIABLE")==0)
                    return desTipo;   
            }
            level--;
        }
        return null;
    }  
    public boolean existVariable(String id)//Retorna un descritor del variable solicitado
    {
        id = id.toUpperCase(); 
        int level=scopeAtual;
        while(level >= 0)
        {
                
            if(levelsScope.get(level).containsKey(id))//TYPE
            {
                Descritor  desTipo=levelsScope.get(level).get(id);
                if(desTipo.getRotulo().compareToIgnoreCase("VARIABLE")==0||(desTipo.getRotulo().compareToIgnoreCase("PARAM")==0&&level==scopeAtual))
                    return true;   
            }
            level--;
        }
        return false;
    }
    public boolean existFunction(String id)//Retorna un descritor del variable solicitado
    {
        id = id.toUpperCase(); 
        int level=scopeAtual;
        while(level >= 0)
        {
                
            if(levelsScope.get(level).containsKey(id))//TYPE
            {
                Descritor  desTipo=levelsScope.get(level).get(id);
                if(desTipo.getRotulo().compareToIgnoreCase("FUNCTION")==0)
                    return true;   
            }
            level--;
        }
        return false;
    }
    public Descritor search(String id)
    {
        id = id.toUpperCase(); 
        int level=scopeAtual;
        while(level >= 0)
        {
                
            if(levelsScope.get(level).containsKey(id))//TYPE
            {
                Descritor  desTipo=levelsScope.get(level).get(id);
                if(desTipo.getRotulo().compareToIgnoreCase("VARIABLE")==0||(desTipo.getRotulo().compareToIgnoreCase("PARAM")==0&&level==scopeAtual)
                    ||desTipo.getRotulo().compareToIgnoreCase("FUNCTION")==0    )
                    return desTipo;   
            }
            level--;
        }
        return null;
    } 
    public boolean exist(String id)//Retorna un descritor del variable solicitado
    {
        id = id.toUpperCase(); 
        int level=scopeAtual;
        while(level >= 0)
        {
                
            if(levelsScope.get(level).containsKey(id))//TYPE
            {
                Descritor  desTipo=levelsScope.get(level).get(id);
                if(desTipo.getRotulo().compareToIgnoreCase("TYPE")!=0&&desTipo.getRotulo().compareToIgnoreCase("PROCEDURE")!=0)
                    return true;   
            }
            level--;
        }
        return false;
    }    
    public Descritor search(int level, String id)//Busca en una nivel de escope especifico
    {
        id = id.toUpperCase();
        if(levelsScope.get(level).containsKey(id))
            return (Descritor) levelsScope.get(level).get(id); 
        else
            return null;
    }
    public boolean searchId(int level, String id)//Busca en una nivel de escope especifico
    {
        id = id.toUpperCase();
        if(levelsScope.get(level).containsKey(id))
            return true; 
        else
            return false;
    }
    public Integer getscopeAtual() {
        return scopeAtual;
    }
}