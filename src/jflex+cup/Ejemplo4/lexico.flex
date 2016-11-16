package Example;
import java_cup.runtime.Symbol;
%%
%public
%class Scanner
%standalone
%unicode
%cup
%line
%column
%%

"INICIA" { //RECONOCE EL INICIO
return new Symbol(sym.INIC);}

"AVANZA" { //RECONOCE AVANZA
return new Symbol(sym.AVAN);}

"GDERECHA" { //RECONOCE EL GIRO A LA DERECHA
return new Symbol(sym.GDE);}

"GIZQUIERDA" { //RECONOCE EL GIRO A LA IZQUIERDA
return new Symbol(sym.GIZ);}

"ACTIVA" { //RECONOCE ACTIVA
return new Symbol(sym.ACT);}

"FIN" { //RECONOCE EL FIN
return new Symbol(sym.TERM);}

";" { //RECONOCE EL SIMBOLO PUNTO Y COMA
return new Symbol(sym.SEMI);}
"(" {//RECONOCE EL PARENTESIS DE APERTURA
return new Symbol(sym.LPAREN); }
")" {//RECONOCE EL SIMBOLO PARENTESIS DE CIERRE
return new Symbol(sym.RPAREN); }
[0-9]+ {//RECONOCE LOS NUMEROS
//System.out.print(" Número ");
return new Symbol(sym.NUMBER, new Integer(yytext())); }
[\b|\t|\r|\n|\f]+ {/* Código para ignorar espacios en blanco, tab, return, salto de línea, salto de página*/
System.out.println(yytext()); }
[^] {/* Error */
System.out.println("Caracter Ilegal: <"+yytext()+">");}
