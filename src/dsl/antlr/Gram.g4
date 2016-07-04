grammar Gram;
file : logo backGround player enemy bullet ;

logo : objectName Separator fileName LineBreak;

backGround : objectName Separator fileName LineBreak;

player : objectName Separator fileName Separator nubmerLine Separator numberColumn Separator objectWidth
         Separator objectHeight LineBreak;

enemy : objectName Separator fileName Separator nubmerLine Separator numberColumn Separator objectWidth
        Separator objectHeight Separator movingType Separator speed Separator offense Separator
        defence Separator probability LineBreak;

bullet : objectName Separator fileName Separator nubmerLine Separator numberColumn Separator objectWidth
         Separator objectHeight EOF;

objectName   : LETTERS;
fileName     : LETTERS '.' LETTERS;
nubmerLine   : DIGIT;
numberColumn : DIGIT;
objectWidth  : DIGIT+;
objectHeight : DIGIT+;
movingType   : Type;
speed        : DIGIT;
offense      : DIGIT;
defence      : DIGIT;
probability  : DIGIT;

Type     : (ZIGZAG | VERTICAL | CONTINUE);
LETTERS  : ('a'..'z')+;
DIGIT    : ('0'..'9');
ZIGZAG   : 'zigzag';
VERTICAL : 'vertical';
CONTINUE : 'continue';

LineBreak : '\r'?'\n' |'\r' ;
Separator : ';' ;