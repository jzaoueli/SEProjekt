grammar MyGram;

gram : images bullet enemy EOF;

images : 'image' logo background player;

logo : 'ImageLogo' '{' imageObject '}';
background : 'ImageBackground' '{' imageObject '}';
player : 'ImagePlayer' '{' spriteObject '}';
bullet : 'BulletNormal' '{' spriteObject attack speed '}';
enemy : 'CommonAttackEnemy' '{' spriteObject movement attack defense speed '}';

spriteObject : imageObject numberLine numberColumn width height ;

imageObject : 'file' ':' STRING '.' STRING;
numberLine : 'row' ':' DIGIT;
numberColumn : 'column' ':' DIGIT;
width : 'width' ':' DIGIT+;
height : 'height' ':' DIGIT+;
attack : 'attack' ':' DIGIT;
defense : 'defense' ':' DIGIT;
speed : 'speed' ':' DIGIT;
movement : 'movement:' movingType;

movingType : Type;
Type : (ZIGZAG | VERTICAL | CONTINUE);

STRING : ('a'..'z')+;
DIGIT  : ('0'..'9');
ZIGZAG   : 'zigzag';
VERTICAL : 'vertical';
CONTINUE : 'continue';

WS
   : [ \t\n\r] + -> skip
   ;