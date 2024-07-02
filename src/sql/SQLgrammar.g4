grammar SQLgrammar;

@header{
package sql;
}

//reglas lexer

INT: [0-9]+; //numeros
ID: [a-zA-Z_][a-zA-Z_0-9]*;
STRING: '\'' .*? '\'';
WS : [ \t\n\r]+ -> skip; //ignorar saltos de espacio
SEMICOLON: ';';

//reglas parser

sql : declaracion (EOF | SEMICOLON); //nos dice que una consulta sql puede ser una declaracion

declaracion: seleccion | eliminacion | insercion | actualizacion; //una declaracion puede ser varias cosas

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

