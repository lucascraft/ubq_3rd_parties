lexer grammar InternalFmurfUiDSL;
@header {
package net.sf.fmurf.ui.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'VISIBLE' ;
T12 : 'HIDDEN' ;
T13 : 'DISC' ;
T14 : 'SQUARE' ;
T15 : 'PENTAGON' ;
T16 : 'HEXAGON' ;
T17 : 'EIGHTSTAR' ;
T18 : 'SIN_OSC' ;
T19 : 'SQR_OSC' ;
T20 : 'PULSE_OSC' ;
T21 : 'TRI_OSC' ;
T22 : 'SAW_OSC' ;
T23 : 'SEQUENCER' ;
T24 : 'SAMPLER' ;
T25 : 'ECHO' ;
T26 : 'REVERB' ;
T27 : 'KNOB' ;
T28 : 'NONE' ;
T29 : 'Aquamarine' ;
T30 : 'Bakers_Chocolate' ;
T31 : 'Black' ;
T32 : 'Blue' ;
T33 : 'Brass' ;
T34 : 'Bright_Gold' ;
T35 : 'Brown' ;
T36 : 'Bronze' ;
T37 : 'Gold' ;
T38 : 'Grey' ;
T39 : 'Green' ;
T40 : 'Copper' ;
T41 : 'Coral' ;
T42 : 'Cyan' ;
T43 : 'Dark_Green' ;
T44 : 'Green_Yellow' ;
T45 : 'Magenta' ;
T46 : 'Maroon' ;
T47 : 'Medium_Blue' ;
T48 : 'Sienna' ;
T49 : 'Silver' ;
T50 : 'Salmon' ;
T51 : 'Orange' ;
T52 : 'Pink' ;
T53 : 'Red' ;
T54 : 'Summer_Sky' ;
T55 : 'Tan' ;
T56 : 'Thistle' ;
T57 : 'Turquoise' ;
T58 : 'Very_Dark_Brown' ;
T59 : 'Very_Light_Grey' ;
T60 : 'Violet' ;
T61 : 'Violet_Red' ;
T62 : 'Wheat' ;
T63 : 'White' ;
T64 : 'Yellow' ;
T65 : 'Yellow_Green' ;
T66 : 'Dark_Yellow' ;
T67 : 'Bronze_II' ;
T68 : 'Cadet_Blue' ;
T69 : 'Cool_Copper' ;
T70 : 'Corn_Flower_Blue' ;
T71 : 'Dark_Brown' ;
T72 : 'Dark_Green_Copper' ;
T73 : 'Dark_Olive_Green' ;
T74 : 'Dark_Orchid' ;
T75 : 'Dark_Purple' ;
T76 : 'Dark_Slate_Blue' ;
T77 : 'Dark_Turquoise' ;
T78 : 'Dark_Tan' ;
T79 : 'Dark_Wood' ;
T80 : 'Dim_Grey' ;
T81 : 'Dusty_Rose' ;
T82 : 'Feldspar' ;
T83 : 'Firebrick' ;
T84 : 'Forest_Green' ;
T85 : 'Goldenrod' ;
T86 : 'Green_Copper' ;
T87 : 'Hunter_Green' ;
T88 : 'Indian_Red' ;
T89 : 'Khaki' ;
T90 : 'Light_Blue' ;
T91 : 'Light_Grey' ;
T92 : 'Light_Steel_Blue' ;
T93 : 'Light_Wood' ;
T94 : 'Lime_Green' ;
T95 : 'Mandarian_Orange' ;
T96 : 'Medium_Aquamarine' ;
T97 : 'Medium_Forest_Green' ;
T98 : 'Medium_Goldenrod' ;
T99 : 'Medium_Orchid' ;
T100 : 'Medium_Sea_Green' ;
T101 : 'Medium_Slate_Blue' ;
T102 : 'Medium_Spring_Green' ;
T103 : 'Medium_Turquoise' ;
T104 : 'Medium_Violet_Red' ;
T105 : 'Medium_Wood' ;
T106 : 'Midnight_Blue' ;
T107 : 'Navy_Blue' ;
T108 : 'Neon_Blue' ;
T109 : 'Neon_Pink' ;
T110 : 'New_Midnight_Blue' ;
T111 : 'New_Tan' ;
T112 : 'Old_Gold' ;
T113 : 'Orange_Red' ;
T114 : 'Orchid' ;
T115 : 'Pale_Green' ;
T116 : 'Plum' ;
T117 : 'Quartz' ;
T118 : 'Rich_Blue' ;
T119 : 'Scarlet' ;
T120 : 'Sea_Green' ;
T121 : 'Semi_Sweet_Chocolate' ;
T122 : 'Sky_Blue' ;
T123 : 'Slate_Blue' ;
T124 : 'Spicy_Pink' ;
T125 : 'Spring_Green' ;
T126 : 'Steel_Blue' ;
T127 : 'fiducial' ;
T128 : ':' ;
T129 : '{' ;
T130 : 'style:' ;
T131 : 'kind:' ;
T132 : 'foreground:' ;
T133 : 'background:' ;
T134 : 'radius:' ;
T135 : 'proxima:' ;
T136 : 'proximaVisible:' ;
T137 : 'function:' ;
T138 : 'range:' ;
T139 : '}' ;
T140 : 'settings : {' ;
T141 : 'OscReceivePort:' ;
T142 : 'OscSendAddress:' ;
T143 : 'OscSendPort:' ;
T144 : 'TuioPort:' ;
T145 : 'liveRate:' ;
T146 : 'processingRate:' ;

// $ANTLR src "../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g" 2673
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g" 2675
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g" 2677
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g" 2679
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g" 2681
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g" 2683
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g" 2685
RULE_ANY_OTHER : .;


