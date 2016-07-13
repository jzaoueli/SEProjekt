grammar MyGram;

gram : images bullet enemyCollection itemCollection EOF;

images : 'image' logo background player;
enemyCollection : 'enemy' enemy+;
itemCollection : 'item' item+;

logo : 'ImageLogo' '{' imageObject '}';
background : 'ImageBackground' '{' imageObject '}';
player : 'ImagePlayer' '{' spriteObject '}';
bullet : 'BulletNormal' '{' spriteObject attack speed '}';
enemy : className '{' spriteObject movement attack defense speed probability '}';
item : className '{' spriteObject effect '}';

spriteObject : imageObject numberLine numberColumn width height ;

className : LETTERS;
imageObject : 'file' ':' fileName;
fileName : LETTERS '.' LETTERS;
numberLine : 'row' ':' value;
numberColumn : 'column' ':' value;
width : 'width' ':' value;
height : 'height' ':' value;
attack : 'attack' ':' value;
defense : 'defense' ':' value;
speed : 'speed' ':' value;
probability : 'probability' ':' value;
movement : 'movement:' movingType;
effect : 'effect:' effectType;
value : DIGIT;
movingType : Movement;
effectType : Effect;
Effect : (LIFEPOINTS | BULLETRATE);
Movement : (ZIGZAG | VERTICAL | CONTINUE);

LETTERS : (SMALLLETTER | BIGLETTER)+;
SMALLLETTER : ('a'..'z');
BIGLETTER : ('A'..'Z');
DIGIT  : ('0'..'9')+;
ZIGZAG   : 'zigzag';
VERTICAL : 'vertical';
CONTINUE : 'continue';
LIFEPOINTS : 'lifepoints';
BULLETRATE : 'bulletrate';

WS
   : [ \t\n\r] + -> skip
   ;