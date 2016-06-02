options 
{
IGNORE_CASE = true ;
} 
PARSER_BEGIN(Tester)
import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import jdk.nashorn.internal.parser.Token;
public class Tester {

	public final static tabelaSimbolos ts = new tabelaSimbolos();
	public  static ArrayList<String> palavrasReservadas = new ArrayList<String>();
	public  static ArrayList<String> tipoPrimitivo = new ArrayList<String>();

	public static boolean isInteger(String str){
		try {
        	Integer.parseInt(str);
        	return true;
    	} catch (NumberFormatException nfe) {}
    	return false;
	}
	public static boolean isReal(String str){
		try {
        	Double.parseDouble(str);
        	return true;
    	} catch (NumberFormatException nfe) {}
    	return false;

	}
	public static boolean isString(String str){
		if(str.charAt(0) == '\'')
			return true;
		return false;
	}

	/*static public void main(String args[]) {
	try*/
		{
			palavrasReservadas.add("array");palavrasReservadas.add("endwhile");palavrasReservadas.add("program");
			palavrasReservadas.add("begin");palavrasReservadas.add("function");palavrasReservadas.add("read");
			palavrasReservadas.add("then");palavrasReservadas.add("call");palavrasReservadas.add("if");
			palavrasReservadas.add("types");palavrasReservadas.add("do");palavrasReservadas.add("record");
			palavrasReservadas.add("until");palavrasReservadas.add("else");palavrasReservadas.add("parameterS");
			palavrasReservadas.add("return");palavrasReservadas.add("variables");palavrasReservadas.add("end");
			palavrasReservadas.add("set");palavrasReservadas.add("while");palavrasReservadas.add("endif");
			palavrasReservadas.add("procedure");palavrasReservadas.add("write");palavrasReservadas.add("enduntil");
			palavrasReservadas.add("returns");palavrasReservadas.add("var");

                        tipoPrimitivo.add("real");dataType.add("integer");dataType.add("string");
			Tester analizador = new Tester( System.in ) ;
			analizador.Program();
			System.out.println("Compilado com exito!");
		}/*
		catch(ParseException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Analisador: Encontrou erros durante a analise!");
		}
	}
}*/
PARSER_END(Tester)


TOKEN: // PALAVRAS CHAVE //
{
	<ARRAY: "array">
	| <ENDWHILE: "endwhile">
	| <PROGRAM: "program">
	| <BEGIN: "begin">
	| <FUNCTION: "function">
	| <READ: "read">
	| <THEN: "then">
	| <CALL: "call">
	| <IF: "if">
	| <REAL: "real">
	| <TYPES: "types">
	| <DO: "do">
	| <INTEGER: "integer">
	| <RECORD: "record">
	| <UNTIL: "until">
	| <ELSE: "else">
	| <PARAMETERS: "parameterS">
	| <RETURN: "return">
	| <VARIABLES: "variables">
	| <END: "end">
	| <SET: "set">
	| <WHILE: "while">
	| <ENDIF: "endif">
	| <PROCEDURE: "procedure">
	| <STRING: "string">
	| <WRITE: "write">
	| <ENDUNTIL: "enduntil">
	| <RETURNS: "returns">
	| <VAR: "var">
}

TOKEN : // OPERADORES //
{ 
	<ADD : "+">
	| <SUB : "-">
	| <MULT : "*">
	| <DIV : "/">
	| <IGUAL : "=">
	| <MENOR : "<">
	| <MAIOR : ">">
	| <DIFERENTE : "!">
	| <MENORIGUAL : "<=">
	| <MAIORIGUAL : ">=">
}

TOKEN : /* NUMEROS */
{
	<INTEIRO : "0" | ["1"-"9"](<DIGITO>){0,4}>
	| <FLOAT : (<INTEIRO>)("."(<INTEIRO>))? | ((<INTEIRO>)".") | ("."(<INTEIRO>))>
	| <DIGITO : ["0"-"9"]> 
}
TOKEN : /* LITERAIS */
{
	<IDENTIFIER : ["a"-"z","A"-"Z"](["a"-"z","0"-"9","A"-"Z","_"]){0,16}>
| <CADEIA : ("'"|"\"")["a"-"z","A"-"Z","0"-"9","!","#","$","%","&","(",")","*","+","-",".","/",":",";","<","=",">","?","`","|","~"](["a"-"z","A"-"Z","0"-"9","!","#","$","%","&","(",")","*","+","-",".","/",":",";","<","=",">","?","`","|","~"," "])*("'"|"\"")>
}
/*
TOKEN : //NUMEROS 
{
	<NUMERO: <INTEIRO> | <FLOAT>>
	| <INTEIRO : "0" | ["1"-"9"](<DIGITO>)+> // 4 Bytes
	{ 
		String t = image.toString();
		long n=Integer.parseInt(t);
		if(n<-2147483648||n>2147483647)
			System.out.println("Erro semantico na linha "+input_stream.getBeginLine()+", coluna "+input_stream.getBeginColumn()+".\n\tRango do Interiro excedido : Overflow .");
	}
	| <FLOAT : (<INTEIRO>)("."(<INTEIRO>))? | ((<INTEIRO>)".") | ("."(<INTEIRO>))>
	{ 
		String[] strs = image.toString().split("\\.");
		if(strs[0].length() >9 || strs[1].length() > 9)
			System.out.println("Erro semantico na linha "+input_stream.getBeginLine()+", coluna "+input_stream.getBeginColumn()+".\n\tLimite do numero de digitos excedido na parte entera ou real da variable.");
	}	
	| <DIGITO : ["0"-"9"]> 
}
TOKEN : //LITERAIS 
{
	<IDENTIFIER : ["a"-"z","A"-"Z"](["a"-"z","0"-"9","A"-"Z","_"])+>//{0,16}
	{ 
		t = image.toString();
		if(t.length() > 16){
			System.out.println("Erro semantico na linha "+input_stream.getBeginLine()+", coluna "+input_stream.getBeginColumn()+".\n\tTamanho maximo para identificador excedido.");
		}
	}	
	| <CADEIA : ("'"|"\"")["a"-"z","A"-"Z","0"-"9","!","#","$","%","&","(",")","*","+","-",".","/",":",";","<","=",">","?","`","|","~"](["a"-"z","A"-"Z","0"-"9","!","#","$","%","&","(",")","*","+","-",".","/",":",";","<","=",">","?","`","|","~"," "])*("'"|"\"")>

}*/

TOKEN : // SYMBOLS //
{
	<PONTOVIRGULA: ";">
	|<VIRGULA: ",">
	|<ABREPAR: "(">
	|<FECPAR: ")">
	|<ABRECOL: "[">
	|<FECHACOL: "]">
	|<NAO: "~">
	|<DOT: ".">
	|<E: "&">
	|<OU: "\\">
}
SKIP :
{
	" " | "\r" | "\t" | "\n" 
}

/*
void Program():
{Token t;}
{
	(t = <ADD> 			{System.out.println("@("+t.beginLine+","+t.beginColumn+") ADD           - "+t.image);}
	| t = <SUB>			{System.out.println("@("+t.beginLine+","+t.beginColumn+") SUB           - "+t.image);}
	| t = <MULT>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") MULT          - "+t.image);}
	| t = <DIV>			{System.out.println("@("+t.beginLine+","+t.beginColumn+") DIV           - "+t.image);}
	| t = <IGUAL>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") IGUAL         - "+t.image);}
	| t = <MENOR>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") MENOR         - "+t.image);}
	| t = <MAIOR>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") MAIOR         - "+t.image);}
	| t = <DIFERENTE>	{System.out.println("@("+t.beginLine+","+t.beginColumn+") DIFERENTE     - "+t.image);}
	| t = <MENORIGUAL>	{System.out.println("@("+t.beginLine+","+t.beginColumn+") MENORIGUAL    - "+t.image);}
	| t = <MAIORIGUAL>	{System.out.println("@("+t.beginLine+","+t.beginColumn+") MAIORIGUAL    - "+t.image);}
	| t = <IDENTIFIER>	{System.out.println("@("+t.beginLine+","+t.beginColumn+") IDENTIFICADORR- "+t.image);}
	| t = <NUMERO>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") NUMERO        - "+t.image);}
	| t = <PONTOVIRGULA>{System.out.println("@("+t.beginLine+","+t.beginColumn+") PONTOVIRGULA  - "+t.image);}
	| t = <VIRGULA>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") VIRGULA       - "+t.image);}
	| t = <ABREPAR>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") ABREPAR       - "+t.image);}
	| t = <FECPAR>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") FECHAPAR      - "+t.image);}
	| t = <ABRECOL>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") ABRECOL       - "+t.image);}
	| t = <FECHACOL>	{System.out.println("@("+t.beginLine+","+t.beginColumn+") FECHACOL      - "+t.image);}
	| t = <NAO>			{System.out.println("@("+t.beginLine+","+t.beginColumn+") NAO           - "+t.image);}
	| t = <CADEIA>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") CADEIA        - "+t.image);}
	| t = <ARRAY>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") ARRAY         - "+t.image);}
	| t = <ENDWHILE>	{System.out.println("@("+t.beginLine+","+t.beginColumn+") ENDWHILE      - "+t.image);}
	| t = <PROGRAM>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") PROGRAM       - "+t.image);}
	| t = <BEGIN>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") BEGIN         - "+t.image);}
	| t = <FUNCTION>	{System.out.println("@("+t.beginLine+","+t.beginColumn+") FUNCTION      - "+t.image);}
	| t = <READ>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") READ          - "+t.image);}
	| t = <THEN>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") THEN          - "+t.image);}
	| t = <CALL>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") CALL          - "+t.image);}
	| t = <IF>			{System.out.println("@("+t.beginLine+","+t.beginColumn+") IF            - "+t.image);}
	| t = <REAL>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") REAL          - "+t.image);}
	| t = <TYPES>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") TYPES         - "+t.image);}
	| t = <DO>			{System.out.println("@("+t.beginLine+","+t.beginColumn+") DO            - "+t.image);}
	| t = <INTEGER>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") INTEGER       - "+t.image);}
	| t = <RECORD>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") RECORD        - "+t.image);}
	| t = <UNTIL>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") UNTIL         - "+t.image);}
	| t = <ELSE>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") ELSE          - "+t.image);}
	| t = <PARAMETERS>	{System.out.println("@("+t.beginLine+","+t.beginColumn+") PARAMETERS    - "+t.image);}
	| t = <RETURN>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") RETURN        - "+t.image);}
	| t = <VARIABLES>	{System.out.println("@("+t.beginLine+","+t.beginColumn+") VARIABLES     - "+t.image);}
	| t = <END>			{System.out.println("@("+t.beginLine+","+t.beginColumn+") END           - "+t.image);}
	| t = <SET>			{System.out.println("@("+t.beginLine+","+t.beginColumn+") SET           - "+t.image);}
	| t = <WHILE>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") WHILE         - "+t.image);}
	| t = <ENDIF>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") ENDIF         - "+t.image);}
	| t = <PROCEDURE>	{System.out.println("@("+t.beginLine+","+t.beginColumn+") PROCEDURE     - "+t.image);}
	| t = <STRING>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") STRING        - "+t.image);}
	| t = <WRITE>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") WRITE         - "+t.image);}
	| t = <ENDUNTIL>	{System.out.println("@("+t.beginLine+","+t.beginColumn+") ENDUNTIL      - "+t.image);}
	| t = <RETURNS>		{System.out.println("@("+t.beginLine+","+t.beginColumn+") RETURNS       - "+t.image);}
	| t = <VAR> 		{System.out.println("@("+t.beginLine+","+t.beginColumn+") VAR           - "+t.image);}
	| t = <DOT> 		{System.out.println("@("+t.beginLine+","+t.beginColumn+") DOT           - "+t.image);})*
}
*/


        
token Identifier(): // Genera el mensage de error cuando el id es una palabra reservada o ya existe (Usar solo para variables o nombres de funciones y proc)
{
    Token t;
}
{
    t = <IDENTIFIER>
    {
        String id = t.image.toString();
        if(palavrasReservadas.contains(id.toLowerCase())||tipoPrimitivo.contains(id.toLowerCase()))
            System.out.println("Erro semantico na linha "+t.beginLine+", coluna "+t.beginColumn+".\n\tO identifier nao pode ser uma palavra reservada!");
        else if(ts.existType(id))
            System.out.println("Erro semantico na linha "+t.beginLine+", coluna "+t.beginColumn+".\n\t Identifier "+t.image.toString()+" nao pode ser um dataType!!!..");
        else if(ts.existId(id))
            System.out.println("Erro semantico na linha "+t.beginLine+", coluna "+t.beginColumn+".\n\tVariavel "+t.image.toString()+" ja foi definido.");
        return t;
    }          
}
    
//Programa e Bloco

//1.  Program ::= Header DeclSec Block
void Program():
{}
{
	Header() DeclSec() Block() <DOT>
	{
		ts.removeLevelScope();
	}
}

//2.  Header ::= program identifier ;
void Header():
{
    Token t;
}
{
    <PROGRAM>
    t = <IDENTIFIER>
    {
        String id = t.image.toString();
	if(!palavrasReservadas.contains(id.toLowerCase())&&!tipoPrimitivo.contains(id.toLowerCase()))
        {
            ts.addDescritor(id,"PROGRAM");
	}
	else
            System.out.println("Erro semantico na linha "+t.beginLine+", coluna "+t.beginColumn+".\n\tO identifier nao pode ser uma palavra reservada!");
    }     
    <PONTOVIRGULA>	
}

//3.  Block ::= begin Statements end
void Block():
{}
{
    <BEGIN> Statements() <END>
}

//Declarações//

//4.  DeclSec ::= TypeDeclSec VarDeclSec SubProgramDecls
void DeclSec():
{}
{
	TypeDeclSec() VarDeclSec() SubProgramDecls()
}

//5.  TypeDeclSec ::= [types TypeDecls]
void TypeDeclSec():
{}
{
	[<TYPES> TypeDecls()]
}

//6.  TypeDecls ::= TypeDecl+
void TypeDecls():
{}
{
	(TypeDecl())+
}

//7.  TypeDecl ::= identifier TypeSpecification
void TypeDecl():
{
	Token t;
}
{
	t=Identifier()
	{
		String idTipo=t.image.toString();
		if(!palavrasReservadas.contains(idTipo.toLowerCase())&&!tipoPrimitivo.contains(idTipo.toLowerCase()))
			if(!ts.addDescritor(idTipo,"TYPE"))
				System.out.println("Erro semantico na linha "+t.beginLine+", coluna "+t.beginColumn+".\n\tO Tipo "+t.image.toString()+" ja foi definido nesse contexto.");
	}
	TypeSpecification(idTipo)
}

//8.  TypeSpecification ::= (ArraySpecification |  RecordSpecification)
void TypeSpecification(String idTipo):
{}
{
	(ArraySpecification(idTipo) | RecordSpecification(idTipo))
}

//9.  ArraySpecification ::= array DataType “[“numericliteral”]”;
void ArraySpecification(String idArray)://///////////////////////////WARDIOLA :V
{
	Token t;
}
{
	<ARRAY>
	t = DataType()
	{
            if(ts.existId(idArray))//Verifica si el id existe en el escopo actual
            {              
                Descritor desIdArray = ts.searchScopeAtual(idArray);
                if(desIdArray.getRotulo().compareToIgnoreCase("TYPE")==0)// Verifica si es un Type 
                {
                    if(idArray.compareToIgnoreCase(t.image.toString())==0)	
                        System.out.println("Erro semantico na linha "+t.beginLine+", coluna "+t.beginColumn+".\n\t O DataType: " +t.image.toString()+" precisa  ser diferente ao identifier.");
                    else 
                    { 	
                        desIdArray.getCategoria().set("ELEMTYPE","ARRAY");		
                        Descritor dataTipo = ts.initDataType(t.image.toString());			
                        ((ArrayTipo)((Tipo)desIdArray.getCategoria()).get("ELEMTYPE")).set("ELEMTYPE",dataTipo);				
                    }
                }
            }
	}
	<ABRECOL>
	t = <INTEIRO>//INTEIRO
	{		
		if(!isInteger(t.image.toString()))
			System.out.println("Erro semantico na linha "+t.beginLine+", coluna "+t.beginColumn+".\n\t O indice nao é um inteiro: "+t.image.toString());
		else
                {
                    int size = Integer.parseInt(t.image.toString());
                    if(size>0)
                        ((ArrayTipo)((Tipo)desArrayTipo.getCategoria()).get("ELEMTYPE")).set("SIZE",size);            
                    else
                        System.out.println("Erro semantico na linha "+t.beginLine+", coluna "+t.beginColumn+".\n\t O indice nao pode ser negativog: "+t.image.toString());
                }
	}
	<FECHACOL>
	<PONTOVIRGULA>
}

//10. RecordSpecification ::= record VarDecls end;
void RecordSpecification(String idRecord):
{}
{
	{
            if(ts.existId(idRecord))//Verifica si el id existe en el escopo actual
            {              
 		Descritor desRecordTipo = ts.searchDataType(idRecord);
                if(desRecordTipo.getRotulo().compareToIgnoreCase("TYPE")==0)// Verifica si es un Type           
                    desRecordTipo.getCategoria().set("ELEMTYPE","RECORD");
            }
	}
	<RECORD>
	VarDecls(idRecord, true)
	<END> <PONTOVIRGULA>
}

//11. VarDeclSec ::= [variables VarDecls]
void VarDeclSec():
{}
{
	[<VARIABLES> VarDecls("",false)]
}

//12. VarDecls ::= (VarDecl)+
void VarDecls(String idTipo, boolean origenRecord):
{}
{
	(VarDecl(idTipo, origenRecord))+
}

//13. VarDecl ::= DataType IdList ;
void VarDecl(String idTipo, boolean origenRecord):
{ 
	Token t;
}
{
	t = DataType()
	IdList(idTipo, t, origenRecord) 
	<PONTOVIRGULA>
}

//14. DataType ::= (real | integer | identifier | string)
Token DataType():
{
	Token t;
}
{
	(t = <REAL>
	|t = <INTEGER>
	|t = <IDENTIFIER>
	{
		if(!ts.existType(t.image.toString()))
		{
			System.out.println("Erro semantico na linha: "+t.beginLine+", coluna: "+t.beginColumn+".\n\tTipo "+t.image.toString()+" nao esta definido.");
		}
	}
	|t= <STRING>
	)
	{
		return t;
	}
}

//15. IdList ::= identifier {, identifier}
void IdList(String idTipo, Token dataT, boolean origenRecord):
{
	Token t;
}
{
	t=Identifier()
	{
		addRecordData(idTipo,dataT, t, origenRecord);
	}
	(
	<VIRGULA>
	t=Identifier()
	{
		addRecordData(idTipo,dataT, t, origenRecord);
	}
	)*
}

//Java Code
void addRecordData(String idTipo,Token dataT, Token id, boolean origenRecord):
{}
{	//Java code
	{	
		if(origenRecord)//TYPERECORD
		{
                    if(ts.existId(idTipo))//Verifica si el id existe en el escopo actual       
                    {
                        Descritor desIdTipo = ts.searchScopeAtual(idTipo);
                        if(desIdTipo.getRotulo().compareToIgnoreCase("TYPE")==0)// Verifica si es un Type           				
                            if(ts.existType(dataT.image.toString()))
                            {
				Descritor dataTipo = ts.initDataType(dataT.image.toString());
				if(!palavrasReservadas.contains(id.image.toString())&&!ts.existType(id.image.toString()))
				{
					boolean result =((RecordTipo)((Tipo)desIdTipo.getCategoria()).get("ELEMTYPE")).set(id.image.toString(),dataTipo);
					if(!result)
						System.out.println("Erro semantico na linha "+id.beginLine+", coluna "+id.beginColumn+".\n\tIdentificador "+id.image.toString()+" ja foi definido.");	
				}				
                            }
                    }
		}
		else //VARIABLES
		{
                    if(ts.existType(dataT.image.toString())&&!ts.existId(id.image.toString())
                            &&!palavrasReservadas.contains(id.image.toString().toLowerCase())
                            &&!ts.existType(id.image.toString()))//Solo si existe dataType y el id no fue definido en el mismo escopo
                    {
			Descritor dataTipo = ts.initDataType(dataT.image.toString());
			if(ts.addDescritor(id.image.toString(),"VARIABLE"))
                            ((Variavel)ts.searchVariable(id.image.toString()).getCategoria()).set("ELEMTYPE",dataTipo);		
                    }
		}
	}
}

//16. SubProgramDecls ::= (SubProgramDecl)*
void SubProgramDecls():
{}
{
	(SubProgramDecl())*
}

//17. SubProgramDecl ::= (ProcDecl | FunctionDecl)
void SubProgramDecl():
{}
{
	(ProcDecl() | FunctionDecl())
	{
		ts.removeLevelScope();
	}
}

//18. ProcDecl ::= ProcHeader SubProgramDeclSec Block;
void ProcDecl():
{
	String nameP;
}
{
	nameP=ProcHeader() SubProgramDeclSec(nameP) Block() <PONTOVIRGULA>
}

//19. ProcHeader ::= procedure identifier ;
String ProcHeader():
{
	Token t;
}
{
	<PROCEDURE> 
	t=Identifier()
	<PONTOVIRGULA>
	{
		String nameP = t.image.toString();
		ts.addDescritor(nameP, "PROCEDURE");
		ts.addLevelScope();
		return nameP;
	}
}

//20. SubProgramDeclSec ::= ParamDeclSec DeclSec
void SubProgramDeclSec(String nameSubPrograma):
{
	int nParametros=0;
}
{
	nParametros=ParamDeclSec() 
	{
  		if(ts.searchId(ts.getscopeAtual()-1,nameSubPrograma))    
                {
                    String subProg = ts.search(ts.getscopeAtual()-1,nameSubPrograma).getRotulo();
                    if(subProg.compareTo("FUNCTION")==0||subProg.compareTo("PROCEDURE")==0)       
                        ts.search(ts.getscopeAtual()-1, nameSubPrograma).getCategoria().set("NPARAMS", nParametros);
                }
	}
	DeclSec()
}

//21. ParamDeclSec ::= [parameter ParamDecls]
int ParamDeclSec():
{
	int nParametros=0;
}
{
	[<PARAMETERS> nParametros=ParamDecls()]
	{
		return nParametros;
	}
}

//22. ParamDecls ::= (ParamDecl)+
int ParamDecls():
{
	int nParametros=0;
}
{
	(ParamDecl(nParametros))+
	{
		return nParametros;
	}
}

//23. ParamDecl ::= [var]DataType identifier;
int ParamDecl(int nParametros):
{
	String classParam="VALUE";
	Token dataT;
	Token id;
}
{ 
	[
	<VAR>
	{
		classParam = "REFERENCE";
	}
	] 
	dataT=DataType()	
	id=Identifier();
	<PONTOVIRGULA>
	{
                if(!palavrasReservadas.contains(id.toLowerCase())&&!ts.existType(id)&&!ts.existId(id)&&ts.existType(dataT.image.toString()))
		{       
                        ts.addDescritor(id.image.toString(), "PARAM");
			Descritor descParam = ts.searchScopeAtual(id.image.toString());
			((Parametro)descParam.getCategoria()).set("ELEMTYPE", ts.initDataType(dataT.image.toString()));
			((Parametro)descParam.getCategoria()).set("TCLASS", classParam);
		}
		return nParametros+1;
	}	
}

//24. FunctionDecl ::= FunctionHeader SubProgramDeclSec FunctionBlock ;
void FunctionDecl():
{
	String nameF;
}
{
	nameF=FunctionHeader() SubProgramDeclSec(nameF) FunctionBlock() <PONTOVIRGULA>
}

//25. FunctionHeader ::= function identifier returns Datatype ;
String FunctionHeader():
{
	Token id;
	Token tipoR;	
}
{
	<FUNCTION> id= Identifier() <RETURNS> tipoR=DataType() <PONTOVIRGULA>
	{
		String nameF = id.image.toString();
		ts.addDescritor(nameF, "FUNCTION");
		if(ts.existId(nameF))
                {       
                    if(ts.searchScopeAtual(nameF).getRotulo().compareTo("FUNCTION")==0&&ts.existType(tipoR.image.toString()))
                    {
			((Function)ts.searchScopeAtual(nameF).getCategoria()).set("RTYPE", ts.initDataType(tipoR.image.toString()));
                    }
                }
		ts.addLevelScope();
		return nameF;
	}
}

//26. FunctionBlock ::= begin SpecialStatements end  
void FunctionBlock():
{}
{
	<BEGIN> SpecialStatements() <END>
}

//Comandos //

//27. Statements ::= Statement {; Statement}
void Statements():
{}
{
	Statement()(<PONTOVIRGULA> Statement())*
}

//28. SpecialStatements ::= Statement; {Statement} ReturnStatement 
void SpecialStatements():
{}
{
	(Statement()<PONTOVIRGULA>)+ReturnStatement()
}

/*29. Statement ::= [(read  Variable | set  Variable = Expresion
| write  Variable
| if Condition then Statements ElseClause
| while Condition do Statements endwhile
| until Condition do Statements enduntil
| call identifier ArgList)]*/
void Statement():
{
	Token t;
	String id;
}
{ 
	[(<READ> t = <IDENTIFIER> Variable()
	{
		id = t.image.toString();
		if(!ts.existId(id))
			if(!ts.existGlobalId(id))
				System.out.println("Erro semantico na linha "+t.beginLine+", coluna "+t.beginColumn+".\n\tIdentificador não definido.");
	}
	| <SET> t = <IDENTIFIER> Variable() <IGUAL> Expression(t)
	{
		id = t.image.toString();
		if(!ts.existId(id))
			if(!ts.existGlobalId(id))
				System.out.println("Erro semantico na linha "+t.beginLine+", coluna "+t.beginColumn+".\n\tIdentificador não definido.");
	}
	| <WRITE> t = <IDENTIFIER> Variable()
	{
		id = t.image.toString();
		if(!ts.existId(id))
			if(!ts.existGlobalId(id))
				System.out.println("Erro semantico na linha "+t.beginLine+", coluna "+t.beginColumn+".\n\tIdentificador não definido.");
	}
	| <IF> Condition() <THEN> Statements() ElseClause()
	| <WHILE> Condition() <DO> Statements() <ENDWHILE>
	| <UNTIL> Condition() <DO> Statements() <ENDUNTIL>
	| <CALL> t = <IDENTIFIER> ArgList()
	{
		id = t.image.toString();
		if(!ts.existId(id))
			if(!ts.existGlobalId(id))
				System.out.println("Erro semantico na linha "+t.beginLine+", coluna "+t.beginColumn+".\n\tIdentificador não definido.");
	}
	)]
}

//30. ElseClause ::= (else Statements endif | endif
void ElseClause():
{}
{
	(<ELSE> Statements() <ENDIF> | <ENDIF>)
}

//31. ReturnStatement ::= return “(“ Condition “)”
void ReturnStatement():
{}
{
	<RETURN> <ABREPAR> Condition() <FECPAR>
}

//32. ArgList ::= [“(“ Arguments “)”]
void ArgList():
{}
{
	[<ABREPAR> Arguments() <FECPAR>]
}

//33. ArgListSpecial ::= “(“ Arguments “)” 
void ArgListSpecial():
{}
{
	<ABREPAR> Arguments() <FECPAR>
}

//34. Arguments ::= Argument {, Argument}
void Arguments():
{}
{
    Argument() (<VIRGULA> Argument())*
}

//Expressões//

//35. Condition ::= CompoundCondition {\ CompoundCondition}
void Condition():
{}
{
    CompoundCondition() (<OU> CompoundCondition())*
}

//36. CompoundCondition ::= SimpleCondition {& SimpleCondition}
void CompoundCondition():
{}
{
    SimpleCondition() (<E> SimpleCondition())*
}

//37. SimpleCondition ::= Expression [RelOp Expression]
void SimpleCondition():
{}
{
    Expression(null) [RelOp() Expression(null)]
}

//38. Expression ::= Term {AddOp Term}
Token Expression(Token t0):
{
	Token t1, t2;
	String op, tipo = "", tipo1, tipo2;
	if(t0 != null){
		tipo = ((Descritor)(ts.searchDataType(t0.image.toString())).getCategoria().get("ELEMTYPE")).getRotulo();
	}
}
{
	t1 = Term(t0)
	{
		if(isInteger(t1.image.toString()))
			tipo1 = "INTEGER";
		else if(isReal(t1.image.toString()))
			tipo1 = "REAL";
		else if(isString(t1.image.toString()))
			tipo1 = "STRING";
		else
			tipo1 = (ts.searchDataType(t1.image.toString())).getRotulo();
	}
	(op = AddOp()
	t2 = Term(t0)
	{
		if(t0 != null){
			if(isInteger(t2.image.toString()))
				tipo2 = "INTEGER";
			else if(isReal(t2.image.toString()))
				tipo2 = "REAL";
			else if(isString(t2.image.toString()))
				tipo2 = "STRING";
			else
				tipo2 = (ts.searchDataType(t2.image.toString())).getRotulo();
		   	if(op.compareTo("+")==0 || op.compareTo("-")==0){
		   		if(tipo1.compareTo(tipo2)==0)
		   			t1 = t1;
		   		else if(tipo1.compareTo("INTEGER")==0 && tipo2.compareTo("REAL")==0)
		   			t1 = t2;
		   		else if(tipo1.compareTo("REAL")==0 && tipo2.compareTo("INTEGER")==0)
		   			t1 = t1;
		   		else {
		   			System.out.println("Erro semantico na linha: "+t1.beginLine+", coluna: "+t1.beginColumn+".\n\tTipos incompativeis. ("+tipo1+" "+op+" "+tipo2+")!");
		   		}
			}
		}
	}
	)*
	{
	   	if(tipo.compareTo(tipo1)==0)
	   		return t1;
	   	System.out.println("Erro semantico na linha: "+t0.beginLine+", coluna: "+t0.beginColumn+".\n\tTipos incompativeis. ("+tipo+" diferente de "+tipo1+")!");
	  	return t1;
	}
}

//39. Term ::= Unary {MultOp Unary}
Token Term(Token t0):
{
	Token t1, t2;
	String op, tipo = "", tipo1, tipo2;
	if(t0 != null){
		tipo = ((Descritor)(ts.searchDataType(t0.image.toString())).getCategoria().get("ELEMTYPE")).getRotulo();
	}
}
{
	t1 = Unary()
	{
		if(isInteger(t1.image.toString()))
			tipo1 = "INTEGER";
		else if(isReal(t1.image.toString()))
			tipo1 = "REAL";
		else if(isString(t1.image.toString()))
			tipo1 = "STRING";
		else
			tipo1 = (ts.searchDataType(t1.image.toString())).getRotulo();
	}
	(op = MultOp()
	t2 = Unary()
	{
		if(t0 != null){
			tipo2 = (ts.searchDataType(t2.image.toString())).getRotulo();
	    	if(op.compareTo("*")==0 || op.compareTo("/")==0){
	    		if(tipo1.compareTo(tipo2)==0)
	    			t1 = t1;
	    		else if(tipo1.compareTo("INTEGER")==0 && tipo2.compareTo("REAL")==0)
	    			t1 = t2;
	    		else if(tipo1.compareTo("REAL")==0 && tipo2.compareTo("INTEGER")==0)
	    			t1 = t1;
	    		else {
	    			System.out.println("Erro semantico na linha: "+t1.beginLine+", coluna: "+t1.beginColumn+".\n\tTipos incompativeis. ("+tipo1+" "+op+" "+tipo2+")!");
	    		}
	    	}
	    }
	}
	)*
	{
	   	if(tipo.compareTo(tipo1)==0)
	   		return t1;
	   	System.out.println("Erro semantico na linha: "+t0.beginLine+", coluna: "+t0.beginColumn+".\n\tTipos incompativeis. ("+tipo+" diferente de "+tipo1+")!");
	  	return t1;
	}
}

//40. Unary ::= [+ | -] Factor
Token Unary():
{
	Token t;
}
{
    [<ADD>|<SUB>]
    t = Factor()
    {
    	return t;
    }
}

//41. Factor ::= [~](identifier (ArgListSpecial | Variable) | numericliteral | stringliteral| “(“Condition”)”)
Token Factor():
{
	Token t;
}
{
	(t = <IDENTIFIER> (ArgListSpecial()
	{
		return t;
	}
	| Variable())
	|t = <INTEIRO>
	{
		return t;
	}
	|t = <FLOAT>
	{
		return t;
	}
	|t = <CADEIA>
	{
		return t;
	}
	| <ABREPAR> Condition() <FECPAR>
	| <NAO> Factor())
	{
		return null;
	}
}

//42. Variable ::=[“[“ Expression “]”]{.identifier [“[“ Expression “]”]}
void Variable():
{
	Token t;
}
{
    [<ABRECOL> t = Expression(null) <FECHACOL>
    {
    	if(((ts.searchDataType(t.image.toString())).getRotulo()).compareToIgnoreCase("INTEGER")!=0)
    		System.out.println("Erro semantico na linha: "+t.beginLine+", coluna: "+t.beginColumn+".\n\tIndice deve ser inteiro!");
    }
    ] (<DOT> (<IDENTIFIER> [<ABRECOL> Expression(null) <FECHACOL>]))*
}

//43. RelOp ::= (= | ! | > | < | <= | >=)
String RelOp():
{Token t;}
{
	(t = <IGUAL> |t =  <DIFERENTE> |t =  <MAIOR> |t =  <MENOR> |t =  <MENORIGUAL> |t =  <MAIORIGUAL>)
	{
		return t.image.toString();
	}
}

//44. AddOp ::= (+ | -)
String AddOp():
{Token t;}
{
	(t = <ADD> | t = <SUB>)
	{
		return t.image.toString();
	}
}

//45. MultOp ::=  (* | /)
String MultOp():
{Token t;}
{
	(t = <MULT> | t = <DIV>)
	{
		return t.image.toString();
	}
}

//46. Argument ::= Condition
void Argument():
{}
{
	Condition()
}


//THIS PART READ COMMENTS

SKIP:
{
	"{": ComentarioBloco
}
<ComentarioBloco> SKIP:
{
	"}": DEFAULT
}
<ComentarioBloco> MORE:
{
<~ [ ] >
}
SKIP:
{
	"--": ComentarioLinha
}
<ComentarioLinha> SKIP:
{
	"\n": DEFAULT
}
<ComentarioLinha> MORE:
{
<~ [ ] >
}

}//////
