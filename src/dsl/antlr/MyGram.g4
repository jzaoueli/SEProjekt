grammar MyGram;

gram : images bullet enemy EOF;

images : 'image' logo background player;

logo : 'ImageLogo' '{' imageObject '}';
background : 'ImageBackground' '{' imageObject '}';
player : 'ImagePlayer' '{' spriteObject '}';
bullet : 'BulletNormal' '{' spriteObject attack speed '}';
enemy : 'CommonAttackEnemy' '{' spriteObject movement attack defense speed probability '}';

spriteObject : imageObject numberLine numberColumn width height ;

imageObject : 'file' ':' fileName;
fileName : STRING '.' STRING;
numberLine : 'row' ':' value;
numberColumn : 'column' ':' value;
width : 'width' ':' value;
height : 'height' ':' value;
attack : 'attack' ':' value;
defense : 'defense' ':' value;
speed : 'speed' ':' value;
probability : 'probability' ':' value;
movement : 'movement:' movingType;
value : DIGIT;
movingType : Type;
Type : (ZIGZAG | VERTICAL | CONTINUE);

STRING : ('a'..'z')+;
DIGIT  : ('0'..'9')+;
ZIGZAG   : 'zigzag';
VERTICAL : 'vertical';
CONTINUE : 'continue';

WS
   : [ \t\n\r] + -> skip
   ;