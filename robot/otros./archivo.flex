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

";" 
{ 
	//RECONOCE EL SIMBOLO PUNTO Y COMA
	return new Symbol(sym.Semi); 
}
"INICIO"
{
	//RECONOCE EL INICIO DEL ROBOT
	return new Symbol(sym.Inicio);
}
"AVANZA"
{
	//RECONOCE EL AVANZE DEL ROBOT
	return new Symbol(sym.Avanza); 
}
"GLEFT" 
{
	//RECONOCE EL GIRO IZQUIERDO DEL ROBOT
	return new Symbol(sym.GLeft); 
}
"GRIGHT" 
{ 
	//RECONOCE EL GIRO DERECHO DEL ROBOT
	return new Symbol(sym.GRight); 
}
"ACTIVA"
{
	//RECONOCE EL ENCENDIDO DEL LED DEL ROBOT
	return new Symbol(sym.Activa); 
}
"FIN"
{
	//RECONOCE EL DIN DE LA ACCION DEL ROBOT
	return new Symbol(sym.Fin); 
}
"(" 
{
	//RECONOCE EL PARENTESIS DE APERTURA
	return new Symbol(sym.LPAREN); 
}
")" 
{
	//RECONOCE EL SIMBOLO PARENTESIS DE CIERRE
	return new Symbol(sym.RPAREN);
}
[0-9]+
{
	//RECONOCE LOS NUMEROS
	return new Symbol(sym.NUMBER, new Integer(yytext()));
}
[\b|\t|\r|\n|\f]+
{
	/* Código para ignorar espacios en blanco, tab, return,
	salto de línea, salto de página*/
	System.out.println(yytext()); 
}
[^] 
{
	/* Error */
	System.out.println("Caracter Ilegal: <"+yytext()+">"); 
}
/*copiar carpeta java_cup
jflex nombre.flex

java java_cup.Main sintactico.cup 
                 El cual genera los archivos parser.java sym.jav

javac –d . parser.java sym.java Scanner.java 
               El cual genera la carpeta Example, con los archivos CUP$parser   
               $actions.class parser.class Scanner.class sym.class*/