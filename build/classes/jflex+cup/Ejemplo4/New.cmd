@echo off
jflex lexico.flex && java java_cup.Main sintactico.cup && javac -d . parser.java sym.java Scanner.java && java Example/parser Document.txt && pause