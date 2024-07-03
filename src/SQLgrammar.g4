grammar SQLgrammar;

@header{
package sql;
}

//reglas lexer

INT: [0-9]+; //numeros
ID: [a-zA-Z_][a-zA-Z_0-9]*;
STRING: '\'' .*? '\'';
WS : [ \t\n\r]+ -> skip; //ignorar saltos de espacio

//reglas parser

sql : declaracion ';' EOF; //nos dice que una consulta sql puede ser una declaracion

declaracion: seleccion | eliminacion | insercion | actualizacion | createTable | dropTable | alterTable | createIndex | createConstraint |
             createView | createProcedure | callProcedure; //una declaracion puede ser varias cosas

columnas : ID (',' ID)*; // una lista de IDs

valores : expresion (',' expresion)*;

asignaciones: ID '=' expresion (',' ID '=' expresion)*;

comparacion : '=' | '<' | '>' | '>=' | '<=' | '!=';

condicion : expresion comparacion expresion;

expresion : INT | ID | STRING;

seleccion : 'SELECT' ('*' | columnas) 'FROM' ID (where)? (orderby)?;

where: 'WHERE' condicion;

orderby : 'ORDER' 'BY' ID ('ASC'|'DESC')?;

eliminacion : 'DELETE' 'FROM' ID (where)?;

insercion : 'INSERT' 'INTO' ID '(' columnas ')' 'VALUES' '(' valores ')';

actualizacion : 'UPDATE' ID 'SET' asignaciones (where)?;

createTable: 'CREATE' 'TABLE' ID '(' columna (',' columna)* (',' restriccion)* ')';

restriccion: 'PRIMARY' 'KEY' '(' ID ')' | 'FOREIGN' 'KEY' '(' ID ')' 'REFERENCES' ID '(' ID ')' | 'UNIQUE' '(' ID ')';

columna: ID tipoDato (restriccionColumna)*;

restriccionColumna: 'NOT' 'NULL' | 'PRIMARY' 'KEY' | 'AUTO_INCREMENT';

tipoDato: 'INT' | 'VARCHAR' '(' INT ')' | 'DECIMAL' '(' INT ',' INT ')' | 'DATE';

dropTable: 'DROP' 'TABLE' ID;

alterTable: 'ALTER' 'TABLE' ID alterAction;

alterAction: 'ADD' 'COLUMN' columna | 'MODIFY' 'COLUMN' columna | 'DROP' 'COLUMN' ID;

createIndex: 'CREATE' 'INDEX' ID 'ON' ID '(' ID ')';

createConstraint: 'ALTER' 'TABLE' ID 'ADD' 'CONSTRAINT' ID restriccion;

createView: 'CREATE' 'VIEW' ID 'AS' seleccion;

createProcedure: 'CREATE' 'PROCEDURE' ID '(' parametro (',' parametro)* ')' 'BEGIN' (declaracion)* 'END';

parametro: 'IN' ID tipoDato;

callProcedure: 'CALL' ID '(' expresion (',' expresion)* ')';

