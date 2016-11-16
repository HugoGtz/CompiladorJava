package tareaunolexico;
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

";" { //RECONOCE EL SIMBOLO PUNTO Y COMA
return new Symbol(sym.SEMI); }
/* MANEJO DE LAS PALABRAS RESERVADAS*/
"Inicio" {System.out.print("Inicio"); return new Symbol(sym.Inicioo); }
"Avanza" {System.out.print("Avanza"); return new Symbol(sym.Avanzaa); }
"GDerecha" {System.out.print("GDerecha"); return new Symbol(sym.GD); }
"GIzquierda" {System.out.print("GIzquierda"); return new Symbol(sym.GI); }
"Fin" {System.out.print("Fin"); return new Symbol(sym.Finn); }
"Activo" {System.out.print("Activo"); return new Symbol(sym.ACTIVO }
"(" {//RECONOCE EL PARENTESIS DE APERTURA
return new Symbol(sym.LPAREN); }
")" {//RECONOCE EL SIMBOLO PARENTESIS DE CIERRE
return new Symbol(sym.RPAREN); }
[0-9]+ {//RECONOCE LOS NUMEROS
System.out.print(" Numero ");
return new Symbol(sym.NUMBER, new Integer(yytext()));
}
[\b|\t|\r|\n|\f]+ {/* Código para ignorar espacios en blanco, tab, return,
salto de línea, salto de página*/
System.out.println(yytext()); }
[^] {/* Error */
System.out.println("Caracter Ilegal: <"+yytext()+">"); }