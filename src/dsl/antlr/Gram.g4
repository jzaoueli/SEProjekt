grammar Gram;
file : backgroundRow LineBreak playerRow;
backgroundRow : Name Separator FileName;
playerRow : Name Separator FileName Separator Line Separator Column Separator Width Separator Height EOF;
Name : ('a'..'z')+;
FileName : ('a'..'z' | '.')+;
Line : DIGIT;
Column : DIGIT;
Width : DIGIT+;
Height : DIGIT+;

DIGIT : ('0'..'9');

LineBreak : '\r'?'\n' |'\r' ;
Separator : ';' ;

/*
file : row* EOF ;
row : value (Separator value)* (LineBreak | EOF) ;
value : SimpleValue | QuotedValue ;
Separator : ',' | ';' ;
// line break maybe with preceding line feed
LineBreak : '\r'?'\n' | '\r';
// Anything but a line-breaking, separator or quoting character is allowed
SimpleValue : ~(','|';'|'\r'|'\n'|'"')+ ;
// Anything but a quoting character is allowed
QuotedValue : '"'('""'|~'"')*'"' ;
*/


/*
file : Row Row Row EOF ;
Row : Teil+ LineBreak;
FirstRow : Teil+ LineBreak;
BackGroundRow : FileName LineBreak;
PlayerRow : FileName Separator Line Separator Column Separator Width Separator Height;
FileName : [A-G];
Line : [1-3];
Column : [1-4];
Width : ('0'..'9')+;
Height : ('0'..'9')+;

Teil : (Name Separator);
Name : ('a'..'z' | '.')+;
LineBreak : '\r'?'\n' |'\r' ;
Separator : ';' ;
*/