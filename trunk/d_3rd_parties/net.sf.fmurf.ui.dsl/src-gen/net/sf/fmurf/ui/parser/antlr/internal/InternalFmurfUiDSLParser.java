package net.sf.fmurf.ui.parser.antlr.internal; 

import java.io.InputStream;

import net.sf.fmurf.ui.services.FmurfUiDSLGrammarAccess;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.parser.IAstFactory;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;

@SuppressWarnings("all")
public class InternalFmurfUiDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fiducial'", "':'", "'{'", "'style:'", "'kind:'", "'foreground:'", "'background:'", "'radius:'", "'proxima:'", "'proximaVisible:'", "'function:'", "'range:'", "'}'", "'settings : {'", "'OscReceivePort:'", "'OscSendAddress:'", "'OscSendPort:'", "'TuioPort:'", "'liveRate:'", "'processingRate:'", "'VISIBLE'", "'HIDDEN'", "'DISC'", "'SQUARE'", "'PENTAGON'", "'HEXAGON'", "'EIGHTSTAR'", "'SIN_OSC'", "'SQR_OSC'", "'PULSE_OSC'", "'TRI_OSC'", "'SAW_OSC'", "'SEQUENCER'", "'SAMPLER'", "'ECHO'", "'REVERB'", "'KNOB'", "'NONE'", "'Aquamarine'", "'Bakers_Chocolate'", "'Black'", "'Blue'", "'Brass'", "'Bright_Gold'", "'Brown'", "'Bronze'", "'Gold'", "'Grey'", "'Green'", "'Copper'", "'Coral'", "'Cyan'", "'Dark_Green'", "'Green_Yellow'", "'Magenta'", "'Maroon'", "'Medium_Blue'", "'Sienna'", "'Silver'", "'Salmon'", "'Orange'", "'Pink'", "'Red'", "'Summer_Sky'", "'Tan'", "'Thistle'", "'Turquoise'", "'Very_Dark_Brown'", "'Very_Light_Grey'", "'Violet'", "'Violet_Red'", "'Wheat'", "'White'", "'Yellow'", "'Yellow_Green'", "'Dark_Yellow'", "'Bronze_II'", "'Cadet_Blue'", "'Cool_Copper'", "'Corn_Flower_Blue'", "'Dark_Brown'", "'Dark_Green_Copper'", "'Dark_Olive_Green'", "'Dark_Orchid'", "'Dark_Purple'", "'Dark_Slate_Blue'", "'Dark_Turquoise'", "'Dark_Tan'", "'Dark_Wood'", "'Dim_Grey'", "'Dusty_Rose'", "'Feldspar'", "'Firebrick'", "'Forest_Green'", "'Goldenrod'", "'Green_Copper'", "'Hunter_Green'", "'Indian_Red'", "'Khaki'", "'Light_Blue'", "'Light_Grey'", "'Light_Steel_Blue'", "'Light_Wood'", "'Lime_Green'", "'Mandarian_Orange'", "'Medium_Aquamarine'", "'Medium_Forest_Green'", "'Medium_Goldenrod'", "'Medium_Orchid'", "'Medium_Sea_Green'", "'Medium_Slate_Blue'", "'Medium_Spring_Green'", "'Medium_Turquoise'", "'Medium_Violet_Red'", "'Medium_Wood'", "'Midnight_Blue'", "'Navy_Blue'", "'Neon_Blue'", "'Neon_Pink'", "'New_Midnight_Blue'", "'New_Tan'", "'Old_Gold'", "'Orange_Red'", "'Orchid'", "'Pale_Green'", "'Plum'", "'Quartz'", "'Rich_Blue'", "'Scarlet'", "'Sea_Green'", "'Semi_Sweet_Chocolate'", "'Sky_Blue'", "'Slate_Blue'", "'Spicy_Pink'", "'Spring_Green'", "'Steel_Blue'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalFmurfUiDSLParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g"; }



     	private FmurfUiDSLGrammarAccess grammarAccess;
     	
        public InternalFmurfUiDSLParser(TokenStream input, IAstFactory factory, FmurfUiDSLGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "FMFUI";	
       	}
       	
       	@Override
       	protected FmurfUiDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleFMFUI
    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:78:1: entryRuleFMFUI returns [EObject current=null] : iv_ruleFMFUI= ruleFMFUI EOF ;
    public final EObject entryRuleFMFUI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFMFUI = null;


        try {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:79:2: (iv_ruleFMFUI= ruleFMFUI EOF )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:80:2: iv_ruleFMFUI= ruleFMFUI EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFMFUIRule(), currentNode); 
            pushFollow(FOLLOW_ruleFMFUI_in_entryRuleFMFUI75);
            iv_ruleFMFUI=ruleFMFUI();
            _fsp--;

             current =iv_ruleFMFUI; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFMFUI85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFMFUI


    // $ANTLR start ruleFMFUI
    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:87:1: ruleFMFUI returns [EObject current=null] : ( ( (lv_settings_0_0= ruleFMFSettings ) ) ( (lv_fiducials_1_0= ruleFiducial ) )* ) ;
    public final EObject ruleFMFUI() throws RecognitionException {
        EObject current = null;

        EObject lv_settings_0_0 = null;

        EObject lv_fiducials_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:92:6: ( ( ( (lv_settings_0_0= ruleFMFSettings ) ) ( (lv_fiducials_1_0= ruleFiducial ) )* ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:93:1: ( ( (lv_settings_0_0= ruleFMFSettings ) ) ( (lv_fiducials_1_0= ruleFiducial ) )* )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:93:1: ( ( (lv_settings_0_0= ruleFMFSettings ) ) ( (lv_fiducials_1_0= ruleFiducial ) )* )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:93:2: ( (lv_settings_0_0= ruleFMFSettings ) ) ( (lv_fiducials_1_0= ruleFiducial ) )*
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:93:2: ( (lv_settings_0_0= ruleFMFSettings ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:94:1: (lv_settings_0_0= ruleFMFSettings )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:94:1: (lv_settings_0_0= ruleFMFSettings )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:95:3: lv_settings_0_0= ruleFMFSettings
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFMFUIAccess().getSettingsFMFSettingsParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFMFSettings_in_ruleFMFUI131);
            lv_settings_0_0=ruleFMFSettings();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFMFUIRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"settings",
            	        		lv_settings_0_0, 
            	        		"FMFSettings", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:117:2: ( (lv_fiducials_1_0= ruleFiducial ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:118:1: (lv_fiducials_1_0= ruleFiducial )
            	    {
            	    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:118:1: (lv_fiducials_1_0= ruleFiducial )
            	    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:119:3: lv_fiducials_1_0= ruleFiducial
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFMFUIAccess().getFiducialsFiducialParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFiducial_in_ruleFMFUI152);
            	    lv_fiducials_1_0=ruleFiducial();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFMFUIRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"fiducials",
            	    	        		lv_fiducials_1_0, 
            	    	        		"Fiducial", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFMFUI


    // $ANTLR start entryRuleFiducial
    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:149:1: entryRuleFiducial returns [EObject current=null] : iv_ruleFiducial= ruleFiducial EOF ;
    public final EObject entryRuleFiducial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFiducial = null;


        try {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:150:2: (iv_ruleFiducial= ruleFiducial EOF )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:151:2: iv_ruleFiducial= ruleFiducial EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFiducialRule(), currentNode); 
            pushFollow(FOLLOW_ruleFiducial_in_entryRuleFiducial189);
            iv_ruleFiducial=ruleFiducial();
            _fsp--;

             current =iv_ruleFiducial; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFiducial199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFiducial


    // $ANTLR start ruleFiducial
    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:158:1: ruleFiducial returns [EObject current=null] : ( 'fiducial' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_uid_3_0= RULE_INT ) ) '{' 'style:' ( (lv_style_6_0= ruleFMFFidStyleEnum ) ) 'kind:' ( (lv_kind_8_0= ruleFMFKind ) ) 'foreground:' ( (lv_fg_10_0= ruleFMFFidColorEnum ) ) 'background:' ( (lv_bg_12_0= ruleFMFFidColorEnum ) ) 'radius:' ( (lv_radius_14_0= RULE_INT ) ) 'proxima:' ( (lv_proxima_16_0= RULE_INT ) ) 'proximaVisible:' ( (lv_proximaVisible_18_0= ruleFMFProximaVisibleEnum ) ) 'function:' ( (lv_function_20_0= ruleFMFFidFunctionEnum ) ) 'range:' ( (lv_range_22_0= RULE_INT ) ) '}' ) ;
    public final EObject ruleFiducial() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_uid_3_0=null;
        Token lv_radius_14_0=null;
        Token lv_proxima_16_0=null;
        Token lv_range_22_0=null;
        Enumerator lv_style_6_0 = null;

        Enumerator lv_kind_8_0 = null;

        Enumerator lv_fg_10_0 = null;

        Enumerator lv_bg_12_0 = null;

        Enumerator lv_proximaVisible_18_0 = null;

        Enumerator lv_function_20_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:163:6: ( ( 'fiducial' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_uid_3_0= RULE_INT ) ) '{' 'style:' ( (lv_style_6_0= ruleFMFFidStyleEnum ) ) 'kind:' ( (lv_kind_8_0= ruleFMFKind ) ) 'foreground:' ( (lv_fg_10_0= ruleFMFFidColorEnum ) ) 'background:' ( (lv_bg_12_0= ruleFMFFidColorEnum ) ) 'radius:' ( (lv_radius_14_0= RULE_INT ) ) 'proxima:' ( (lv_proxima_16_0= RULE_INT ) ) 'proximaVisible:' ( (lv_proximaVisible_18_0= ruleFMFProximaVisibleEnum ) ) 'function:' ( (lv_function_20_0= ruleFMFFidFunctionEnum ) ) 'range:' ( (lv_range_22_0= RULE_INT ) ) '}' ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:164:1: ( 'fiducial' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_uid_3_0= RULE_INT ) ) '{' 'style:' ( (lv_style_6_0= ruleFMFFidStyleEnum ) ) 'kind:' ( (lv_kind_8_0= ruleFMFKind ) ) 'foreground:' ( (lv_fg_10_0= ruleFMFFidColorEnum ) ) 'background:' ( (lv_bg_12_0= ruleFMFFidColorEnum ) ) 'radius:' ( (lv_radius_14_0= RULE_INT ) ) 'proxima:' ( (lv_proxima_16_0= RULE_INT ) ) 'proximaVisible:' ( (lv_proximaVisible_18_0= ruleFMFProximaVisibleEnum ) ) 'function:' ( (lv_function_20_0= ruleFMFFidFunctionEnum ) ) 'range:' ( (lv_range_22_0= RULE_INT ) ) '}' )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:164:1: ( 'fiducial' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_uid_3_0= RULE_INT ) ) '{' 'style:' ( (lv_style_6_0= ruleFMFFidStyleEnum ) ) 'kind:' ( (lv_kind_8_0= ruleFMFKind ) ) 'foreground:' ( (lv_fg_10_0= ruleFMFFidColorEnum ) ) 'background:' ( (lv_bg_12_0= ruleFMFFidColorEnum ) ) 'radius:' ( (lv_radius_14_0= RULE_INT ) ) 'proxima:' ( (lv_proxima_16_0= RULE_INT ) ) 'proximaVisible:' ( (lv_proximaVisible_18_0= ruleFMFProximaVisibleEnum ) ) 'function:' ( (lv_function_20_0= ruleFMFFidFunctionEnum ) ) 'range:' ( (lv_range_22_0= RULE_INT ) ) '}' )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:164:3: 'fiducial' ( (lv_name_1_0= RULE_ID ) ) ':' ( (lv_uid_3_0= RULE_INT ) ) '{' 'style:' ( (lv_style_6_0= ruleFMFFidStyleEnum ) ) 'kind:' ( (lv_kind_8_0= ruleFMFKind ) ) 'foreground:' ( (lv_fg_10_0= ruleFMFFidColorEnum ) ) 'background:' ( (lv_bg_12_0= ruleFMFFidColorEnum ) ) 'radius:' ( (lv_radius_14_0= RULE_INT ) ) 'proxima:' ( (lv_proxima_16_0= RULE_INT ) ) 'proximaVisible:' ( (lv_proximaVisible_18_0= ruleFMFProximaVisibleEnum ) ) 'function:' ( (lv_function_20_0= ruleFMFFidFunctionEnum ) ) 'range:' ( (lv_range_22_0= RULE_INT ) ) '}'
            {
            match(input,11,FOLLOW_11_in_ruleFiducial234); 

                    createLeafNode(grammarAccess.getFiducialAccess().getFiducialKeyword_0(), null); 
                
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:168:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:169:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:169:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:170:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFiducial251); 

            			createLeafNode(grammarAccess.getFiducialAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFiducialRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleFiducial266); 

