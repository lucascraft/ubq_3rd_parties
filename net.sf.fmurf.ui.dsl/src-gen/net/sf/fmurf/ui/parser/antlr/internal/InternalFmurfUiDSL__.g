lexer grammar InternalFmurfUiDSL;
@header {
package net.sf.fmurf.ui.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'fiducial' ;
T12 : ':' ;
T13 : '{' ;
T14 : 'style:' ;
T15 : 'kind:' ;
T16 : 'foreground:' ;
T17 : 'background:' ;
T18 : 'radius:' ;
T19 : 'proxima:' ;
T20 : 'proximaVisible:' ;
T21 : 'function:' ;
T22 : 'range:' ;
T23 : '}' ;
T24 : 'settings : {' ;
T25 : 'OscReceivePort:' ;
T26 : 'OscSendAddress:' ;
T27 : 'OscSendPort:' ;
T28 : 'TuioPort:' ;
T29 : 'liveRate:' ;
T30 : 'processingRate:' ;
T31 : 'VISIBLE' ;
T32 : 'HIDDEN' ;
T33 : 'DISC' ;
T34 : 'SQUARE' ;
T35 : 'PENTAGON' ;
T36 : 'HEXAGON' ;
T37 : 'EIGHTSTAR' ;
T38 : 'SIN_OSC' ;
T39 : 'SQR_OSC' ;
T40 : 'PULSE_OSC' ;
T41 : 'TRI_OSC' ;
T42 : 'SAW_OSC' ;
T43 : 'SEQUENCER' ;
T44 : 'SAMPLER' ;
T45 : 'ECHO' ;
T46 : 'REVERB' ;
T47 : 'KNOB' ;
T48 : 'NONE' ;
T49 : 'Aquamarine' ;
T50 : 'Bakers_Chocolate' ;
T51 : 'Black' ;
T52 : 'Blue' ;
T53 : 'Brass' ;
T54 : 'Bright_Gold' ;
T55 : 'Brown' ;
T56 : 'Bronze' ;
T57 : 'Gold' ;
T58 : 'Grey' ;
T59 : 'Green' ;
T60 : 'Copper' ;
T61 : 'Coral' ;
T62 : 'Cyan' ;
T63 : 'Dark_Green' ;
T64 : 'Green_Yellow' ;
T65 : 'Magenta' ;
T66 : 'Maroon' ;
T67 : 'Medium_Blue' ;
T68 : 'Sienna' ;
T69 : 'Silver' ;
T70 : 'Salmon' ;
T71 : 'Orange' ;
T72 : 'Pink' ;
T73 : 'Red' ;
T74 : 'Summer_Sky' ;
T75 : 'Tan' ;
T76 : 'Thistle' ;
T77 : 'Turquoise' ;
T78 : 'Very_Dark_Brown' ;
T79 : 'Very_Light_Grey' ;
T80 : 'Violet' ;
T81 : 'Violet_Red' ;
T82 : 'Wheat' ;
T83 : 'White' ;
T84 : 'Yellow' ;
T85 : 'Yellow_Green' ;
T86 : 'Dark_Yellow' ;
T87 : 'Bronze_II' ;
T88 : 'Cadet_Blue' ;
T89 : 'Cool_Copper' ;
T90 : 'Corn_Flower_Blue' ;
T91 : 'Dark_Brown' ;
T92 : 'Dark_Green_Copper' ;
T93 : 'Dark_Olive_Green' ;
T94 : 'Dark_Orchid' ;
T95 : 'Dark_Purple' ;
T96 : 'Dark_Slate_Blue' ;
T97 : 'Dark_Turquoise' ;
T98 : 'Dark_Tan' ;
T99 : 'Dark_Wood' ;
T100 : 'Dim_Grey' ;
T101 : 'Dusty_Rose' ;
T102 : 'Feldspar' ;
T103 : 'Firebrick' ;
T104 : 'Forest_Green' ;
T105 : 'Goldenrod' ;
T106 : 'Green_Copper' ;
T107 : 'Hunter_Green' ;
T108 : 'Indian_Red' ;
T109 : 'Khaki' ;
T110 : 'Light_Blue' ;
T111 : 'Light_Grey' ;
T112 : 'Light_Steel_Blue' ;
T113 : 'Light_Wood' ;
T114 : 'Lime_Green' ;
T115 : 'Mandarian_Orange' ;
T116 : 'Medium_Aquamarine' ;
T117 : 'Medium_Forest_Green' ;
T118 : 'Medium_Goldenrod' ;
T119 : 'Medium_Orchid' ;
T120 : 'Medium_Sea_Green' ;
T121 : 'Medium_Slate_Blue' ;
T122 : 'Medium_Spring_Green' ;
T123 : 'Medium_Turquoise' ;
T124 : 'Medium_Violet_Red' ;
T125 : 'Medium_Wood' ;
T126 : 'Midnight_Blue' ;
T127 : 'Navy_Blue' ;
T128 : 'Neon_Blue' ;
T129 : 'Neon_Pink' ;
T130 : 'New_Midnight_Blue' ;
T131 : 'New_Tan' ;
T132 : 'Old_Gold' ;
T133 : 'Orange_Red' ;
T134 : 'Orchid' ;
T135 : 'Pale_Green' ;
T136 : 'Plum' ;
T137 : 'Quartz' ;
T138 : 'Rich_Blue' ;
T139 : 'Scarlet' ;
T140 : 'Sea_Green' ;
T141 : 'Semi_Sweet_Chocolate' ;
T142 : 'Sky_Blue' ;
T143 : 'Slate_Blue' ;
T144 : 'Spicy_Pink' ;
T145 : 'Spring_Green' ;
T146 : 'Steel_Blue' ;

// $ANTLR src "../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g" 1429
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g" 1431
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g" 1433
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g" 1435
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g" 1437
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g" 1439
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g" 1441
RULE_ANY_OTHER : .;


