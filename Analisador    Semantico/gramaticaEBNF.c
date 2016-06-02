Regras de JASON em EBNF

Programa e Bloco
1.  Program ::= Header DeclSec Block
2.  Header ::= program identifier ;
3.  Block ::= begin Statements end

Declarações
4.  DeclSec ::= TypeDeclSec VarDeclSec SubProgramDecls
5.  TypeDeclSec ::= [types TypeDecls]
6.  TypeDecls ::= TypeDecl+
7.  TypeDecl ::= identifier TypeSpecification
8.  TypeSpecification ::= (ArraySpecification |  RecordSpecification)
9.  ArraySpecification ::= array DataType “[“numericliteral”]”;
10. RecordSpecification ::= record VarDecls end;
11. VarDeclSec ::= [variables VarDecls]
12. VarDecls ::= (VarDecl)+
13. VarDecl ::= DataType IdList ;
14. DataType ::= (real | integer | identifier | string)
15. IdList ::= identifier {, identifier}
16. SubProgramDecls ::= (SubProgramDecl)*
17. SubProgramDecl ::= (ProcDecl | FunctionDecl)
18. ProcDecl ::= ProcHeader SubProgramDeclSec Block;
19. ProcHeader ::= procedure identifier ;
20. SubProgramDeclSec ::= ParamDeclSec DeclSec
21. ParamDeclSec ::= [parameter ParamDecls]
22. ParamDecls ::= (ParamDecl)+
23. ParamDecl ::= (DataType identifier; | var DataType identifier;)
24. FunctionDecl ::= FunctionHeader SubProgramDeclSec FunctionBlock ;
25. FunctionHeader ::= function identifier returns Datatype ;
26. FunctionBlock ::= begin SpecialStatements end  

Comandos
27. Statements ::= Statement {; Statement}
28. SpecialStatements ::= Statement; {Statement} ReturnStatement 
29. Statement ::= [(read identifier Variable | set identifier Variable = Expresion
| write identifier Variable
| if Condition then Statements ElseClause
| while Condition do Statements endwhile
| until Condition do Statements enduntil
| call identifier ArgList)]
30. ElseClause ::= (else Statements endif | endif)
31. ReturnStatement ::= return “(“ Condition “)”
32. ArgList ::= [“(“ Arguments “)”]
33. ArgListSpecial ::= “(“ Arguments “)” 
34. Arguments ::= Argument {, Argument}

Expressões
35. Condition ::= CompoundCondition {\ CompoundCondition}
36. CompoundCondition ::= SimpleCondition {& SimpleCondition}
37. SimpleCondition ::= Expression [RelOp Expression]
38. Expression ::= Term {AddOp Term}
39. Term ::= Unary {MultOp Unary}
40. Unary ::= [+ | -] Factor
41. Factor ::= [~](identifier (ArgListSpecial | Variable) | numericliteral | stringliteral| “(“Condition”)”)
42. Variable ::=[“[“ Expression “]”]{.identifier [“[“ Expression “]”]}
43. RelOp ::= (= | ! | > | < | <= | >=)
44. AddOp ::= (+ | -)
45. MultOp ::=  (* | /)
46. Argument ::= Condition