                    createLeafNode(grammarAccess.getFiducialAccess().getColonKeyword_2(), null); 
                
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:196:1: ( (lv_uid_3_0= RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:197:1: (lv_uid_3_0= RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:197:1: (lv_uid_3_0= RULE_INT )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:198:3: lv_uid_3_0= RULE_INT
            {
            lv_uid_3_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFiducial283); 

            			createLeafNode(grammarAccess.getFiducialAccess().getUidINTTerminalRuleCall_3_0(), "uid"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFiducialRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"uid",
            	        		lv_uid_3_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleFiducial298); 

                    createLeafNode(grammarAccess.getFiducialAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            match(input,14,FOLLOW_14_in_ruleFiducial308); 

                    createLeafNode(grammarAccess.getFiducialAccess().getStyleKeyword_5(), null); 
                
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:228:1: ( (lv_style_6_0= ruleFMFFidStyleEnum ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:229:1: (lv_style_6_0= ruleFMFFidStyleEnum )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:229:1: (lv_style_6_0= ruleFMFFidStyleEnum )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:230:3: lv_style_6_0= ruleFMFFidStyleEnum
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFiducialAccess().getStyleFMFFidStyleEnumEnumRuleCall_6_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFMFFidStyleEnum_in_ruleFiducial329);
            lv_style_6_0=ruleFMFFidStyleEnum();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFiducialRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"style",
            	        		lv_style_6_0, 
            	        		"FMFFidStyleEnum", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleFiducial339); 

                    createLeafNode(grammarAccess.getFiducialAccess().getKindKeyword_7(), null); 
                
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:256:1: ( (lv_kind_8_0= ruleFMFKind ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:257:1: (lv_kind_8_0= ruleFMFKind )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:257:1: (lv_kind_8_0= ruleFMFKind )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:258:3: lv_kind_8_0= ruleFMFKind
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFiducialAccess().getKindFMFKindEnumRuleCall_8_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFMFKind_in_ruleFiducial360);
            lv_kind_8_0=ruleFMFKind();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFiducialRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"kind",
            	        		lv_kind_8_0, 
            	        		"FMFKind", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,16,FOLLOW_16_in_ruleFiducial370); 

                    createLeafNode(grammarAccess.getFiducialAccess().getForegroundKeyword_9(), null); 
                
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:284:1: ( (lv_fg_10_0= ruleFMFFidColorEnum ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:285:1: (lv_fg_10_0= ruleFMFFidColorEnum )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:285:1: (lv_fg_10_0= ruleFMFFidColorEnum )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:286:3: lv_fg_10_0= ruleFMFFidColorEnum
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFiducialAccess().getFgFMFFidColorEnumEnumRuleCall_10_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFMFFidColorEnum_in_ruleFiducial391);
            lv_fg_10_0=ruleFMFFidColorEnum();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFiducialRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"fg",
            	        		lv_fg_10_0, 
            	        		"FMFFidColorEnum", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,17,FOLLOW_17_in_ruleFiducial401); 

                    createLeafNode(grammarAccess.getFiducialAccess().getBackgroundKeyword_11(), null); 
                
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:312:1: ( (lv_bg_12_0= ruleFMFFidColorEnum ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:313:1: (lv_bg_12_0= ruleFMFFidColorEnum )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:313:1: (lv_bg_12_0= ruleFMFFidColorEnum )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:314:3: lv_bg_12_0= ruleFMFFidColorEnum
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFiducialAccess().getBgFMFFidColorEnumEnumRuleCall_12_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFMFFidColorEnum_in_ruleFiducial422);
            lv_bg_12_0=ruleFMFFidColorEnum();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFiducialRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"bg",
            	        		lv_bg_12_0, 
            	        		"FMFFidColorEnum", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,18,FOLLOW_18_in_ruleFiducial432); 

                    createLeafNode(grammarAccess.getFiducialAccess().getRadiusKeyword_13(), null); 
                
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:340:1: ( (lv_radius_14_0= RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:341:1: (lv_radius_14_0= RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:341:1: (lv_radius_14_0= RULE_INT )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:342:3: lv_radius_14_0= RULE_INT
            {
            lv_radius_14_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFiducial449); 

            			createLeafNode(grammarAccess.getFiducialAccess().getRadiusINTTerminalRuleCall_14_0(), "radius"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFiducialRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"radius",
            	        		lv_radius_14_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,19,FOLLOW_19_in_ruleFiducial464); 

                    createLeafNode(grammarAccess.getFiducialAccess().getProximaKeyword_15(), null); 
                
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:368:1: ( (lv_proxima_16_0= RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:369:1: (lv_proxima_16_0= RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:369:1: (lv_proxima_16_0= RULE_INT )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:370:3: lv_proxima_16_0= RULE_INT
            {
            lv_proxima_16_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFiducial481); 

            			createLeafNode(grammarAccess.getFiducialAccess().getProximaINTTerminalRuleCall_16_0(), "proxima"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFiducialRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"proxima",
            	        		lv_proxima_16_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleFiducial496); 

                    createLeafNode(grammarAccess.getFiducialAccess().getProximaVisibleKeyword_17(), null); 
                
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:396:1: ( (lv_proximaVisible_18_0= ruleFMFProximaVisibleEnum ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:397:1: (lv_proximaVisible_18_0= ruleFMFProximaVisibleEnum )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:397:1: (lv_proximaVisible_18_0= ruleFMFProximaVisibleEnum )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:398:3: lv_proximaVisible_18_0= ruleFMFProximaVisibleEnum
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFiducialAccess().getProximaVisibleFMFProximaVisibleEnumEnumRuleCall_18_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFMFProximaVisibleEnum_in_ruleFiducial517);
            lv_proximaVisible_18_0=ruleFMFProximaVisibleEnum();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFiducialRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"proximaVisible",
            	        		lv_proximaVisible_18_0, 
            	        		"FMFProximaVisibleEnum", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,21,FOLLOW_21_in_ruleFiducial527); 

                    createLeafNode(grammarAccess.getFiducialAccess().getFunctionKeyword_19(), null); 
                
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:424:1: ( (lv_function_20_0= ruleFMFFidFunctionEnum ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:425:1: (lv_function_20_0= ruleFMFFidFunctionEnum )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:425:1: (lv_function_20_0= ruleFMFFidFunctionEnum )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:426:3: lv_function_20_0= ruleFMFFidFunctionEnum
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFiducialAccess().getFunctionFMFFidFunctionEnumEnumRuleCall_20_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFMFFidFunctionEnum_in_ruleFiducial548);
            lv_function_20_0=ruleFMFFidFunctionEnum();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFiducialRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"function",
            	        		lv_function_20_0, 
            	        		"FMFFidFunctionEnum", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,22,FOLLOW_22_in_ruleFiducial558); 

                    createLeafNode(grammarAccess.getFiducialAccess().getRangeKeyword_21(), null); 
                
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:452:1: ( (lv_range_22_0= RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:453:1: (lv_range_22_0= RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:453:1: (lv_range_22_0= RULE_INT )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:454:3: lv_range_22_0= RULE_INT
            {
            lv_range_22_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFiducial575); 

            			createLeafNode(grammarAccess.getFiducialAccess().getRangeINTTerminalRuleCall_22_0(), "range"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFiducialRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"range",
            	        		lv_range_22_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,23,FOLLOW_23_in_ruleFiducial590); 

                    createLeafNode(grammarAccess.getFiducialAccess().getRightCurlyBracketKeyword_23(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFiducial


    // $ANTLR start entryRuleFMFSettings
    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:488:1: entryRuleFMFSettings returns [EObject current=null] : iv_ruleFMFSettings= ruleFMFSettings EOF ;
    public final EObject entryRuleFMFSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFMFSettings = null;


        try {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:489:2: (iv_ruleFMFSettings= ruleFMFSettings EOF )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:490:2: iv_ruleFMFSettings= ruleFMFSettings EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFMFSettingsRule(), currentNode); 
            pushFollow(FOLLOW_ruleFMFSettings_in_entryRuleFMFSettings626);
            iv_ruleFMFSettings=ruleFMFSettings();
            _fsp--;

             current =iv_ruleFMFSettings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFMFSettings636); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFMFSettings


    // $ANTLR start ruleFMFSettings
    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:497:1: ruleFMFSettings returns [EObject current=null] : ( 'settings : {' 'OscReceivePort:' ( (lv_oscReceivePort_2_0= RULE_INT ) ) 'OscSendAddress:' ( (lv_oscSendAddress_4_0= RULE_STRING ) ) 'OscSendPort:' ( (lv_oscSendPort_6_0= RULE_INT ) ) 'TuioPort:' ( (lv_tuioPort_8_0= RULE_INT ) ) 'liveRate:' ( (lv_liveRate_10_0= RULE_INT ) ) 'processingRate:' ( (lv_processingRate_12_0= RULE_INT ) ) '}' ) ;
    public final EObject ruleFMFSettings() throws RecognitionException {
        EObject current = null;

        Token lv_oscReceivePort_2_0=null;
        Token lv_oscSendAddress_4_0=null;
        Token lv_oscSendPort_6_0=null;
        Token lv_tuioPort_8_0=null;
        Token lv_liveRate_10_0=null;
        Token lv_processingRate_12_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:502:6: ( ( 'settings : {' 'OscReceivePort:' ( (lv_oscReceivePort_2_0= RULE_INT ) ) 'OscSendAddress:' ( (lv_oscSendAddress_4_0= RULE_STRING ) ) 'OscSendPort:' ( (lv_oscSendPort_6_0= RULE_INT ) ) 'TuioPort:' ( (lv_tuioPort_8_0= RULE_INT ) ) 'liveRate:' ( (lv_liveRate_10_0= RULE_INT ) ) 'processingRate:' ( (lv_processingRate_12_0= RULE_INT ) ) '}' ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:503:1: ( 'settings : {' 'OscReceivePort:' ( (lv_oscReceivePort_2_0= RULE_INT ) ) 'OscSendAddress:' ( (lv_oscSendAddress_4_0= RULE_STRING ) ) 'OscSendPort:' ( (lv_oscSendPort_6_0= RULE_INT ) ) 'TuioPort:' ( (lv_tuioPort_8_0= RULE_INT ) ) 'liveRate:' ( (lv_liveRate_10_0= RULE_INT ) ) 'processingRate:' ( (lv_processingRate_12_0= RULE_INT ) ) '}' )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:503:1: ( 'settings : {' 'OscReceivePort:' ( (lv_oscReceivePort_2_0= RULE_INT ) ) 'OscSendAddress:' ( (lv_oscSendAddress_4_0= RULE_STRING ) ) 'OscSendPort:' ( (lv_oscSendPort_6_0= RULE_INT ) ) 'TuioPort:' ( (lv_tuioPort_8_0= RULE_INT ) ) 'liveRate:' ( (lv_liveRate_10_0= RULE_INT ) ) 'processingRate:' ( (lv_processingRate_12_0= RULE_INT ) ) '}' )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:503:3: 'settings : {' 'OscReceivePort:' ( (lv_oscReceivePort_2_0= RULE_INT ) ) 'OscSendAddress:' ( (lv_oscSendAddress_4_0= RULE_STRING ) ) 'OscSendPort:' ( (lv_oscSendPort_6_0= RULE_INT ) ) 'TuioPort:' ( (lv_tuioPort_8_0= RULE_INT ) ) 'liveRate:' ( (lv_liveRate_10_0= RULE_INT ) ) 'processingRate:' ( (lv_processingRate_12_0= RULE_INT ) ) '}'
            {
            match(input,24,FOLLOW_24_in_ruleFMFSettings671); 

                    createLeafNode(grammarAccess.getFMFSettingsAccess().getSettingsKeyword_0(), null); 
                
            match(input,25,FOLLOW_25_in_ruleFMFSettings681); 

                    createLeafNode(grammarAccess.getFMFSettingsAccess().getOscReceivePortKeyword_1(), null); 
                
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:511:1: ( (lv_oscReceivePort_2_0= RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:512:1: (lv_oscReceivePort_2_0= RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:512:1: (lv_oscReceivePort_2_0= RULE_INT )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:513:3: lv_oscReceivePort_2_0= RULE_INT
            {
            lv_oscReceivePort_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFMFSettings698); 

            			createLeafNode(grammarAccess.getFMFSettingsAccess().getOscReceivePortINTTerminalRuleCall_2_0(), "oscReceivePort"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFMFSettingsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"oscReceivePort",
            	        		lv_oscReceivePort_2_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,26,FOLLOW_26_in_ruleFMFSettings713); 

                    createLeafNode(grammarAccess.getFMFSettingsAccess().getOscSendAddressKeyword_3(), null); 
                
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:539:1: ( (lv_oscSendAddress_4_0= RULE_STRING ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:540:1: (lv_oscSendAddress_4_0= RULE_STRING )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:540:1: (lv_oscSendAddress_4_0= RULE_STRING )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:541:3: lv_oscSendAddress_4_0= RULE_STRING
            {
            lv_oscSendAddress_4_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFMFSettings730); 

            			createLeafNode(grammarAccess.getFMFSettingsAccess().getOscSendAddressSTRINGTerminalRuleCall_4_0(), "oscSendAddress"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFMFSettingsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"oscSendAddress",
            	        		lv_oscSendAddress_4_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,27,FOLLOW_27_in_ruleFMFSettings745); 

                    createLeafNode(grammarAccess.getFMFSettingsAccess().getOscSendPortKeyword_5(), null); 
                
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:567:1: ( (lv_oscSendPort_6_0= RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:568:1: (lv_oscSendPort_6_0= RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:568:1: (lv_oscSendPort_6_0= RULE_INT )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:569:3: lv_oscSendPort_6_0= RULE_INT
            {
            lv_oscSendPort_6_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFMFSettings762); 

            			createLeafNode(grammarAccess.getFMFSettingsAccess().getOscSendPortINTTerminalRuleCall_6_0(), "oscSendPort"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFMFSettingsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"oscSendPort",
            	        		lv_oscSendPort_6_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,28,FOLLOW_28_in_ruleFMFSettings777); 

                    createLeafNode(grammarAccess.getFMFSettingsAccess().getTuioPortKeyword_7(), null); 
                
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:595:1: ( (lv_tuioPort_8_0= RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:596:1: (lv_tuioPort_8_0= RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:596:1: (lv_tuioPort_8_0= RULE_INT )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:597:3: lv_tuioPort_8_0= RULE_INT
            {
            lv_tuioPort_8_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFMFSettings794); 

            			createLeafNode(grammarAccess.getFMFSettingsAccess().getTuioPortINTTerminalRuleCall_8_0(), "tuioPort"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFMFSettingsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"tuioPort",
            	        		lv_tuioPort_8_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,29,FOLLOW_29_in_ruleFMFSettings809); 

                    createLeafNode(grammarAccess.getFMFSettingsAccess().getLiveRateKeyword_9(), null); 
                
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:623:1: ( (lv_liveRate_10_0= RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:624:1: (lv_liveRate_10_0= RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:624:1: (lv_liveRate_10_0= RULE_INT )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:625:3: lv_liveRate_10_0= RULE_INT
            {
            lv_liveRate_10_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFMFSettings826); 

            			createLeafNode(grammarAccess.getFMFSettingsAccess().getLiveRateINTTerminalRuleCall_10_0(), "liveRate"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFMFSettingsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"liveRate",
            	        		lv_liveRate_10_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,30,FOLLOW_30_in_ruleFMFSettings841); 

                    createLeafNode(grammarAccess.getFMFSettingsAccess().getProcessingRateKeyword_11(), null); 
                
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:651:1: ( (lv_processingRate_12_0= RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:652:1: (lv_processingRate_12_0= RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:652:1: (lv_processingRate_12_0= RULE_INT )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:653:3: lv_processingRate_12_0= RULE_INT
            {
            lv_processingRate_12_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFMFSettings858); 

            			createLeafNode(grammarAccess.getFMFSettingsAccess().getProcessingRateINTTerminalRuleCall_12_0(), "processingRate"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFMFSettingsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"processingRate",
            	        		lv_processingRate_12_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,23,FOLLOW_23_in_ruleFMFSettings873); 

                    createLeafNode(grammarAccess.getFMFSettingsAccess().getRightCurlyBracketKeyword_13(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFMFSettings


    // $ANTLR start ruleFMFProximaVisibleEnum
    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:687:1: ruleFMFProximaVisibleEnum returns [Enumerator current=null] : ( ( 'VISIBLE' ) | ( 'HIDDEN' ) ) ;
    public final Enumerator ruleFMFProximaVisibleEnum() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:691:6: ( ( ( 'VISIBLE' ) | ( 'HIDDEN' ) ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:692:1: ( ( 'VISIBLE' ) | ( 'HIDDEN' ) )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:692:1: ( ( 'VISIBLE' ) | ( 'HIDDEN' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                alt2=1;
            }
            else if ( (LA2_0==32) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("692:1: ( ( 'VISIBLE' ) | ( 'HIDDEN' ) )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:692:2: ( 'VISIBLE' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:692:2: ( 'VISIBLE' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:692:4: 'VISIBLE'
                    {
                    match(input,31,FOLLOW_31_in_ruleFMFProximaVisibleEnum921); 

                            current = grammarAccess.getFMFProximaVisibleEnumAccess().getVISIBLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFProximaVisibleEnumAccess().getVISIBLEEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:698:6: ( 'HIDDEN' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:698:6: ( 'HIDDEN' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:698:8: 'HIDDEN'
                    {
                    match(input,32,FOLLOW_32_in_ruleFMFProximaVisibleEnum936); 

                            current = grammarAccess.getFMFProximaVisibleEnumAccess().getHIDDENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFProximaVisibleEnumAccess().getHIDDENEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFMFProximaVisibleEnum


    // $ANTLR start ruleFMFFidStyleEnum
    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:708:1: ruleFMFFidStyleEnum returns [Enumerator current=null] : ( ( 'DISC' ) | ( 'SQUARE' ) | ( 'PENTAGON' ) | ( 'HEXAGON' ) | ( 'EIGHTSTAR' ) ) ;
    public final Enumerator ruleFMFFidStyleEnum() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:712:6: ( ( ( 'DISC' ) | ( 'SQUARE' ) | ( 'PENTAGON' ) | ( 'HEXAGON' ) | ( 'EIGHTSTAR' ) ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:713:1: ( ( 'DISC' ) | ( 'SQUARE' ) | ( 'PENTAGON' ) | ( 'HEXAGON' ) | ( 'EIGHTSTAR' ) )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:713:1: ( ( 'DISC' ) | ( 'SQUARE' ) | ( 'PENTAGON' ) | ( 'HEXAGON' ) | ( 'EIGHTSTAR' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt3=1;
                }
                break;
            case 34:
                {
                alt3=2;
                }
                break;
            case 35:
                {
                alt3=3;
                }
                break;
            case 36:
                {
                alt3=4;
                }
                break;
            case 37:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("713:1: ( ( 'DISC' ) | ( 'SQUARE' ) | ( 'PENTAGON' ) | ( 'HEXAGON' ) | ( 'EIGHTSTAR' ) )", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:713:2: ( 'DISC' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:713:2: ( 'DISC' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:713:4: 'DISC'
                    {
                    match(input,33,FOLLOW_33_in_ruleFMFFidStyleEnum979); 

                            current = grammarAccess.getFMFFidStyleEnumAccess().getDISCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidStyleEnumAccess().getDISCEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:719:6: ( 'SQUARE' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:719:6: ( 'SQUARE' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:719:8: 'SQUARE'
                    {
                    match(input,34,FOLLOW_34_in_ruleFMFFidStyleEnum994); 

                            current = grammarAccess.getFMFFidStyleEnumAccess().getSQUAREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidStyleEnumAccess().getSQUAREEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:725:6: ( 'PENTAGON' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:725:6: ( 'PENTAGON' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:725:8: 'PENTAGON'
                    {
                    match(input,35,FOLLOW_35_in_ruleFMFFidStyleEnum1009); 

                            current = grammarAccess.getFMFFidStyleEnumAccess().getPENTAGONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidStyleEnumAccess().getPENTAGONEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:731:6: ( 'HEXAGON' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:731:6: ( 'HEXAGON' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:731:8: 'HEXAGON'
                    {
                    match(input,36,FOLLOW_36_in_ruleFMFFidStyleEnum1024); 

                            current = grammarAccess.getFMFFidStyleEnumAccess().getHEXAGONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidStyleEnumAccess().getHEXAGONEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:737:6: ( 'EIGHTSTAR' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:737:6: ( 'EIGHTSTAR' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:737:8: 'EIGHTSTAR'
                    {
                    match(input,37,FOLLOW_37_in_ruleFMFFidStyleEnum1039); 

                            current = grammarAccess.getFMFFidStyleEnumAccess().getEIGHTSTAREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidStyleEnumAccess().getEIGHTSTAREnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFMFFidStyleEnum


    // $ANTLR start ruleFMFKind
    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:747:1: ruleFMFKind returns [Enumerator current=null] : ( ( 'SIN_OSC' ) | ( 'SQR_OSC' ) | ( 'PULSE_OSC' ) | ( 'TRI_OSC' ) | ( 'SAW_OSC' ) | ( 'SEQUENCER' ) | ( 'SAMPLER' ) | ( 'ECHO' ) | ( 'REVERB' ) ) ;
    public final Enumerator ruleFMFKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:751:6: ( ( ( 'SIN_OSC' ) | ( 'SQR_OSC' ) | ( 'PULSE_OSC' ) | ( 'TRI_OSC' ) | ( 'SAW_OSC' ) | ( 'SEQUENCER' ) | ( 'SAMPLER' ) | ( 'ECHO' ) | ( 'REVERB' ) ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:752:1: ( ( 'SIN_OSC' ) | ( 'SQR_OSC' ) | ( 'PULSE_OSC' ) | ( 'TRI_OSC' ) | ( 'SAW_OSC' ) | ( 'SEQUENCER' ) | ( 'SAMPLER' ) | ( 'ECHO' ) | ( 'REVERB' ) )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:752:1: ( ( 'SIN_OSC' ) | ( 'SQR_OSC' ) | ( 'PULSE_OSC' ) | ( 'TRI_OSC' ) | ( 'SAW_OSC' ) | ( 'SEQUENCER' ) | ( 'SAMPLER' ) | ( 'ECHO' ) | ( 'REVERB' ) )
            int alt4=9;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt4=1;
                }
                break;
            case 39:
                {
                alt4=2;
                }
                break;
            case 40:
                {
                alt4=3;
                }
                break;
            case 41:
                {
                alt4=4;
                }
                break;
            case 42:
                {
                alt4=5;
                }
                break;
            case 43:
                {
                alt4=6;
                }
                break;
            case 44:
                {
                alt4=7;
                }
                break;
            case 45:
                {
                alt4=8;
                }
                break;
            case 46:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("752:1: ( ( 'SIN_OSC' ) | ( 'SQR_OSC' ) | ( 'PULSE_OSC' ) | ( 'TRI_OSC' ) | ( 'SAW_OSC' ) | ( 'SEQUENCER' ) | ( 'SAMPLER' ) | ( 'ECHO' ) | ( 'REVERB' ) )", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:752:2: ( 'SIN_OSC' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:752:2: ( 'SIN_OSC' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:752:4: 'SIN_OSC'
                    {
                    match(input,38,FOLLOW_38_in_ruleFMFKind1082); 

                            current = grammarAccess.getFMFKindAccess().getSIN_OSCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFKindAccess().getSIN_OSCEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:758:6: ( 'SQR_OSC' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:758:6: ( 'SQR_OSC' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:758:8: 'SQR_OSC'
                    {
                    match(input,39,FOLLOW_39_in_ruleFMFKind1097); 

                            current = grammarAccess.getFMFKindAccess().getSQR_OSCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFKindAccess().getSQR_OSCEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:764:6: ( 'PULSE_OSC' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:764:6: ( 'PULSE_OSC' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:764:8: 'PULSE_OSC'
                    {
                    match(input,40,FOLLOW_40_in_ruleFMFKind1112); 

                            current = grammarAccess.getFMFKindAccess().getPULSE_OSCEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFKindAccess().getPULSE_OSCEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:770:6: ( 'TRI_OSC' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:770:6: ( 'TRI_OSC' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:770:8: 'TRI_OSC'
                    {
                    match(input,41,FOLLOW_41_in_ruleFMFKind1127); 

                            current = grammarAccess.getFMFKindAccess().getTRI_OSCEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFKindAccess().getTRI_OSCEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:776:6: ( 'SAW_OSC' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:776:6: ( 'SAW_OSC' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:776:8: 'SAW_OSC'
                    {
                    match(input,42,FOLLOW_42_in_ruleFMFKind1142); 

                            current = grammarAccess.getFMFKindAccess().getSAW_OSCEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFKindAccess().getSAW_OSCEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:782:6: ( 'SEQUENCER' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:782:6: ( 'SEQUENCER' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:782:8: 'SEQUENCER'
                    {
                    match(input,43,FOLLOW_43_in_ruleFMFKind1157); 

                            current = grammarAccess.getFMFKindAccess().getSEQUENCEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFKindAccess().getSEQUENCEREnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:788:6: ( 'SAMPLER' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:788:6: ( 'SAMPLER' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:788:8: 'SAMPLER'
                    {
                    match(input,44,FOLLOW_44_in_ruleFMFKind1172); 

                            current = grammarAccess.getFMFKindAccess().getSAMPLEREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFKindAccess().getSAMPLEREnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:794:6: ( 'ECHO' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:794:6: ( 'ECHO' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:794:8: 'ECHO'
                    {
                    match(input,45,FOLLOW_45_in_ruleFMFKind1187); 

                            current = grammarAccess.getFMFKindAccess().getECHOEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFKindAccess().getECHOEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:800:6: ( 'REVERB' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:800:6: ( 'REVERB' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:800:8: 'REVERB'
                    {
                    match(input,46,FOLLOW_46_in_ruleFMFKind1202); 

                            current = grammarAccess.getFMFKindAccess().getREVERBEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFKindAccess().getREVERBEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFMFKind


    // $ANTLR start ruleFMFFidFunctionEnum
    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:810:1: ruleFMFFidFunctionEnum returns [Enumerator current=null] : ( ( 'KNOB' ) | ( 'NONE' ) ) ;
    public final Enumerator ruleFMFFidFunctionEnum() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:814:6: ( ( ( 'KNOB' ) | ( 'NONE' ) ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:815:1: ( ( 'KNOB' ) | ( 'NONE' ) )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:815:1: ( ( 'KNOB' ) | ( 'NONE' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==47) ) {
                alt5=1;
            }
            else if ( (LA5_0==48) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("815:1: ( ( 'KNOB' ) | ( 'NONE' ) )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:815:2: ( 'KNOB' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:815:2: ( 'KNOB' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:815:4: 'KNOB'
                    {
                    match(input,47,FOLLOW_47_in_ruleFMFFidFunctionEnum1245); 

                            current = grammarAccess.getFMFFidFunctionEnumAccess().getKNOBEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidFunctionEnumAccess().getKNOBEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:821:6: ( 'NONE' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:821:6: ( 'NONE' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:821:8: 'NONE'
                    {
                    match(input,48,FOLLOW_48_in_ruleFMFFidFunctionEnum1260); 

                            current = grammarAccess.getFMFFidFunctionEnumAccess().getNONEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidFunctionEnumAccess().getNONEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFMFFidFunctionEnum


    // $ANTLR start ruleFMFFidColorEnum
    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:833:1: ruleFMFFidColorEnum returns [Enumerator current=null] : ( ( 'Aquamarine' ) | ( 'Bakers_Chocolate' ) | ( 'Black' ) | ( 'Blue' ) | ( 'Brass' ) | ( 'Bright_Gold' ) | ( 'Brown' ) | ( 'Bronze' ) | ( 'Gold' ) | ( 'Grey' ) | ( 'Green' ) | ( 'Copper' ) | ( 'Coral' ) | ( 'Cyan' ) | ( 'Dark_Green' ) | ( 'Green_Yellow' ) | ( 'Magenta' ) | ( 'Maroon' ) | ( 'Medium_Blue' ) | ( 'Sienna' ) | ( 'Silver' ) | ( 'Salmon' ) | ( 'Orange' ) | ( 'Pink' ) | ( 'Red' ) | ( 'Summer_Sky' ) | ( 'Tan' ) | ( 'Thistle' ) | ( 'Turquoise' ) | ( 'Very_Dark_Brown' ) | ( 'Very_Light_Grey' ) | ( 'Violet' ) | ( 'Violet_Red' ) | ( 'Wheat' ) | ( 'White' ) | ( 'Yellow' ) | ( 'Yellow_Green' ) | ( 'Dark_Yellow' ) | ( 'Bronze_II' ) | ( 'Cadet_Blue' ) | ( 'Cool_Copper' ) | ( 'Corn_Flower_Blue' ) | ( 'Dark_Brown' ) | ( 'Dark_Green_Copper' ) | ( 'Dark_Olive_Green' ) | ( 'Dark_Orchid' ) | ( 'Dark_Purple' ) | ( 'Dark_Slate_Blue' ) | ( 'Dark_Turquoise' ) | ( 'Dark_Tan' ) | ( 'Dark_Wood' ) | ( 'Dim_Grey' ) | ( 'Dusty_Rose' ) | ( 'Feldspar' ) | ( 'Firebrick' ) | ( 'Forest_Green' ) | ( 'Goldenrod' ) | ( 'Green_Copper' ) | ( 'Hunter_Green' ) | ( 'Indian_Red' ) | ( 'Khaki' ) | ( 'Light_Blue' ) | ( 'Light_Grey' ) | ( 'Light_Steel_Blue' ) | ( 'Light_Wood' ) | ( 'Lime_Green' ) | ( 'Mandarian_Orange' ) | ( 'Medium_Aquamarine' ) | ( 'Medium_Forest_Green' ) | ( 'Medium_Goldenrod' ) | ( 'Medium_Orchid' ) | ( 'Medium_Sea_Green' ) | ( 'Medium_Slate_Blue' ) | ( 'Medium_Spring_Green' ) | ( 'Medium_Turquoise' ) | ( 'Medium_Violet_Red' ) | ( 'Medium_Wood' ) | ( 'Midnight_Blue' ) | ( 'Navy_Blue' ) | ( 'Neon_Blue' ) | ( 'Neon_Pink' ) | ( 'New_Midnight_Blue' ) | ( 'New_Tan' ) | ( 'Old_Gold' ) | ( 'Orange_Red' ) | ( 'Orchid' ) | ( 'Pale_Green' ) | ( 'Plum' ) | ( 'Quartz' ) | ( 'Rich_Blue' ) | ( 'Scarlet' ) | ( 'Sea_Green' ) | ( 'Semi_Sweet_Chocolate' ) | ( 'Sky_Blue' ) | ( 'Slate_Blue' ) | ( 'Spicy_Pink' ) | ( 'Spring_Green' ) | ( 'Steel_Blue' ) ) ;
    public final Enumerator ruleFMFFidColorEnum() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:837:6: ( ( ( 'Aquamarine' ) | ( 'Bakers_Chocolate' ) | ( 'Black' ) | ( 'Blue' ) | ( 'Brass' ) | ( 'Bright_Gold' ) | ( 'Brown' ) | ( 'Bronze' ) | ( 'Gold' ) | ( 'Grey' ) | ( 'Green' ) | ( 'Copper' ) | ( 'Coral' ) | ( 'Cyan' ) | ( 'Dark_Green' ) | ( 'Green_Yellow' ) | ( 'Magenta' ) | ( 'Maroon' ) | ( 'Medium_Blue' ) | ( 'Sienna' ) | ( 'Silver' ) | ( 'Salmon' ) | ( 'Orange' ) | ( 'Pink' ) | ( 'Red' ) | ( 'Summer_Sky' ) | ( 'Tan' ) | ( 'Thistle' ) | ( 'Turquoise' ) | ( 'Very_Dark_Brown' ) | ( 'Very_Light_Grey' ) | ( 'Violet' ) | ( 'Violet_Red' ) | ( 'Wheat' ) | ( 'White' ) | ( 'Yellow' ) | ( 'Yellow_Green' ) | ( 'Dark_Yellow' ) | ( 'Bronze_II' ) | ( 'Cadet_Blue' ) | ( 'Cool_Copper' ) | ( 'Corn_Flower_Blue' ) | ( 'Dark_Brown' ) | ( 'Dark_Green_Copper' ) | ( 'Dark_Olive_Green' ) | ( 'Dark_Orchid' ) | ( 'Dark_Purple' ) | ( 'Dark_Slate_Blue' ) | ( 'Dark_Turquoise' ) | ( 'Dark_Tan' ) | ( 'Dark_Wood' ) | ( 'Dim_Grey' ) | ( 'Dusty_Rose' ) | ( 'Feldspar' ) | ( 'Firebrick' ) | ( 'Forest_Green' ) | ( 'Goldenrod' ) | ( 'Green_Copper' ) | ( 'Hunter_Green' ) | ( 'Indian_Red' ) | ( 'Khaki' ) | ( 'Light_Blue' ) | ( 'Light_Grey' ) | ( 'Light_Steel_Blue' ) | ( 'Light_Wood' ) | ( 'Lime_Green' ) | ( 'Mandarian_Orange' ) | ( 'Medium_Aquamarine' ) | ( 'Medium_Forest_Green' ) | ( 'Medium_Goldenrod' ) | ( 'Medium_Orchid' ) | ( 'Medium_Sea_Green' ) | ( 'Medium_Slate_Blue' ) | ( 'Medium_Spring_Green' ) | ( 'Medium_Turquoise' ) | ( 'Medium_Violet_Red' ) | ( 'Medium_Wood' ) | ( 'Midnight_Blue' ) | ( 'Navy_Blue' ) | ( 'Neon_Blue' ) | ( 'Neon_Pink' ) | ( 'New_Midnight_Blue' ) | ( 'New_Tan' ) | ( 'Old_Gold' ) | ( 'Orange_Red' ) | ( 'Orchid' ) | ( 'Pale_Green' ) | ( 'Plum' ) | ( 'Quartz' ) | ( 'Rich_Blue' ) | ( 'Scarlet' ) | ( 'Sea_Green' ) | ( 'Semi_Sweet_Chocolate' ) | ( 'Sky_Blue' ) | ( 'Slate_Blue' ) | ( 'Spicy_Pink' ) | ( 'Spring_Green' ) | ( 'Steel_Blue' ) ) )
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:838:1: ( ( 'Aquamarine' ) | ( 'Bakers_Chocolate' ) | ( 'Black' ) | ( 'Blue' ) | ( 'Brass' ) | ( 'Bright_Gold' ) | ( 'Brown' ) | ( 'Bronze' ) | ( 'Gold' ) | ( 'Grey' ) | ( 'Green' ) | ( 'Copper' ) | ( 'Coral' ) | ( 'Cyan' ) | ( 'Dark_Green' ) | ( 'Green_Yellow' ) | ( 'Magenta' ) | ( 'Maroon' ) | ( 'Medium_Blue' ) | ( 'Sienna' ) | ( 'Silver' ) | ( 'Salmon' ) | ( 'Orange' ) | ( 'Pink' ) | ( 'Red' ) | ( 'Summer_Sky' ) | ( 'Tan' ) | ( 'Thistle' ) | ( 'Turquoise' ) | ( 'Very_Dark_Brown' ) | ( 'Very_Light_Grey' ) | ( 'Violet' ) | ( 'Violet_Red' ) | ( 'Wheat' ) | ( 'White' ) | ( 'Yellow' ) | ( 'Yellow_Green' ) | ( 'Dark_Yellow' ) | ( 'Bronze_II' ) | ( 'Cadet_Blue' ) | ( 'Cool_Copper' ) | ( 'Corn_Flower_Blue' ) | ( 'Dark_Brown' ) | ( 'Dark_Green_Copper' ) | ( 'Dark_Olive_Green' ) | ( 'Dark_Orchid' ) | ( 'Dark_Purple' ) | ( 'Dark_Slate_Blue' ) | ( 'Dark_Turquoise' ) | ( 'Dark_Tan' ) | ( 'Dark_Wood' ) | ( 'Dim_Grey' ) | ( 'Dusty_Rose' ) | ( 'Feldspar' ) | ( 'Firebrick' ) | ( 'Forest_Green' ) | ( 'Goldenrod' ) | ( 'Green_Copper' ) | ( 'Hunter_Green' ) | ( 'Indian_Red' ) | ( 'Khaki' ) | ( 'Light_Blue' ) | ( 'Light_Grey' ) | ( 'Light_Steel_Blue' ) | ( 'Light_Wood' ) | ( 'Lime_Green' ) | ( 'Mandarian_Orange' ) | ( 'Medium_Aquamarine' ) | ( 'Medium_Forest_Green' ) | ( 'Medium_Goldenrod' ) | ( 'Medium_Orchid' ) | ( 'Medium_Sea_Green' ) | ( 'Medium_Slate_Blue' ) | ( 'Medium_Spring_Green' ) | ( 'Medium_Turquoise' ) | ( 'Medium_Violet_Red' ) | ( 'Medium_Wood' ) | ( 'Midnight_Blue' ) | ( 'Navy_Blue' ) | ( 'Neon_Blue' ) | ( 'Neon_Pink' ) | ( 'New_Midnight_Blue' ) | ( 'New_Tan' ) | ( 'Old_Gold' ) | ( 'Orange_Red' ) | ( 'Orchid' ) | ( 'Pale_Green' ) | ( 'Plum' ) | ( 'Quartz' ) | ( 'Rich_Blue' ) | ( 'Scarlet' ) | ( 'Sea_Green' ) | ( 'Semi_Sweet_Chocolate' ) | ( 'Sky_Blue' ) | ( 'Slate_Blue' ) | ( 'Spicy_Pink' ) | ( 'Spring_Green' ) | ( 'Steel_Blue' ) )
            {
            // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:838:1: ( ( 'Aquamarine' ) | ( 'Bakers_Chocolate' ) | ( 'Black' ) | ( 'Blue' ) | ( 'Brass' ) | ( 'Bright_Gold' ) | ( 'Brown' ) | ( 'Bronze' ) | ( 'Gold' ) | ( 'Grey' ) | ( 'Green' ) | ( 'Copper' ) | ( 'Coral' ) | ( 'Cyan' ) | ( 'Dark_Green' ) | ( 'Green_Yellow' ) | ( 'Magenta' ) | ( 'Maroon' ) | ( 'Medium_Blue' ) | ( 'Sienna' ) | ( 'Silver' ) | ( 'Salmon' ) | ( 'Orange' ) | ( 'Pink' ) | ( 'Red' ) | ( 'Summer_Sky' ) | ( 'Tan' ) | ( 'Thistle' ) | ( 'Turquoise' ) | ( 'Very_Dark_Brown' ) | ( 'Very_Light_Grey' ) | ( 'Violet' ) | ( 'Violet_Red' ) | ( 'Wheat' ) | ( 'White' ) | ( 'Yellow' ) | ( 'Yellow_Green' ) | ( 'Dark_Yellow' ) | ( 'Bronze_II' ) | ( 'Cadet_Blue' ) | ( 'Cool_Copper' ) | ( 'Corn_Flower_Blue' ) | ( 'Dark_Brown' ) | ( 'Dark_Green_Copper' ) | ( 'Dark_Olive_Green' ) | ( 'Dark_Orchid' ) | ( 'Dark_Purple' ) | ( 'Dark_Slate_Blue' ) | ( 'Dark_Turquoise' ) | ( 'Dark_Tan' ) | ( 'Dark_Wood' ) | ( 'Dim_Grey' ) | ( 'Dusty_Rose' ) | ( 'Feldspar' ) | ( 'Firebrick' ) | ( 'Forest_Green' ) | ( 'Goldenrod' ) | ( 'Green_Copper' ) | ( 'Hunter_Green' ) | ( 'Indian_Red' ) | ( 'Khaki' ) | ( 'Light_Blue' ) | ( 'Light_Grey' ) | ( 'Light_Steel_Blue' ) | ( 'Light_Wood' ) | ( 'Lime_Green' ) | ( 'Mandarian_Orange' ) | ( 'Medium_Aquamarine' ) | ( 'Medium_Forest_Green' ) | ( 'Medium_Goldenrod' ) | ( 'Medium_Orchid' ) | ( 'Medium_Sea_Green' ) | ( 'Medium_Slate_Blue' ) | ( 'Medium_Spring_Green' ) | ( 'Medium_Turquoise' ) | ( 'Medium_Violet_Red' ) | ( 'Medium_Wood' ) | ( 'Midnight_Blue' ) | ( 'Navy_Blue' ) | ( 'Neon_Blue' ) | ( 'Neon_Pink' ) | ( 'New_Midnight_Blue' ) | ( 'New_Tan' ) | ( 'Old_Gold' ) | ( 'Orange_Red' ) | ( 'Orchid' ) | ( 'Pale_Green' ) | ( 'Plum' ) | ( 'Quartz' ) | ( 'Rich_Blue' ) | ( 'Scarlet' ) | ( 'Sea_Green' ) | ( 'Semi_Sweet_Chocolate' ) | ( 'Sky_Blue' ) | ( 'Slate_Blue' ) | ( 'Spicy_Pink' ) | ( 'Spring_Green' ) | ( 'Steel_Blue' ) )
            int alt6=98;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt6=1;
                }
                break;
            case 50:
                {
                alt6=2;
                }
                break;
            case 51:
                {
                alt6=3;
                }
                break;
            case 52:
                {
                alt6=4;
                }
                break;
            case 53:
                {
                alt6=5;
                }
                break;
            case 54:
                {
                alt6=6;
                }
                break;
            case 55:
                {
                alt6=7;
                }
                break;
            case 56:
                {
                alt6=8;
                }
                break;
            case 57:
                {
                alt6=9;
                }
                break;
            case 58:
                {
                alt6=10;
                }
                break;
            case 59:
                {
                alt6=11;
                }
                break;
            case 60:
                {
                alt6=12;
                }
                break;
            case 61:
                {
                alt6=13;
                }
                break;
            case 62:
                {
                alt6=14;
                }
                break;
            case 63:
                {
                alt6=15;
                }
                break;
            case 64:
                {
                alt6=16;
                }
                break;
            case 65:
                {
                alt6=17;
                }
                break;
            case 66:
                {
                alt6=18;
                }
                break;
            case 67:
                {
                alt6=19;
                }
                break;
            case 68:
                {
                alt6=20;
                }
                break;
            case 69:
                {
                alt6=21;
                }
                break;
            case 70:
                {
                alt6=22;
                }
                break;
            case 71:
                {
                alt6=23;
                }
                break;
            case 72:
                {
                alt6=24;
                }
                break;
            case 73:
                {
                alt6=25;
                }
                break;
            case 74:
                {
                alt6=26;
                }
                break;
            case 75:
                {
                alt6=27;
                }
                break;
            case 76:
                {
                alt6=28;
                }
                break;
            case 77:
                {
                alt6=29;
                }
                break;
            case 78:
                {
                alt6=30;
                }
                break;
            case 79:
                {
                alt6=31;
                }
                break;
            case 80:
                {
                alt6=32;
                }
                break;
            case 81:
                {
                alt6=33;
                }
                break;
            case 82:
                {
                alt6=34;
                }
                break;
            case 83:
                {
                alt6=35;
                }
                break;
            case 84:
                {
                alt6=36;
                }
                break;
            case 85:
                {
                alt6=37;
                }
                break;
            case 86:
                {
                alt6=38;
                }
                break;
            case 87:
                {
                alt6=39;
                }
                break;
            case 88:
                {
                alt6=40;
                }
                break;
            case 89:
                {
                alt6=41;
                }
                break;
            case 90:
                {
                alt6=42;
                }
                break;
            case 91:
                {
                alt6=43;
                }
                break;
            case 92:
                {
                alt6=44;
                }
                break;
            case 93:
                {
                alt6=45;
                }
                break;
            case 94:
                {
                alt6=46;
                }
                break;
            case 95:
                {
                alt6=47;
                }
                break;
            case 96:
                {
                alt6=48;
                }
                break;
            case 97:
                {
                alt6=49;
                }
                break;
            case 98:
                {
                alt6=50;
                }
                break;
            case 99:
                {
                alt6=51;
                }
                break;
            case 100:
                {
                alt6=52;
                }
                break;
            case 101:
                {
                alt6=53;
                }
                break;
            case 102:
                {
                alt6=54;
                }
                break;
            case 103:
                {
                alt6=55;
                }
                break;
            case 104:
                {
                alt6=56;
                }
                break;
            case 105:
                {
                alt6=57;
                }
                break;
            case 106:
                {
                alt6=58;
                }
                break;
            case 107:
                {
                alt6=59;
                }
                break;
            case 108:
                {
                alt6=60;
                }
                break;
            case 109:
                {
                alt6=61;
                }
                break;
            case 110:
                {
                alt6=62;
                }
                break;
            case 111:
                {
                alt6=63;
                }
                break;
            case 112:
                {
                alt6=64;
                }
                break;
            case 113:
                {
                alt6=65;
                }
                break;
            case 114:
                {
                alt6=66;
                }
                break;
            case 115:
                {
                alt6=67;
                }
                break;
            case 116:
                {
                alt6=68;
                }
                break;
            case 117:
                {
                alt6=69;
                }
                break;
            case 118:
                {
                alt6=70;
                }
                break;
            case 119:
                {
                alt6=71;
                }
                break;
            case 120:
                {
                alt6=72;
                }
                break;
            case 121:
                {
                alt6=73;
                }
                break;
            case 122:
                {
                alt6=74;
                }
                break;
            case 123:
                {
                alt6=75;
                }
                break;
            case 124:
                {
                alt6=76;
                }
                break;
            case 125:
                {
                alt6=77;
                }
                break;
            case 126:
                {
                alt6=78;
                }
                break;
            case 127:
                {
                alt6=79;
                }
                break;
            case 128:
                {
                alt6=80;
                }
                break;
            case 129:
                {
                alt6=81;
                }
                break;
            case 130:
                {
                alt6=82;
                }
                break;
            case 131:
                {
                alt6=83;
                }
                break;
            case 132:
                {
                alt6=84;
                }
                break;
            case 133:
                {
                alt6=85;
                }
                break;
            case 134:
                {
                alt6=86;
                }
                break;
            case 135:
                {
                alt6=87;
                }
                break;
            case 136:
                {
                alt6=88;
                }
                break;
            case 137:
                {
                alt6=89;
                }
                break;
            case 138:
                {
                alt6=90;
                }
                break;
            case 139:
                {
                alt6=91;
                }
                break;
            case 140:
                {
                alt6=92;
                }
                break;
            case 141:
                {
                alt6=93;
                }
                break;
            case 142:
                {
                alt6=94;
                }
                break;
            case 143:
                {
                alt6=95;
                }
                break;
            case 144:
                {
                alt6=96;
                }
                break;
            case 145:
                {
                alt6=97;
                }
                break;
            case 146:
                {
                alt6=98;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("838:1: ( ( 'Aquamarine' ) | ( 'Bakers_Chocolate' ) | ( 'Black' ) | ( 'Blue' ) | ( 'Brass' ) | ( 'Bright_Gold' ) | ( 'Brown' ) | ( 'Bronze' ) | ( 'Gold' ) | ( 'Grey' ) | ( 'Green' ) | ( 'Copper' ) | ( 'Coral' ) | ( 'Cyan' ) | ( 'Dark_Green' ) | ( 'Green_Yellow' ) | ( 'Magenta' ) | ( 'Maroon' ) | ( 'Medium_Blue' ) | ( 'Sienna' ) | ( 'Silver' ) | ( 'Salmon' ) | ( 'Orange' ) | ( 'Pink' ) | ( 'Red' ) | ( 'Summer_Sky' ) | ( 'Tan' ) | ( 'Thistle' ) | ( 'Turquoise' ) | ( 'Very_Dark_Brown' ) | ( 'Very_Light_Grey' ) | ( 'Violet' ) | ( 'Violet_Red' ) | ( 'Wheat' ) | ( 'White' ) | ( 'Yellow' ) | ( 'Yellow_Green' ) | ( 'Dark_Yellow' ) | ( 'Bronze_II' ) | ( 'Cadet_Blue' ) | ( 'Cool_Copper' ) | ( 'Corn_Flower_Blue' ) | ( 'Dark_Brown' ) | ( 'Dark_Green_Copper' ) | ( 'Dark_Olive_Green' ) | ( 'Dark_Orchid' ) | ( 'Dark_Purple' ) | ( 'Dark_Slate_Blue' ) | ( 'Dark_Turquoise' ) | ( 'Dark_Tan' ) | ( 'Dark_Wood' ) | ( 'Dim_Grey' ) | ( 'Dusty_Rose' ) | ( 'Feldspar' ) | ( 'Firebrick' ) | ( 'Forest_Green' ) | ( 'Goldenrod' ) | ( 'Green_Copper' ) | ( 'Hunter_Green' ) | ( 'Indian_Red' ) | ( 'Khaki' ) | ( 'Light_Blue' ) | ( 'Light_Grey' ) | ( 'Light_Steel_Blue' ) | ( 'Light_Wood' ) | ( 'Lime_Green' ) | ( 'Mandarian_Orange' ) | ( 'Medium_Aquamarine' ) | ( 'Medium_Forest_Green' ) | ( 'Medium_Goldenrod' ) | ( 'Medium_Orchid' ) | ( 'Medium_Sea_Green' ) | ( 'Medium_Slate_Blue' ) | ( 'Medium_Spring_Green' ) | ( 'Medium_Turquoise' ) | ( 'Medium_Violet_Red' ) | ( 'Medium_Wood' ) | ( 'Midnight_Blue' ) | ( 'Navy_Blue' ) | ( 'Neon_Blue' ) | ( 'Neon_Pink' ) | ( 'New_Midnight_Blue' ) | ( 'New_Tan' ) | ( 'Old_Gold' ) | ( 'Orange_Red' ) | ( 'Orchid' ) | ( 'Pale_Green' ) | ( 'Plum' ) | ( 'Quartz' ) | ( 'Rich_Blue' ) | ( 'Scarlet' ) | ( 'Sea_Green' ) | ( 'Semi_Sweet_Chocolate' ) | ( 'Sky_Blue' ) | ( 'Slate_Blue' ) | ( 'Spicy_Pink' ) | ( 'Spring_Green' ) | ( 'Steel_Blue' ) )", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:838:2: ( 'Aquamarine' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:838:2: ( 'Aquamarine' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:838:4: 'Aquamarine'
                    {
                    match(input,49,FOLLOW_49_in_ruleFMFFidColorEnum1305); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getAquamarineEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getAquamarineEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:844:6: ( 'Bakers_Chocolate' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:844:6: ( 'Bakers_Chocolate' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:844:8: 'Bakers_Chocolate'
                    {
                    match(input,50,FOLLOW_50_in_ruleFMFFidColorEnum1320); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getBakers_ChocolateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getBakers_ChocolateEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:850:6: ( 'Black' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:850:6: ( 'Black' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:850:8: 'Black'
                    {
                    match(input,51,FOLLOW_51_in_ruleFMFFidColorEnum1335); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getBlackEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getBlackEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:856:6: ( 'Blue' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:856:6: ( 'Blue' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:856:8: 'Blue'
                    {
                    match(input,52,FOLLOW_52_in_ruleFMFFidColorEnum1350); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getBlueEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getBlueEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:862:6: ( 'Brass' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:862:6: ( 'Brass' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:862:8: 'Brass'
                    {
                    match(input,53,FOLLOW_53_in_ruleFMFFidColorEnum1365); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getBrassEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getBrassEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:868:6: ( 'Bright_Gold' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:868:6: ( 'Bright_Gold' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:868:8: 'Bright_Gold'
                    {
                    match(input,54,FOLLOW_54_in_ruleFMFFidColorEnum1380); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getBright_GoldEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getBright_GoldEnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:874:6: ( 'Brown' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:874:6: ( 'Brown' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:874:8: 'Brown'
                    {
                    match(input,55,FOLLOW_55_in_ruleFMFFidColorEnum1395); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getBrownEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getBrownEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:880:6: ( 'Bronze' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:880:6: ( 'Bronze' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:880:8: 'Bronze'
                    {
                    match(input,56,FOLLOW_56_in_ruleFMFFidColorEnum1410); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getBronzeEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getBronzeEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:886:6: ( 'Gold' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:886:6: ( 'Gold' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:886:8: 'Gold'
                    {
                    match(input,57,FOLLOW_57_in_ruleFMFFidColorEnum1425); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getGoldEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getGoldEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:892:6: ( 'Grey' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:892:6: ( 'Grey' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:892:8: 'Grey'
                    {
                    match(input,58,FOLLOW_58_in_ruleFMFFidColorEnum1440); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getGreyEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getGreyEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:898:6: ( 'Green' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:898:6: ( 'Green' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:898:8: 'Green'
                    {
                    match(input,59,FOLLOW_59_in_ruleFMFFidColorEnum1455); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getGreenEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getGreenEnumLiteralDeclaration_10(), null); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:904:6: ( 'Copper' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:904:6: ( 'Copper' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:904:8: 'Copper'
                    {
                    match(input,60,FOLLOW_60_in_ruleFMFFidColorEnum1470); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getCopperEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getCopperEnumLiteralDeclaration_11(), null); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:910:6: ( 'Coral' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:910:6: ( 'Coral' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:910:8: 'Coral'
                    {
                    match(input,61,FOLLOW_61_in_ruleFMFFidColorEnum1485); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getCoralEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getCoralEnumLiteralDeclaration_12(), null); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:916:6: ( 'Cyan' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:916:6: ( 'Cyan' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:916:8: 'Cyan'
                    {
                    match(input,62,FOLLOW_62_in_ruleFMFFidColorEnum1500); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getCyanEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getCyanEnumLiteralDeclaration_13(), null); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:922:6: ( 'Dark_Green' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:922:6: ( 'Dark_Green' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:922:8: 'Dark_Green'
                    {
                    match(input,63,FOLLOW_63_in_ruleFMFFidColorEnum1515); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getDark_GreenEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getDark_GreenEnumLiteralDeclaration_14(), null); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:928:6: ( 'Green_Yellow' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:928:6: ( 'Green_Yellow' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:928:8: 'Green_Yellow'
                    {
                    match(input,64,FOLLOW_64_in_ruleFMFFidColorEnum1530); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getGreen_YellowEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getGreen_YellowEnumLiteralDeclaration_15(), null); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:934:6: ( 'Magenta' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:934:6: ( 'Magenta' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:934:8: 'Magenta'
                    {
                    match(input,65,FOLLOW_65_in_ruleFMFFidColorEnum1545); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getMagentaEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getMagentaEnumLiteralDeclaration_16(), null); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:940:6: ( 'Maroon' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:940:6: ( 'Maroon' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:940:8: 'Maroon'
                    {
                    match(input,66,FOLLOW_66_in_ruleFMFFidColorEnum1560); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getMaroonEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getMaroonEnumLiteralDeclaration_17(), null); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:946:6: ( 'Medium_Blue' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:946:6: ( 'Medium_Blue' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:946:8: 'Medium_Blue'
                    {
                    match(input,67,FOLLOW_67_in_ruleFMFFidColorEnum1575); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getMedium_BlueEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getMedium_BlueEnumLiteralDeclaration_18(), null); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:952:6: ( 'Sienna' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:952:6: ( 'Sienna' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:952:8: 'Sienna'
                    {
                    match(input,68,FOLLOW_68_in_ruleFMFFidColorEnum1590); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getSiennaEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getSiennaEnumLiteralDeclaration_19(), null); 
                        

                    }


                    }
                    break;
                case 21 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:958:6: ( 'Silver' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:958:6: ( 'Silver' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:958:8: 'Silver'
                    {
                    match(input,69,FOLLOW_69_in_ruleFMFFidColorEnum1605); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getSilverEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getSilverEnumLiteralDeclaration_20(), null); 
                        

                    }


                    }
                    break;
                case 22 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:964:6: ( 'Salmon' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:964:6: ( 'Salmon' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:964:8: 'Salmon'
                    {
                    match(input,70,FOLLOW_70_in_ruleFMFFidColorEnum1620); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getSalmonEnumLiteralDeclaration_21().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getSalmonEnumLiteralDeclaration_21(), null); 
                        

                    }


                    }
                    break;
                case 23 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:970:6: ( 'Orange' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:970:6: ( 'Orange' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:970:8: 'Orange'
                    {
                    match(input,71,FOLLOW_71_in_ruleFMFFidColorEnum1635); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getOrangeEnumLiteralDeclaration_22().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getOrangeEnumLiteralDeclaration_22(), null); 
                        

                    }


                    }
                    break;
                case 24 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:976:6: ( 'Pink' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:976:6: ( 'Pink' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:976:8: 'Pink'
                    {
                    match(input,72,FOLLOW_72_in_ruleFMFFidColorEnum1650); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getPinkEnumLiteralDeclaration_23().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getPinkEnumLiteralDeclaration_23(), null); 
                        

                    }


                    }
                    break;
                case 25 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:982:6: ( 'Red' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:982:6: ( 'Red' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:982:8: 'Red'
                    {
                    match(input,73,FOLLOW_73_in_ruleFMFFidColorEnum1665); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getRedEnumLiteralDeclaration_24().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getRedEnumLiteralDeclaration_24(), null); 
                        

                    }


                    }
                    break;
                case 26 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:988:6: ( 'Summer_Sky' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:988:6: ( 'Summer_Sky' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:988:8: 'Summer_Sky'
                    {
                    match(input,74,FOLLOW_74_in_ruleFMFFidColorEnum1680); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getSummer_SkyEnumLiteralDeclaration_25().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getSummer_SkyEnumLiteralDeclaration_25(), null); 
                        

                    }


                    }
                    break;
                case 27 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:994:6: ( 'Tan' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:994:6: ( 'Tan' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:994:8: 'Tan'
                    {
                    match(input,75,FOLLOW_75_in_ruleFMFFidColorEnum1695); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getTanEnumLiteralDeclaration_26().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getTanEnumLiteralDeclaration_26(), null); 
                        

                    }


                    }
                    break;
                case 28 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1000:6: ( 'Thistle' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1000:6: ( 'Thistle' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1000:8: 'Thistle'
                    {
                    match(input,76,FOLLOW_76_in_ruleFMFFidColorEnum1710); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getThistleEnumLiteralDeclaration_27().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getThistleEnumLiteralDeclaration_27(), null); 
                        

                    }


                    }
                    break;
                case 29 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1006:6: ( 'Turquoise' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1006:6: ( 'Turquoise' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1006:8: 'Turquoise'
                    {
                    match(input,77,FOLLOW_77_in_ruleFMFFidColorEnum1725); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getTurquoiseEnumLiteralDeclaration_28().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getTurquoiseEnumLiteralDeclaration_28(), null); 
                        

                    }


                    }
                    break;
                case 30 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1012:6: ( 'Very_Dark_Brown' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1012:6: ( 'Very_Dark_Brown' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1012:8: 'Very_Dark_Brown'
                    {
                    match(input,78,FOLLOW_78_in_ruleFMFFidColorEnum1740); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getVery_Dark_BrownEnumLiteralDeclaration_29().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getVery_Dark_BrownEnumLiteralDeclaration_29(), null); 
                        

                    }


                    }
                    break;
                case 31 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1018:6: ( 'Very_Light_Grey' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1018:6: ( 'Very_Light_Grey' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1018:8: 'Very_Light_Grey'
                    {
                    match(input,79,FOLLOW_79_in_ruleFMFFidColorEnum1755); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getVery_Light_GreyEnumLiteralDeclaration_30().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getVery_Light_GreyEnumLiteralDeclaration_30(), null); 
                        

                    }


                    }
                    break;
                case 32 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1024:6: ( 'Violet' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1024:6: ( 'Violet' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1024:8: 'Violet'
                    {
                    match(input,80,FOLLOW_80_in_ruleFMFFidColorEnum1770); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getVioletEnumLiteralDeclaration_31().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getVioletEnumLiteralDeclaration_31(), null); 
                        

                    }


                    }
                    break;
                case 33 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1030:6: ( 'Violet_Red' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1030:6: ( 'Violet_Red' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1030:8: 'Violet_Red'
                    {
                    match(input,81,FOLLOW_81_in_ruleFMFFidColorEnum1785); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getViolet_RedEnumLiteralDeclaration_32().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getViolet_RedEnumLiteralDeclaration_32(), null); 
                        

                    }


                    }
                    break;
                case 34 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1036:6: ( 'Wheat' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1036:6: ( 'Wheat' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1036:8: 'Wheat'
                    {
                    match(input,82,FOLLOW_82_in_ruleFMFFidColorEnum1800); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getWheatEnumLiteralDeclaration_33().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getWheatEnumLiteralDeclaration_33(), null); 
                        

                    }


                    }
                    break;
                case 35 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1042:6: ( 'White' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1042:6: ( 'White' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1042:8: 'White'
                    {
                    match(input,83,FOLLOW_83_in_ruleFMFFidColorEnum1815); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getWhiteEnumLiteralDeclaration_34().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getWhiteEnumLiteralDeclaration_34(), null); 
                        

                    }


                    }
                    break;
                case 36 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1048:6: ( 'Yellow' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1048:6: ( 'Yellow' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1048:8: 'Yellow'
                    {
                    match(input,84,FOLLOW_84_in_ruleFMFFidColorEnum1830); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getYellowEnumLiteralDeclaration_35().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getYellowEnumLiteralDeclaration_35(), null); 
                        

                    }


                    }
                    break;
                case 37 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1054:6: ( 'Yellow_Green' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1054:6: ( 'Yellow_Green' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1054:8: 'Yellow_Green'
                    {
                    match(input,85,FOLLOW_85_in_ruleFMFFidColorEnum1845); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getYellow_GreenEnumLiteralDeclaration_36().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getYellow_GreenEnumLiteralDeclaration_36(), null); 
                        

                    }


                    }
                    break;
                case 38 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1060:6: ( 'Dark_Yellow' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1060:6: ( 'Dark_Yellow' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1060:8: 'Dark_Yellow'
                    {
                    match(input,86,FOLLOW_86_in_ruleFMFFidColorEnum1860); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getDark_YellowEnumLiteralDeclaration_37().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getDark_YellowEnumLiteralDeclaration_37(), null); 
                        

                    }


                    }
                    break;
                case 39 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1066:6: ( 'Bronze_II' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1066:6: ( 'Bronze_II' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1066:8: 'Bronze_II'
                    {
                    match(input,87,FOLLOW_87_in_ruleFMFFidColorEnum1875); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getBronze_IIEnumLiteralDeclaration_38().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getBronze_IIEnumLiteralDeclaration_38(), null); 
                        

                    }


                    }
                    break;
                case 40 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1072:6: ( 'Cadet_Blue' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1072:6: ( 'Cadet_Blue' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1072:8: 'Cadet_Blue'
                    {
                    match(input,88,FOLLOW_88_in_ruleFMFFidColorEnum1890); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getCadet_BlueEnumLiteralDeclaration_39().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getCadet_BlueEnumLiteralDeclaration_39(), null); 
                        

                    }


                    }
                    break;
                case 41 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1078:6: ( 'Cool_Copper' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1078:6: ( 'Cool_Copper' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1078:8: 'Cool_Copper'
                    {
                    match(input,89,FOLLOW_89_in_ruleFMFFidColorEnum1905); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getCool_CopperEnumLiteralDeclaration_40().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getCool_CopperEnumLiteralDeclaration_40(), null); 
                        

                    }


                    }
                    break;
                case 42 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1084:6: ( 'Corn_Flower_Blue' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1084:6: ( 'Corn_Flower_Blue' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1084:8: 'Corn_Flower_Blue'
                    {
                    match(input,90,FOLLOW_90_in_ruleFMFFidColorEnum1920); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getCorn_Flower_BlueEnumLiteralDeclaration_41().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getCorn_Flower_BlueEnumLiteralDeclaration_41(), null); 
                        

                    }


                    }
                    break;
                case 43 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1090:6: ( 'Dark_Brown' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1090:6: ( 'Dark_Brown' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1090:8: 'Dark_Brown'
                    {
                    match(input,91,FOLLOW_91_in_ruleFMFFidColorEnum1935); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getDark_BrownEnumLiteralDeclaration_42().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getDark_BrownEnumLiteralDeclaration_42(), null); 
                        

                    }


                    }
                    break;
                case 44 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1096:6: ( 'Dark_Green_Copper' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1096:6: ( 'Dark_Green_Copper' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1096:8: 'Dark_Green_Copper'
                    {
                    match(input,92,FOLLOW_92_in_ruleFMFFidColorEnum1950); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getDark_Green_CopperEnumLiteralDeclaration_43().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getDark_Green_CopperEnumLiteralDeclaration_43(), null); 
                        

                    }


                    }
                    break;
                case 45 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1102:6: ( 'Dark_Olive_Green' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1102:6: ( 'Dark_Olive_Green' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1102:8: 'Dark_Olive_Green'
                    {
                    match(input,93,FOLLOW_93_in_ruleFMFFidColorEnum1965); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getDark_Olive_GreenEnumLiteralDeclaration_44().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getDark_Olive_GreenEnumLiteralDeclaration_44(), null); 
                        

                    }


                    }
                    break;
                case 46 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1108:6: ( 'Dark_Orchid' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1108:6: ( 'Dark_Orchid' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1108:8: 'Dark_Orchid'
                    {
                    match(input,94,FOLLOW_94_in_ruleFMFFidColorEnum1980); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getDark_OrchidEnumLiteralDeclaration_45().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getDark_OrchidEnumLiteralDeclaration_45(), null); 
                        

                    }


                    }
                    break;
                case 47 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1114:6: ( 'Dark_Purple' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1114:6: ( 'Dark_Purple' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1114:8: 'Dark_Purple'
                    {
                    match(input,95,FOLLOW_95_in_ruleFMFFidColorEnum1995); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getDark_PurpleEnumLiteralDeclaration_46().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getDark_PurpleEnumLiteralDeclaration_46(), null); 
                        

                    }


                    }
                    break;
                case 48 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1120:6: ( 'Dark_Slate_Blue' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1120:6: ( 'Dark_Slate_Blue' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1120:8: 'Dark_Slate_Blue'
                    {
                    match(input,96,FOLLOW_96_in_ruleFMFFidColorEnum2010); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getDark_Slate_BlueEnumLiteralDeclaration_47().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getDark_Slate_BlueEnumLiteralDeclaration_47(), null); 
                        

                    }


                    }
                    break;
                case 49 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1126:6: ( 'Dark_Turquoise' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1126:6: ( 'Dark_Turquoise' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1126:8: 'Dark_Turquoise'
                    {
                    match(input,97,FOLLOW_97_in_ruleFMFFidColorEnum2025); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getDark_TurquoiseEnumLiteralDeclaration_48().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getDark_TurquoiseEnumLiteralDeclaration_48(), null); 
                        

                    }


                    }
                    break;
                case 50 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1132:6: ( 'Dark_Tan' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1132:6: ( 'Dark_Tan' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1132:8: 'Dark_Tan'
                    {
                    match(input,98,FOLLOW_98_in_ruleFMFFidColorEnum2040); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getDark_TanEnumLiteralDeclaration_49().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getDark_TanEnumLiteralDeclaration_49(), null); 
                        

                    }


                    }
                    break;
                case 51 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1138:6: ( 'Dark_Wood' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1138:6: ( 'Dark_Wood' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1138:8: 'Dark_Wood'
                    {
                    match(input,99,FOLLOW_99_in_ruleFMFFidColorEnum2055); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getDark_WoodEnumLiteralDeclaration_50().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getDark_WoodEnumLiteralDeclaration_50(), null); 
                        

                    }


                    }
                    break;
                case 52 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1144:6: ( 'Dim_Grey' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1144:6: ( 'Dim_Grey' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1144:8: 'Dim_Grey'
                    {
                    match(input,100,FOLLOW_100_in_ruleFMFFidColorEnum2070); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getDim_GreyEnumLiteralDeclaration_51().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getDim_GreyEnumLiteralDeclaration_51(), null); 
                        

                    }


                    }
                    break;
                case 53 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1150:6: ( 'Dusty_Rose' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1150:6: ( 'Dusty_Rose' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1150:8: 'Dusty_Rose'
                    {
                    match(input,101,FOLLOW_101_in_ruleFMFFidColorEnum2085); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getDusty_RoseEnumLiteralDeclaration_52().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getDusty_RoseEnumLiteralDeclaration_52(), null); 
                        

                    }


                    }
                    break;
                case 54 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1156:6: ( 'Feldspar' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1156:6: ( 'Feldspar' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1156:8: 'Feldspar'
                    {
                    match(input,102,FOLLOW_102_in_ruleFMFFidColorEnum2100); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getFeldsparEnumLiteralDeclaration_53().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getFeldsparEnumLiteralDeclaration_53(), null); 
                        

                    }


                    }
                    break;
                case 55 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1162:6: ( 'Firebrick' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1162:6: ( 'Firebrick' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1162:8: 'Firebrick'
                    {
                    match(input,103,FOLLOW_103_in_ruleFMFFidColorEnum2115); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getFirebrickEnumLiteralDeclaration_54().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getFirebrickEnumLiteralDeclaration_54(), null); 
                        

                    }


                    }
                    break;
                case 56 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1168:6: ( 'Forest_Green' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1168:6: ( 'Forest_Green' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1168:8: 'Forest_Green'
                    {
                    match(input,104,FOLLOW_104_in_ruleFMFFidColorEnum2130); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getForest_GreenEnumLiteralDeclaration_55().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getForest_GreenEnumLiteralDeclaration_55(), null); 
                        

                    }


                    }
                    break;
                case 57 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1174:6: ( 'Goldenrod' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1174:6: ( 'Goldenrod' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1174:8: 'Goldenrod'
                    {
                    match(input,105,FOLLOW_105_in_ruleFMFFidColorEnum2145); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getGoldenrodEnumLiteralDeclaration_56().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getGoldenrodEnumLiteralDeclaration_56(), null); 
                        

                    }


                    }
                    break;
                case 58 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1180:6: ( 'Green_Copper' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1180:6: ( 'Green_Copper' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1180:8: 'Green_Copper'
                    {
                    match(input,106,FOLLOW_106_in_ruleFMFFidColorEnum2160); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getGreen_CopperEnumLiteralDeclaration_57().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getGreen_CopperEnumLiteralDeclaration_57(), null); 
                        

                    }


                    }
                    break;
                case 59 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1186:6: ( 'Hunter_Green' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1186:6: ( 'Hunter_Green' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1186:8: 'Hunter_Green'
                    {
                    match(input,107,FOLLOW_107_in_ruleFMFFidColorEnum2175); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getHunter_GreenEnumLiteralDeclaration_58().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getHunter_GreenEnumLiteralDeclaration_58(), null); 
                        

                    }


                    }
                    break;
                case 60 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1192:6: ( 'Indian_Red' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1192:6: ( 'Indian_Red' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1192:8: 'Indian_Red'
                    {
                    match(input,108,FOLLOW_108_in_ruleFMFFidColorEnum2190); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getIndian_RedEnumLiteralDeclaration_59().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getIndian_RedEnumLiteralDeclaration_59(), null); 
                        

                    }


                    }
                    break;
                case 61 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1198:6: ( 'Khaki' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1198:6: ( 'Khaki' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1198:8: 'Khaki'
                    {
                    match(input,109,FOLLOW_109_in_ruleFMFFidColorEnum2205); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getKhakiEnumLiteralDeclaration_60().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getKhakiEnumLiteralDeclaration_60(), null); 
                        

                    }


                    }
                    break;
                case 62 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1204:6: ( 'Light_Blue' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1204:6: ( 'Light_Blue' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1204:8: 'Light_Blue'
                    {
                    match(input,110,FOLLOW_110_in_ruleFMFFidColorEnum2220); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getLight_BlueEnumLiteralDeclaration_61().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getLight_BlueEnumLiteralDeclaration_61(), null); 
                        

                    }


                    }
                    break;
                case 63 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1210:6: ( 'Light_Grey' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1210:6: ( 'Light_Grey' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1210:8: 'Light_Grey'
                    {
                    match(input,111,FOLLOW_111_in_ruleFMFFidColorEnum2235); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getLight_GreyEnumLiteralDeclaration_62().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getLight_GreyEnumLiteralDeclaration_62(), null); 
                        

                    }


                    }
                    break;
                case 64 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1216:6: ( 'Light_Steel_Blue' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1216:6: ( 'Light_Steel_Blue' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1216:8: 'Light_Steel_Blue'
                    {
                    match(input,112,FOLLOW_112_in_ruleFMFFidColorEnum2250); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getLight_Steel_BlueEnumLiteralDeclaration_63().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getLight_Steel_BlueEnumLiteralDeclaration_63(), null); 
                        

                    }


                    }
                    break;
                case 65 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1222:6: ( 'Light_Wood' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1222:6: ( 'Light_Wood' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1222:8: 'Light_Wood'
                    {
                    match(input,113,FOLLOW_113_in_ruleFMFFidColorEnum2265); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getLight_WoodEnumLiteralDeclaration_64().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getLight_WoodEnumLiteralDeclaration_64(), null); 
                        

                    }


                    }
                    break;
                case 66 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1228:6: ( 'Lime_Green' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1228:6: ( 'Lime_Green' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1228:8: 'Lime_Green'
                    {
                    match(input,114,FOLLOW_114_in_ruleFMFFidColorEnum2280); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getLime_GreenEnumLiteralDeclaration_65().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getLime_GreenEnumLiteralDeclaration_65(), null); 
                        

                    }


                    }
                    break;
                case 67 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1234:6: ( 'Mandarian_Orange' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1234:6: ( 'Mandarian_Orange' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1234:8: 'Mandarian_Orange'
                    {
                    match(input,115,FOLLOW_115_in_ruleFMFFidColorEnum2295); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getMandarian_OrangeEnumLiteralDeclaration_66().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getMandarian_OrangeEnumLiteralDeclaration_66(), null); 
                        

                    }


                    }
                    break;
                case 68 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1240:6: ( 'Medium_Aquamarine' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1240:6: ( 'Medium_Aquamarine' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1240:8: 'Medium_Aquamarine'
                    {
                    match(input,116,FOLLOW_116_in_ruleFMFFidColorEnum2310); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getMedium_AquamarineEnumLiteralDeclaration_67().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getMedium_AquamarineEnumLiteralDeclaration_67(), null); 
                        

                    }


                    }
                    break;
                case 69 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1246:6: ( 'Medium_Forest_Green' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1246:6: ( 'Medium_Forest_Green' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1246:8: 'Medium_Forest_Green'
                    {
                    match(input,117,FOLLOW_117_in_ruleFMFFidColorEnum2325); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getMedium_Forest_GreenEnumLiteralDeclaration_68().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getMedium_Forest_GreenEnumLiteralDeclaration_68(), null); 
                        

                    }


                    }
                    break;
                case 70 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1252:6: ( 'Medium_Goldenrod' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1252:6: ( 'Medium_Goldenrod' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1252:8: 'Medium_Goldenrod'
                    {
                    match(input,118,FOLLOW_118_in_ruleFMFFidColorEnum2340); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getMedium_GoldenrodEnumLiteralDeclaration_69().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getMedium_GoldenrodEnumLiteralDeclaration_69(), null); 
                        

                    }


                    }
                    break;
                case 71 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1258:6: ( 'Medium_Orchid' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1258:6: ( 'Medium_Orchid' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1258:8: 'Medium_Orchid'
                    {
                    match(input,119,FOLLOW_119_in_ruleFMFFidColorEnum2355); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getMedium_OrchidEnumLiteralDeclaration_70().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getMedium_OrchidEnumLiteralDeclaration_70(), null); 
                        

                    }


                    }
                    break;
                case 72 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1264:6: ( 'Medium_Sea_Green' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1264:6: ( 'Medium_Sea_Green' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1264:8: 'Medium_Sea_Green'
                    {
                    match(input,120,FOLLOW_120_in_ruleFMFFidColorEnum2370); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getMedium_Sea_GreenEnumLiteralDeclaration_71().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getMedium_Sea_GreenEnumLiteralDeclaration_71(), null); 
                        

                    }


                    }
                    break;
                case 73 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1270:6: ( 'Medium_Slate_Blue' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1270:6: ( 'Medium_Slate_Blue' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1270:8: 'Medium_Slate_Blue'
                    {
                    match(input,121,FOLLOW_121_in_ruleFMFFidColorEnum2385); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getMedium_Slate_BlueEnumLiteralDeclaration_72().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getMedium_Slate_BlueEnumLiteralDeclaration_72(), null); 
                        

                    }


                    }
                    break;
                case 74 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1276:6: ( 'Medium_Spring_Green' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1276:6: ( 'Medium_Spring_Green' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1276:8: 'Medium_Spring_Green'
                    {
                    match(input,122,FOLLOW_122_in_ruleFMFFidColorEnum2400); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getMedium_Spring_GreenEnumLiteralDeclaration_73().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getMedium_Spring_GreenEnumLiteralDeclaration_73(), null); 
                        

                    }


                    }
                    break;
                case 75 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1282:6: ( 'Medium_Turquoise' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1282:6: ( 'Medium_Turquoise' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1282:8: 'Medium_Turquoise'
                    {
                    match(input,123,FOLLOW_123_in_ruleFMFFidColorEnum2415); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getMedium_TurquoiseEnumLiteralDeclaration_74().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getMedium_TurquoiseEnumLiteralDeclaration_74(), null); 
                        

                    }


                    }
                    break;
                case 76 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1288:6: ( 'Medium_Violet_Red' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1288:6: ( 'Medium_Violet_Red' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1288:8: 'Medium_Violet_Red'
                    {
                    match(input,124,FOLLOW_124_in_ruleFMFFidColorEnum2430); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getMedium_Violet_RedEnumLiteralDeclaration_75().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getMedium_Violet_RedEnumLiteralDeclaration_75(), null); 
                        

                    }


                    }
                    break;
                case 77 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1294:6: ( 'Medium_Wood' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1294:6: ( 'Medium_Wood' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1294:8: 'Medium_Wood'
                    {
                    match(input,125,FOLLOW_125_in_ruleFMFFidColorEnum2445); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getMedium_WoodEnumLiteralDeclaration_76().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getMedium_WoodEnumLiteralDeclaration_76(), null); 
                        

                    }


                    }
                    break;
                case 78 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1300:6: ( 'Midnight_Blue' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1300:6: ( 'Midnight_Blue' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1300:8: 'Midnight_Blue'
                    {
                    match(input,126,FOLLOW_126_in_ruleFMFFidColorEnum2460); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getMidnight_BlueEnumLiteralDeclaration_77().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getMidnight_BlueEnumLiteralDeclaration_77(), null); 
                        

                    }


                    }
                    break;
                case 79 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1306:6: ( 'Navy_Blue' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1306:6: ( 'Navy_Blue' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1306:8: 'Navy_Blue'
                    {
                    match(input,127,FOLLOW_127_in_ruleFMFFidColorEnum2475); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getNavy_BlueEnumLiteralDeclaration_78().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getNavy_BlueEnumLiteralDeclaration_78(), null); 
                        

                    }


                    }
                    break;
                case 80 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1312:6: ( 'Neon_Blue' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1312:6: ( 'Neon_Blue' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1312:8: 'Neon_Blue'
                    {
                    match(input,128,FOLLOW_128_in_ruleFMFFidColorEnum2490); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getNeon_BlueEnumLiteralDeclaration_79().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getNeon_BlueEnumLiteralDeclaration_79(), null); 
                        

                    }


                    }
                    break;
                case 81 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1318:6: ( 'Neon_Pink' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1318:6: ( 'Neon_Pink' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1318:8: 'Neon_Pink'
                    {
                    match(input,129,FOLLOW_129_in_ruleFMFFidColorEnum2505); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getNeon_PinkEnumLiteralDeclaration_80().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getNeon_PinkEnumLiteralDeclaration_80(), null); 
                        

                    }


                    }
                    break;
                case 82 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1324:6: ( 'New_Midnight_Blue' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1324:6: ( 'New_Midnight_Blue' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1324:8: 'New_Midnight_Blue'
                    {
                    match(input,130,FOLLOW_130_in_ruleFMFFidColorEnum2520); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getNew_Midnight_BlueEnumLiteralDeclaration_81().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getNew_Midnight_BlueEnumLiteralDeclaration_81(), null); 
                        

                    }


                    }
                    break;
                case 83 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1330:6: ( 'New_Tan' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1330:6: ( 'New_Tan' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1330:8: 'New_Tan'
                    {
                    match(input,131,FOLLOW_131_in_ruleFMFFidColorEnum2535); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getNew_TanEnumLiteralDeclaration_82().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getNew_TanEnumLiteralDeclaration_82(), null); 
                        

                    }


                    }
                    break;
                case 84 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1336:6: ( 'Old_Gold' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1336:6: ( 'Old_Gold' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1336:8: 'Old_Gold'
                    {
                    match(input,132,FOLLOW_132_in_ruleFMFFidColorEnum2550); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getOld_GoldEnumLiteralDeclaration_83().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getOld_GoldEnumLiteralDeclaration_83(), null); 
                        

                    }


                    }
                    break;
                case 85 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1342:6: ( 'Orange_Red' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1342:6: ( 'Orange_Red' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1342:8: 'Orange_Red'
                    {
                    match(input,133,FOLLOW_133_in_ruleFMFFidColorEnum2565); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getOrange_RedEnumLiteralDeclaration_84().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getOrange_RedEnumLiteralDeclaration_84(), null); 
                        

                    }


                    }
                    break;
                case 86 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1348:6: ( 'Orchid' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1348:6: ( 'Orchid' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1348:8: 'Orchid'
                    {
                    match(input,134,FOLLOW_134_in_ruleFMFFidColorEnum2580); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getOrchidEnumLiteralDeclaration_85().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getOrchidEnumLiteralDeclaration_85(), null); 
                        

                    }


                    }
                    break;
                case 87 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1354:6: ( 'Pale_Green' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1354:6: ( 'Pale_Green' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1354:8: 'Pale_Green'
                    {
                    match(input,135,FOLLOW_135_in_ruleFMFFidColorEnum2595); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getPale_GreenEnumLiteralDeclaration_86().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getPale_GreenEnumLiteralDeclaration_86(), null); 
                        

                    }


                    }
                    break;
                case 88 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1360:6: ( 'Plum' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1360:6: ( 'Plum' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1360:8: 'Plum'
                    {
                    match(input,136,FOLLOW_136_in_ruleFMFFidColorEnum2610); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getPlumEnumLiteralDeclaration_87().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getPlumEnumLiteralDeclaration_87(), null); 
                        

                    }


                    }
                    break;
                case 89 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1366:6: ( 'Quartz' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1366:6: ( 'Quartz' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1366:8: 'Quartz'
                    {
                    match(input,137,FOLLOW_137_in_ruleFMFFidColorEnum2625); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getQuartzEnumLiteralDeclaration_88().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getQuartzEnumLiteralDeclaration_88(), null); 
                        

                    }


                    }
                    break;
                case 90 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1372:6: ( 'Rich_Blue' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1372:6: ( 'Rich_Blue' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1372:8: 'Rich_Blue'
                    {
                    match(input,138,FOLLOW_138_in_ruleFMFFidColorEnum2640); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getRich_BlueEnumLiteralDeclaration_89().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getRich_BlueEnumLiteralDeclaration_89(), null); 
                        

                    }


                    }
                    break;
                case 91 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1378:6: ( 'Scarlet' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1378:6: ( 'Scarlet' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1378:8: 'Scarlet'
                    {
                    match(input,139,FOLLOW_139_in_ruleFMFFidColorEnum2655); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getScarletEnumLiteralDeclaration_90().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getScarletEnumLiteralDeclaration_90(), null); 
                        

                    }


                    }
                    break;
                case 92 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1384:6: ( 'Sea_Green' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1384:6: ( 'Sea_Green' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1384:8: 'Sea_Green'
                    {
                    match(input,140,FOLLOW_140_in_ruleFMFFidColorEnum2670); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getSea_GreenEnumLiteralDeclaration_91().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getSea_GreenEnumLiteralDeclaration_91(), null); 
                        

                    }


                    }
                    break;
                case 93 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1390:6: ( 'Semi_Sweet_Chocolate' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1390:6: ( 'Semi_Sweet_Chocolate' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1390:8: 'Semi_Sweet_Chocolate'
                    {
                    match(input,141,FOLLOW_141_in_ruleFMFFidColorEnum2685); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getSemi_Sweet_ChocolateEnumLiteralDeclaration_92().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getSemi_Sweet_ChocolateEnumLiteralDeclaration_92(), null); 
                        

                    }


                    }
                    break;
                case 94 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1396:6: ( 'Sky_Blue' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1396:6: ( 'Sky_Blue' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1396:8: 'Sky_Blue'
                    {
                    match(input,142,FOLLOW_142_in_ruleFMFFidColorEnum2700); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getSky_BlueEnumLiteralDeclaration_93().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getSky_BlueEnumLiteralDeclaration_93(), null); 
                        

                    }


                    }
                    break;
                case 95 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1402:6: ( 'Slate_Blue' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1402:6: ( 'Slate_Blue' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1402:8: 'Slate_Blue'
                    {
                    match(input,143,FOLLOW_143_in_ruleFMFFidColorEnum2715); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getSlate_BlueEnumLiteralDeclaration_94().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getSlate_BlueEnumLiteralDeclaration_94(), null); 
                        

                    }


                    }
                    break;
                case 96 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1408:6: ( 'Spicy_Pink' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1408:6: ( 'Spicy_Pink' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1408:8: 'Spicy_Pink'
                    {
                    match(input,144,FOLLOW_144_in_ruleFMFFidColorEnum2730); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getSpicy_PinkEnumLiteralDeclaration_95().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getSpicy_PinkEnumLiteralDeclaration_95(), null); 
                        

                    }


                    }
                    break;
                case 97 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1414:6: ( 'Spring_Green' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1414:6: ( 'Spring_Green' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1414:8: 'Spring_Green'
                    {
                    match(input,145,FOLLOW_145_in_ruleFMFFidColorEnum2745); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getSpring_GreenEnumLiteralDeclaration_96().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getSpring_GreenEnumLiteralDeclaration_96(), null); 
                        

                    }


                    }
                    break;
                case 98 :
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1420:6: ( 'Steel_Blue' )
                    {
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1420:6: ( 'Steel_Blue' )
                    // ../net.sf.fmurf.ui.dsl/src-gen/net/sf/fmurf/ui/parser/antlr/internal/InternalFmurfUiDSL.g:1420:8: 'Steel_Blue'
                    {
                    match(input,146,FOLLOW_146_in_ruleFMFFidColorEnum2760); 

                            current = grammarAccess.getFMFFidColorEnumAccess().getSteel_BlueEnumLiteralDeclaration_97().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getFMFFidColorEnumAccess().getSteel_BlueEnumLiteralDeclaration_97(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFMFFidColorEnum


 

    public static final BitSet FOLLOW_ruleFMFUI_in_entryRuleFMFUI75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFMFUI85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFMFSettings_in_ruleFMFUI131 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleFiducial_in_ruleFMFUI152 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleFiducial_in_entryRuleFiducial189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFiducial199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleFiducial234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFiducial251 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFiducial266 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFiducial283 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFiducial298 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFiducial308 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_ruleFMFFidStyleEnum_in_ruleFiducial329 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFiducial339 = new BitSet(new long[]{0x00007FC000000000L});
    public static final BitSet FOLLOW_ruleFMFKind_in_ruleFiducial360 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFiducial370 = new BitSet(new long[]{0xFFFE000000000000L,0xFFFFFFFFFFFFFFFFL,0x000000000007FFFFL});
    public static final BitSet FOLLOW_ruleFMFFidColorEnum_in_ruleFiducial391 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFiducial401 = new BitSet(new long[]{0xFFFE000000000000L,0xFFFFFFFFFFFFFFFFL,0x000000000007FFFFL});
    public static final BitSet FOLLOW_ruleFMFFidColorEnum_in_ruleFiducial422 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFiducial432 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFiducial449 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFiducial464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFiducial481 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFiducial496 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_ruleFMFProximaVisibleEnum_in_ruleFiducial517 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFiducial527 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleFMFFidFunctionEnum_in_ruleFiducial548 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFiducial558 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFiducial575 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFiducial590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFMFSettings_in_entryRuleFMFSettings626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFMFSettings636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFMFSettings671 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFMFSettings681 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFMFSettings698 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFMFSettings713 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFMFSettings730 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFMFSettings745 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFMFSettings762 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFMFSettings777 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFMFSettings794 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleFMFSettings809 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFMFSettings826 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleFMFSettings841 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFMFSettings858 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFMFSettings873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFMFProximaVisibleEnum921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFMFProximaVisibleEnum936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFMFFidStyleEnum979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFMFFidStyleEnum994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFMFFidStyleEnum1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFMFFidStyleEnum1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFMFFidStyleEnum1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleFMFKind1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFMFKind1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleFMFKind1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleFMFKind1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFMFKind1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleFMFKind1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleFMFKind1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleFMFKind1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleFMFKind1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleFMFFidFunctionEnum1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleFMFFidFunctionEnum1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleFMFFidColorEnum1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleFMFFidColorEnum1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleFMFFidColorEnum1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleFMFFidColorEnum1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleFMFFidColorEnum1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleFMFFidColorEnum1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleFMFFidColorEnum1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleFMFFidColorEnum1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleFMFFidColorEnum1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleFMFFidColorEnum1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleFMFFidColorEnum1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleFMFFidColorEnum1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleFMFFidColorEnum1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleFMFFidColorEnum1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleFMFFidColorEnum1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleFMFFidColorEnum1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleFMFFidColorEnum1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleFMFFidColorEnum1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleFMFFidColorEnum1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleFMFFidColorEnum1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleFMFFidColorEnum1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleFMFFidColorEnum1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleFMFFidColorEnum1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleFMFFidColorEnum1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleFMFFidColorEnum1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleFMFFidColorEnum1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleFMFFidColorEnum1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleFMFFidColorEnum1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleFMFFidColorEnum1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleFMFFidColorEnum1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleFMFFidColorEnum1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleFMFFidColorEnum1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleFMFFidColorEnum1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleFMFFidColorEnum1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleFMFFidColorEnum1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleFMFFidColorEnum1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleFMFFidColorEnum1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleFMFFidColorEnum1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleFMFFidColorEnum1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleFMFFidColorEnum1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleFMFFidColorEnum1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleFMFFidColorEnum1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleFMFFidColorEnum1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleFMFFidColorEnum1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleFMFFidColorEnum1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleFMFFidColorEnum1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleFMFFidColorEnum1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleFMFFidColorEnum2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleFMFFidColorEnum2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleFMFFidColorEnum2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleFMFFidColorEnum2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleFMFFidColorEnum2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleFMFFidColorEnum2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleFMFFidColorEnum2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleFMFFidColorEnum2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleFMFFidColorEnum2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleFMFFidColorEnum2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleFMFFidColorEnum2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleFMFFidColorEnum2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleFMFFidColorEnum2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleFMFFidColorEnum2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleFMFFidColorEnum2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleFMFFidColorEnum2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleFMFFidColorEnum2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleFMFFidColorEnum2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleFMFFidColorEnum2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleFMFFidColorEnum2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleFMFFidColorEnum2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleFMFFidColorEnum2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleFMFFidColorEnum2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleFMFFidColorEnum2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleFMFFidColorEnum2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleFMFFidColorEnum2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleFMFFidColorEnum2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleFMFFidColorEnum2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleFMFFidColorEnum2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleFMFFidColorEnum2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleFMFFidColorEnum2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleFMFFidColorEnum2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleFMFFidColorEnum2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleFMFFidColorEnum2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleFMFFidColorEnum2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleFMFFidColorEnum2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleFMFFidColorEnum2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleFMFFidColorEnum2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleFMFFidColorEnum2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleFMFFidColorEnum2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleFMFFidColorEnum2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleFMFFidColorEnum2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleFMFFidColorEnum2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleFMFFidColorEnum2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleFMFFidColorEnum2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_ruleFMFFidColorEnum2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_ruleFMFFidColorEnum2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_ruleFMFFidColorEnum2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_ruleFMFFidColorEnum2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_ruleFMFFidColorEnum2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_ruleFMFFidColorEnum2760 = new BitSet(new long[]{0x0000000000000002L});

}