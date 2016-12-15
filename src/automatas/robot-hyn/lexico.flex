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

"Inicio" { //RECONOCE EL INICIO
return new Symbol(sym.INIC, yyline, yycolumn, yytext());}

"Avanza" { //RECONOCE AVANZA
return new Symbol(sym.AVAN, yyline, yycolumn, yytext());}

"GDerecha" { //RECONOCE EL GIRO A LA DERECHA
return new Symbol(sym.GDE, yyline, yycolumn, yytext());}

"GIzquierda" { //RECONOCE EL GIRO A LA IZQUIERDA
return new Symbol(sym.GIZ, yyline, yycolumn, yytext());}

"Activa" { //RECONOCE ACTIVA
return new Symbol(sym.ACT, yyline, yycolumn, yytext());}

"Fin" { //RECONOCE EL FIN
return new Symbol(sym.TERM, yyline, yycolumn, yytext());}

";" { //RECONOCE EL SIMBOLO PUNTO Y COMA
return new Symbol(sym.SEMI, yyline, yycolumn, yytext());}

"(" {//RECONOCE EL PARENTESIS DE APERTURA
return new Symbol(sym.LPAREN, yyline, yycolumn, yytext());}

")" {//RECONOCE EL SIMBOLO PARENTESIS DE CIERRE
return new Symbol(sym.RPAREN, yyline, yycolumn, yytext());}

[0-9]+ {//RECONOCE LOS NUMEROS
return new Symbol(sym.NUMBER, yyline, yycolumn, new Integer(yytext()));}

[\b|\t|\r|\n|\f]+ {System.out.print(yytext());}/* Código para ignorar espacios en blanco, tab, return, salto de línea, salto de página*/

[^] {} /* Error */
