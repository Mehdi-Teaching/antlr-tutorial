grammar Math;

math: expression EOF;

expression: number | expression operator expression | '(' expression ')';

number: NUMBER | SPECIAL;

operator: OPERATOR;

NUMBER: [0-9]+;

OPERATOR: ('+'|'-'|'/'|'^'|'*');

SPECIAL: ('e'|'pi');

WHITESPACE: [ \t\r\f]+ -> skip;