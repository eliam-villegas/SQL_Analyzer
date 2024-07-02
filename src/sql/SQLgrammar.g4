grammar SQLgrammar;

@header {
package sql;
}

// Reglas Lexer

INT: [0-9]+; // Números enteros
FLOAT: [0-9]+'.'[0-9]*; // Números de punto flotante
ID: [a-zA-Z_][a-zA-Z_0-9]*; // Identificadores
STRING: '\'' .*? '\''; // Cadenas de texto
WS: [ \t\n\r]+ -> skip; // Ignorar espacios en blanco
SEMICOLON: ';';

// Reglas Parser

sql: declaracion (EOF | SEMICOLON); // Una consulta SQL puede ser una declaración

declaracion:
    seleccion
    | eliminacion
    | insercion
    | actualizacion
    | creacionTabla
    | borradoTabla
    | creacionIndice
    | borradoIndice
    | definicionClave
    ; // Una declaración puede ser varias cosas

columnas: columnaAlias (',' columnaAlias)*; // Una lista de columnas con alias

columnaAlias: columna ('AS' ID)?; // Columna con alias opcional

columna: ID ('.' ID)?; // Columna con posible referencia a tabla

valores: expresion (',' expresion)*; // Una lista de expresiones

asignaciones: ID '=' expresion (',' ID '=' expresion)*; // Asignaciones en UPDATE

comparacion: '=' | '<' | '>' | '>=' | '<=' | '!=' | 'LIKE' | 'IN'; // Operadores de comparación

condicion: expresion comparacion expresion | expresion 'BETWEEN' expresion 'AND' expresion | '(' condicion ')'; // Condiciones en WHERE

expresion: INT | FLOAT | ID | STRING | columna | funcionAgregado | '(' seleccion ')'; // Expresiones (agregando funciones de agregado y subconsultas)

funcionAgregado: ('SUM' | 'AVG' | 'MIN' | 'MAX' | 'COUNT') '(' ('*' | columna) ')'; // Funciones de agregado

seleccion: 'SELECT' ('DISTINCT')? ('*' | columnas) 'FROM' tabla (aliasTabla)? (join)* (where)? (groupby)? (having)? (orderby)? (limit)?; // Consulta SELECT con más opciones

aliasTabla: 'AS'? ID; // Alias para tablas

tabla: ID; // Tabla

join: ('INNER' | 'LEFT' | 'RIGHT' | 'FULL')? 'JOIN' tabla (aliasTabla)? 'ON' condicion; // Soporte para JOIN

where: 'WHERE' condicion; // Cláusula WHERE

groupby: 'GROUP' 'BY' columnas; // Cláusula GROUP BY

having: 'HAVING' condicion; // Cláusula HAVING

orderby: 'ORDER' 'BY' columnas; // Cláusula ORDER BY

limit: 'LIMIT' INT; // Cláusula LIMIT

eliminacion: 'DELETE' 'FROM' tabla (where)?; // Consulta DELETE

insercion: 'INSERT' 'INTO' tabla '(' columnas ')' 'VALUES' '(' valores ')'; // Consulta INSERT

actualizacion: 'UPDATE' tabla 'SET' asignaciones (where)?; // Consulta UPDATE

creacionTabla: 'CREATE' 'TABLE' tabla '(' definicionColumna (',' definicionColumna)* (',' constraintTabla)? ')'; // Creación de tablas

borradoTabla: 'DROP' 'TABLE' tabla; // Borrado de tablas

creacionIndice: 'CREATE' 'INDEX' ID 'ON' tabla '(' columnas ')'; // Creación de índices

borradoIndice: 'DROP' 'INDEX' ID; // Borrado de índices

definicionClave: 'ALTER' 'TABLE' tabla 'ADD' constraint; // Definición de claves

definicionColumna: ID tipoDato (constraint)*; // Definición de columna en creación de tabla

tipoDato: 'INT' | 'FLOAT' | 'VARCHAR' '(' INT ')' | 'BOOLEAN'; // Tipos de datos

constraint: 'PRIMARY' 'KEY' | 'NOT' 'NULL' | 'UNIQUE' | 'CHECK' '(' condicion ')' | 'FOREIGN' 'KEY' '(' ID ')' 'REFERENCES' tabla '(' ID ')'; // Restricciones de columna

constraintTabla: 'PRIMARY' 'KEY' '(' columnas ')' | 'FOREIGN' 'KEY' '(' columnas ')' 'REFERENCES' tabla '(' columnas ')'; // Restricciones a nivel de tabla
