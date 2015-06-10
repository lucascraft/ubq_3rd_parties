package net.sf.fmurf.ui.ui.contentassist.antlr.internal; 

import net.sf.fmurf.ui.services.FmurfUiDSLGrammarAccess;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

@SuppressWarnings("all")
public class InternalFmurfUiDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VISIBLE'", "'HIDDEN'", "'DISC'", "'SQUARE'", "'PENTAGON'", "'HEXAGON'", "'EIGHTSTAR'", "'SIN_OSC'", "'SQR_OSC'", "'PULSE_OSC'", "'TRI_OSC'", "'SAW_OSC'", "'SEQUENCER'", "'SAMPLER'", "'ECHO'", "'REVERB'", "'KNOB'", "'NONE'", "'Aquamarine'", "'Bakers_Chocolate'", "'Black'", "'Blue'", "'Brass'", "'Bright_Gold'", "'Brown'", "'Bronze'", "'Gold'", "'Grey'", "'Green'", "'Copper'", "'Coral'", "'Cyan'", "'Dark_Green'", "'Green_Yellow'", "'Magenta'", "'Maroon'", "'Medium_Blue'", "'Sienna'", "'Silver'", "'Salmon'", "'Orange'", "'Pink'", "'Red'", "'Summer_Sky'", "'Tan'", "'Thistle'", "'Turquoise'", "'Very_Dark_Brown'", "'Very_Light_Grey'", "'Violet'", "'Violet_Red'", "'Wheat'", "'White'", "'Yellow'", "'Yellow_Green'", "'Dark_Yellow'", "'Bronze_II'", "'Cadet_Blue'", "'Cool_Copper'", "'Corn_Flower_Blue'", "'Dark_Brown'", "'Dark_Green_Copper'", "'Dark_Olive_Green'", "'Dark_Orchid'", "'Dark_Purple'", "'Dark_Slate_Blue'", "'Dark_Turquoise'", "'Dark_Tan'", "'Dark_Wood'", "'Dim_Grey'", "'Dusty_Rose'", "'Feldspar'", "'Firebrick'", "'Forest_Green'", "'Goldenrod'", "'Green_Copper'", "'Hunter_Green'", "'Indian_Red'", "'Khaki'", "'Light_Blue'", "'Light_Grey'", "'Light_Steel_Blue'", "'Light_Wood'", "'Lime_Green'", "'Mandarian_Orange'", "'Medium_Aquamarine'", "'Medium_Forest_Green'", "'Medium_Goldenrod'", "'Medium_Orchid'", "'Medium_Sea_Green'", "'Medium_Slate_Blue'", "'Medium_Spring_Green'", "'Medium_Turquoise'", "'Medium_Violet_Red'", "'Medium_Wood'", "'Midnight_Blue'", "'Navy_Blue'", "'Neon_Blue'", "'Neon_Pink'", "'New_Midnight_Blue'", "'New_Tan'", "'Old_Gold'", "'Orange_Red'", "'Orchid'", "'Pale_Green'", "'Plum'", "'Quartz'", "'Rich_Blue'", "'Scarlet'", "'Sea_Green'", "'Semi_Sweet_Chocolate'", "'Sky_Blue'", "'Slate_Blue'", "'Spicy_Pink'", "'Spring_Green'", "'Steel_Blue'", "'fiducial'", "':'", "'{'", "'style:'", "'kind:'", "'foreground:'", "'background:'", "'radius:'", "'proxima:'", "'proximaVisible:'", "'function:'", "'range:'", "'}'", "'settings : {'", "'OscReceivePort:'", "'OscSendAddress:'", "'OscSendPort:'", "'TuioPort:'", "'liveRate:'", "'processingRate:'"
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
    public String getGrammarFileName() { return "../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g"; }


     
     	private FmurfUiDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FmurfUiDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleFMFUI
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:61:1: entryRuleFMFUI : ruleFMFUI EOF ;
    public final void entryRuleFMFUI() throws RecognitionException {
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:62:1: ( ruleFMFUI EOF )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:63:1: ruleFMFUI EOF
            {
             before(grammarAccess.getFMFUIRule()); 
            pushFollow(FOLLOW_ruleFMFUI_in_entryRuleFMFUI61);
            ruleFMFUI();
            _fsp--;

             after(grammarAccess.getFMFUIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFMFUI68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFMFUI


    // $ANTLR start ruleFMFUI
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:70:1: ruleFMFUI : ( ( rule__FMFUI__Group__0 ) ) ;
    public final void ruleFMFUI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:74:2: ( ( ( rule__FMFUI__Group__0 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:75:1: ( ( rule__FMFUI__Group__0 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:75:1: ( ( rule__FMFUI__Group__0 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:76:1: ( rule__FMFUI__Group__0 )
            {
             before(grammarAccess.getFMFUIAccess().getGroup()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:77:1: ( rule__FMFUI__Group__0 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:77:2: rule__FMFUI__Group__0
            {
            pushFollow(FOLLOW_rule__FMFUI__Group__0_in_ruleFMFUI94);
            rule__FMFUI__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFMFUIAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFMFUI


    // $ANTLR start entryRuleFiducial
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:89:1: entryRuleFiducial : ruleFiducial EOF ;
    public final void entryRuleFiducial() throws RecognitionException {
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:90:1: ( ruleFiducial EOF )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:91:1: ruleFiducial EOF
            {
             before(grammarAccess.getFiducialRule()); 
            pushFollow(FOLLOW_ruleFiducial_in_entryRuleFiducial121);
            ruleFiducial();
            _fsp--;

             after(grammarAccess.getFiducialRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFiducial128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFiducial


    // $ANTLR start ruleFiducial
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:98:1: ruleFiducial : ( ( rule__Fiducial__Group__0 ) ) ;
    public final void ruleFiducial() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:102:2: ( ( ( rule__Fiducial__Group__0 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:103:1: ( ( rule__Fiducial__Group__0 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:103:1: ( ( rule__Fiducial__Group__0 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:104:1: ( rule__Fiducial__Group__0 )
            {
             before(grammarAccess.getFiducialAccess().getGroup()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:105:1: ( rule__Fiducial__Group__0 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:105:2: rule__Fiducial__Group__0
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__0_in_ruleFiducial154);
            rule__Fiducial__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFiducialAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFiducial


    // $ANTLR start entryRuleFMFSettings
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:117:1: entryRuleFMFSettings : ruleFMFSettings EOF ;
    public final void entryRuleFMFSettings() throws RecognitionException {
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:118:1: ( ruleFMFSettings EOF )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:119:1: ruleFMFSettings EOF
            {
             before(grammarAccess.getFMFSettingsRule()); 
            pushFollow(FOLLOW_ruleFMFSettings_in_entryRuleFMFSettings181);
            ruleFMFSettings();
            _fsp--;

             after(grammarAccess.getFMFSettingsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFMFSettings188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFMFSettings


    // $ANTLR start ruleFMFSettings
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:126:1: ruleFMFSettings : ( ( rule__FMFSettings__Group__0 ) ) ;
    public final void ruleFMFSettings() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:130:2: ( ( ( rule__FMFSettings__Group__0 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:131:1: ( ( rule__FMFSettings__Group__0 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:131:1: ( ( rule__FMFSettings__Group__0 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:132:1: ( rule__FMFSettings__Group__0 )
            {
             before(grammarAccess.getFMFSettingsAccess().getGroup()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:133:1: ( rule__FMFSettings__Group__0 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:133:2: rule__FMFSettings__Group__0
            {
            pushFollow(FOLLOW_rule__FMFSettings__Group__0_in_ruleFMFSettings214);
            rule__FMFSettings__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFMFSettingsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFMFSettings


    // $ANTLR start ruleFMFProximaVisibleEnum
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:146:1: ruleFMFProximaVisibleEnum : ( ( rule__FMFProximaVisibleEnum__Alternatives ) ) ;
    public final void ruleFMFProximaVisibleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:150:1: ( ( ( rule__FMFProximaVisibleEnum__Alternatives ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:151:1: ( ( rule__FMFProximaVisibleEnum__Alternatives ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:151:1: ( ( rule__FMFProximaVisibleEnum__Alternatives ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:152:1: ( rule__FMFProximaVisibleEnum__Alternatives )
            {
             before(grammarAccess.getFMFProximaVisibleEnumAccess().getAlternatives()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:153:1: ( rule__FMFProximaVisibleEnum__Alternatives )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:153:2: rule__FMFProximaVisibleEnum__Alternatives
            {
            pushFollow(FOLLOW_rule__FMFProximaVisibleEnum__Alternatives_in_ruleFMFProximaVisibleEnum251);
            rule__FMFProximaVisibleEnum__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getFMFProximaVisibleEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFMFProximaVisibleEnum


    // $ANTLR start ruleFMFFidStyleEnum
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:165:1: ruleFMFFidStyleEnum : ( ( rule__FMFFidStyleEnum__Alternatives ) ) ;
    public final void ruleFMFFidStyleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:169:1: ( ( ( rule__FMFFidStyleEnum__Alternatives ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:170:1: ( ( rule__FMFFidStyleEnum__Alternatives ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:170:1: ( ( rule__FMFFidStyleEnum__Alternatives ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:171:1: ( rule__FMFFidStyleEnum__Alternatives )
            {
             before(grammarAccess.getFMFFidStyleEnumAccess().getAlternatives()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:172:1: ( rule__FMFFidStyleEnum__Alternatives )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:172:2: rule__FMFFidStyleEnum__Alternatives
            {
            pushFollow(FOLLOW_rule__FMFFidStyleEnum__Alternatives_in_ruleFMFFidStyleEnum287);
            rule__FMFFidStyleEnum__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getFMFFidStyleEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFMFFidStyleEnum


    // $ANTLR start ruleFMFKind
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:184:1: ruleFMFKind : ( ( rule__FMFKind__Alternatives ) ) ;
    public final void ruleFMFKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:188:1: ( ( ( rule__FMFKind__Alternatives ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:189:1: ( ( rule__FMFKind__Alternatives ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:189:1: ( ( rule__FMFKind__Alternatives ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:190:1: ( rule__FMFKind__Alternatives )
            {
             before(grammarAccess.getFMFKindAccess().getAlternatives()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:191:1: ( rule__FMFKind__Alternatives )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:191:2: rule__FMFKind__Alternatives
            {
            pushFollow(FOLLOW_rule__FMFKind__Alternatives_in_ruleFMFKind323);
            rule__FMFKind__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getFMFKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFMFKind


    // $ANTLR start ruleFMFFidFunctionEnum
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:203:1: ruleFMFFidFunctionEnum : ( ( rule__FMFFidFunctionEnum__Alternatives ) ) ;
    public final void ruleFMFFidFunctionEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:207:1: ( ( ( rule__FMFFidFunctionEnum__Alternatives ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:208:1: ( ( rule__FMFFidFunctionEnum__Alternatives ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:208:1: ( ( rule__FMFFidFunctionEnum__Alternatives ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:209:1: ( rule__FMFFidFunctionEnum__Alternatives )
            {
             before(grammarAccess.getFMFFidFunctionEnumAccess().getAlternatives()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:210:1: ( rule__FMFFidFunctionEnum__Alternatives )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:210:2: rule__FMFFidFunctionEnum__Alternatives
            {
            pushFollow(FOLLOW_rule__FMFFidFunctionEnum__Alternatives_in_ruleFMFFidFunctionEnum359);
            rule__FMFFidFunctionEnum__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getFMFFidFunctionEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFMFFidFunctionEnum


    // $ANTLR start ruleFMFFidColorEnum
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:224:1: ruleFMFFidColorEnum : ( ( rule__FMFFidColorEnum__Alternatives ) ) ;
    public final void ruleFMFFidColorEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:228:1: ( ( ( rule__FMFFidColorEnum__Alternatives ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:229:1: ( ( rule__FMFFidColorEnum__Alternatives ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:229:1: ( ( rule__FMFFidColorEnum__Alternatives ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:230:1: ( rule__FMFFidColorEnum__Alternatives )
            {
             before(grammarAccess.getFMFFidColorEnumAccess().getAlternatives()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:231:1: ( rule__FMFFidColorEnum__Alternatives )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:231:2: rule__FMFFidColorEnum__Alternatives
            {
            pushFollow(FOLLOW_rule__FMFFidColorEnum__Alternatives_in_ruleFMFFidColorEnum397);
            rule__FMFFidColorEnum__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getFMFFidColorEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFMFFidColorEnum


    // $ANTLR start rule__FMFProximaVisibleEnum__Alternatives
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:242:1: rule__FMFProximaVisibleEnum__Alternatives : ( ( ( 'VISIBLE' ) ) | ( ( 'HIDDEN' ) ) );
    public final void rule__FMFProximaVisibleEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:246:1: ( ( ( 'VISIBLE' ) ) | ( ( 'HIDDEN' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("242:1: rule__FMFProximaVisibleEnum__Alternatives : ( ( ( 'VISIBLE' ) ) | ( ( 'HIDDEN' ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:247:1: ( ( 'VISIBLE' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:247:1: ( ( 'VISIBLE' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:248:1: ( 'VISIBLE' )
                    {
                     before(grammarAccess.getFMFProximaVisibleEnumAccess().getVISIBLEEnumLiteralDeclaration_0()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:249:1: ( 'VISIBLE' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:249:3: 'VISIBLE'
                    {
                    match(input,11,FOLLOW_11_in_rule__FMFProximaVisibleEnum__Alternatives433); 

                    }

                     after(grammarAccess.getFMFProximaVisibleEnumAccess().getVISIBLEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:254:6: ( ( 'HIDDEN' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:254:6: ( ( 'HIDDEN' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:255:1: ( 'HIDDEN' )
                    {
                     before(grammarAccess.getFMFProximaVisibleEnumAccess().getHIDDENEnumLiteralDeclaration_1()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:256:1: ( 'HIDDEN' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:256:3: 'HIDDEN'
                    {
                    match(input,12,FOLLOW_12_in_rule__FMFProximaVisibleEnum__Alternatives454); 

                    }

                     after(grammarAccess.getFMFProximaVisibleEnumAccess().getHIDDENEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFProximaVisibleEnum__Alternatives


    // $ANTLR start rule__FMFFidStyleEnum__Alternatives
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:266:1: rule__FMFFidStyleEnum__Alternatives : ( ( ( 'DISC' ) ) | ( ( 'SQUARE' ) ) | ( ( 'PENTAGON' ) ) | ( ( 'HEXAGON' ) ) | ( ( 'EIGHTSTAR' ) ) );
    public final void rule__FMFFidStyleEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:270:1: ( ( ( 'DISC' ) ) | ( ( 'SQUARE' ) ) | ( ( 'PENTAGON' ) ) | ( ( 'HEXAGON' ) ) | ( ( 'EIGHTSTAR' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("266:1: rule__FMFFidStyleEnum__Alternatives : ( ( ( 'DISC' ) ) | ( ( 'SQUARE' ) ) | ( ( 'PENTAGON' ) ) | ( ( 'HEXAGON' ) ) | ( ( 'EIGHTSTAR' ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:271:1: ( ( 'DISC' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:271:1: ( ( 'DISC' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:272:1: ( 'DISC' )
                    {
                     before(grammarAccess.getFMFFidStyleEnumAccess().getDISCEnumLiteralDeclaration_0()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:273:1: ( 'DISC' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:273:3: 'DISC'
                    {
                    match(input,13,FOLLOW_13_in_rule__FMFFidStyleEnum__Alternatives490); 

                    }

                     after(grammarAccess.getFMFFidStyleEnumAccess().getDISCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:278:6: ( ( 'SQUARE' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:278:6: ( ( 'SQUARE' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:279:1: ( 'SQUARE' )
                    {
                     before(grammarAccess.getFMFFidStyleEnumAccess().getSQUAREEnumLiteralDeclaration_1()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:280:1: ( 'SQUARE' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:280:3: 'SQUARE'
                    {
                    match(input,14,FOLLOW_14_in_rule__FMFFidStyleEnum__Alternatives511); 

                    }

                     after(grammarAccess.getFMFFidStyleEnumAccess().getSQUAREEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:285:6: ( ( 'PENTAGON' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:285:6: ( ( 'PENTAGON' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:286:1: ( 'PENTAGON' )
                    {
                     before(grammarAccess.getFMFFidStyleEnumAccess().getPENTAGONEnumLiteralDeclaration_2()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:287:1: ( 'PENTAGON' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:287:3: 'PENTAGON'
                    {
                    match(input,15,FOLLOW_15_in_rule__FMFFidStyleEnum__Alternatives532); 

                    }

                     after(grammarAccess.getFMFFidStyleEnumAccess().getPENTAGONEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:292:6: ( ( 'HEXAGON' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:292:6: ( ( 'HEXAGON' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:293:1: ( 'HEXAGON' )
                    {
                     before(grammarAccess.getFMFFidStyleEnumAccess().getHEXAGONEnumLiteralDeclaration_3()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:294:1: ( 'HEXAGON' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:294:3: 'HEXAGON'
                    {
                    match(input,16,FOLLOW_16_in_rule__FMFFidStyleEnum__Alternatives553); 

                    }

                     after(grammarAccess.getFMFFidStyleEnumAccess().getHEXAGONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:299:6: ( ( 'EIGHTSTAR' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:299:6: ( ( 'EIGHTSTAR' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:300:1: ( 'EIGHTSTAR' )
                    {
                     before(grammarAccess.getFMFFidStyleEnumAccess().getEIGHTSTAREnumLiteralDeclaration_4()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:301:1: ( 'EIGHTSTAR' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:301:3: 'EIGHTSTAR'
                    {
                    match(input,17,FOLLOW_17_in_rule__FMFFidStyleEnum__Alternatives574); 

                    }

                     after(grammarAccess.getFMFFidStyleEnumAccess().getEIGHTSTAREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFFidStyleEnum__Alternatives


    // $ANTLR start rule__FMFKind__Alternatives
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:311:1: rule__FMFKind__Alternatives : ( ( ( 'SIN_OSC' ) ) | ( ( 'SQR_OSC' ) ) | ( ( 'PULSE_OSC' ) ) | ( ( 'TRI_OSC' ) ) | ( ( 'SAW_OSC' ) ) | ( ( 'SEQUENCER' ) ) | ( ( 'SAMPLER' ) ) | ( ( 'ECHO' ) ) | ( ( 'REVERB' ) ) );
    public final void rule__FMFKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:315:1: ( ( ( 'SIN_OSC' ) ) | ( ( 'SQR_OSC' ) ) | ( ( 'PULSE_OSC' ) ) | ( ( 'TRI_OSC' ) ) | ( ( 'SAW_OSC' ) ) | ( ( 'SEQUENCER' ) ) | ( ( 'SAMPLER' ) ) | ( ( 'ECHO' ) ) | ( ( 'REVERB' ) ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            case 22:
                {
                alt3=5;
                }
                break;
            case 23:
                {
                alt3=6;
                }
                break;
            case 24:
                {
                alt3=7;
                }
                break;
            case 25:
                {
                alt3=8;
                }
                break;
            case 26:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("311:1: rule__FMFKind__Alternatives : ( ( ( 'SIN_OSC' ) ) | ( ( 'SQR_OSC' ) ) | ( ( 'PULSE_OSC' ) ) | ( ( 'TRI_OSC' ) ) | ( ( 'SAW_OSC' ) ) | ( ( 'SEQUENCER' ) ) | ( ( 'SAMPLER' ) ) | ( ( 'ECHO' ) ) | ( ( 'REVERB' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:316:1: ( ( 'SIN_OSC' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:316:1: ( ( 'SIN_OSC' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:317:1: ( 'SIN_OSC' )
                    {
                     before(grammarAccess.getFMFKindAccess().getSIN_OSCEnumLiteralDeclaration_0()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:318:1: ( 'SIN_OSC' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:318:3: 'SIN_OSC'
                    {
                    match(input,18,FOLLOW_18_in_rule__FMFKind__Alternatives610); 

                    }

                     after(grammarAccess.getFMFKindAccess().getSIN_OSCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:323:6: ( ( 'SQR_OSC' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:323:6: ( ( 'SQR_OSC' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:324:1: ( 'SQR_OSC' )
                    {
                     before(grammarAccess.getFMFKindAccess().getSQR_OSCEnumLiteralDeclaration_1()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:325:1: ( 'SQR_OSC' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:325:3: 'SQR_OSC'
                    {
                    match(input,19,FOLLOW_19_in_rule__FMFKind__Alternatives631); 

                    }

                     after(grammarAccess.getFMFKindAccess().getSQR_OSCEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:330:6: ( ( 'PULSE_OSC' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:330:6: ( ( 'PULSE_OSC' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:331:1: ( 'PULSE_OSC' )
                    {
                     before(grammarAccess.getFMFKindAccess().getPULSE_OSCEnumLiteralDeclaration_2()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:332:1: ( 'PULSE_OSC' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:332:3: 'PULSE_OSC'
                    {
                    match(input,20,FOLLOW_20_in_rule__FMFKind__Alternatives652); 

                    }

                     after(grammarAccess.getFMFKindAccess().getPULSE_OSCEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:337:6: ( ( 'TRI_OSC' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:337:6: ( ( 'TRI_OSC' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:338:1: ( 'TRI_OSC' )
                    {
                     before(grammarAccess.getFMFKindAccess().getTRI_OSCEnumLiteralDeclaration_3()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:339:1: ( 'TRI_OSC' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:339:3: 'TRI_OSC'
                    {
                    match(input,21,FOLLOW_21_in_rule__FMFKind__Alternatives673); 

                    }

                     after(grammarAccess.getFMFKindAccess().getTRI_OSCEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:344:6: ( ( 'SAW_OSC' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:344:6: ( ( 'SAW_OSC' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:345:1: ( 'SAW_OSC' )
                    {
                     before(grammarAccess.getFMFKindAccess().getSAW_OSCEnumLiteralDeclaration_4()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:346:1: ( 'SAW_OSC' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:346:3: 'SAW_OSC'
                    {
                    match(input,22,FOLLOW_22_in_rule__FMFKind__Alternatives694); 

                    }

                     after(grammarAccess.getFMFKindAccess().getSAW_OSCEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:351:6: ( ( 'SEQUENCER' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:351:6: ( ( 'SEQUENCER' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:352:1: ( 'SEQUENCER' )
                    {
                     before(grammarAccess.getFMFKindAccess().getSEQUENCEREnumLiteralDeclaration_5()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:353:1: ( 'SEQUENCER' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:353:3: 'SEQUENCER'
                    {
                    match(input,23,FOLLOW_23_in_rule__FMFKind__Alternatives715); 

                    }

                     after(grammarAccess.getFMFKindAccess().getSEQUENCEREnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:358:6: ( ( 'SAMPLER' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:358:6: ( ( 'SAMPLER' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:359:1: ( 'SAMPLER' )
                    {
                     before(grammarAccess.getFMFKindAccess().getSAMPLEREnumLiteralDeclaration_6()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:360:1: ( 'SAMPLER' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:360:3: 'SAMPLER'
                    {
                    match(input,24,FOLLOW_24_in_rule__FMFKind__Alternatives736); 

                    }

                     after(grammarAccess.getFMFKindAccess().getSAMPLEREnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:365:6: ( ( 'ECHO' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:365:6: ( ( 'ECHO' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:366:1: ( 'ECHO' )
                    {
                     before(grammarAccess.getFMFKindAccess().getECHOEnumLiteralDeclaration_7()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:367:1: ( 'ECHO' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:367:3: 'ECHO'
                    {
                    match(input,25,FOLLOW_25_in_rule__FMFKind__Alternatives757); 

                    }

                     after(grammarAccess.getFMFKindAccess().getECHOEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:372:6: ( ( 'REVERB' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:372:6: ( ( 'REVERB' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:373:1: ( 'REVERB' )
                    {
                     before(grammarAccess.getFMFKindAccess().getREVERBEnumLiteralDeclaration_8()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:374:1: ( 'REVERB' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:374:3: 'REVERB'
                    {
                    match(input,26,FOLLOW_26_in_rule__FMFKind__Alternatives778); 

                    }

                     after(grammarAccess.getFMFKindAccess().getREVERBEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFKind__Alternatives


    // $ANTLR start rule__FMFFidFunctionEnum__Alternatives
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:384:1: rule__FMFFidFunctionEnum__Alternatives : ( ( ( 'KNOB' ) ) | ( ( 'NONE' ) ) );
    public final void rule__FMFFidFunctionEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:388:1: ( ( ( 'KNOB' ) ) | ( ( 'NONE' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            else if ( (LA4_0==28) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("384:1: rule__FMFFidFunctionEnum__Alternatives : ( ( ( 'KNOB' ) ) | ( ( 'NONE' ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:389:1: ( ( 'KNOB' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:389:1: ( ( 'KNOB' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:390:1: ( 'KNOB' )
                    {
                     before(grammarAccess.getFMFFidFunctionEnumAccess().getKNOBEnumLiteralDeclaration_0()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:391:1: ( 'KNOB' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:391:3: 'KNOB'
                    {
                    match(input,27,FOLLOW_27_in_rule__FMFFidFunctionEnum__Alternatives814); 

                    }

                     after(grammarAccess.getFMFFidFunctionEnumAccess().getKNOBEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:396:6: ( ( 'NONE' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:396:6: ( ( 'NONE' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:397:1: ( 'NONE' )
                    {
                     before(grammarAccess.getFMFFidFunctionEnumAccess().getNONEEnumLiteralDeclaration_1()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:398:1: ( 'NONE' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:398:3: 'NONE'
                    {
                    match(input,28,FOLLOW_28_in_rule__FMFFidFunctionEnum__Alternatives835); 

                    }

                     after(grammarAccess.getFMFFidFunctionEnumAccess().getNONEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFFidFunctionEnum__Alternatives


    // $ANTLR start rule__FMFFidColorEnum__Alternatives
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:409:1: rule__FMFFidColorEnum__Alternatives : ( ( ( 'Aquamarine' ) ) | ( ( 'Bakers_Chocolate' ) ) | ( ( 'Black' ) ) | ( ( 'Blue' ) ) | ( ( 'Brass' ) ) | ( ( 'Bright_Gold' ) ) | ( ( 'Brown' ) ) | ( ( 'Bronze' ) ) | ( ( 'Gold' ) ) | ( ( 'Grey' ) ) | ( ( 'Green' ) ) | ( ( 'Copper' ) ) | ( ( 'Coral' ) ) | ( ( 'Cyan' ) ) | ( ( 'Dark_Green' ) ) | ( ( 'Green_Yellow' ) ) | ( ( 'Magenta' ) ) | ( ( 'Maroon' ) ) | ( ( 'Medium_Blue' ) ) | ( ( 'Sienna' ) ) | ( ( 'Silver' ) ) | ( ( 'Salmon' ) ) | ( ( 'Orange' ) ) | ( ( 'Pink' ) ) | ( ( 'Red' ) ) | ( ( 'Summer_Sky' ) ) | ( ( 'Tan' ) ) | ( ( 'Thistle' ) ) | ( ( 'Turquoise' ) ) | ( ( 'Very_Dark_Brown' ) ) | ( ( 'Very_Light_Grey' ) ) | ( ( 'Violet' ) ) | ( ( 'Violet_Red' ) ) | ( ( 'Wheat' ) ) | ( ( 'White' ) ) | ( ( 'Yellow' ) ) | ( ( 'Yellow_Green' ) ) | ( ( 'Dark_Yellow' ) ) | ( ( 'Bronze_II' ) ) | ( ( 'Cadet_Blue' ) ) | ( ( 'Cool_Copper' ) ) | ( ( 'Corn_Flower_Blue' ) ) | ( ( 'Dark_Brown' ) ) | ( ( 'Dark_Green_Copper' ) ) | ( ( 'Dark_Olive_Green' ) ) | ( ( 'Dark_Orchid' ) ) | ( ( 'Dark_Purple' ) ) | ( ( 'Dark_Slate_Blue' ) ) | ( ( 'Dark_Turquoise' ) ) | ( ( 'Dark_Tan' ) ) | ( ( 'Dark_Wood' ) ) | ( ( 'Dim_Grey' ) ) | ( ( 'Dusty_Rose' ) ) | ( ( 'Feldspar' ) ) | ( ( 'Firebrick' ) ) | ( ( 'Forest_Green' ) ) | ( ( 'Goldenrod' ) ) | ( ( 'Green_Copper' ) ) | ( ( 'Hunter_Green' ) ) | ( ( 'Indian_Red' ) ) | ( ( 'Khaki' ) ) | ( ( 'Light_Blue' ) ) | ( ( 'Light_Grey' ) ) | ( ( 'Light_Steel_Blue' ) ) | ( ( 'Light_Wood' ) ) | ( ( 'Lime_Green' ) ) | ( ( 'Mandarian_Orange' ) ) | ( ( 'Medium_Aquamarine' ) ) | ( ( 'Medium_Forest_Green' ) ) | ( ( 'Medium_Goldenrod' ) ) | ( ( 'Medium_Orchid' ) ) | ( ( 'Medium_Sea_Green' ) ) | ( ( 'Medium_Slate_Blue' ) ) | ( ( 'Medium_Spring_Green' ) ) | ( ( 'Medium_Turquoise' ) ) | ( ( 'Medium_Violet_Red' ) ) | ( ( 'Medium_Wood' ) ) | ( ( 'Midnight_Blue' ) ) | ( ( 'Navy_Blue' ) ) | ( ( 'Neon_Blue' ) ) | ( ( 'Neon_Pink' ) ) | ( ( 'New_Midnight_Blue' ) ) | ( ( 'New_Tan' ) ) | ( ( 'Old_Gold' ) ) | ( ( 'Orange_Red' ) ) | ( ( 'Orchid' ) ) | ( ( 'Pale_Green' ) ) | ( ( 'Plum' ) ) | ( ( 'Quartz' ) ) | ( ( 'Rich_Blue' ) ) | ( ( 'Scarlet' ) ) | ( ( 'Sea_Green' ) ) | ( ( 'Semi_Sweet_Chocolate' ) ) | ( ( 'Sky_Blue' ) ) | ( ( 'Slate_Blue' ) ) | ( ( 'Spicy_Pink' ) ) | ( ( 'Spring_Green' ) ) | ( ( 'Steel_Blue' ) ) );
    public final void rule__FMFFidColorEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:413:1: ( ( ( 'Aquamarine' ) ) | ( ( 'Bakers_Chocolate' ) ) | ( ( 'Black' ) ) | ( ( 'Blue' ) ) | ( ( 'Brass' ) ) | ( ( 'Bright_Gold' ) ) | ( ( 'Brown' ) ) | ( ( 'Bronze' ) ) | ( ( 'Gold' ) ) | ( ( 'Grey' ) ) | ( ( 'Green' ) ) | ( ( 'Copper' ) ) | ( ( 'Coral' ) ) | ( ( 'Cyan' ) ) | ( ( 'Dark_Green' ) ) | ( ( 'Green_Yellow' ) ) | ( ( 'Magenta' ) ) | ( ( 'Maroon' ) ) | ( ( 'Medium_Blue' ) ) | ( ( 'Sienna' ) ) | ( ( 'Silver' ) ) | ( ( 'Salmon' ) ) | ( ( 'Orange' ) ) | ( ( 'Pink' ) ) | ( ( 'Red' ) ) | ( ( 'Summer_Sky' ) ) | ( ( 'Tan' ) ) | ( ( 'Thistle' ) ) | ( ( 'Turquoise' ) ) | ( ( 'Very_Dark_Brown' ) ) | ( ( 'Very_Light_Grey' ) ) | ( ( 'Violet' ) ) | ( ( 'Violet_Red' ) ) | ( ( 'Wheat' ) ) | ( ( 'White' ) ) | ( ( 'Yellow' ) ) | ( ( 'Yellow_Green' ) ) | ( ( 'Dark_Yellow' ) ) | ( ( 'Bronze_II' ) ) | ( ( 'Cadet_Blue' ) ) | ( ( 'Cool_Copper' ) ) | ( ( 'Corn_Flower_Blue' ) ) | ( ( 'Dark_Brown' ) ) | ( ( 'Dark_Green_Copper' ) ) | ( ( 'Dark_Olive_Green' ) ) | ( ( 'Dark_Orchid' ) ) | ( ( 'Dark_Purple' ) ) | ( ( 'Dark_Slate_Blue' ) ) | ( ( 'Dark_Turquoise' ) ) | ( ( 'Dark_Tan' ) ) | ( ( 'Dark_Wood' ) ) | ( ( 'Dim_Grey' ) ) | ( ( 'Dusty_Rose' ) ) | ( ( 'Feldspar' ) ) | ( ( 'Firebrick' ) ) | ( ( 'Forest_Green' ) ) | ( ( 'Goldenrod' ) ) | ( ( 'Green_Copper' ) ) | ( ( 'Hunter_Green' ) ) | ( ( 'Indian_Red' ) ) | ( ( 'Khaki' ) ) | ( ( 'Light_Blue' ) ) | ( ( 'Light_Grey' ) ) | ( ( 'Light_Steel_Blue' ) ) | ( ( 'Light_Wood' ) ) | ( ( 'Lime_Green' ) ) | ( ( 'Mandarian_Orange' ) ) | ( ( 'Medium_Aquamarine' ) ) | ( ( 'Medium_Forest_Green' ) ) | ( ( 'Medium_Goldenrod' ) ) | ( ( 'Medium_Orchid' ) ) | ( ( 'Medium_Sea_Green' ) ) | ( ( 'Medium_Slate_Blue' ) ) | ( ( 'Medium_Spring_Green' ) ) | ( ( 'Medium_Turquoise' ) ) | ( ( 'Medium_Violet_Red' ) ) | ( ( 'Medium_Wood' ) ) | ( ( 'Midnight_Blue' ) ) | ( ( 'Navy_Blue' ) ) | ( ( 'Neon_Blue' ) ) | ( ( 'Neon_Pink' ) ) | ( ( 'New_Midnight_Blue' ) ) | ( ( 'New_Tan' ) ) | ( ( 'Old_Gold' ) ) | ( ( 'Orange_Red' ) ) | ( ( 'Orchid' ) ) | ( ( 'Pale_Green' ) ) | ( ( 'Plum' ) ) | ( ( 'Quartz' ) ) | ( ( 'Rich_Blue' ) ) | ( ( 'Scarlet' ) ) | ( ( 'Sea_Green' ) ) | ( ( 'Semi_Sweet_Chocolate' ) ) | ( ( 'Sky_Blue' ) ) | ( ( 'Slate_Blue' ) ) | ( ( 'Spicy_Pink' ) ) | ( ( 'Spring_Green' ) ) | ( ( 'Steel_Blue' ) ) )
            int alt5=98;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 31:
                {
                alt5=3;
                }
                break;
            case 32:
                {
                alt5=4;
                }
                break;
            case 33:
                {
                alt5=5;
                }
                break;
            case 34:
                {
                alt5=6;
                }
                break;
            case 35:
                {
                alt5=7;
                }
                break;
            case 36:
                {
                alt5=8;
                }
                break;
            case 37:
                {
                alt5=9;
                }
                break;
            case 38:
                {
                alt5=10;
                }
                break;
            case 39:
                {
                alt5=11;
                }
                break;
            case 40:
                {
                alt5=12;
                }
                break;
            case 41:
                {
                alt5=13;
                }
                break;
            case 42:
                {
                alt5=14;
                }
                break;
            case 43:
                {
                alt5=15;
                }
                break;
            case 44:
                {
                alt5=16;
                }
                break;
            case 45:
                {
                alt5=17;
                }
                break;
            case 46:
                {
                alt5=18;
                }
                break;
            case 47:
                {
                alt5=19;
                }
                break;
            case 48:
                {
                alt5=20;
                }
                break;
            case 49:
                {
                alt5=21;
                }
                break;
            case 50:
                {
                alt5=22;
                }
                break;
            case 51:
                {
                alt5=23;
                }
                break;
            case 52:
                {
                alt5=24;
                }
                break;
            case 53:
                {
                alt5=25;
                }
                break;
            case 54:
                {
                alt5=26;
                }
                break;
            case 55:
                {
                alt5=27;
                }
                break;
            case 56:
                {
                alt5=28;
                }
                break;
            case 57:
                {
                alt5=29;
                }
                break;
            case 58:
                {
                alt5=30;
                }
                break;
            case 59:
                {
                alt5=31;
                }
                break;
            case 60:
                {
                alt5=32;
                }
                break;
            case 61:
                {
                alt5=33;
                }
                break;
            case 62:
                {
                alt5=34;
                }
                break;
            case 63:
                {
                alt5=35;
                }
                break;
            case 64:
                {
                alt5=36;
                }
                break;
            case 65:
                {
                alt5=37;
                }
                break;
            case 66:
                {
                alt5=38;
                }
                break;
            case 67:
                {
                alt5=39;
                }
                break;
            case 68:
                {
                alt5=40;
                }
                break;
            case 69:
                {
                alt5=41;
                }
                break;
            case 70:
                {
                alt5=42;
                }
                break;
            case 71:
                {
                alt5=43;
                }
                break;
            case 72:
                {
                alt5=44;
                }
                break;
            case 73:
                {
                alt5=45;
                }
                break;
            case 74:
                {
                alt5=46;
                }
                break;
            case 75:
                {
                alt5=47;
                }
                break;
            case 76:
                {
                alt5=48;
                }
                break;
            case 77:
                {
                alt5=49;
                }
                break;
            case 78:
                {
                alt5=50;
                }
                break;
            case 79:
                {
                alt5=51;
                }
                break;
            case 80:
                {
                alt5=52;
                }
                break;
            case 81:
                {
                alt5=53;
                }
                break;
            case 82:
                {
                alt5=54;
                }
                break;
            case 83:
                {
                alt5=55;
                }
                break;
            case 84:
                {
                alt5=56;
                }
                break;
            case 85:
                {
                alt5=57;
                }
                break;
            case 86:
                {
                alt5=58;
                }
                break;
            case 87:
                {
                alt5=59;
                }
                break;
            case 88:
                {
                alt5=60;
                }
                break;
            case 89:
                {
                alt5=61;
                }
                break;
            case 90:
                {
                alt5=62;
                }
                break;
            case 91:
                {
                alt5=63;
                }
                break;
            case 92:
                {
                alt5=64;
                }
                break;
            case 93:
                {
                alt5=65;
                }
                break;
            case 94:
                {
                alt5=66;
                }
                break;
            case 95:
                {
                alt5=67;
                }
                break;
            case 96:
                {
                alt5=68;
                }
                break;
            case 97:
                {
                alt5=69;
                }
                break;
            case 98:
                {
                alt5=70;
                }
                break;
            case 99:
                {
                alt5=71;
                }
                break;
            case 100:
                {
                alt5=72;
                }
                break;
            case 101:
                {
                alt5=73;
                }
                break;
            case 102:
                {
                alt5=74;
                }
                break;
            case 103:
                {
                alt5=75;
                }
                break;
            case 104:
                {
                alt5=76;
                }
                break;
            case 105:
                {
                alt5=77;
                }
                break;
            case 106:
                {
                alt5=78;
                }
                break;
            case 107:
                {
                alt5=79;
                }
                break;
            case 108:
                {
                alt5=80;
                }
                break;
            case 109:
                {
                alt5=81;
                }
                break;
            case 110:
                {
                alt5=82;
                }
                break;
            case 111:
                {
                alt5=83;
                }
                break;
            case 112:
                {
                alt5=84;
                }
                break;
            case 113:
                {
                alt5=85;
                }
                break;
            case 114:
                {
                alt5=86;
                }
                break;
            case 115:
                {
                alt5=87;
                }
                break;
            case 116:
                {
                alt5=88;
                }
                break;
            case 117:
                {
                alt5=89;
                }
                break;
            case 118:
                {
                alt5=90;
                }
                break;
            case 119:
                {
                alt5=91;
                }
                break;
            case 120:
                {
                alt5=92;
                }
                break;
            case 121:
                {
                alt5=93;
                }
                break;
            case 122:
                {
                alt5=94;
                }
                break;
            case 123:
                {
                alt5=95;
                }
                break;
            case 124:
                {
                alt5=96;
                }
                break;
            case 125:
                {
                alt5=97;
                }
                break;
            case 126:
                {
                alt5=98;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("409:1: rule__FMFFidColorEnum__Alternatives : ( ( ( 'Aquamarine' ) ) | ( ( 'Bakers_Chocolate' ) ) | ( ( 'Black' ) ) | ( ( 'Blue' ) ) | ( ( 'Brass' ) ) | ( ( 'Bright_Gold' ) ) | ( ( 'Brown' ) ) | ( ( 'Bronze' ) ) | ( ( 'Gold' ) ) | ( ( 'Grey' ) ) | ( ( 'Green' ) ) | ( ( 'Copper' ) ) | ( ( 'Coral' ) ) | ( ( 'Cyan' ) ) | ( ( 'Dark_Green' ) ) | ( ( 'Green_Yellow' ) ) | ( ( 'Magenta' ) ) | ( ( 'Maroon' ) ) | ( ( 'Medium_Blue' ) ) | ( ( 'Sienna' ) ) | ( ( 'Silver' ) ) | ( ( 'Salmon' ) ) | ( ( 'Orange' ) ) | ( ( 'Pink' ) ) | ( ( 'Red' ) ) | ( ( 'Summer_Sky' ) ) | ( ( 'Tan' ) ) | ( ( 'Thistle' ) ) | ( ( 'Turquoise' ) ) | ( ( 'Very_Dark_Brown' ) ) | ( ( 'Very_Light_Grey' ) ) | ( ( 'Violet' ) ) | ( ( 'Violet_Red' ) ) | ( ( 'Wheat' ) ) | ( ( 'White' ) ) | ( ( 'Yellow' ) ) | ( ( 'Yellow_Green' ) ) | ( ( 'Dark_Yellow' ) ) | ( ( 'Bronze_II' ) ) | ( ( 'Cadet_Blue' ) ) | ( ( 'Cool_Copper' ) ) | ( ( 'Corn_Flower_Blue' ) ) | ( ( 'Dark_Brown' ) ) | ( ( 'Dark_Green_Copper' ) ) | ( ( 'Dark_Olive_Green' ) ) | ( ( 'Dark_Orchid' ) ) | ( ( 'Dark_Purple' ) ) | ( ( 'Dark_Slate_Blue' ) ) | ( ( 'Dark_Turquoise' ) ) | ( ( 'Dark_Tan' ) ) | ( ( 'Dark_Wood' ) ) | ( ( 'Dim_Grey' ) ) | ( ( 'Dusty_Rose' ) ) | ( ( 'Feldspar' ) ) | ( ( 'Firebrick' ) ) | ( ( 'Forest_Green' ) ) | ( ( 'Goldenrod' ) ) | ( ( 'Green_Copper' ) ) | ( ( 'Hunter_Green' ) ) | ( ( 'Indian_Red' ) ) | ( ( 'Khaki' ) ) | ( ( 'Light_Blue' ) ) | ( ( 'Light_Grey' ) ) | ( ( 'Light_Steel_Blue' ) ) | ( ( 'Light_Wood' ) ) | ( ( 'Lime_Green' ) ) | ( ( 'Mandarian_Orange' ) ) | ( ( 'Medium_Aquamarine' ) ) | ( ( 'Medium_Forest_Green' ) ) | ( ( 'Medium_Goldenrod' ) ) | ( ( 'Medium_Orchid' ) ) | ( ( 'Medium_Sea_Green' ) ) | ( ( 'Medium_Slate_Blue' ) ) | ( ( 'Medium_Spring_Green' ) ) | ( ( 'Medium_Turquoise' ) ) | ( ( 'Medium_Violet_Red' ) ) | ( ( 'Medium_Wood' ) ) | ( ( 'Midnight_Blue' ) ) | ( ( 'Navy_Blue' ) ) | ( ( 'Neon_Blue' ) ) | ( ( 'Neon_Pink' ) ) | ( ( 'New_Midnight_Blue' ) ) | ( ( 'New_Tan' ) ) | ( ( 'Old_Gold' ) ) | ( ( 'Orange_Red' ) ) | ( ( 'Orchid' ) ) | ( ( 'Pale_Green' ) ) | ( ( 'Plum' ) ) | ( ( 'Quartz' ) ) | ( ( 'Rich_Blue' ) ) | ( ( 'Scarlet' ) ) | ( ( 'Sea_Green' ) ) | ( ( 'Semi_Sweet_Chocolate' ) ) | ( ( 'Sky_Blue' ) ) | ( ( 'Slate_Blue' ) ) | ( ( 'Spicy_Pink' ) ) | ( ( 'Spring_Green' ) ) | ( ( 'Steel_Blue' ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:414:1: ( ( 'Aquamarine' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:414:1: ( ( 'Aquamarine' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:415:1: ( 'Aquamarine' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getAquamarineEnumLiteralDeclaration_0()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:416:1: ( 'Aquamarine' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:416:3: 'Aquamarine'
                    {
                    match(input,29,FOLLOW_29_in_rule__FMFFidColorEnum__Alternatives872); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getAquamarineEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:421:6: ( ( 'Bakers_Chocolate' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:421:6: ( ( 'Bakers_Chocolate' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:422:1: ( 'Bakers_Chocolate' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getBakers_ChocolateEnumLiteralDeclaration_1()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:423:1: ( 'Bakers_Chocolate' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:423:3: 'Bakers_Chocolate'
                    {
                    match(input,30,FOLLOW_30_in_rule__FMFFidColorEnum__Alternatives893); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getBakers_ChocolateEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:428:6: ( ( 'Black' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:428:6: ( ( 'Black' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:429:1: ( 'Black' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getBlackEnumLiteralDeclaration_2()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:430:1: ( 'Black' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:430:3: 'Black'
                    {
                    match(input,31,FOLLOW_31_in_rule__FMFFidColorEnum__Alternatives914); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getBlackEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:435:6: ( ( 'Blue' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:435:6: ( ( 'Blue' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:436:1: ( 'Blue' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getBlueEnumLiteralDeclaration_3()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:437:1: ( 'Blue' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:437:3: 'Blue'
                    {
                    match(input,32,FOLLOW_32_in_rule__FMFFidColorEnum__Alternatives935); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getBlueEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:442:6: ( ( 'Brass' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:442:6: ( ( 'Brass' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:443:1: ( 'Brass' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getBrassEnumLiteralDeclaration_4()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:444:1: ( 'Brass' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:444:3: 'Brass'
                    {
                    match(input,33,FOLLOW_33_in_rule__FMFFidColorEnum__Alternatives956); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getBrassEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:449:6: ( ( 'Bright_Gold' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:449:6: ( ( 'Bright_Gold' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:450:1: ( 'Bright_Gold' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getBright_GoldEnumLiteralDeclaration_5()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:451:1: ( 'Bright_Gold' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:451:3: 'Bright_Gold'
                    {
                    match(input,34,FOLLOW_34_in_rule__FMFFidColorEnum__Alternatives977); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getBright_GoldEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:456:6: ( ( 'Brown' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:456:6: ( ( 'Brown' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:457:1: ( 'Brown' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getBrownEnumLiteralDeclaration_6()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:458:1: ( 'Brown' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:458:3: 'Brown'
                    {
                    match(input,35,FOLLOW_35_in_rule__FMFFidColorEnum__Alternatives998); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getBrownEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:463:6: ( ( 'Bronze' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:463:6: ( ( 'Bronze' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:464:1: ( 'Bronze' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getBronzeEnumLiteralDeclaration_7()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:465:1: ( 'Bronze' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:465:3: 'Bronze'
                    {
                    match(input,36,FOLLOW_36_in_rule__FMFFidColorEnum__Alternatives1019); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getBronzeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:470:6: ( ( 'Gold' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:470:6: ( ( 'Gold' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:471:1: ( 'Gold' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getGoldEnumLiteralDeclaration_8()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:472:1: ( 'Gold' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:472:3: 'Gold'
                    {
                    match(input,37,FOLLOW_37_in_rule__FMFFidColorEnum__Alternatives1040); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getGoldEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:477:6: ( ( 'Grey' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:477:6: ( ( 'Grey' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:478:1: ( 'Grey' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getGreyEnumLiteralDeclaration_9()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:479:1: ( 'Grey' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:479:3: 'Grey'
                    {
                    match(input,38,FOLLOW_38_in_rule__FMFFidColorEnum__Alternatives1061); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getGreyEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:484:6: ( ( 'Green' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:484:6: ( ( 'Green' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:485:1: ( 'Green' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getGreenEnumLiteralDeclaration_10()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:486:1: ( 'Green' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:486:3: 'Green'
                    {
                    match(input,39,FOLLOW_39_in_rule__FMFFidColorEnum__Alternatives1082); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getGreenEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:491:6: ( ( 'Copper' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:491:6: ( ( 'Copper' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:492:1: ( 'Copper' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getCopperEnumLiteralDeclaration_11()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:493:1: ( 'Copper' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:493:3: 'Copper'
                    {
                    match(input,40,FOLLOW_40_in_rule__FMFFidColorEnum__Alternatives1103); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getCopperEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:498:6: ( ( 'Coral' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:498:6: ( ( 'Coral' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:499:1: ( 'Coral' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getCoralEnumLiteralDeclaration_12()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:500:1: ( 'Coral' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:500:3: 'Coral'
                    {
                    match(input,41,FOLLOW_41_in_rule__FMFFidColorEnum__Alternatives1124); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getCoralEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:505:6: ( ( 'Cyan' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:505:6: ( ( 'Cyan' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:506:1: ( 'Cyan' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getCyanEnumLiteralDeclaration_13()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:507:1: ( 'Cyan' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:507:3: 'Cyan'
                    {
                    match(input,42,FOLLOW_42_in_rule__FMFFidColorEnum__Alternatives1145); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getCyanEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:512:6: ( ( 'Dark_Green' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:512:6: ( ( 'Dark_Green' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:513:1: ( 'Dark_Green' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getDark_GreenEnumLiteralDeclaration_14()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:514:1: ( 'Dark_Green' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:514:3: 'Dark_Green'
                    {
                    match(input,43,FOLLOW_43_in_rule__FMFFidColorEnum__Alternatives1166); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getDark_GreenEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:519:6: ( ( 'Green_Yellow' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:519:6: ( ( 'Green_Yellow' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:520:1: ( 'Green_Yellow' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getGreen_YellowEnumLiteralDeclaration_15()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:521:1: ( 'Green_Yellow' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:521:3: 'Green_Yellow'
                    {
                    match(input,44,FOLLOW_44_in_rule__FMFFidColorEnum__Alternatives1187); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getGreen_YellowEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:526:6: ( ( 'Magenta' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:526:6: ( ( 'Magenta' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:527:1: ( 'Magenta' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getMagentaEnumLiteralDeclaration_16()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:528:1: ( 'Magenta' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:528:3: 'Magenta'
                    {
                    match(input,45,FOLLOW_45_in_rule__FMFFidColorEnum__Alternatives1208); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getMagentaEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:533:6: ( ( 'Maroon' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:533:6: ( ( 'Maroon' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:534:1: ( 'Maroon' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getMaroonEnumLiteralDeclaration_17()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:535:1: ( 'Maroon' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:535:3: 'Maroon'
                    {
                    match(input,46,FOLLOW_46_in_rule__FMFFidColorEnum__Alternatives1229); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getMaroonEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:540:6: ( ( 'Medium_Blue' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:540:6: ( ( 'Medium_Blue' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:541:1: ( 'Medium_Blue' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getMedium_BlueEnumLiteralDeclaration_18()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:542:1: ( 'Medium_Blue' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:542:3: 'Medium_Blue'
                    {
                    match(input,47,FOLLOW_47_in_rule__FMFFidColorEnum__Alternatives1250); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getMedium_BlueEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:547:6: ( ( 'Sienna' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:547:6: ( ( 'Sienna' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:548:1: ( 'Sienna' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getSiennaEnumLiteralDeclaration_19()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:549:1: ( 'Sienna' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:549:3: 'Sienna'
                    {
                    match(input,48,FOLLOW_48_in_rule__FMFFidColorEnum__Alternatives1271); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getSiennaEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:554:6: ( ( 'Silver' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:554:6: ( ( 'Silver' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:555:1: ( 'Silver' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getSilverEnumLiteralDeclaration_20()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:556:1: ( 'Silver' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:556:3: 'Silver'
                    {
                    match(input,49,FOLLOW_49_in_rule__FMFFidColorEnum__Alternatives1292); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getSilverEnumLiteralDeclaration_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:561:6: ( ( 'Salmon' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:561:6: ( ( 'Salmon' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:562:1: ( 'Salmon' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getSalmonEnumLiteralDeclaration_21()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:563:1: ( 'Salmon' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:563:3: 'Salmon'
                    {
                    match(input,50,FOLLOW_50_in_rule__FMFFidColorEnum__Alternatives1313); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getSalmonEnumLiteralDeclaration_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:568:6: ( ( 'Orange' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:568:6: ( ( 'Orange' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:569:1: ( 'Orange' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getOrangeEnumLiteralDeclaration_22()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:570:1: ( 'Orange' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:570:3: 'Orange'
                    {
                    match(input,51,FOLLOW_51_in_rule__FMFFidColorEnum__Alternatives1334); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getOrangeEnumLiteralDeclaration_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:575:6: ( ( 'Pink' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:575:6: ( ( 'Pink' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:576:1: ( 'Pink' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getPinkEnumLiteralDeclaration_23()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:577:1: ( 'Pink' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:577:3: 'Pink'
                    {
                    match(input,52,FOLLOW_52_in_rule__FMFFidColorEnum__Alternatives1355); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getPinkEnumLiteralDeclaration_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:582:6: ( ( 'Red' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:582:6: ( ( 'Red' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:583:1: ( 'Red' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getRedEnumLiteralDeclaration_24()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:584:1: ( 'Red' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:584:3: 'Red'
                    {
                    match(input,53,FOLLOW_53_in_rule__FMFFidColorEnum__Alternatives1376); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getRedEnumLiteralDeclaration_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:589:6: ( ( 'Summer_Sky' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:589:6: ( ( 'Summer_Sky' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:590:1: ( 'Summer_Sky' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getSummer_SkyEnumLiteralDeclaration_25()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:591:1: ( 'Summer_Sky' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:591:3: 'Summer_Sky'
                    {
                    match(input,54,FOLLOW_54_in_rule__FMFFidColorEnum__Alternatives1397); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getSummer_SkyEnumLiteralDeclaration_25()); 

                    }


                    }
                    break;
                case 27 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:596:6: ( ( 'Tan' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:596:6: ( ( 'Tan' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:597:1: ( 'Tan' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getTanEnumLiteralDeclaration_26()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:598:1: ( 'Tan' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:598:3: 'Tan'
                    {
                    match(input,55,FOLLOW_55_in_rule__FMFFidColorEnum__Alternatives1418); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getTanEnumLiteralDeclaration_26()); 

                    }


                    }
                    break;
                case 28 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:603:6: ( ( 'Thistle' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:603:6: ( ( 'Thistle' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:604:1: ( 'Thistle' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getThistleEnumLiteralDeclaration_27()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:605:1: ( 'Thistle' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:605:3: 'Thistle'
                    {
                    match(input,56,FOLLOW_56_in_rule__FMFFidColorEnum__Alternatives1439); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getThistleEnumLiteralDeclaration_27()); 

                    }


                    }
                    break;
                case 29 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:610:6: ( ( 'Turquoise' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:610:6: ( ( 'Turquoise' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:611:1: ( 'Turquoise' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getTurquoiseEnumLiteralDeclaration_28()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:612:1: ( 'Turquoise' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:612:3: 'Turquoise'
                    {
                    match(input,57,FOLLOW_57_in_rule__FMFFidColorEnum__Alternatives1460); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getTurquoiseEnumLiteralDeclaration_28()); 

                    }


                    }
                    break;
                case 30 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:617:6: ( ( 'Very_Dark_Brown' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:617:6: ( ( 'Very_Dark_Brown' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:618:1: ( 'Very_Dark_Brown' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getVery_Dark_BrownEnumLiteralDeclaration_29()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:619:1: ( 'Very_Dark_Brown' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:619:3: 'Very_Dark_Brown'
                    {
                    match(input,58,FOLLOW_58_in_rule__FMFFidColorEnum__Alternatives1481); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getVery_Dark_BrownEnumLiteralDeclaration_29()); 

                    }


                    }
                    break;
                case 31 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:624:6: ( ( 'Very_Light_Grey' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:624:6: ( ( 'Very_Light_Grey' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:625:1: ( 'Very_Light_Grey' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getVery_Light_GreyEnumLiteralDeclaration_30()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:626:1: ( 'Very_Light_Grey' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:626:3: 'Very_Light_Grey'
                    {
                    match(input,59,FOLLOW_59_in_rule__FMFFidColorEnum__Alternatives1502); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getVery_Light_GreyEnumLiteralDeclaration_30()); 

                    }


                    }
                    break;
                case 32 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:631:6: ( ( 'Violet' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:631:6: ( ( 'Violet' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:632:1: ( 'Violet' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getVioletEnumLiteralDeclaration_31()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:633:1: ( 'Violet' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:633:3: 'Violet'
                    {
                    match(input,60,FOLLOW_60_in_rule__FMFFidColorEnum__Alternatives1523); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getVioletEnumLiteralDeclaration_31()); 

                    }


                    }
                    break;
                case 33 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:638:6: ( ( 'Violet_Red' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:638:6: ( ( 'Violet_Red' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:639:1: ( 'Violet_Red' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getViolet_RedEnumLiteralDeclaration_32()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:640:1: ( 'Violet_Red' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:640:3: 'Violet_Red'
                    {
                    match(input,61,FOLLOW_61_in_rule__FMFFidColorEnum__Alternatives1544); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getViolet_RedEnumLiteralDeclaration_32()); 

                    }


                    }
                    break;
                case 34 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:645:6: ( ( 'Wheat' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:645:6: ( ( 'Wheat' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:646:1: ( 'Wheat' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getWheatEnumLiteralDeclaration_33()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:647:1: ( 'Wheat' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:647:3: 'Wheat'
                    {
                    match(input,62,FOLLOW_62_in_rule__FMFFidColorEnum__Alternatives1565); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getWheatEnumLiteralDeclaration_33()); 

                    }


                    }
                    break;
                case 35 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:652:6: ( ( 'White' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:652:6: ( ( 'White' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:653:1: ( 'White' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getWhiteEnumLiteralDeclaration_34()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:654:1: ( 'White' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:654:3: 'White'
                    {
                    match(input,63,FOLLOW_63_in_rule__FMFFidColorEnum__Alternatives1586); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getWhiteEnumLiteralDeclaration_34()); 

                    }


                    }
                    break;
                case 36 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:659:6: ( ( 'Yellow' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:659:6: ( ( 'Yellow' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:660:1: ( 'Yellow' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getYellowEnumLiteralDeclaration_35()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:661:1: ( 'Yellow' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:661:3: 'Yellow'
                    {
                    match(input,64,FOLLOW_64_in_rule__FMFFidColorEnum__Alternatives1607); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getYellowEnumLiteralDeclaration_35()); 

                    }


                    }
                    break;
                case 37 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:666:6: ( ( 'Yellow_Green' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:666:6: ( ( 'Yellow_Green' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:667:1: ( 'Yellow_Green' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getYellow_GreenEnumLiteralDeclaration_36()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:668:1: ( 'Yellow_Green' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:668:3: 'Yellow_Green'
                    {
                    match(input,65,FOLLOW_65_in_rule__FMFFidColorEnum__Alternatives1628); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getYellow_GreenEnumLiteralDeclaration_36()); 

                    }


                    }
                    break;
                case 38 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:673:6: ( ( 'Dark_Yellow' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:673:6: ( ( 'Dark_Yellow' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:674:1: ( 'Dark_Yellow' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getDark_YellowEnumLiteralDeclaration_37()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:675:1: ( 'Dark_Yellow' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:675:3: 'Dark_Yellow'
                    {
                    match(input,66,FOLLOW_66_in_rule__FMFFidColorEnum__Alternatives1649); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getDark_YellowEnumLiteralDeclaration_37()); 

                    }


                    }
                    break;
                case 39 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:680:6: ( ( 'Bronze_II' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:680:6: ( ( 'Bronze_II' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:681:1: ( 'Bronze_II' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getBronze_IIEnumLiteralDeclaration_38()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:682:1: ( 'Bronze_II' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:682:3: 'Bronze_II'
                    {
                    match(input,67,FOLLOW_67_in_rule__FMFFidColorEnum__Alternatives1670); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getBronze_IIEnumLiteralDeclaration_38()); 

                    }


                    }
                    break;
                case 40 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:687:6: ( ( 'Cadet_Blue' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:687:6: ( ( 'Cadet_Blue' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:688:1: ( 'Cadet_Blue' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getCadet_BlueEnumLiteralDeclaration_39()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:689:1: ( 'Cadet_Blue' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:689:3: 'Cadet_Blue'
                    {
                    match(input,68,FOLLOW_68_in_rule__FMFFidColorEnum__Alternatives1691); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getCadet_BlueEnumLiteralDeclaration_39()); 

                    }


                    }
                    break;
                case 41 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:694:6: ( ( 'Cool_Copper' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:694:6: ( ( 'Cool_Copper' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:695:1: ( 'Cool_Copper' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getCool_CopperEnumLiteralDeclaration_40()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:696:1: ( 'Cool_Copper' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:696:3: 'Cool_Copper'
                    {
                    match(input,69,FOLLOW_69_in_rule__FMFFidColorEnum__Alternatives1712); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getCool_CopperEnumLiteralDeclaration_40()); 

                    }


                    }
                    break;
                case 42 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:701:6: ( ( 'Corn_Flower_Blue' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:701:6: ( ( 'Corn_Flower_Blue' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:702:1: ( 'Corn_Flower_Blue' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getCorn_Flower_BlueEnumLiteralDeclaration_41()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:703:1: ( 'Corn_Flower_Blue' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:703:3: 'Corn_Flower_Blue'
                    {
                    match(input,70,FOLLOW_70_in_rule__FMFFidColorEnum__Alternatives1733); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getCorn_Flower_BlueEnumLiteralDeclaration_41()); 

                    }


                    }
                    break;
                case 43 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:708:6: ( ( 'Dark_Brown' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:708:6: ( ( 'Dark_Brown' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:709:1: ( 'Dark_Brown' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getDark_BrownEnumLiteralDeclaration_42()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:710:1: ( 'Dark_Brown' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:710:3: 'Dark_Brown'
                    {
                    match(input,71,FOLLOW_71_in_rule__FMFFidColorEnum__Alternatives1754); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getDark_BrownEnumLiteralDeclaration_42()); 

                    }


                    }
                    break;
                case 44 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:715:6: ( ( 'Dark_Green_Copper' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:715:6: ( ( 'Dark_Green_Copper' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:716:1: ( 'Dark_Green_Copper' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getDark_Green_CopperEnumLiteralDeclaration_43()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:717:1: ( 'Dark_Green_Copper' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:717:3: 'Dark_Green_Copper'
                    {
                    match(input,72,FOLLOW_72_in_rule__FMFFidColorEnum__Alternatives1775); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getDark_Green_CopperEnumLiteralDeclaration_43()); 

                    }


                    }
                    break;
                case 45 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:722:6: ( ( 'Dark_Olive_Green' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:722:6: ( ( 'Dark_Olive_Green' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:723:1: ( 'Dark_Olive_Green' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getDark_Olive_GreenEnumLiteralDeclaration_44()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:724:1: ( 'Dark_Olive_Green' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:724:3: 'Dark_Olive_Green'
                    {
                    match(input,73,FOLLOW_73_in_rule__FMFFidColorEnum__Alternatives1796); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getDark_Olive_GreenEnumLiteralDeclaration_44()); 

                    }


                    }
                    break;
                case 46 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:729:6: ( ( 'Dark_Orchid' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:729:6: ( ( 'Dark_Orchid' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:730:1: ( 'Dark_Orchid' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getDark_OrchidEnumLiteralDeclaration_45()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:731:1: ( 'Dark_Orchid' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:731:3: 'Dark_Orchid'
                    {
                    match(input,74,FOLLOW_74_in_rule__FMFFidColorEnum__Alternatives1817); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getDark_OrchidEnumLiteralDeclaration_45()); 

                    }


                    }
                    break;
                case 47 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:736:6: ( ( 'Dark_Purple' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:736:6: ( ( 'Dark_Purple' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:737:1: ( 'Dark_Purple' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getDark_PurpleEnumLiteralDeclaration_46()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:738:1: ( 'Dark_Purple' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:738:3: 'Dark_Purple'
                    {
                    match(input,75,FOLLOW_75_in_rule__FMFFidColorEnum__Alternatives1838); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getDark_PurpleEnumLiteralDeclaration_46()); 

                    }


                    }
                    break;
                case 48 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:743:6: ( ( 'Dark_Slate_Blue' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:743:6: ( ( 'Dark_Slate_Blue' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:744:1: ( 'Dark_Slate_Blue' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getDark_Slate_BlueEnumLiteralDeclaration_47()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:745:1: ( 'Dark_Slate_Blue' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:745:3: 'Dark_Slate_Blue'
                    {
                    match(input,76,FOLLOW_76_in_rule__FMFFidColorEnum__Alternatives1859); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getDark_Slate_BlueEnumLiteralDeclaration_47()); 

                    }


                    }
                    break;
                case 49 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:750:6: ( ( 'Dark_Turquoise' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:750:6: ( ( 'Dark_Turquoise' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:751:1: ( 'Dark_Turquoise' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getDark_TurquoiseEnumLiteralDeclaration_48()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:752:1: ( 'Dark_Turquoise' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:752:3: 'Dark_Turquoise'
                    {
                    match(input,77,FOLLOW_77_in_rule__FMFFidColorEnum__Alternatives1880); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getDark_TurquoiseEnumLiteralDeclaration_48()); 

                    }


                    }
                    break;
                case 50 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:757:6: ( ( 'Dark_Tan' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:757:6: ( ( 'Dark_Tan' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:758:1: ( 'Dark_Tan' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getDark_TanEnumLiteralDeclaration_49()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:759:1: ( 'Dark_Tan' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:759:3: 'Dark_Tan'
                    {
                    match(input,78,FOLLOW_78_in_rule__FMFFidColorEnum__Alternatives1901); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getDark_TanEnumLiteralDeclaration_49()); 

                    }


                    }
                    break;
                case 51 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:764:6: ( ( 'Dark_Wood' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:764:6: ( ( 'Dark_Wood' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:765:1: ( 'Dark_Wood' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getDark_WoodEnumLiteralDeclaration_50()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:766:1: ( 'Dark_Wood' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:766:3: 'Dark_Wood'
                    {
                    match(input,79,FOLLOW_79_in_rule__FMFFidColorEnum__Alternatives1922); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getDark_WoodEnumLiteralDeclaration_50()); 

                    }


                    }
                    break;
                case 52 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:771:6: ( ( 'Dim_Grey' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:771:6: ( ( 'Dim_Grey' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:772:1: ( 'Dim_Grey' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getDim_GreyEnumLiteralDeclaration_51()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:773:1: ( 'Dim_Grey' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:773:3: 'Dim_Grey'
                    {
                    match(input,80,FOLLOW_80_in_rule__FMFFidColorEnum__Alternatives1943); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getDim_GreyEnumLiteralDeclaration_51()); 

                    }


                    }
                    break;
                case 53 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:778:6: ( ( 'Dusty_Rose' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:778:6: ( ( 'Dusty_Rose' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:779:1: ( 'Dusty_Rose' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getDusty_RoseEnumLiteralDeclaration_52()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:780:1: ( 'Dusty_Rose' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:780:3: 'Dusty_Rose'
                    {
                    match(input,81,FOLLOW_81_in_rule__FMFFidColorEnum__Alternatives1964); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getDusty_RoseEnumLiteralDeclaration_52()); 

                    }


                    }
                    break;
                case 54 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:785:6: ( ( 'Feldspar' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:785:6: ( ( 'Feldspar' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:786:1: ( 'Feldspar' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getFeldsparEnumLiteralDeclaration_53()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:787:1: ( 'Feldspar' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:787:3: 'Feldspar'
                    {
                    match(input,82,FOLLOW_82_in_rule__FMFFidColorEnum__Alternatives1985); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getFeldsparEnumLiteralDeclaration_53()); 

                    }


                    }
                    break;
                case 55 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:792:6: ( ( 'Firebrick' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:792:6: ( ( 'Firebrick' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:793:1: ( 'Firebrick' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getFirebrickEnumLiteralDeclaration_54()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:794:1: ( 'Firebrick' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:794:3: 'Firebrick'
                    {
                    match(input,83,FOLLOW_83_in_rule__FMFFidColorEnum__Alternatives2006); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getFirebrickEnumLiteralDeclaration_54()); 

                    }


                    }
                    break;
                case 56 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:799:6: ( ( 'Forest_Green' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:799:6: ( ( 'Forest_Green' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:800:1: ( 'Forest_Green' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getForest_GreenEnumLiteralDeclaration_55()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:801:1: ( 'Forest_Green' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:801:3: 'Forest_Green'
                    {
                    match(input,84,FOLLOW_84_in_rule__FMFFidColorEnum__Alternatives2027); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getForest_GreenEnumLiteralDeclaration_55()); 

                    }


                    }
                    break;
                case 57 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:806:6: ( ( 'Goldenrod' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:806:6: ( ( 'Goldenrod' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:807:1: ( 'Goldenrod' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getGoldenrodEnumLiteralDeclaration_56()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:808:1: ( 'Goldenrod' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:808:3: 'Goldenrod'
                    {
                    match(input,85,FOLLOW_85_in_rule__FMFFidColorEnum__Alternatives2048); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getGoldenrodEnumLiteralDeclaration_56()); 

                    }


                    }
                    break;
                case 58 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:813:6: ( ( 'Green_Copper' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:813:6: ( ( 'Green_Copper' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:814:1: ( 'Green_Copper' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getGreen_CopperEnumLiteralDeclaration_57()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:815:1: ( 'Green_Copper' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:815:3: 'Green_Copper'
                    {
                    match(input,86,FOLLOW_86_in_rule__FMFFidColorEnum__Alternatives2069); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getGreen_CopperEnumLiteralDeclaration_57()); 

                    }


                    }
                    break;
                case 59 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:820:6: ( ( 'Hunter_Green' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:820:6: ( ( 'Hunter_Green' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:821:1: ( 'Hunter_Green' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getHunter_GreenEnumLiteralDeclaration_58()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:822:1: ( 'Hunter_Green' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:822:3: 'Hunter_Green'
                    {
                    match(input,87,FOLLOW_87_in_rule__FMFFidColorEnum__Alternatives2090); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getHunter_GreenEnumLiteralDeclaration_58()); 

                    }


                    }
                    break;
                case 60 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:827:6: ( ( 'Indian_Red' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:827:6: ( ( 'Indian_Red' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:828:1: ( 'Indian_Red' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getIndian_RedEnumLiteralDeclaration_59()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:829:1: ( 'Indian_Red' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:829:3: 'Indian_Red'
                    {
                    match(input,88,FOLLOW_88_in_rule__FMFFidColorEnum__Alternatives2111); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getIndian_RedEnumLiteralDeclaration_59()); 

                    }


                    }
                    break;
                case 61 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:834:6: ( ( 'Khaki' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:834:6: ( ( 'Khaki' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:835:1: ( 'Khaki' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getKhakiEnumLiteralDeclaration_60()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:836:1: ( 'Khaki' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:836:3: 'Khaki'
                    {
                    match(input,89,FOLLOW_89_in_rule__FMFFidColorEnum__Alternatives2132); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getKhakiEnumLiteralDeclaration_60()); 

                    }


                    }
                    break;
                case 62 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:841:6: ( ( 'Light_Blue' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:841:6: ( ( 'Light_Blue' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:842:1: ( 'Light_Blue' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getLight_BlueEnumLiteralDeclaration_61()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:843:1: ( 'Light_Blue' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:843:3: 'Light_Blue'
                    {
                    match(input,90,FOLLOW_90_in_rule__FMFFidColorEnum__Alternatives2153); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getLight_BlueEnumLiteralDeclaration_61()); 

                    }


                    }
                    break;
                case 63 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:848:6: ( ( 'Light_Grey' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:848:6: ( ( 'Light_Grey' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:849:1: ( 'Light_Grey' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getLight_GreyEnumLiteralDeclaration_62()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:850:1: ( 'Light_Grey' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:850:3: 'Light_Grey'
                    {
                    match(input,91,FOLLOW_91_in_rule__FMFFidColorEnum__Alternatives2174); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getLight_GreyEnumLiteralDeclaration_62()); 

                    }


                    }
                    break;
                case 64 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:855:6: ( ( 'Light_Steel_Blue' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:855:6: ( ( 'Light_Steel_Blue' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:856:1: ( 'Light_Steel_Blue' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getLight_Steel_BlueEnumLiteralDeclaration_63()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:857:1: ( 'Light_Steel_Blue' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:857:3: 'Light_Steel_Blue'
                    {
                    match(input,92,FOLLOW_92_in_rule__FMFFidColorEnum__Alternatives2195); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getLight_Steel_BlueEnumLiteralDeclaration_63()); 

                    }


                    }
                    break;
                case 65 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:862:6: ( ( 'Light_Wood' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:862:6: ( ( 'Light_Wood' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:863:1: ( 'Light_Wood' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getLight_WoodEnumLiteralDeclaration_64()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:864:1: ( 'Light_Wood' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:864:3: 'Light_Wood'
                    {
                    match(input,93,FOLLOW_93_in_rule__FMFFidColorEnum__Alternatives2216); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getLight_WoodEnumLiteralDeclaration_64()); 

                    }


                    }
                    break;
                case 66 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:869:6: ( ( 'Lime_Green' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:869:6: ( ( 'Lime_Green' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:870:1: ( 'Lime_Green' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getLime_GreenEnumLiteralDeclaration_65()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:871:1: ( 'Lime_Green' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:871:3: 'Lime_Green'
                    {
                    match(input,94,FOLLOW_94_in_rule__FMFFidColorEnum__Alternatives2237); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getLime_GreenEnumLiteralDeclaration_65()); 

                    }


                    }
                    break;
                case 67 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:876:6: ( ( 'Mandarian_Orange' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:876:6: ( ( 'Mandarian_Orange' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:877:1: ( 'Mandarian_Orange' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getMandarian_OrangeEnumLiteralDeclaration_66()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:878:1: ( 'Mandarian_Orange' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:878:3: 'Mandarian_Orange'
                    {
                    match(input,95,FOLLOW_95_in_rule__FMFFidColorEnum__Alternatives2258); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getMandarian_OrangeEnumLiteralDeclaration_66()); 

                    }


                    }
                    break;
                case 68 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:883:6: ( ( 'Medium_Aquamarine' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:883:6: ( ( 'Medium_Aquamarine' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:884:1: ( 'Medium_Aquamarine' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getMedium_AquamarineEnumLiteralDeclaration_67()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:885:1: ( 'Medium_Aquamarine' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:885:3: 'Medium_Aquamarine'
                    {
                    match(input,96,FOLLOW_96_in_rule__FMFFidColorEnum__Alternatives2279); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getMedium_AquamarineEnumLiteralDeclaration_67()); 

                    }


                    }
                    break;
                case 69 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:890:6: ( ( 'Medium_Forest_Green' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:890:6: ( ( 'Medium_Forest_Green' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:891:1: ( 'Medium_Forest_Green' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getMedium_Forest_GreenEnumLiteralDeclaration_68()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:892:1: ( 'Medium_Forest_Green' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:892:3: 'Medium_Forest_Green'
                    {
                    match(input,97,FOLLOW_97_in_rule__FMFFidColorEnum__Alternatives2300); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getMedium_Forest_GreenEnumLiteralDeclaration_68()); 

                    }


                    }
                    break;
                case 70 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:897:6: ( ( 'Medium_Goldenrod' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:897:6: ( ( 'Medium_Goldenrod' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:898:1: ( 'Medium_Goldenrod' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getMedium_GoldenrodEnumLiteralDeclaration_69()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:899:1: ( 'Medium_Goldenrod' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:899:3: 'Medium_Goldenrod'
                    {
                    match(input,98,FOLLOW_98_in_rule__FMFFidColorEnum__Alternatives2321); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getMedium_GoldenrodEnumLiteralDeclaration_69()); 

                    }


                    }
                    break;
                case 71 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:904:6: ( ( 'Medium_Orchid' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:904:6: ( ( 'Medium_Orchid' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:905:1: ( 'Medium_Orchid' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getMedium_OrchidEnumLiteralDeclaration_70()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:906:1: ( 'Medium_Orchid' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:906:3: 'Medium_Orchid'
                    {
                    match(input,99,FOLLOW_99_in_rule__FMFFidColorEnum__Alternatives2342); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getMedium_OrchidEnumLiteralDeclaration_70()); 

                    }


                    }
                    break;
                case 72 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:911:6: ( ( 'Medium_Sea_Green' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:911:6: ( ( 'Medium_Sea_Green' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:912:1: ( 'Medium_Sea_Green' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getMedium_Sea_GreenEnumLiteralDeclaration_71()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:913:1: ( 'Medium_Sea_Green' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:913:3: 'Medium_Sea_Green'
                    {
                    match(input,100,FOLLOW_100_in_rule__FMFFidColorEnum__Alternatives2363); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getMedium_Sea_GreenEnumLiteralDeclaration_71()); 

                    }


                    }
                    break;
                case 73 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:918:6: ( ( 'Medium_Slate_Blue' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:918:6: ( ( 'Medium_Slate_Blue' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:919:1: ( 'Medium_Slate_Blue' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getMedium_Slate_BlueEnumLiteralDeclaration_72()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:920:1: ( 'Medium_Slate_Blue' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:920:3: 'Medium_Slate_Blue'
                    {
                    match(input,101,FOLLOW_101_in_rule__FMFFidColorEnum__Alternatives2384); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getMedium_Slate_BlueEnumLiteralDeclaration_72()); 

                    }


                    }
                    break;
                case 74 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:925:6: ( ( 'Medium_Spring_Green' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:925:6: ( ( 'Medium_Spring_Green' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:926:1: ( 'Medium_Spring_Green' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getMedium_Spring_GreenEnumLiteralDeclaration_73()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:927:1: ( 'Medium_Spring_Green' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:927:3: 'Medium_Spring_Green'
                    {
                    match(input,102,FOLLOW_102_in_rule__FMFFidColorEnum__Alternatives2405); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getMedium_Spring_GreenEnumLiteralDeclaration_73()); 

                    }


                    }
                    break;
                case 75 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:932:6: ( ( 'Medium_Turquoise' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:932:6: ( ( 'Medium_Turquoise' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:933:1: ( 'Medium_Turquoise' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getMedium_TurquoiseEnumLiteralDeclaration_74()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:934:1: ( 'Medium_Turquoise' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:934:3: 'Medium_Turquoise'
                    {
                    match(input,103,FOLLOW_103_in_rule__FMFFidColorEnum__Alternatives2426); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getMedium_TurquoiseEnumLiteralDeclaration_74()); 

                    }


                    }
                    break;
                case 76 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:939:6: ( ( 'Medium_Violet_Red' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:939:6: ( ( 'Medium_Violet_Red' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:940:1: ( 'Medium_Violet_Red' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getMedium_Violet_RedEnumLiteralDeclaration_75()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:941:1: ( 'Medium_Violet_Red' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:941:3: 'Medium_Violet_Red'
                    {
                    match(input,104,FOLLOW_104_in_rule__FMFFidColorEnum__Alternatives2447); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getMedium_Violet_RedEnumLiteralDeclaration_75()); 

                    }


                    }
                    break;
                case 77 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:946:6: ( ( 'Medium_Wood' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:946:6: ( ( 'Medium_Wood' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:947:1: ( 'Medium_Wood' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getMedium_WoodEnumLiteralDeclaration_76()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:948:1: ( 'Medium_Wood' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:948:3: 'Medium_Wood'
                    {
                    match(input,105,FOLLOW_105_in_rule__FMFFidColorEnum__Alternatives2468); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getMedium_WoodEnumLiteralDeclaration_76()); 

                    }


                    }
                    break;
                case 78 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:953:6: ( ( 'Midnight_Blue' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:953:6: ( ( 'Midnight_Blue' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:954:1: ( 'Midnight_Blue' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getMidnight_BlueEnumLiteralDeclaration_77()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:955:1: ( 'Midnight_Blue' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:955:3: 'Midnight_Blue'
                    {
                    match(input,106,FOLLOW_106_in_rule__FMFFidColorEnum__Alternatives2489); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getMidnight_BlueEnumLiteralDeclaration_77()); 

                    }


                    }
                    break;
                case 79 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:960:6: ( ( 'Navy_Blue' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:960:6: ( ( 'Navy_Blue' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:961:1: ( 'Navy_Blue' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getNavy_BlueEnumLiteralDeclaration_78()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:962:1: ( 'Navy_Blue' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:962:3: 'Navy_Blue'
                    {
                    match(input,107,FOLLOW_107_in_rule__FMFFidColorEnum__Alternatives2510); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getNavy_BlueEnumLiteralDeclaration_78()); 

                    }


                    }
                    break;
                case 80 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:967:6: ( ( 'Neon_Blue' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:967:6: ( ( 'Neon_Blue' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:968:1: ( 'Neon_Blue' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getNeon_BlueEnumLiteralDeclaration_79()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:969:1: ( 'Neon_Blue' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:969:3: 'Neon_Blue'
                    {
                    match(input,108,FOLLOW_108_in_rule__FMFFidColorEnum__Alternatives2531); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getNeon_BlueEnumLiteralDeclaration_79()); 

                    }


                    }
                    break;
                case 81 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:974:6: ( ( 'Neon_Pink' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:974:6: ( ( 'Neon_Pink' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:975:1: ( 'Neon_Pink' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getNeon_PinkEnumLiteralDeclaration_80()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:976:1: ( 'Neon_Pink' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:976:3: 'Neon_Pink'
                    {
                    match(input,109,FOLLOW_109_in_rule__FMFFidColorEnum__Alternatives2552); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getNeon_PinkEnumLiteralDeclaration_80()); 

                    }


                    }
                    break;
                case 82 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:981:6: ( ( 'New_Midnight_Blue' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:981:6: ( ( 'New_Midnight_Blue' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:982:1: ( 'New_Midnight_Blue' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getNew_Midnight_BlueEnumLiteralDeclaration_81()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:983:1: ( 'New_Midnight_Blue' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:983:3: 'New_Midnight_Blue'
                    {
                    match(input,110,FOLLOW_110_in_rule__FMFFidColorEnum__Alternatives2573); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getNew_Midnight_BlueEnumLiteralDeclaration_81()); 

                    }


                    }
                    break;
                case 83 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:988:6: ( ( 'New_Tan' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:988:6: ( ( 'New_Tan' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:989:1: ( 'New_Tan' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getNew_TanEnumLiteralDeclaration_82()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:990:1: ( 'New_Tan' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:990:3: 'New_Tan'
                    {
                    match(input,111,FOLLOW_111_in_rule__FMFFidColorEnum__Alternatives2594); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getNew_TanEnumLiteralDeclaration_82()); 

                    }


                    }
                    break;
                case 84 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:995:6: ( ( 'Old_Gold' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:995:6: ( ( 'Old_Gold' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:996:1: ( 'Old_Gold' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getOld_GoldEnumLiteralDeclaration_83()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:997:1: ( 'Old_Gold' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:997:3: 'Old_Gold'
                    {
                    match(input,112,FOLLOW_112_in_rule__FMFFidColorEnum__Alternatives2615); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getOld_GoldEnumLiteralDeclaration_83()); 

                    }


                    }
                    break;
                case 85 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1002:6: ( ( 'Orange_Red' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1002:6: ( ( 'Orange_Red' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1003:1: ( 'Orange_Red' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getOrange_RedEnumLiteralDeclaration_84()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1004:1: ( 'Orange_Red' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1004:3: 'Orange_Red'
                    {
                    match(input,113,FOLLOW_113_in_rule__FMFFidColorEnum__Alternatives2636); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getOrange_RedEnumLiteralDeclaration_84()); 

                    }


                    }
                    break;
                case 86 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1009:6: ( ( 'Orchid' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1009:6: ( ( 'Orchid' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1010:1: ( 'Orchid' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getOrchidEnumLiteralDeclaration_85()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1011:1: ( 'Orchid' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1011:3: 'Orchid'
                    {
                    match(input,114,FOLLOW_114_in_rule__FMFFidColorEnum__Alternatives2657); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getOrchidEnumLiteralDeclaration_85()); 

                    }


                    }
                    break;
                case 87 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1016:6: ( ( 'Pale_Green' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1016:6: ( ( 'Pale_Green' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1017:1: ( 'Pale_Green' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getPale_GreenEnumLiteralDeclaration_86()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1018:1: ( 'Pale_Green' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1018:3: 'Pale_Green'
                    {
                    match(input,115,FOLLOW_115_in_rule__FMFFidColorEnum__Alternatives2678); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getPale_GreenEnumLiteralDeclaration_86()); 

                    }


                    }
                    break;
                case 88 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1023:6: ( ( 'Plum' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1023:6: ( ( 'Plum' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1024:1: ( 'Plum' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getPlumEnumLiteralDeclaration_87()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1025:1: ( 'Plum' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1025:3: 'Plum'
                    {
                    match(input,116,FOLLOW_116_in_rule__FMFFidColorEnum__Alternatives2699); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getPlumEnumLiteralDeclaration_87()); 

                    }


                    }
                    break;
                case 89 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1030:6: ( ( 'Quartz' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1030:6: ( ( 'Quartz' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1031:1: ( 'Quartz' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getQuartzEnumLiteralDeclaration_88()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1032:1: ( 'Quartz' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1032:3: 'Quartz'
                    {
                    match(input,117,FOLLOW_117_in_rule__FMFFidColorEnum__Alternatives2720); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getQuartzEnumLiteralDeclaration_88()); 

                    }


                    }
                    break;
                case 90 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1037:6: ( ( 'Rich_Blue' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1037:6: ( ( 'Rich_Blue' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1038:1: ( 'Rich_Blue' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getRich_BlueEnumLiteralDeclaration_89()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1039:1: ( 'Rich_Blue' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1039:3: 'Rich_Blue'
                    {
                    match(input,118,FOLLOW_118_in_rule__FMFFidColorEnum__Alternatives2741); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getRich_BlueEnumLiteralDeclaration_89()); 

                    }


                    }
                    break;
                case 91 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1044:6: ( ( 'Scarlet' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1044:6: ( ( 'Scarlet' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1045:1: ( 'Scarlet' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getScarletEnumLiteralDeclaration_90()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1046:1: ( 'Scarlet' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1046:3: 'Scarlet'
                    {
                    match(input,119,FOLLOW_119_in_rule__FMFFidColorEnum__Alternatives2762); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getScarletEnumLiteralDeclaration_90()); 

                    }


                    }
                    break;
                case 92 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1051:6: ( ( 'Sea_Green' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1051:6: ( ( 'Sea_Green' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1052:1: ( 'Sea_Green' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getSea_GreenEnumLiteralDeclaration_91()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1053:1: ( 'Sea_Green' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1053:3: 'Sea_Green'
                    {
                    match(input,120,FOLLOW_120_in_rule__FMFFidColorEnum__Alternatives2783); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getSea_GreenEnumLiteralDeclaration_91()); 

                    }


                    }
                    break;
                case 93 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1058:6: ( ( 'Semi_Sweet_Chocolate' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1058:6: ( ( 'Semi_Sweet_Chocolate' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1059:1: ( 'Semi_Sweet_Chocolate' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getSemi_Sweet_ChocolateEnumLiteralDeclaration_92()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1060:1: ( 'Semi_Sweet_Chocolate' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1060:3: 'Semi_Sweet_Chocolate'
                    {
                    match(input,121,FOLLOW_121_in_rule__FMFFidColorEnum__Alternatives2804); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getSemi_Sweet_ChocolateEnumLiteralDeclaration_92()); 

                    }


                    }
                    break;
                case 94 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1065:6: ( ( 'Sky_Blue' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1065:6: ( ( 'Sky_Blue' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1066:1: ( 'Sky_Blue' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getSky_BlueEnumLiteralDeclaration_93()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1067:1: ( 'Sky_Blue' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1067:3: 'Sky_Blue'
                    {
                    match(input,122,FOLLOW_122_in_rule__FMFFidColorEnum__Alternatives2825); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getSky_BlueEnumLiteralDeclaration_93()); 

                    }


                    }
                    break;
                case 95 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1072:6: ( ( 'Slate_Blue' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1072:6: ( ( 'Slate_Blue' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1073:1: ( 'Slate_Blue' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getSlate_BlueEnumLiteralDeclaration_94()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1074:1: ( 'Slate_Blue' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1074:3: 'Slate_Blue'
                    {
                    match(input,123,FOLLOW_123_in_rule__FMFFidColorEnum__Alternatives2846); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getSlate_BlueEnumLiteralDeclaration_94()); 

                    }


                    }
                    break;
                case 96 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1079:6: ( ( 'Spicy_Pink' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1079:6: ( ( 'Spicy_Pink' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1080:1: ( 'Spicy_Pink' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getSpicy_PinkEnumLiteralDeclaration_95()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1081:1: ( 'Spicy_Pink' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1081:3: 'Spicy_Pink'
                    {
                    match(input,124,FOLLOW_124_in_rule__FMFFidColorEnum__Alternatives2867); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getSpicy_PinkEnumLiteralDeclaration_95()); 

                    }


                    }
                    break;
                case 97 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1086:6: ( ( 'Spring_Green' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1086:6: ( ( 'Spring_Green' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1087:1: ( 'Spring_Green' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getSpring_GreenEnumLiteralDeclaration_96()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1088:1: ( 'Spring_Green' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1088:3: 'Spring_Green'
                    {
                    match(input,125,FOLLOW_125_in_rule__FMFFidColorEnum__Alternatives2888); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getSpring_GreenEnumLiteralDeclaration_96()); 

                    }


                    }
                    break;
                case 98 :
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1093:6: ( ( 'Steel_Blue' ) )
                    {
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1093:6: ( ( 'Steel_Blue' ) )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1094:1: ( 'Steel_Blue' )
                    {
                     before(grammarAccess.getFMFFidColorEnumAccess().getSteel_BlueEnumLiteralDeclaration_97()); 
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1095:1: ( 'Steel_Blue' )
                    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1095:3: 'Steel_Blue'
                    {
                    match(input,126,FOLLOW_126_in_rule__FMFFidColorEnum__Alternatives2909); 

                    }

                     after(grammarAccess.getFMFFidColorEnumAccess().getSteel_BlueEnumLiteralDeclaration_97()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFFidColorEnum__Alternatives


    // $ANTLR start rule__FMFUI__Group__0
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1107:1: rule__FMFUI__Group__0 : rule__FMFUI__Group__0__Impl rule__FMFUI__Group__1 ;
    public final void rule__FMFUI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1111:1: ( rule__FMFUI__Group__0__Impl rule__FMFUI__Group__1 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1112:2: rule__FMFUI__Group__0__Impl rule__FMFUI__Group__1
            {
            pushFollow(FOLLOW_rule__FMFUI__Group__0__Impl_in_rule__FMFUI__Group__02942);
            rule__FMFUI__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FMFUI__Group__1_in_rule__FMFUI__Group__02945);
            rule__FMFUI__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFUI__Group__0


    // $ANTLR start rule__FMFUI__Group__0__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1119:1: rule__FMFUI__Group__0__Impl : ( ( rule__FMFUI__SettingsAssignment_0 ) ) ;
    public final void rule__FMFUI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1123:1: ( ( ( rule__FMFUI__SettingsAssignment_0 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1124:1: ( ( rule__FMFUI__SettingsAssignment_0 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1124:1: ( ( rule__FMFUI__SettingsAssignment_0 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1125:1: ( rule__FMFUI__SettingsAssignment_0 )
            {
             before(grammarAccess.getFMFUIAccess().getSettingsAssignment_0()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1126:1: ( rule__FMFUI__SettingsAssignment_0 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1126:2: rule__FMFUI__SettingsAssignment_0
            {
            pushFollow(FOLLOW_rule__FMFUI__SettingsAssignment_0_in_rule__FMFUI__Group__0__Impl2972);
            rule__FMFUI__SettingsAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getFMFUIAccess().getSettingsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFUI__Group__0__Impl


    // $ANTLR start rule__FMFUI__Group__1
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1136:1: rule__FMFUI__Group__1 : rule__FMFUI__Group__1__Impl ;
    public final void rule__FMFUI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1140:1: ( rule__FMFUI__Group__1__Impl )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1141:2: rule__FMFUI__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FMFUI__Group__1__Impl_in_rule__FMFUI__Group__13002);
            rule__FMFUI__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFUI__Group__1


    // $ANTLR start rule__FMFUI__Group__1__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1147:1: rule__FMFUI__Group__1__Impl : ( ( rule__FMFUI__FiducialsAssignment_1 )* ) ;
    public final void rule__FMFUI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1151:1: ( ( ( rule__FMFUI__FiducialsAssignment_1 )* ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1152:1: ( ( rule__FMFUI__FiducialsAssignment_1 )* )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1152:1: ( ( rule__FMFUI__FiducialsAssignment_1 )* )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1153:1: ( rule__FMFUI__FiducialsAssignment_1 )*
            {
             before(grammarAccess.getFMFUIAccess().getFiducialsAssignment_1()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1154:1: ( rule__FMFUI__FiducialsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==127) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1154:2: rule__FMFUI__FiducialsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__FMFUI__FiducialsAssignment_1_in_rule__FMFUI__Group__1__Impl3029);
            	    rule__FMFUI__FiducialsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFMFUIAccess().getFiducialsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFUI__Group__1__Impl


    // $ANTLR start rule__Fiducial__Group__0
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1168:1: rule__Fiducial__Group__0 : rule__Fiducial__Group__0__Impl rule__Fiducial__Group__1 ;
    public final void rule__Fiducial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1172:1: ( rule__Fiducial__Group__0__Impl rule__Fiducial__Group__1 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1173:2: rule__Fiducial__Group__0__Impl rule__Fiducial__Group__1
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__0__Impl_in_rule__Fiducial__Group__03064);
            rule__Fiducial__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__1_in_rule__Fiducial__Group__03067);
            rule__Fiducial__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__0


    // $ANTLR start rule__Fiducial__Group__0__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1180:1: rule__Fiducial__Group__0__Impl : ( 'fiducial' ) ;
    public final void rule__Fiducial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1184:1: ( ( 'fiducial' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1185:1: ( 'fiducial' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1185:1: ( 'fiducial' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1186:1: 'fiducial'
            {
             before(grammarAccess.getFiducialAccess().getFiducialKeyword_0()); 
            match(input,127,FOLLOW_127_in_rule__Fiducial__Group__0__Impl3095); 
             after(grammarAccess.getFiducialAccess().getFiducialKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__0__Impl


    // $ANTLR start rule__Fiducial__Group__1
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1199:1: rule__Fiducial__Group__1 : rule__Fiducial__Group__1__Impl rule__Fiducial__Group__2 ;
    public final void rule__Fiducial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1203:1: ( rule__Fiducial__Group__1__Impl rule__Fiducial__Group__2 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1204:2: rule__Fiducial__Group__1__Impl rule__Fiducial__Group__2
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__1__Impl_in_rule__Fiducial__Group__13126);
            rule__Fiducial__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__2_in_rule__Fiducial__Group__13129);
            rule__Fiducial__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__1


    // $ANTLR start rule__Fiducial__Group__1__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1211:1: rule__Fiducial__Group__1__Impl : ( ( rule__Fiducial__NameAssignment_1 ) ) ;
    public final void rule__Fiducial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1215:1: ( ( ( rule__Fiducial__NameAssignment_1 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1216:1: ( ( rule__Fiducial__NameAssignment_1 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1216:1: ( ( rule__Fiducial__NameAssignment_1 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1217:1: ( rule__Fiducial__NameAssignment_1 )
            {
             before(grammarAccess.getFiducialAccess().getNameAssignment_1()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1218:1: ( rule__Fiducial__NameAssignment_1 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1218:2: rule__Fiducial__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Fiducial__NameAssignment_1_in_rule__Fiducial__Group__1__Impl3156);
            rule__Fiducial__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getFiducialAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__1__Impl


    // $ANTLR start rule__Fiducial__Group__2
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1228:1: rule__Fiducial__Group__2 : rule__Fiducial__Group__2__Impl rule__Fiducial__Group__3 ;
    public final void rule__Fiducial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1232:1: ( rule__Fiducial__Group__2__Impl rule__Fiducial__Group__3 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1233:2: rule__Fiducial__Group__2__Impl rule__Fiducial__Group__3
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__2__Impl_in_rule__Fiducial__Group__23186);
            rule__Fiducial__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__3_in_rule__Fiducial__Group__23189);
            rule__Fiducial__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__2


    // $ANTLR start rule__Fiducial__Group__2__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1240:1: rule__Fiducial__Group__2__Impl : ( ':' ) ;
    public final void rule__Fiducial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1244:1: ( ( ':' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1245:1: ( ':' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1245:1: ( ':' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1246:1: ':'
            {
             before(grammarAccess.getFiducialAccess().getColonKeyword_2()); 
            match(input,128,FOLLOW_128_in_rule__Fiducial__Group__2__Impl3217); 
             after(grammarAccess.getFiducialAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__2__Impl


    // $ANTLR start rule__Fiducial__Group__3
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1259:1: rule__Fiducial__Group__3 : rule__Fiducial__Group__3__Impl rule__Fiducial__Group__4 ;
    public final void rule__Fiducial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1263:1: ( rule__Fiducial__Group__3__Impl rule__Fiducial__Group__4 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1264:2: rule__Fiducial__Group__3__Impl rule__Fiducial__Group__4
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__3__Impl_in_rule__Fiducial__Group__33248);
            rule__Fiducial__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__4_in_rule__Fiducial__Group__33251);
            rule__Fiducial__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__3


    // $ANTLR start rule__Fiducial__Group__3__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1271:1: rule__Fiducial__Group__3__Impl : ( ( rule__Fiducial__UidAssignment_3 ) ) ;
    public final void rule__Fiducial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1275:1: ( ( ( rule__Fiducial__UidAssignment_3 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1276:1: ( ( rule__Fiducial__UidAssignment_3 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1276:1: ( ( rule__Fiducial__UidAssignment_3 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1277:1: ( rule__Fiducial__UidAssignment_3 )
            {
             before(grammarAccess.getFiducialAccess().getUidAssignment_3()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1278:1: ( rule__Fiducial__UidAssignment_3 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1278:2: rule__Fiducial__UidAssignment_3
            {
            pushFollow(FOLLOW_rule__Fiducial__UidAssignment_3_in_rule__Fiducial__Group__3__Impl3278);
            rule__Fiducial__UidAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getFiducialAccess().getUidAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__3__Impl


    // $ANTLR start rule__Fiducial__Group__4
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1288:1: rule__Fiducial__Group__4 : rule__Fiducial__Group__4__Impl rule__Fiducial__Group__5 ;
    public final void rule__Fiducial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1292:1: ( rule__Fiducial__Group__4__Impl rule__Fiducial__Group__5 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1293:2: rule__Fiducial__Group__4__Impl rule__Fiducial__Group__5
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__4__Impl_in_rule__Fiducial__Group__43308);
            rule__Fiducial__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__5_in_rule__Fiducial__Group__43311);
            rule__Fiducial__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__4


    // $ANTLR start rule__Fiducial__Group__4__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1300:1: rule__Fiducial__Group__4__Impl : ( '{' ) ;
    public final void rule__Fiducial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1304:1: ( ( '{' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1305:1: ( '{' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1305:1: ( '{' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1306:1: '{'
            {
             before(grammarAccess.getFiducialAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,129,FOLLOW_129_in_rule__Fiducial__Group__4__Impl3339); 
             after(grammarAccess.getFiducialAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__4__Impl


    // $ANTLR start rule__Fiducial__Group__5
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1319:1: rule__Fiducial__Group__5 : rule__Fiducial__Group__5__Impl rule__Fiducial__Group__6 ;
    public final void rule__Fiducial__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1323:1: ( rule__Fiducial__Group__5__Impl rule__Fiducial__Group__6 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1324:2: rule__Fiducial__Group__5__Impl rule__Fiducial__Group__6
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__5__Impl_in_rule__Fiducial__Group__53370);
            rule__Fiducial__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__6_in_rule__Fiducial__Group__53373);
            rule__Fiducial__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__5


    // $ANTLR start rule__Fiducial__Group__5__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1331:1: rule__Fiducial__Group__5__Impl : ( 'style:' ) ;
    public final void rule__Fiducial__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1335:1: ( ( 'style:' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1336:1: ( 'style:' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1336:1: ( 'style:' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1337:1: 'style:'
            {
             before(grammarAccess.getFiducialAccess().getStyleKeyword_5()); 
            match(input,130,FOLLOW_130_in_rule__Fiducial__Group__5__Impl3401); 
             after(grammarAccess.getFiducialAccess().getStyleKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__5__Impl


    // $ANTLR start rule__Fiducial__Group__6
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1350:1: rule__Fiducial__Group__6 : rule__Fiducial__Group__6__Impl rule__Fiducial__Group__7 ;
    public final void rule__Fiducial__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1354:1: ( rule__Fiducial__Group__6__Impl rule__Fiducial__Group__7 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1355:2: rule__Fiducial__Group__6__Impl rule__Fiducial__Group__7
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__6__Impl_in_rule__Fiducial__Group__63432);
            rule__Fiducial__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__7_in_rule__Fiducial__Group__63435);
            rule__Fiducial__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__6


    // $ANTLR start rule__Fiducial__Group__6__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1362:1: rule__Fiducial__Group__6__Impl : ( ( rule__Fiducial__StyleAssignment_6 ) ) ;
    public final void rule__Fiducial__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1366:1: ( ( ( rule__Fiducial__StyleAssignment_6 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1367:1: ( ( rule__Fiducial__StyleAssignment_6 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1367:1: ( ( rule__Fiducial__StyleAssignment_6 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1368:1: ( rule__Fiducial__StyleAssignment_6 )
            {
             before(grammarAccess.getFiducialAccess().getStyleAssignment_6()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1369:1: ( rule__Fiducial__StyleAssignment_6 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1369:2: rule__Fiducial__StyleAssignment_6
            {
            pushFollow(FOLLOW_rule__Fiducial__StyleAssignment_6_in_rule__Fiducial__Group__6__Impl3462);
            rule__Fiducial__StyleAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getFiducialAccess().getStyleAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__6__Impl


    // $ANTLR start rule__Fiducial__Group__7
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1379:1: rule__Fiducial__Group__7 : rule__Fiducial__Group__7__Impl rule__Fiducial__Group__8 ;
    public final void rule__Fiducial__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1383:1: ( rule__Fiducial__Group__7__Impl rule__Fiducial__Group__8 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1384:2: rule__Fiducial__Group__7__Impl rule__Fiducial__Group__8
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__7__Impl_in_rule__Fiducial__Group__73492);
            rule__Fiducial__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__8_in_rule__Fiducial__Group__73495);
            rule__Fiducial__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__7


    // $ANTLR start rule__Fiducial__Group__7__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1391:1: rule__Fiducial__Group__7__Impl : ( 'kind:' ) ;
    public final void rule__Fiducial__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1395:1: ( ( 'kind:' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1396:1: ( 'kind:' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1396:1: ( 'kind:' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1397:1: 'kind:'
            {
             before(grammarAccess.getFiducialAccess().getKindKeyword_7()); 
            match(input,131,FOLLOW_131_in_rule__Fiducial__Group__7__Impl3523); 
             after(grammarAccess.getFiducialAccess().getKindKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__7__Impl


    // $ANTLR start rule__Fiducial__Group__8
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1410:1: rule__Fiducial__Group__8 : rule__Fiducial__Group__8__Impl rule__Fiducial__Group__9 ;
    public final void rule__Fiducial__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1414:1: ( rule__Fiducial__Group__8__Impl rule__Fiducial__Group__9 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1415:2: rule__Fiducial__Group__8__Impl rule__Fiducial__Group__9
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__8__Impl_in_rule__Fiducial__Group__83554);
            rule__Fiducial__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__9_in_rule__Fiducial__Group__83557);
            rule__Fiducial__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__8


    // $ANTLR start rule__Fiducial__Group__8__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1422:1: rule__Fiducial__Group__8__Impl : ( ( rule__Fiducial__KindAssignment_8 ) ) ;
    public final void rule__Fiducial__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1426:1: ( ( ( rule__Fiducial__KindAssignment_8 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1427:1: ( ( rule__Fiducial__KindAssignment_8 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1427:1: ( ( rule__Fiducial__KindAssignment_8 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1428:1: ( rule__Fiducial__KindAssignment_8 )
            {
             before(grammarAccess.getFiducialAccess().getKindAssignment_8()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1429:1: ( rule__Fiducial__KindAssignment_8 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1429:2: rule__Fiducial__KindAssignment_8
            {
            pushFollow(FOLLOW_rule__Fiducial__KindAssignment_8_in_rule__Fiducial__Group__8__Impl3584);
            rule__Fiducial__KindAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getFiducialAccess().getKindAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__8__Impl


    // $ANTLR start rule__Fiducial__Group__9
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1439:1: rule__Fiducial__Group__9 : rule__Fiducial__Group__9__Impl rule__Fiducial__Group__10 ;
    public final void rule__Fiducial__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1443:1: ( rule__Fiducial__Group__9__Impl rule__Fiducial__Group__10 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1444:2: rule__Fiducial__Group__9__Impl rule__Fiducial__Group__10
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__9__Impl_in_rule__Fiducial__Group__93614);
            rule__Fiducial__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__10_in_rule__Fiducial__Group__93617);
            rule__Fiducial__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__9


    // $ANTLR start rule__Fiducial__Group__9__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1451:1: rule__Fiducial__Group__9__Impl : ( 'foreground:' ) ;
    public final void rule__Fiducial__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1455:1: ( ( 'foreground:' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1456:1: ( 'foreground:' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1456:1: ( 'foreground:' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1457:1: 'foreground:'
            {
             before(grammarAccess.getFiducialAccess().getForegroundKeyword_9()); 
            match(input,132,FOLLOW_132_in_rule__Fiducial__Group__9__Impl3645); 
             after(grammarAccess.getFiducialAccess().getForegroundKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__9__Impl


    // $ANTLR start rule__Fiducial__Group__10
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1470:1: rule__Fiducial__Group__10 : rule__Fiducial__Group__10__Impl rule__Fiducial__Group__11 ;
    public final void rule__Fiducial__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1474:1: ( rule__Fiducial__Group__10__Impl rule__Fiducial__Group__11 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1475:2: rule__Fiducial__Group__10__Impl rule__Fiducial__Group__11
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__10__Impl_in_rule__Fiducial__Group__103676);
            rule__Fiducial__Group__10__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__11_in_rule__Fiducial__Group__103679);
            rule__Fiducial__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__10


    // $ANTLR start rule__Fiducial__Group__10__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1482:1: rule__Fiducial__Group__10__Impl : ( ( rule__Fiducial__FgAssignment_10 ) ) ;
    public final void rule__Fiducial__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1486:1: ( ( ( rule__Fiducial__FgAssignment_10 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1487:1: ( ( rule__Fiducial__FgAssignment_10 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1487:1: ( ( rule__Fiducial__FgAssignment_10 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1488:1: ( rule__Fiducial__FgAssignment_10 )
            {
             before(grammarAccess.getFiducialAccess().getFgAssignment_10()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1489:1: ( rule__Fiducial__FgAssignment_10 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1489:2: rule__Fiducial__FgAssignment_10
            {
            pushFollow(FOLLOW_rule__Fiducial__FgAssignment_10_in_rule__Fiducial__Group__10__Impl3706);
            rule__Fiducial__FgAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getFiducialAccess().getFgAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__10__Impl


    // $ANTLR start rule__Fiducial__Group__11
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1499:1: rule__Fiducial__Group__11 : rule__Fiducial__Group__11__Impl rule__Fiducial__Group__12 ;
    public final void rule__Fiducial__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1503:1: ( rule__Fiducial__Group__11__Impl rule__Fiducial__Group__12 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1504:2: rule__Fiducial__Group__11__Impl rule__Fiducial__Group__12
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__11__Impl_in_rule__Fiducial__Group__113736);
            rule__Fiducial__Group__11__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__12_in_rule__Fiducial__Group__113739);
            rule__Fiducial__Group__12();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__11


    // $ANTLR start rule__Fiducial__Group__11__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1511:1: rule__Fiducial__Group__11__Impl : ( 'background:' ) ;
    public final void rule__Fiducial__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1515:1: ( ( 'background:' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1516:1: ( 'background:' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1516:1: ( 'background:' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1517:1: 'background:'
            {
             before(grammarAccess.getFiducialAccess().getBackgroundKeyword_11()); 
            match(input,133,FOLLOW_133_in_rule__Fiducial__Group__11__Impl3767); 
             after(grammarAccess.getFiducialAccess().getBackgroundKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__11__Impl


    // $ANTLR start rule__Fiducial__Group__12
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1530:1: rule__Fiducial__Group__12 : rule__Fiducial__Group__12__Impl rule__Fiducial__Group__13 ;
    public final void rule__Fiducial__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1534:1: ( rule__Fiducial__Group__12__Impl rule__Fiducial__Group__13 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1535:2: rule__Fiducial__Group__12__Impl rule__Fiducial__Group__13
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__12__Impl_in_rule__Fiducial__Group__123798);
            rule__Fiducial__Group__12__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__13_in_rule__Fiducial__Group__123801);
            rule__Fiducial__Group__13();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__12


    // $ANTLR start rule__Fiducial__Group__12__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1542:1: rule__Fiducial__Group__12__Impl : ( ( rule__Fiducial__BgAssignment_12 ) ) ;
    public final void rule__Fiducial__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1546:1: ( ( ( rule__Fiducial__BgAssignment_12 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1547:1: ( ( rule__Fiducial__BgAssignment_12 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1547:1: ( ( rule__Fiducial__BgAssignment_12 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1548:1: ( rule__Fiducial__BgAssignment_12 )
            {
             before(grammarAccess.getFiducialAccess().getBgAssignment_12()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1549:1: ( rule__Fiducial__BgAssignment_12 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1549:2: rule__Fiducial__BgAssignment_12
            {
            pushFollow(FOLLOW_rule__Fiducial__BgAssignment_12_in_rule__Fiducial__Group__12__Impl3828);
            rule__Fiducial__BgAssignment_12();
            _fsp--;


            }

             after(grammarAccess.getFiducialAccess().getBgAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__12__Impl


    // $ANTLR start rule__Fiducial__Group__13
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1559:1: rule__Fiducial__Group__13 : rule__Fiducial__Group__13__Impl rule__Fiducial__Group__14 ;
    public final void rule__Fiducial__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1563:1: ( rule__Fiducial__Group__13__Impl rule__Fiducial__Group__14 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1564:2: rule__Fiducial__Group__13__Impl rule__Fiducial__Group__14
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__13__Impl_in_rule__Fiducial__Group__133858);
            rule__Fiducial__Group__13__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__14_in_rule__Fiducial__Group__133861);
            rule__Fiducial__Group__14();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__13


    // $ANTLR start rule__Fiducial__Group__13__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1571:1: rule__Fiducial__Group__13__Impl : ( 'radius:' ) ;
    public final void rule__Fiducial__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1575:1: ( ( 'radius:' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1576:1: ( 'radius:' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1576:1: ( 'radius:' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1577:1: 'radius:'
            {
             before(grammarAccess.getFiducialAccess().getRadiusKeyword_13()); 
            match(input,134,FOLLOW_134_in_rule__Fiducial__Group__13__Impl3889); 
             after(grammarAccess.getFiducialAccess().getRadiusKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__13__Impl


    // $ANTLR start rule__Fiducial__Group__14
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1590:1: rule__Fiducial__Group__14 : rule__Fiducial__Group__14__Impl rule__Fiducial__Group__15 ;
    public final void rule__Fiducial__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1594:1: ( rule__Fiducial__Group__14__Impl rule__Fiducial__Group__15 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1595:2: rule__Fiducial__Group__14__Impl rule__Fiducial__Group__15
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__14__Impl_in_rule__Fiducial__Group__143920);
            rule__Fiducial__Group__14__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__15_in_rule__Fiducial__Group__143923);
            rule__Fiducial__Group__15();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__14


    // $ANTLR start rule__Fiducial__Group__14__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1602:1: rule__Fiducial__Group__14__Impl : ( ( rule__Fiducial__RadiusAssignment_14 ) ) ;
    public final void rule__Fiducial__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1606:1: ( ( ( rule__Fiducial__RadiusAssignment_14 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1607:1: ( ( rule__Fiducial__RadiusAssignment_14 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1607:1: ( ( rule__Fiducial__RadiusAssignment_14 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1608:1: ( rule__Fiducial__RadiusAssignment_14 )
            {
             before(grammarAccess.getFiducialAccess().getRadiusAssignment_14()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1609:1: ( rule__Fiducial__RadiusAssignment_14 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1609:2: rule__Fiducial__RadiusAssignment_14
            {
            pushFollow(FOLLOW_rule__Fiducial__RadiusAssignment_14_in_rule__Fiducial__Group__14__Impl3950);
            rule__Fiducial__RadiusAssignment_14();
            _fsp--;


            }

             after(grammarAccess.getFiducialAccess().getRadiusAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__14__Impl


    // $ANTLR start rule__Fiducial__Group__15
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1619:1: rule__Fiducial__Group__15 : rule__Fiducial__Group__15__Impl rule__Fiducial__Group__16 ;
    public final void rule__Fiducial__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1623:1: ( rule__Fiducial__Group__15__Impl rule__Fiducial__Group__16 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1624:2: rule__Fiducial__Group__15__Impl rule__Fiducial__Group__16
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__15__Impl_in_rule__Fiducial__Group__153980);
            rule__Fiducial__Group__15__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__16_in_rule__Fiducial__Group__153983);
            rule__Fiducial__Group__16();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__15


    // $ANTLR start rule__Fiducial__Group__15__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1631:1: rule__Fiducial__Group__15__Impl : ( 'proxima:' ) ;
    public final void rule__Fiducial__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1635:1: ( ( 'proxima:' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1636:1: ( 'proxima:' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1636:1: ( 'proxima:' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1637:1: 'proxima:'
            {
             before(grammarAccess.getFiducialAccess().getProximaKeyword_15()); 
            match(input,135,FOLLOW_135_in_rule__Fiducial__Group__15__Impl4011); 
             after(grammarAccess.getFiducialAccess().getProximaKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__15__Impl


    // $ANTLR start rule__Fiducial__Group__16
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1650:1: rule__Fiducial__Group__16 : rule__Fiducial__Group__16__Impl rule__Fiducial__Group__17 ;
    public final void rule__Fiducial__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1654:1: ( rule__Fiducial__Group__16__Impl rule__Fiducial__Group__17 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1655:2: rule__Fiducial__Group__16__Impl rule__Fiducial__Group__17
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__16__Impl_in_rule__Fiducial__Group__164042);
            rule__Fiducial__Group__16__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__17_in_rule__Fiducial__Group__164045);
            rule__Fiducial__Group__17();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__16


    // $ANTLR start rule__Fiducial__Group__16__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1662:1: rule__Fiducial__Group__16__Impl : ( ( rule__Fiducial__ProximaAssignment_16 ) ) ;
    public final void rule__Fiducial__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1666:1: ( ( ( rule__Fiducial__ProximaAssignment_16 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1667:1: ( ( rule__Fiducial__ProximaAssignment_16 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1667:1: ( ( rule__Fiducial__ProximaAssignment_16 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1668:1: ( rule__Fiducial__ProximaAssignment_16 )
            {
             before(grammarAccess.getFiducialAccess().getProximaAssignment_16()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1669:1: ( rule__Fiducial__ProximaAssignment_16 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1669:2: rule__Fiducial__ProximaAssignment_16
            {
            pushFollow(FOLLOW_rule__Fiducial__ProximaAssignment_16_in_rule__Fiducial__Group__16__Impl4072);
            rule__Fiducial__ProximaAssignment_16();
            _fsp--;


            }

             after(grammarAccess.getFiducialAccess().getProximaAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__16__Impl


    // $ANTLR start rule__Fiducial__Group__17
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1679:1: rule__Fiducial__Group__17 : rule__Fiducial__Group__17__Impl rule__Fiducial__Group__18 ;
    public final void rule__Fiducial__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1683:1: ( rule__Fiducial__Group__17__Impl rule__Fiducial__Group__18 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1684:2: rule__Fiducial__Group__17__Impl rule__Fiducial__Group__18
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__17__Impl_in_rule__Fiducial__Group__174102);
            rule__Fiducial__Group__17__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__18_in_rule__Fiducial__Group__174105);
            rule__Fiducial__Group__18();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__17


    // $ANTLR start rule__Fiducial__Group__17__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1691:1: rule__Fiducial__Group__17__Impl : ( 'proximaVisible:' ) ;
    public final void rule__Fiducial__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1695:1: ( ( 'proximaVisible:' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1696:1: ( 'proximaVisible:' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1696:1: ( 'proximaVisible:' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1697:1: 'proximaVisible:'
            {
             before(grammarAccess.getFiducialAccess().getProximaVisibleKeyword_17()); 
            match(input,136,FOLLOW_136_in_rule__Fiducial__Group__17__Impl4133); 
             after(grammarAccess.getFiducialAccess().getProximaVisibleKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__17__Impl


    // $ANTLR start rule__Fiducial__Group__18
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1710:1: rule__Fiducial__Group__18 : rule__Fiducial__Group__18__Impl rule__Fiducial__Group__19 ;
    public final void rule__Fiducial__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1714:1: ( rule__Fiducial__Group__18__Impl rule__Fiducial__Group__19 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1715:2: rule__Fiducial__Group__18__Impl rule__Fiducial__Group__19
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__18__Impl_in_rule__Fiducial__Group__184164);
            rule__Fiducial__Group__18__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__19_in_rule__Fiducial__Group__184167);
            rule__Fiducial__Group__19();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__18


    // $ANTLR start rule__Fiducial__Group__18__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1722:1: rule__Fiducial__Group__18__Impl : ( ( rule__Fiducial__ProximaVisibleAssignment_18 ) ) ;
    public final void rule__Fiducial__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1726:1: ( ( ( rule__Fiducial__ProximaVisibleAssignment_18 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1727:1: ( ( rule__Fiducial__ProximaVisibleAssignment_18 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1727:1: ( ( rule__Fiducial__ProximaVisibleAssignment_18 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1728:1: ( rule__Fiducial__ProximaVisibleAssignment_18 )
            {
             before(grammarAccess.getFiducialAccess().getProximaVisibleAssignment_18()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1729:1: ( rule__Fiducial__ProximaVisibleAssignment_18 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1729:2: rule__Fiducial__ProximaVisibleAssignment_18
            {
            pushFollow(FOLLOW_rule__Fiducial__ProximaVisibleAssignment_18_in_rule__Fiducial__Group__18__Impl4194);
            rule__Fiducial__ProximaVisibleAssignment_18();
            _fsp--;


            }

             after(grammarAccess.getFiducialAccess().getProximaVisibleAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__18__Impl


    // $ANTLR start rule__Fiducial__Group__19
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1739:1: rule__Fiducial__Group__19 : rule__Fiducial__Group__19__Impl rule__Fiducial__Group__20 ;
    public final void rule__Fiducial__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1743:1: ( rule__Fiducial__Group__19__Impl rule__Fiducial__Group__20 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1744:2: rule__Fiducial__Group__19__Impl rule__Fiducial__Group__20
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__19__Impl_in_rule__Fiducial__Group__194224);
            rule__Fiducial__Group__19__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__20_in_rule__Fiducial__Group__194227);
            rule__Fiducial__Group__20();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__19


    // $ANTLR start rule__Fiducial__Group__19__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1751:1: rule__Fiducial__Group__19__Impl : ( 'function:' ) ;
    public final void rule__Fiducial__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1755:1: ( ( 'function:' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1756:1: ( 'function:' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1756:1: ( 'function:' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1757:1: 'function:'
            {
             before(grammarAccess.getFiducialAccess().getFunctionKeyword_19()); 
            match(input,137,FOLLOW_137_in_rule__Fiducial__Group__19__Impl4255); 
             after(grammarAccess.getFiducialAccess().getFunctionKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__19__Impl


    // $ANTLR start rule__Fiducial__Group__20
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1770:1: rule__Fiducial__Group__20 : rule__Fiducial__Group__20__Impl rule__Fiducial__Group__21 ;
    public final void rule__Fiducial__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1774:1: ( rule__Fiducial__Group__20__Impl rule__Fiducial__Group__21 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1775:2: rule__Fiducial__Group__20__Impl rule__Fiducial__Group__21
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__20__Impl_in_rule__Fiducial__Group__204286);
            rule__Fiducial__Group__20__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__21_in_rule__Fiducial__Group__204289);
            rule__Fiducial__Group__21();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__20


    // $ANTLR start rule__Fiducial__Group__20__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1782:1: rule__Fiducial__Group__20__Impl : ( ( rule__Fiducial__FunctionAssignment_20 ) ) ;
    public final void rule__Fiducial__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1786:1: ( ( ( rule__Fiducial__FunctionAssignment_20 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1787:1: ( ( rule__Fiducial__FunctionAssignment_20 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1787:1: ( ( rule__Fiducial__FunctionAssignment_20 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1788:1: ( rule__Fiducial__FunctionAssignment_20 )
            {
             before(grammarAccess.getFiducialAccess().getFunctionAssignment_20()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1789:1: ( rule__Fiducial__FunctionAssignment_20 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1789:2: rule__Fiducial__FunctionAssignment_20
            {
            pushFollow(FOLLOW_rule__Fiducial__FunctionAssignment_20_in_rule__Fiducial__Group__20__Impl4316);
            rule__Fiducial__FunctionAssignment_20();
            _fsp--;


            }

             after(grammarAccess.getFiducialAccess().getFunctionAssignment_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__20__Impl


    // $ANTLR start rule__Fiducial__Group__21
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1799:1: rule__Fiducial__Group__21 : rule__Fiducial__Group__21__Impl rule__Fiducial__Group__22 ;
    public final void rule__Fiducial__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1803:1: ( rule__Fiducial__Group__21__Impl rule__Fiducial__Group__22 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1804:2: rule__Fiducial__Group__21__Impl rule__Fiducial__Group__22
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__21__Impl_in_rule__Fiducial__Group__214346);
            rule__Fiducial__Group__21__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__22_in_rule__Fiducial__Group__214349);
            rule__Fiducial__Group__22();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__21


    // $ANTLR start rule__Fiducial__Group__21__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1811:1: rule__Fiducial__Group__21__Impl : ( 'range:' ) ;
    public final void rule__Fiducial__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1815:1: ( ( 'range:' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1816:1: ( 'range:' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1816:1: ( 'range:' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1817:1: 'range:'
            {
             before(grammarAccess.getFiducialAccess().getRangeKeyword_21()); 
            match(input,138,FOLLOW_138_in_rule__Fiducial__Group__21__Impl4377); 
             after(grammarAccess.getFiducialAccess().getRangeKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__21__Impl


    // $ANTLR start rule__Fiducial__Group__22
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1830:1: rule__Fiducial__Group__22 : rule__Fiducial__Group__22__Impl rule__Fiducial__Group__23 ;
    public final void rule__Fiducial__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1834:1: ( rule__Fiducial__Group__22__Impl rule__Fiducial__Group__23 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1835:2: rule__Fiducial__Group__22__Impl rule__Fiducial__Group__23
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__22__Impl_in_rule__Fiducial__Group__224408);
            rule__Fiducial__Group__22__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fiducial__Group__23_in_rule__Fiducial__Group__224411);
            rule__Fiducial__Group__23();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__22


    // $ANTLR start rule__Fiducial__Group__22__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1842:1: rule__Fiducial__Group__22__Impl : ( ( rule__Fiducial__RangeAssignment_22 ) ) ;
    public final void rule__Fiducial__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1846:1: ( ( ( rule__Fiducial__RangeAssignment_22 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1847:1: ( ( rule__Fiducial__RangeAssignment_22 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1847:1: ( ( rule__Fiducial__RangeAssignment_22 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1848:1: ( rule__Fiducial__RangeAssignment_22 )
            {
             before(grammarAccess.getFiducialAccess().getRangeAssignment_22()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1849:1: ( rule__Fiducial__RangeAssignment_22 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1849:2: rule__Fiducial__RangeAssignment_22
            {
            pushFollow(FOLLOW_rule__Fiducial__RangeAssignment_22_in_rule__Fiducial__Group__22__Impl4438);
            rule__Fiducial__RangeAssignment_22();
            _fsp--;


            }

             after(grammarAccess.getFiducialAccess().getRangeAssignment_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__22__Impl


    // $ANTLR start rule__Fiducial__Group__23
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1859:1: rule__Fiducial__Group__23 : rule__Fiducial__Group__23__Impl ;
    public final void rule__Fiducial__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1863:1: ( rule__Fiducial__Group__23__Impl )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1864:2: rule__Fiducial__Group__23__Impl
            {
            pushFollow(FOLLOW_rule__Fiducial__Group__23__Impl_in_rule__Fiducial__Group__234468);
            rule__Fiducial__Group__23__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__23


    // $ANTLR start rule__Fiducial__Group__23__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1870:1: rule__Fiducial__Group__23__Impl : ( '}' ) ;
    public final void rule__Fiducial__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1874:1: ( ( '}' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1875:1: ( '}' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1875:1: ( '}' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1876:1: '}'
            {
             before(grammarAccess.getFiducialAccess().getRightCurlyBracketKeyword_23()); 
            match(input,139,FOLLOW_139_in_rule__Fiducial__Group__23__Impl4496); 
             after(grammarAccess.getFiducialAccess().getRightCurlyBracketKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__Group__23__Impl


    // $ANTLR start rule__FMFSettings__Group__0
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1937:1: rule__FMFSettings__Group__0 : rule__FMFSettings__Group__0__Impl rule__FMFSettings__Group__1 ;
    public final void rule__FMFSettings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1941:1: ( rule__FMFSettings__Group__0__Impl rule__FMFSettings__Group__1 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1942:2: rule__FMFSettings__Group__0__Impl rule__FMFSettings__Group__1
            {
            pushFollow(FOLLOW_rule__FMFSettings__Group__0__Impl_in_rule__FMFSettings__Group__04575);
            rule__FMFSettings__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FMFSettings__Group__1_in_rule__FMFSettings__Group__04578);
            rule__FMFSettings__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__0


    // $ANTLR start rule__FMFSettings__Group__0__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1949:1: rule__FMFSettings__Group__0__Impl : ( 'settings : {' ) ;
    public final void rule__FMFSettings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1953:1: ( ( 'settings : {' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1954:1: ( 'settings : {' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1954:1: ( 'settings : {' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1955:1: 'settings : {'
            {
             before(grammarAccess.getFMFSettingsAccess().getSettingsKeyword_0()); 
            match(input,140,FOLLOW_140_in_rule__FMFSettings__Group__0__Impl4606); 
             after(grammarAccess.getFMFSettingsAccess().getSettingsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__0__Impl


    // $ANTLR start rule__FMFSettings__Group__1
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1968:1: rule__FMFSettings__Group__1 : rule__FMFSettings__Group__1__Impl rule__FMFSettings__Group__2 ;
    public final void rule__FMFSettings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1972:1: ( rule__FMFSettings__Group__1__Impl rule__FMFSettings__Group__2 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1973:2: rule__FMFSettings__Group__1__Impl rule__FMFSettings__Group__2
            {
            pushFollow(FOLLOW_rule__FMFSettings__Group__1__Impl_in_rule__FMFSettings__Group__14637);
            rule__FMFSettings__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FMFSettings__Group__2_in_rule__FMFSettings__Group__14640);
            rule__FMFSettings__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__1


    // $ANTLR start rule__FMFSettings__Group__1__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1980:1: rule__FMFSettings__Group__1__Impl : ( 'OscReceivePort:' ) ;
    public final void rule__FMFSettings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1984:1: ( ( 'OscReceivePort:' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1985:1: ( 'OscReceivePort:' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1985:1: ( 'OscReceivePort:' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1986:1: 'OscReceivePort:'
            {
             before(grammarAccess.getFMFSettingsAccess().getOscReceivePortKeyword_1()); 
            match(input,141,FOLLOW_141_in_rule__FMFSettings__Group__1__Impl4668); 
             after(grammarAccess.getFMFSettingsAccess().getOscReceivePortKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__1__Impl


    // $ANTLR start rule__FMFSettings__Group__2
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:1999:1: rule__FMFSettings__Group__2 : rule__FMFSettings__Group__2__Impl rule__FMFSettings__Group__3 ;
    public final void rule__FMFSettings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2003:1: ( rule__FMFSettings__Group__2__Impl rule__FMFSettings__Group__3 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2004:2: rule__FMFSettings__Group__2__Impl rule__FMFSettings__Group__3
            {
            pushFollow(FOLLOW_rule__FMFSettings__Group__2__Impl_in_rule__FMFSettings__Group__24699);
            rule__FMFSettings__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FMFSettings__Group__3_in_rule__FMFSettings__Group__24702);
            rule__FMFSettings__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__2


    // $ANTLR start rule__FMFSettings__Group__2__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2011:1: rule__FMFSettings__Group__2__Impl : ( ( rule__FMFSettings__OscReceivePortAssignment_2 ) ) ;
    public final void rule__FMFSettings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2015:1: ( ( ( rule__FMFSettings__OscReceivePortAssignment_2 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2016:1: ( ( rule__FMFSettings__OscReceivePortAssignment_2 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2016:1: ( ( rule__FMFSettings__OscReceivePortAssignment_2 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2017:1: ( rule__FMFSettings__OscReceivePortAssignment_2 )
            {
             before(grammarAccess.getFMFSettingsAccess().getOscReceivePortAssignment_2()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2018:1: ( rule__FMFSettings__OscReceivePortAssignment_2 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2018:2: rule__FMFSettings__OscReceivePortAssignment_2
            {
            pushFollow(FOLLOW_rule__FMFSettings__OscReceivePortAssignment_2_in_rule__FMFSettings__Group__2__Impl4729);
            rule__FMFSettings__OscReceivePortAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFMFSettingsAccess().getOscReceivePortAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__2__Impl


    // $ANTLR start rule__FMFSettings__Group__3
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2028:1: rule__FMFSettings__Group__3 : rule__FMFSettings__Group__3__Impl rule__FMFSettings__Group__4 ;
    public final void rule__FMFSettings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2032:1: ( rule__FMFSettings__Group__3__Impl rule__FMFSettings__Group__4 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2033:2: rule__FMFSettings__Group__3__Impl rule__FMFSettings__Group__4
            {
            pushFollow(FOLLOW_rule__FMFSettings__Group__3__Impl_in_rule__FMFSettings__Group__34759);
            rule__FMFSettings__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FMFSettings__Group__4_in_rule__FMFSettings__Group__34762);
            rule__FMFSettings__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__3


    // $ANTLR start rule__FMFSettings__Group__3__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2040:1: rule__FMFSettings__Group__3__Impl : ( 'OscSendAddress:' ) ;
    public final void rule__FMFSettings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2044:1: ( ( 'OscSendAddress:' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2045:1: ( 'OscSendAddress:' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2045:1: ( 'OscSendAddress:' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2046:1: 'OscSendAddress:'
            {
             before(grammarAccess.getFMFSettingsAccess().getOscSendAddressKeyword_3()); 
            match(input,142,FOLLOW_142_in_rule__FMFSettings__Group__3__Impl4790); 
             after(grammarAccess.getFMFSettingsAccess().getOscSendAddressKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__3__Impl


    // $ANTLR start rule__FMFSettings__Group__4
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2059:1: rule__FMFSettings__Group__4 : rule__FMFSettings__Group__4__Impl rule__FMFSettings__Group__5 ;
    public final void rule__FMFSettings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2063:1: ( rule__FMFSettings__Group__4__Impl rule__FMFSettings__Group__5 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2064:2: rule__FMFSettings__Group__4__Impl rule__FMFSettings__Group__5
            {
            pushFollow(FOLLOW_rule__FMFSettings__Group__4__Impl_in_rule__FMFSettings__Group__44821);
            rule__FMFSettings__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FMFSettings__Group__5_in_rule__FMFSettings__Group__44824);
            rule__FMFSettings__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__4


    // $ANTLR start rule__FMFSettings__Group__4__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2071:1: rule__FMFSettings__Group__4__Impl : ( ( rule__FMFSettings__OscSendAddressAssignment_4 ) ) ;
    public final void rule__FMFSettings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2075:1: ( ( ( rule__FMFSettings__OscSendAddressAssignment_4 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2076:1: ( ( rule__FMFSettings__OscSendAddressAssignment_4 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2076:1: ( ( rule__FMFSettings__OscSendAddressAssignment_4 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2077:1: ( rule__FMFSettings__OscSendAddressAssignment_4 )
            {
             before(grammarAccess.getFMFSettingsAccess().getOscSendAddressAssignment_4()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2078:1: ( rule__FMFSettings__OscSendAddressAssignment_4 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2078:2: rule__FMFSettings__OscSendAddressAssignment_4
            {
            pushFollow(FOLLOW_rule__FMFSettings__OscSendAddressAssignment_4_in_rule__FMFSettings__Group__4__Impl4851);
            rule__FMFSettings__OscSendAddressAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getFMFSettingsAccess().getOscSendAddressAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__4__Impl


    // $ANTLR start rule__FMFSettings__Group__5
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2088:1: rule__FMFSettings__Group__5 : rule__FMFSettings__Group__5__Impl rule__FMFSettings__Group__6 ;
    public final void rule__FMFSettings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2092:1: ( rule__FMFSettings__Group__5__Impl rule__FMFSettings__Group__6 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2093:2: rule__FMFSettings__Group__5__Impl rule__FMFSettings__Group__6
            {
            pushFollow(FOLLOW_rule__FMFSettings__Group__5__Impl_in_rule__FMFSettings__Group__54881);
            rule__FMFSettings__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FMFSettings__Group__6_in_rule__FMFSettings__Group__54884);
            rule__FMFSettings__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__5


    // $ANTLR start rule__FMFSettings__Group__5__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2100:1: rule__FMFSettings__Group__5__Impl : ( 'OscSendPort:' ) ;
    public final void rule__FMFSettings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2104:1: ( ( 'OscSendPort:' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2105:1: ( 'OscSendPort:' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2105:1: ( 'OscSendPort:' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2106:1: 'OscSendPort:'
            {
             before(grammarAccess.getFMFSettingsAccess().getOscSendPortKeyword_5()); 
            match(input,143,FOLLOW_143_in_rule__FMFSettings__Group__5__Impl4912); 
             after(grammarAccess.getFMFSettingsAccess().getOscSendPortKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__5__Impl


    // $ANTLR start rule__FMFSettings__Group__6
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2119:1: rule__FMFSettings__Group__6 : rule__FMFSettings__Group__6__Impl rule__FMFSettings__Group__7 ;
    public final void rule__FMFSettings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2123:1: ( rule__FMFSettings__Group__6__Impl rule__FMFSettings__Group__7 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2124:2: rule__FMFSettings__Group__6__Impl rule__FMFSettings__Group__7
            {
            pushFollow(FOLLOW_rule__FMFSettings__Group__6__Impl_in_rule__FMFSettings__Group__64943);
            rule__FMFSettings__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FMFSettings__Group__7_in_rule__FMFSettings__Group__64946);
            rule__FMFSettings__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__6


    // $ANTLR start rule__FMFSettings__Group__6__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2131:1: rule__FMFSettings__Group__6__Impl : ( ( rule__FMFSettings__OscSendPortAssignment_6 ) ) ;
    public final void rule__FMFSettings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2135:1: ( ( ( rule__FMFSettings__OscSendPortAssignment_6 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2136:1: ( ( rule__FMFSettings__OscSendPortAssignment_6 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2136:1: ( ( rule__FMFSettings__OscSendPortAssignment_6 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2137:1: ( rule__FMFSettings__OscSendPortAssignment_6 )
            {
             before(grammarAccess.getFMFSettingsAccess().getOscSendPortAssignment_6()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2138:1: ( rule__FMFSettings__OscSendPortAssignment_6 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2138:2: rule__FMFSettings__OscSendPortAssignment_6
            {
            pushFollow(FOLLOW_rule__FMFSettings__OscSendPortAssignment_6_in_rule__FMFSettings__Group__6__Impl4973);
            rule__FMFSettings__OscSendPortAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getFMFSettingsAccess().getOscSendPortAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__6__Impl


    // $ANTLR start rule__FMFSettings__Group__7
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2148:1: rule__FMFSettings__Group__7 : rule__FMFSettings__Group__7__Impl rule__FMFSettings__Group__8 ;
    public final void rule__FMFSettings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2152:1: ( rule__FMFSettings__Group__7__Impl rule__FMFSettings__Group__8 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2153:2: rule__FMFSettings__Group__7__Impl rule__FMFSettings__Group__8
            {
            pushFollow(FOLLOW_rule__FMFSettings__Group__7__Impl_in_rule__FMFSettings__Group__75003);
            rule__FMFSettings__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FMFSettings__Group__8_in_rule__FMFSettings__Group__75006);
            rule__FMFSettings__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__7


    // $ANTLR start rule__FMFSettings__Group__7__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2160:1: rule__FMFSettings__Group__7__Impl : ( 'TuioPort:' ) ;
    public final void rule__FMFSettings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2164:1: ( ( 'TuioPort:' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2165:1: ( 'TuioPort:' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2165:1: ( 'TuioPort:' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2166:1: 'TuioPort:'
            {
             before(grammarAccess.getFMFSettingsAccess().getTuioPortKeyword_7()); 
            match(input,144,FOLLOW_144_in_rule__FMFSettings__Group__7__Impl5034); 
             after(grammarAccess.getFMFSettingsAccess().getTuioPortKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__7__Impl


    // $ANTLR start rule__FMFSettings__Group__8
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2179:1: rule__FMFSettings__Group__8 : rule__FMFSettings__Group__8__Impl rule__FMFSettings__Group__9 ;
    public final void rule__FMFSettings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2183:1: ( rule__FMFSettings__Group__8__Impl rule__FMFSettings__Group__9 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2184:2: rule__FMFSettings__Group__8__Impl rule__FMFSettings__Group__9
            {
            pushFollow(FOLLOW_rule__FMFSettings__Group__8__Impl_in_rule__FMFSettings__Group__85065);
            rule__FMFSettings__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FMFSettings__Group__9_in_rule__FMFSettings__Group__85068);
            rule__FMFSettings__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__8


    // $ANTLR start rule__FMFSettings__Group__8__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2191:1: rule__FMFSettings__Group__8__Impl : ( ( rule__FMFSettings__TuioPortAssignment_8 ) ) ;
    public final void rule__FMFSettings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2195:1: ( ( ( rule__FMFSettings__TuioPortAssignment_8 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2196:1: ( ( rule__FMFSettings__TuioPortAssignment_8 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2196:1: ( ( rule__FMFSettings__TuioPortAssignment_8 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2197:1: ( rule__FMFSettings__TuioPortAssignment_8 )
            {
             before(grammarAccess.getFMFSettingsAccess().getTuioPortAssignment_8()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2198:1: ( rule__FMFSettings__TuioPortAssignment_8 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2198:2: rule__FMFSettings__TuioPortAssignment_8
            {
            pushFollow(FOLLOW_rule__FMFSettings__TuioPortAssignment_8_in_rule__FMFSettings__Group__8__Impl5095);
            rule__FMFSettings__TuioPortAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getFMFSettingsAccess().getTuioPortAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__8__Impl


    // $ANTLR start rule__FMFSettings__Group__9
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2208:1: rule__FMFSettings__Group__9 : rule__FMFSettings__Group__9__Impl rule__FMFSettings__Group__10 ;
    public final void rule__FMFSettings__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2212:1: ( rule__FMFSettings__Group__9__Impl rule__FMFSettings__Group__10 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2213:2: rule__FMFSettings__Group__9__Impl rule__FMFSettings__Group__10
            {
            pushFollow(FOLLOW_rule__FMFSettings__Group__9__Impl_in_rule__FMFSettings__Group__95125);
            rule__FMFSettings__Group__9__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FMFSettings__Group__10_in_rule__FMFSettings__Group__95128);
            rule__FMFSettings__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__9


    // $ANTLR start rule__FMFSettings__Group__9__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2220:1: rule__FMFSettings__Group__9__Impl : ( 'liveRate:' ) ;
    public final void rule__FMFSettings__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2224:1: ( ( 'liveRate:' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2225:1: ( 'liveRate:' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2225:1: ( 'liveRate:' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2226:1: 'liveRate:'
            {
             before(grammarAccess.getFMFSettingsAccess().getLiveRateKeyword_9()); 
            match(input,145,FOLLOW_145_in_rule__FMFSettings__Group__9__Impl5156); 
             after(grammarAccess.getFMFSettingsAccess().getLiveRateKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__9__Impl


    // $ANTLR start rule__FMFSettings__Group__10
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2239:1: rule__FMFSettings__Group__10 : rule__FMFSettings__Group__10__Impl rule__FMFSettings__Group__11 ;
    public final void rule__FMFSettings__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2243:1: ( rule__FMFSettings__Group__10__Impl rule__FMFSettings__Group__11 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2244:2: rule__FMFSettings__Group__10__Impl rule__FMFSettings__Group__11
            {
            pushFollow(FOLLOW_rule__FMFSettings__Group__10__Impl_in_rule__FMFSettings__Group__105187);
            rule__FMFSettings__Group__10__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FMFSettings__Group__11_in_rule__FMFSettings__Group__105190);
            rule__FMFSettings__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__10


    // $ANTLR start rule__FMFSettings__Group__10__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2251:1: rule__FMFSettings__Group__10__Impl : ( ( rule__FMFSettings__LiveRateAssignment_10 ) ) ;
    public final void rule__FMFSettings__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2255:1: ( ( ( rule__FMFSettings__LiveRateAssignment_10 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2256:1: ( ( rule__FMFSettings__LiveRateAssignment_10 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2256:1: ( ( rule__FMFSettings__LiveRateAssignment_10 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2257:1: ( rule__FMFSettings__LiveRateAssignment_10 )
            {
             before(grammarAccess.getFMFSettingsAccess().getLiveRateAssignment_10()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2258:1: ( rule__FMFSettings__LiveRateAssignment_10 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2258:2: rule__FMFSettings__LiveRateAssignment_10
            {
            pushFollow(FOLLOW_rule__FMFSettings__LiveRateAssignment_10_in_rule__FMFSettings__Group__10__Impl5217);
            rule__FMFSettings__LiveRateAssignment_10();
            _fsp--;


            }

             after(grammarAccess.getFMFSettingsAccess().getLiveRateAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__10__Impl


    // $ANTLR start rule__FMFSettings__Group__11
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2268:1: rule__FMFSettings__Group__11 : rule__FMFSettings__Group__11__Impl rule__FMFSettings__Group__12 ;
    public final void rule__FMFSettings__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2272:1: ( rule__FMFSettings__Group__11__Impl rule__FMFSettings__Group__12 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2273:2: rule__FMFSettings__Group__11__Impl rule__FMFSettings__Group__12
            {
            pushFollow(FOLLOW_rule__FMFSettings__Group__11__Impl_in_rule__FMFSettings__Group__115247);
            rule__FMFSettings__Group__11__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FMFSettings__Group__12_in_rule__FMFSettings__Group__115250);
            rule__FMFSettings__Group__12();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__11


    // $ANTLR start rule__FMFSettings__Group__11__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2280:1: rule__FMFSettings__Group__11__Impl : ( 'processingRate:' ) ;
    public final void rule__FMFSettings__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2284:1: ( ( 'processingRate:' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2285:1: ( 'processingRate:' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2285:1: ( 'processingRate:' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2286:1: 'processingRate:'
            {
             before(grammarAccess.getFMFSettingsAccess().getProcessingRateKeyword_11()); 
            match(input,146,FOLLOW_146_in_rule__FMFSettings__Group__11__Impl5278); 
             after(grammarAccess.getFMFSettingsAccess().getProcessingRateKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__11__Impl


    // $ANTLR start rule__FMFSettings__Group__12
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2299:1: rule__FMFSettings__Group__12 : rule__FMFSettings__Group__12__Impl rule__FMFSettings__Group__13 ;
    public final void rule__FMFSettings__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2303:1: ( rule__FMFSettings__Group__12__Impl rule__FMFSettings__Group__13 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2304:2: rule__FMFSettings__Group__12__Impl rule__FMFSettings__Group__13
            {
            pushFollow(FOLLOW_rule__FMFSettings__Group__12__Impl_in_rule__FMFSettings__Group__125309);
            rule__FMFSettings__Group__12__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FMFSettings__Group__13_in_rule__FMFSettings__Group__125312);
            rule__FMFSettings__Group__13();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__12


    // $ANTLR start rule__FMFSettings__Group__12__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2311:1: rule__FMFSettings__Group__12__Impl : ( ( rule__FMFSettings__ProcessingRateAssignment_12 ) ) ;
    public final void rule__FMFSettings__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2315:1: ( ( ( rule__FMFSettings__ProcessingRateAssignment_12 ) ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2316:1: ( ( rule__FMFSettings__ProcessingRateAssignment_12 ) )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2316:1: ( ( rule__FMFSettings__ProcessingRateAssignment_12 ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2317:1: ( rule__FMFSettings__ProcessingRateAssignment_12 )
            {
             before(grammarAccess.getFMFSettingsAccess().getProcessingRateAssignment_12()); 
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2318:1: ( rule__FMFSettings__ProcessingRateAssignment_12 )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2318:2: rule__FMFSettings__ProcessingRateAssignment_12
            {
            pushFollow(FOLLOW_rule__FMFSettings__ProcessingRateAssignment_12_in_rule__FMFSettings__Group__12__Impl5339);
            rule__FMFSettings__ProcessingRateAssignment_12();
            _fsp--;


            }

             after(grammarAccess.getFMFSettingsAccess().getProcessingRateAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__12__Impl


    // $ANTLR start rule__FMFSettings__Group__13
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2328:1: rule__FMFSettings__Group__13 : rule__FMFSettings__Group__13__Impl ;
    public final void rule__FMFSettings__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2332:1: ( rule__FMFSettings__Group__13__Impl )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2333:2: rule__FMFSettings__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__FMFSettings__Group__13__Impl_in_rule__FMFSettings__Group__135369);
            rule__FMFSettings__Group__13__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__13


    // $ANTLR start rule__FMFSettings__Group__13__Impl
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2339:1: rule__FMFSettings__Group__13__Impl : ( '}' ) ;
    public final void rule__FMFSettings__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2343:1: ( ( '}' ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2344:1: ( '}' )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2344:1: ( '}' )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2345:1: '}'
            {
             before(grammarAccess.getFMFSettingsAccess().getRightCurlyBracketKeyword_13()); 
            match(input,139,FOLLOW_139_in_rule__FMFSettings__Group__13__Impl5397); 
             after(grammarAccess.getFMFSettingsAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__Group__13__Impl


    // $ANTLR start rule__FMFUI__SettingsAssignment_0
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2387:1: rule__FMFUI__SettingsAssignment_0 : ( ruleFMFSettings ) ;
    public final void rule__FMFUI__SettingsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2391:1: ( ( ruleFMFSettings ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2392:1: ( ruleFMFSettings )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2392:1: ( ruleFMFSettings )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2393:1: ruleFMFSettings
            {
             before(grammarAccess.getFMFUIAccess().getSettingsFMFSettingsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFMFSettings_in_rule__FMFUI__SettingsAssignment_05461);
            ruleFMFSettings();
            _fsp--;

             after(grammarAccess.getFMFUIAccess().getSettingsFMFSettingsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFUI__SettingsAssignment_0


    // $ANTLR start rule__FMFUI__FiducialsAssignment_1
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2402:1: rule__FMFUI__FiducialsAssignment_1 : ( ruleFiducial ) ;
    public final void rule__FMFUI__FiducialsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2406:1: ( ( ruleFiducial ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2407:1: ( ruleFiducial )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2407:1: ( ruleFiducial )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2408:1: ruleFiducial
            {
             before(grammarAccess.getFMFUIAccess().getFiducialsFiducialParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFiducial_in_rule__FMFUI__FiducialsAssignment_15492);
            ruleFiducial();
            _fsp--;

             after(grammarAccess.getFMFUIAccess().getFiducialsFiducialParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFUI__FiducialsAssignment_1


    // $ANTLR start rule__Fiducial__NameAssignment_1
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2417:1: rule__Fiducial__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Fiducial__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2421:1: ( ( RULE_ID ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2422:1: ( RULE_ID )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2422:1: ( RULE_ID )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2423:1: RULE_ID
            {
             before(grammarAccess.getFiducialAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fiducial__NameAssignment_15523); 
             after(grammarAccess.getFiducialAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__NameAssignment_1


    // $ANTLR start rule__Fiducial__UidAssignment_3
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2432:1: rule__Fiducial__UidAssignment_3 : ( RULE_INT ) ;
    public final void rule__Fiducial__UidAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2436:1: ( ( RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2437:1: ( RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2437:1: ( RULE_INT )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2438:1: RULE_INT
            {
             before(grammarAccess.getFiducialAccess().getUidINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Fiducial__UidAssignment_35554); 
             after(grammarAccess.getFiducialAccess().getUidINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__UidAssignment_3


    // $ANTLR start rule__Fiducial__StyleAssignment_6
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2447:1: rule__Fiducial__StyleAssignment_6 : ( ruleFMFFidStyleEnum ) ;
    public final void rule__Fiducial__StyleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2451:1: ( ( ruleFMFFidStyleEnum ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2452:1: ( ruleFMFFidStyleEnum )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2452:1: ( ruleFMFFidStyleEnum )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2453:1: ruleFMFFidStyleEnum
            {
             before(grammarAccess.getFiducialAccess().getStyleFMFFidStyleEnumEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleFMFFidStyleEnum_in_rule__Fiducial__StyleAssignment_65585);
            ruleFMFFidStyleEnum();
            _fsp--;

             after(grammarAccess.getFiducialAccess().getStyleFMFFidStyleEnumEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__StyleAssignment_6


    // $ANTLR start rule__Fiducial__KindAssignment_8
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2462:1: rule__Fiducial__KindAssignment_8 : ( ruleFMFKind ) ;
    public final void rule__Fiducial__KindAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2466:1: ( ( ruleFMFKind ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2467:1: ( ruleFMFKind )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2467:1: ( ruleFMFKind )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2468:1: ruleFMFKind
            {
             before(grammarAccess.getFiducialAccess().getKindFMFKindEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleFMFKind_in_rule__Fiducial__KindAssignment_85616);
            ruleFMFKind();
            _fsp--;

             after(grammarAccess.getFiducialAccess().getKindFMFKindEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__KindAssignment_8


    // $ANTLR start rule__Fiducial__FgAssignment_10
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2477:1: rule__Fiducial__FgAssignment_10 : ( ruleFMFFidColorEnum ) ;
    public final void rule__Fiducial__FgAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2481:1: ( ( ruleFMFFidColorEnum ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2482:1: ( ruleFMFFidColorEnum )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2482:1: ( ruleFMFFidColorEnum )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2483:1: ruleFMFFidColorEnum
            {
             before(grammarAccess.getFiducialAccess().getFgFMFFidColorEnumEnumRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleFMFFidColorEnum_in_rule__Fiducial__FgAssignment_105647);
            ruleFMFFidColorEnum();
            _fsp--;

             after(grammarAccess.getFiducialAccess().getFgFMFFidColorEnumEnumRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__FgAssignment_10


    // $ANTLR start rule__Fiducial__BgAssignment_12
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2492:1: rule__Fiducial__BgAssignment_12 : ( ruleFMFFidColorEnum ) ;
    public final void rule__Fiducial__BgAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2496:1: ( ( ruleFMFFidColorEnum ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2497:1: ( ruleFMFFidColorEnum )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2497:1: ( ruleFMFFidColorEnum )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2498:1: ruleFMFFidColorEnum
            {
             before(grammarAccess.getFiducialAccess().getBgFMFFidColorEnumEnumRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleFMFFidColorEnum_in_rule__Fiducial__BgAssignment_125678);
            ruleFMFFidColorEnum();
            _fsp--;

             after(grammarAccess.getFiducialAccess().getBgFMFFidColorEnumEnumRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__BgAssignment_12


    // $ANTLR start rule__Fiducial__RadiusAssignment_14
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2507:1: rule__Fiducial__RadiusAssignment_14 : ( RULE_INT ) ;
    public final void rule__Fiducial__RadiusAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2511:1: ( ( RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2512:1: ( RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2512:1: ( RULE_INT )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2513:1: RULE_INT
            {
             before(grammarAccess.getFiducialAccess().getRadiusINTTerminalRuleCall_14_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Fiducial__RadiusAssignment_145709); 
             after(grammarAccess.getFiducialAccess().getRadiusINTTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__RadiusAssignment_14


    // $ANTLR start rule__Fiducial__ProximaAssignment_16
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2522:1: rule__Fiducial__ProximaAssignment_16 : ( RULE_INT ) ;
    public final void rule__Fiducial__ProximaAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2526:1: ( ( RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2527:1: ( RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2527:1: ( RULE_INT )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2528:1: RULE_INT
            {
             before(grammarAccess.getFiducialAccess().getProximaINTTerminalRuleCall_16_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Fiducial__ProximaAssignment_165740); 
             after(grammarAccess.getFiducialAccess().getProximaINTTerminalRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__ProximaAssignment_16


    // $ANTLR start rule__Fiducial__ProximaVisibleAssignment_18
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2537:1: rule__Fiducial__ProximaVisibleAssignment_18 : ( ruleFMFProximaVisibleEnum ) ;
    public final void rule__Fiducial__ProximaVisibleAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2541:1: ( ( ruleFMFProximaVisibleEnum ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2542:1: ( ruleFMFProximaVisibleEnum )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2542:1: ( ruleFMFProximaVisibleEnum )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2543:1: ruleFMFProximaVisibleEnum
            {
             before(grammarAccess.getFiducialAccess().getProximaVisibleFMFProximaVisibleEnumEnumRuleCall_18_0()); 
            pushFollow(FOLLOW_ruleFMFProximaVisibleEnum_in_rule__Fiducial__ProximaVisibleAssignment_185771);
            ruleFMFProximaVisibleEnum();
            _fsp--;

             after(grammarAccess.getFiducialAccess().getProximaVisibleFMFProximaVisibleEnumEnumRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__ProximaVisibleAssignment_18


    // $ANTLR start rule__Fiducial__FunctionAssignment_20
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2552:1: rule__Fiducial__FunctionAssignment_20 : ( ruleFMFFidFunctionEnum ) ;
    public final void rule__Fiducial__FunctionAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2556:1: ( ( ruleFMFFidFunctionEnum ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2557:1: ( ruleFMFFidFunctionEnum )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2557:1: ( ruleFMFFidFunctionEnum )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2558:1: ruleFMFFidFunctionEnum
            {
             before(grammarAccess.getFiducialAccess().getFunctionFMFFidFunctionEnumEnumRuleCall_20_0()); 
            pushFollow(FOLLOW_ruleFMFFidFunctionEnum_in_rule__Fiducial__FunctionAssignment_205802);
            ruleFMFFidFunctionEnum();
            _fsp--;

             after(grammarAccess.getFiducialAccess().getFunctionFMFFidFunctionEnumEnumRuleCall_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__FunctionAssignment_20


    // $ANTLR start rule__Fiducial__RangeAssignment_22
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2567:1: rule__Fiducial__RangeAssignment_22 : ( RULE_INT ) ;
    public final void rule__Fiducial__RangeAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2571:1: ( ( RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2572:1: ( RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2572:1: ( RULE_INT )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2573:1: RULE_INT
            {
             before(grammarAccess.getFiducialAccess().getRangeINTTerminalRuleCall_22_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Fiducial__RangeAssignment_225833); 
             after(grammarAccess.getFiducialAccess().getRangeINTTerminalRuleCall_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fiducial__RangeAssignment_22


    // $ANTLR start rule__FMFSettings__OscReceivePortAssignment_2
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2582:1: rule__FMFSettings__OscReceivePortAssignment_2 : ( RULE_INT ) ;
    public final void rule__FMFSettings__OscReceivePortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2586:1: ( ( RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2587:1: ( RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2587:1: ( RULE_INT )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2588:1: RULE_INT
            {
             before(grammarAccess.getFMFSettingsAccess().getOscReceivePortINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FMFSettings__OscReceivePortAssignment_25864); 
             after(grammarAccess.getFMFSettingsAccess().getOscReceivePortINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__OscReceivePortAssignment_2


    // $ANTLR start rule__FMFSettings__OscSendAddressAssignment_4
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2597:1: rule__FMFSettings__OscSendAddressAssignment_4 : ( RULE_STRING ) ;
    public final void rule__FMFSettings__OscSendAddressAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2601:1: ( ( RULE_STRING ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2602:1: ( RULE_STRING )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2602:1: ( RULE_STRING )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2603:1: RULE_STRING
            {
             before(grammarAccess.getFMFSettingsAccess().getOscSendAddressSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FMFSettings__OscSendAddressAssignment_45895); 
             after(grammarAccess.getFMFSettingsAccess().getOscSendAddressSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__OscSendAddressAssignment_4


    // $ANTLR start rule__FMFSettings__OscSendPortAssignment_6
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2612:1: rule__FMFSettings__OscSendPortAssignment_6 : ( RULE_INT ) ;
    public final void rule__FMFSettings__OscSendPortAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2616:1: ( ( RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2617:1: ( RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2617:1: ( RULE_INT )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2618:1: RULE_INT
            {
             before(grammarAccess.getFMFSettingsAccess().getOscSendPortINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FMFSettings__OscSendPortAssignment_65926); 
             after(grammarAccess.getFMFSettingsAccess().getOscSendPortINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__OscSendPortAssignment_6


    // $ANTLR start rule__FMFSettings__TuioPortAssignment_8
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2627:1: rule__FMFSettings__TuioPortAssignment_8 : ( RULE_INT ) ;
    public final void rule__FMFSettings__TuioPortAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2631:1: ( ( RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2632:1: ( RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2632:1: ( RULE_INT )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2633:1: RULE_INT
            {
             before(grammarAccess.getFMFSettingsAccess().getTuioPortINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FMFSettings__TuioPortAssignment_85957); 
             after(grammarAccess.getFMFSettingsAccess().getTuioPortINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__TuioPortAssignment_8


    // $ANTLR start rule__FMFSettings__LiveRateAssignment_10
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2642:1: rule__FMFSettings__LiveRateAssignment_10 : ( RULE_INT ) ;
    public final void rule__FMFSettings__LiveRateAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2646:1: ( ( RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2647:1: ( RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2647:1: ( RULE_INT )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2648:1: RULE_INT
            {
             before(grammarAccess.getFMFSettingsAccess().getLiveRateINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FMFSettings__LiveRateAssignment_105988); 
             after(grammarAccess.getFMFSettingsAccess().getLiveRateINTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__LiveRateAssignment_10


    // $ANTLR start rule__FMFSettings__ProcessingRateAssignment_12
    // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2657:1: rule__FMFSettings__ProcessingRateAssignment_12 : ( RULE_INT ) ;
    public final void rule__FMFSettings__ProcessingRateAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2661:1: ( ( RULE_INT ) )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2662:1: ( RULE_INT )
            {
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2662:1: ( RULE_INT )
            // ../net.sf.fmurf.ui.dsl.ui/src-gen/net/sf/fmurf/ui/ui/contentassist/antlr/internal/InternalFmurfUiDSL.g:2663:1: RULE_INT
            {
             before(grammarAccess.getFMFSettingsAccess().getProcessingRateINTTerminalRuleCall_12_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FMFSettings__ProcessingRateAssignment_126019); 
             after(grammarAccess.getFMFSettingsAccess().getProcessingRateINTTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FMFSettings__ProcessingRateAssignment_12


 

    public static final BitSet FOLLOW_ruleFMFUI_in_entryRuleFMFUI61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFMFUI68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFUI__Group__0_in_ruleFMFUI94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFiducial_in_entryRuleFiducial121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFiducial128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__0_in_ruleFiducial154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFMFSettings_in_entryRuleFMFSettings181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFMFSettings188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__0_in_ruleFMFSettings214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFProximaVisibleEnum__Alternatives_in_ruleFMFProximaVisibleEnum251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFFidStyleEnum__Alternatives_in_ruleFMFFidStyleEnum287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFKind__Alternatives_in_ruleFMFKind323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFFidFunctionEnum__Alternatives_in_ruleFMFFidFunctionEnum359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFFidColorEnum__Alternatives_in_ruleFMFFidColorEnum397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__FMFProximaVisibleEnum__Alternatives433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__FMFProximaVisibleEnum__Alternatives454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__FMFFidStyleEnum__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__FMFFidStyleEnum__Alternatives511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__FMFFidStyleEnum__Alternatives532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FMFFidStyleEnum__Alternatives553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__FMFFidStyleEnum__Alternatives574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FMFKind__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__FMFKind__Alternatives631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__FMFKind__Alternatives652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__FMFKind__Alternatives673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FMFKind__Alternatives694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__FMFKind__Alternatives715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__FMFKind__Alternatives736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FMFKind__Alternatives757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FMFKind__Alternatives778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FMFFidFunctionEnum__Alternatives814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FMFFidFunctionEnum__Alternatives835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FMFFidColorEnum__Alternatives872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FMFFidColorEnum__Alternatives893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FMFFidColorEnum__Alternatives914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FMFFidColorEnum__Alternatives935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FMFFidColorEnum__Alternatives956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FMFFidColorEnum__Alternatives977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FMFFidColorEnum__Alternatives998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FMFFidColorEnum__Alternatives1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FMFFidColorEnum__Alternatives1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FMFFidColorEnum__Alternatives1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FMFFidColorEnum__Alternatives1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__FMFFidColorEnum__Alternatives1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__FMFFidColorEnum__Alternatives1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FMFFidColorEnum__Alternatives1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FMFFidColorEnum__Alternatives1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__FMFFidColorEnum__Alternatives1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FMFFidColorEnum__Alternatives1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__FMFFidColorEnum__Alternatives1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__FMFFidColorEnum__Alternatives1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__FMFFidColorEnum__Alternatives1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__FMFFidColorEnum__Alternatives1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__FMFFidColorEnum__Alternatives1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__FMFFidColorEnum__Alternatives1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__FMFFidColorEnum__Alternatives1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__FMFFidColorEnum__Alternatives1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__FMFFidColorEnum__Alternatives1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__FMFFidColorEnum__Alternatives1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__FMFFidColorEnum__Alternatives1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__FMFFidColorEnum__Alternatives1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__FMFFidColorEnum__Alternatives1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__FMFFidColorEnum__Alternatives1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__FMFFidColorEnum__Alternatives1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__FMFFidColorEnum__Alternatives1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__FMFFidColorEnum__Alternatives1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__FMFFidColorEnum__Alternatives1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__FMFFidColorEnum__Alternatives1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__FMFFidColorEnum__Alternatives1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__FMFFidColorEnum__Alternatives1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__FMFFidColorEnum__Alternatives1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__FMFFidColorEnum__Alternatives1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__FMFFidColorEnum__Alternatives1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__FMFFidColorEnum__Alternatives1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__FMFFidColorEnum__Alternatives1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__FMFFidColorEnum__Alternatives1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__FMFFidColorEnum__Alternatives1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__FMFFidColorEnum__Alternatives1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__FMFFidColorEnum__Alternatives1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__FMFFidColorEnum__Alternatives1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__FMFFidColorEnum__Alternatives1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__FMFFidColorEnum__Alternatives1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rule__FMFFidColorEnum__Alternatives1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rule__FMFFidColorEnum__Alternatives1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rule__FMFFidColorEnum__Alternatives1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rule__FMFFidColorEnum__Alternatives1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rule__FMFFidColorEnum__Alternatives2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_rule__FMFFidColorEnum__Alternatives2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rule__FMFFidColorEnum__Alternatives2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_rule__FMFFidColorEnum__Alternatives2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_rule__FMFFidColorEnum__Alternatives2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rule__FMFFidColorEnum__Alternatives2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rule__FMFFidColorEnum__Alternatives2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rule__FMFFidColorEnum__Alternatives2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_rule__FMFFidColorEnum__Alternatives2174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rule__FMFFidColorEnum__Alternatives2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rule__FMFFidColorEnum__Alternatives2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rule__FMFFidColorEnum__Alternatives2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_rule__FMFFidColorEnum__Alternatives2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_rule__FMFFidColorEnum__Alternatives2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_rule__FMFFidColorEnum__Alternatives2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_rule__FMFFidColorEnum__Alternatives2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_rule__FMFFidColorEnum__Alternatives2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__FMFFidColorEnum__Alternatives2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rule__FMFFidColorEnum__Alternatives2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_rule__FMFFidColorEnum__Alternatives2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_rule__FMFFidColorEnum__Alternatives2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule__FMFFidColorEnum__Alternatives2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rule__FMFFidColorEnum__Alternatives2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rule__FMFFidColorEnum__Alternatives2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__FMFFidColorEnum__Alternatives2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rule__FMFFidColorEnum__Alternatives2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_rule__FMFFidColorEnum__Alternatives2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_rule__FMFFidColorEnum__Alternatives2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_rule__FMFFidColorEnum__Alternatives2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_rule__FMFFidColorEnum__Alternatives2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_rule__FMFFidColorEnum__Alternatives2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_rule__FMFFidColorEnum__Alternatives2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_rule__FMFFidColorEnum__Alternatives2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_rule__FMFFidColorEnum__Alternatives2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_rule__FMFFidColorEnum__Alternatives2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_rule__FMFFidColorEnum__Alternatives2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_rule__FMFFidColorEnum__Alternatives2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_rule__FMFFidColorEnum__Alternatives2783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_rule__FMFFidColorEnum__Alternatives2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_rule__FMFFidColorEnum__Alternatives2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_rule__FMFFidColorEnum__Alternatives2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_rule__FMFFidColorEnum__Alternatives2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_rule__FMFFidColorEnum__Alternatives2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_rule__FMFFidColorEnum__Alternatives2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFUI__Group__0__Impl_in_rule__FMFUI__Group__02942 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_rule__FMFUI__Group__1_in_rule__FMFUI__Group__02945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFUI__SettingsAssignment_0_in_rule__FMFUI__Group__0__Impl2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFUI__Group__1__Impl_in_rule__FMFUI__Group__13002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFUI__FiducialsAssignment_1_in_rule__FMFUI__Group__1__Impl3029 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__0__Impl_in_rule__Fiducial__Group__03064 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__1_in_rule__Fiducial__Group__03067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_rule__Fiducial__Group__0__Impl3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__1__Impl_in_rule__Fiducial__Group__13126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__2_in_rule__Fiducial__Group__13129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__NameAssignment_1_in_rule__Fiducial__Group__1__Impl3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__2__Impl_in_rule__Fiducial__Group__23186 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__3_in_rule__Fiducial__Group__23189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_rule__Fiducial__Group__2__Impl3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__3__Impl_in_rule__Fiducial__Group__33248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__4_in_rule__Fiducial__Group__33251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__UidAssignment_3_in_rule__Fiducial__Group__3__Impl3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__4__Impl_in_rule__Fiducial__Group__43308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__5_in_rule__Fiducial__Group__43311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_rule__Fiducial__Group__4__Impl3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__5__Impl_in_rule__Fiducial__Group__53370 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__6_in_rule__Fiducial__Group__53373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_rule__Fiducial__Group__5__Impl3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__6__Impl_in_rule__Fiducial__Group__63432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__7_in_rule__Fiducial__Group__63435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__StyleAssignment_6_in_rule__Fiducial__Group__6__Impl3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__7__Impl_in_rule__Fiducial__Group__73492 = new BitSet(new long[]{0x0000000007FC0000L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__8_in_rule__Fiducial__Group__73495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_rule__Fiducial__Group__7__Impl3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__8__Impl_in_rule__Fiducial__Group__83554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__9_in_rule__Fiducial__Group__83557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__KindAssignment_8_in_rule__Fiducial__Group__8__Impl3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__9__Impl_in_rule__Fiducial__Group__93614 = new BitSet(new long[]{0xFFFFFFFFE0000000L,0x7FFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_rule__Fiducial__Group__10_in_rule__Fiducial__Group__93617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_rule__Fiducial__Group__9__Impl3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__10__Impl_in_rule__Fiducial__Group__103676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__11_in_rule__Fiducial__Group__103679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__FgAssignment_10_in_rule__Fiducial__Group__10__Impl3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__11__Impl_in_rule__Fiducial__Group__113736 = new BitSet(new long[]{0xFFFFFFFFE0000000L,0x7FFFFFFFFFFFFFFFL});
    public static final BitSet FOLLOW_rule__Fiducial__Group__12_in_rule__Fiducial__Group__113739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_rule__Fiducial__Group__11__Impl3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__12__Impl_in_rule__Fiducial__Group__123798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__13_in_rule__Fiducial__Group__123801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__BgAssignment_12_in_rule__Fiducial__Group__12__Impl3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__13__Impl_in_rule__Fiducial__Group__133858 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__14_in_rule__Fiducial__Group__133861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_rule__Fiducial__Group__13__Impl3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__14__Impl_in_rule__Fiducial__Group__143920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__15_in_rule__Fiducial__Group__143923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__RadiusAssignment_14_in_rule__Fiducial__Group__14__Impl3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__15__Impl_in_rule__Fiducial__Group__153980 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__16_in_rule__Fiducial__Group__153983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_rule__Fiducial__Group__15__Impl4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__16__Impl_in_rule__Fiducial__Group__164042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__17_in_rule__Fiducial__Group__164045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__ProximaAssignment_16_in_rule__Fiducial__Group__16__Impl4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__17__Impl_in_rule__Fiducial__Group__174102 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__18_in_rule__Fiducial__Group__174105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_rule__Fiducial__Group__17__Impl4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__18__Impl_in_rule__Fiducial__Group__184164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__19_in_rule__Fiducial__Group__184167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__ProximaVisibleAssignment_18_in_rule__Fiducial__Group__18__Impl4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__19__Impl_in_rule__Fiducial__Group__194224 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__20_in_rule__Fiducial__Group__194227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_rule__Fiducial__Group__19__Impl4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__20__Impl_in_rule__Fiducial__Group__204286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__21_in_rule__Fiducial__Group__204289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__FunctionAssignment_20_in_rule__Fiducial__Group__20__Impl4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__21__Impl_in_rule__Fiducial__Group__214346 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__22_in_rule__Fiducial__Group__214349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_rule__Fiducial__Group__21__Impl4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__22__Impl_in_rule__Fiducial__Group__224408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__23_in_rule__Fiducial__Group__224411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__RangeAssignment_22_in_rule__Fiducial__Group__22__Impl4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fiducial__Group__23__Impl_in_rule__Fiducial__Group__234468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_rule__Fiducial__Group__23__Impl4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__0__Impl_in_rule__FMFSettings__Group__04575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__1_in_rule__FMFSettings__Group__04578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_rule__FMFSettings__Group__0__Impl4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__1__Impl_in_rule__FMFSettings__Group__14637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__2_in_rule__FMFSettings__Group__14640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_rule__FMFSettings__Group__1__Impl4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__2__Impl_in_rule__FMFSettings__Group__24699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__3_in_rule__FMFSettings__Group__24702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__OscReceivePortAssignment_2_in_rule__FMFSettings__Group__2__Impl4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__3__Impl_in_rule__FMFSettings__Group__34759 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__4_in_rule__FMFSettings__Group__34762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_rule__FMFSettings__Group__3__Impl4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__4__Impl_in_rule__FMFSettings__Group__44821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__5_in_rule__FMFSettings__Group__44824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__OscSendAddressAssignment_4_in_rule__FMFSettings__Group__4__Impl4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__5__Impl_in_rule__FMFSettings__Group__54881 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__6_in_rule__FMFSettings__Group__54884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_rule__FMFSettings__Group__5__Impl4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__6__Impl_in_rule__FMFSettings__Group__64943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__7_in_rule__FMFSettings__Group__64946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__OscSendPortAssignment_6_in_rule__FMFSettings__Group__6__Impl4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__7__Impl_in_rule__FMFSettings__Group__75003 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__8_in_rule__FMFSettings__Group__75006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_rule__FMFSettings__Group__7__Impl5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__8__Impl_in_rule__FMFSettings__Group__85065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__9_in_rule__FMFSettings__Group__85068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__TuioPortAssignment_8_in_rule__FMFSettings__Group__8__Impl5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__9__Impl_in_rule__FMFSettings__Group__95125 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__10_in_rule__FMFSettings__Group__95128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_rule__FMFSettings__Group__9__Impl5156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__10__Impl_in_rule__FMFSettings__Group__105187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__11_in_rule__FMFSettings__Group__105190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__LiveRateAssignment_10_in_rule__FMFSettings__Group__10__Impl5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__11__Impl_in_rule__FMFSettings__Group__115247 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__12_in_rule__FMFSettings__Group__115250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_rule__FMFSettings__Group__11__Impl5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__12__Impl_in_rule__FMFSettings__Group__125309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__13_in_rule__FMFSettings__Group__125312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__ProcessingRateAssignment_12_in_rule__FMFSettings__Group__12__Impl5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FMFSettings__Group__13__Impl_in_rule__FMFSettings__Group__135369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_rule__FMFSettings__Group__13__Impl5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFMFSettings_in_rule__FMFUI__SettingsAssignment_05461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFiducial_in_rule__FMFUI__FiducialsAssignment_15492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fiducial__NameAssignment_15523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Fiducial__UidAssignment_35554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFMFFidStyleEnum_in_rule__Fiducial__StyleAssignment_65585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFMFKind_in_rule__Fiducial__KindAssignment_85616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFMFFidColorEnum_in_rule__Fiducial__FgAssignment_105647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFMFFidColorEnum_in_rule__Fiducial__BgAssignment_125678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Fiducial__RadiusAssignment_145709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Fiducial__ProximaAssignment_165740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFMFProximaVisibleEnum_in_rule__Fiducial__ProximaVisibleAssignment_185771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFMFFidFunctionEnum_in_rule__Fiducial__FunctionAssignment_205802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Fiducial__RangeAssignment_225833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FMFSettings__OscReceivePortAssignment_25864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FMFSettings__OscSendAddressAssignment_45895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FMFSettings__OscSendPortAssignment_65926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FMFSettings__TuioPortAssignment_85957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FMFSettings__LiveRateAssignment_105988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FMFSettings__ProcessingRateAssignment_126019 = new BitSet(new long[]{0x0000000000000002L});

}