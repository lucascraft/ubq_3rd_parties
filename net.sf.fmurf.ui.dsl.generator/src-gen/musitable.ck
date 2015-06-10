
SinOsc fid0 => FFT fft0 =^ Flux flux0 => blackhole; 
SawOsc fid1 => FFT fft1 =^ Flux flux1 => blackhole; 
TriOsc fid2 => FFT fft2 =^ Flux flux2 => blackhole; 
SinOsc fid3 => FFT fft3 =^ Flux flux3 => blackhole; 
SinOsc fid4 => FFT fft4 =^ Flux flux4 => blackhole; 
TriOsc fid5 => FFT fft5 =^ Flux flux5 => blackhole; 
SinOsc fid6 => FFT fft6 =^ Flux flux6 => blackhole; 
TriOsc fid7 => FFT fft7 =^ Flux flux7 => blackhole; 
Echo fid8 => FFT fft8 =^ Flux flux8 => blackhole; 
SqrOsc fid9 => FFT fft9 =^ Flux flux9 => blackhole; 
SqrOsc fid10 => FFT fft10 =^ Flux flux10 => blackhole; 
SawOsc fid11 => FFT fft11 =^ Flux flux11 => blackhole; 
SawOsc fid12 => FFT fft12 =^ Flux flux12 => blackhole; 
SinOsc fid13 => FFT fft13 =^ Flux flux13 => blackhole; 
SqrOsc fid14 => FFT fft14 =^ Flux flux14 => blackhole; 
SinOsc fid15 => FFT fft15 =^ Flux flux15 => blackhole; 
SinOsc fid16 => FFT fft16 =^ Flux flux16 => blackhole; 
JCRev fid17 => FFT fft17 =^ Flux flux17 => blackhole; 
SinOsc fid18 => FFT fft18 =^ Flux flux18 => blackhole; 
TriOsc fid19 => FFT fft19 =^ Flux flux19 => blackhole; 
JCRev fid20 => FFT fft20 =^ Flux flux20 => blackhole; 


UAnaBlob blob0, blob1, blob2, blob3, blob4, blob5, blob6, blob7, blob8, blob9, blob10, blob11, blob12, blob13, blob14, blob15, blob16, blob17, blob18, blob19, blob20;
float fid0Gain, fid1Gain, fid2Gain, fid3Gain, fid4Gain, fid5Gain, fid6Gain, fid7Gain, fid8Gain, fid9Gain, fid10Gain, fid11Gain, fid12Gain, fid13Gain, fid14Gain, fid15Gain, fid16Gain, fid17Gain, fid18Gain, fid19Gain, fid20Gain;


2 => fid0.sync;
1 => fid0Gain => fid0.gain;

2 => fid1.sync;
1 => fid1Gain => fid1.gain;

2 => fid2.sync;
1 => fid2Gain => fid2.gain;

2 => fid3.sync;
1 => fid3Gain => fid3.gain;

2 => fid4.sync;
1 => fid4Gain => fid4.gain;

2 => fid5.sync;
1 => fid5Gain => fid5.gain;

2 => fid6.sync;
1 => fid6Gain => fid6.gain;

2 => fid7.sync;
1 => fid7Gain => fid7.gain;

2 => fid9.sync;
1 => fid9Gain => fid9.gain;

2 => fid10.sync;
1 => fid10Gain => fid10.gain;

2 => fid11.sync;
1 => fid11Gain => fid11.gain;

2 => fid12.sync;
1 => fid12Gain => fid12.gain;

2 => fid13.sync;
1 => fid13Gain => fid13.gain;

2 => fid14.sync;
1 => fid14Gain => fid14.gain;

2 => fid15.sync;
1 => fid15Gain => fid15.gain;

2 => fid16.sync;
1 => fid16Gain => fid16.gain;

2 => fid18.sync;
1 => fid18Gain => fid18.gain;

2 => fid19.sync;
1 => fid19Gain => fid19.gain;

//
// Live data feedback
//
OscSend send;

send.setHost("localhost", 4445);

fun void sendLivedata(int _fid, UAnaBlob _blob) {
    send.startMsg("/smurf/fid/" + _fid + "/livedata","f");
    _blob.fval(0) => send.addFloat;
}

fun void computeFlux(int _fid) {
    while(true) {
        50::ms => now;
if(_fid == 0) {
            flux0.upchuck() @=> blob0;
            sendLivedata(_fid, blob0);
        }else if(_fid == 1) {
            flux1.upchuck() @=> blob1;
            sendLivedata(_fid, blob1);
        }else if(_fid == 2) {
            flux2.upchuck() @=> blob2;
            sendLivedata(_fid, blob2);
        }else if(_fid == 3) {
            flux3.upchuck() @=> blob3;
            sendLivedata(_fid, blob3);
        }else if(_fid == 4) {
            flux4.upchuck() @=> blob4;
            sendLivedata(_fid, blob4);
        }else if(_fid == 5) {
            flux5.upchuck() @=> blob5;
            sendLivedata(_fid, blob5);
        }else if(_fid == 6) {
            flux6.upchuck() @=> blob6;
            sendLivedata(_fid, blob6);
        }else if(_fid == 7) {
            flux7.upchuck() @=> blob7;
            sendLivedata(_fid, blob7);
        }else if(_fid == 8) {
            flux8.upchuck() @=> blob8;
            sendLivedata(_fid, blob8);
        }else if(_fid == 9) {
            flux9.upchuck() @=> blob9;
            sendLivedata(_fid, blob9);
        }else if(_fid == 10) {
            flux10.upchuck() @=> blob10;
            sendLivedata(_fid, blob10);
        }else if(_fid == 11) {
            flux11.upchuck() @=> blob11;
            sendLivedata(_fid, blob11);
        }else if(_fid == 12) {
            flux12.upchuck() @=> blob12;
            sendLivedata(_fid, blob12);
        }else if(_fid == 13) {
            flux13.upchuck() @=> blob13;
            sendLivedata(_fid, blob13);
        }else if(_fid == 14) {
            flux14.upchuck() @=> blob14;
            sendLivedata(_fid, blob14);
        }else if(_fid == 15) {
            flux15.upchuck() @=> blob15;
            sendLivedata(_fid, blob15);
        }else if(_fid == 16) {
            flux16.upchuck() @=> blob16;
            sendLivedata(_fid, blob16);
        }else if(_fid == 17) {
            flux17.upchuck() @=> blob17;
            sendLivedata(_fid, blob17);
        }else if(_fid == 18) {
            flux18.upchuck() @=> blob18;
            sendLivedata(_fid, blob18);
        }else if(_fid == 19) {
            flux19.upchuck() @=> blob19;
            sendLivedata(_fid, blob19);
        }else if(_fid == 20) {
            flux20.upchuck() @=> blob20;
            sendLivedata(_fid, blob20);
        }
     }
}

fun void handlerConnectionUpdate(int _from, int _to, float _distRatio) {
	if (_distRatio > 0) {
if(_from == 0 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid0Gain);
        }else if(_from == 1 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid1Gain);
        }else if(_from == 2 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid2Gain);
        }else if(_from == 3 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid3Gain);
        }else if(_from == 4 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid4Gain);
        }else if(_from == 5 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid5Gain);
        }else if(_from == 6 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid6Gain);
        }else if(_from == 7 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid7Gain);
        }else if(_from == 8 && _to == -440) {
		}else if(_from == 9 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid9Gain);
        }else if(_from == 10 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid10Gain);
        }else if(_from == 11 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid11Gain);
        }else if(_from == 12 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid12Gain);
        }else if(_from == 13 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid13Gain);
        }else if(_from == 14 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid14Gain);
        }else if(_from == 15 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid15Gain);
        }else if(_from == 16 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid16Gain);
        }else if(_from == 17 && _to == -440) {
		}else if(_from == 18 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid18Gain);
        }else if(_from == 19 && _to == -440) {
		
            	setOscGain(_from, (1.0 - _distRatio) * fid19Gain);
        }else if(_from == 20 && _to == -440) {
		}
    }
}

fun void handleDACConnection(int _fid, int status) {
    if(_fid == 0) {
        if (status == 0) { // DISCONNECTION
            fid0 =< dac;
        } else {
            fid0 => dac;
        }
    }else if(_fid == 1) {
        if (status == 0) { // DISCONNECTION
            fid1 =< dac;
        } else {
            fid1 => dac;
        }
    }else if(_fid == 2) {
        if (status == 0) { // DISCONNECTION
            fid2 =< dac;
        } else {
            fid2 => dac;
        }
    }else if(_fid == 3) {
        if (status == 0) { // DISCONNECTION
            fid3 =< dac;
        } else {
            fid3 => dac;
        }
    }else if(_fid == 4) {
        if (status == 0) { // DISCONNECTION
            fid4 =< dac;
        } else {
            fid4 => dac;
        }
    }else if(_fid == 5) {
        if (status == 0) { // DISCONNECTION
            fid5 =< dac;
        } else {
            fid5 => dac;
        }
    }else if(_fid == 6) {
        if (status == 0) { // DISCONNECTION
            fid6 =< dac;
        } else {
            fid6 => dac;
        }
    }else if(_fid == 7) {
        if (status == 0) { // DISCONNECTION
            fid7 =< dac;
        } else {
            fid7 => dac;
        }
    }else if(_fid == 8) {
        if (status == 0) { // DISCONNECTION
            fid8 =< dac;
        } else {
            fid8 => dac;
        }
    }else if(_fid == 9) {
        if (status == 0) { // DISCONNECTION
            fid9 =< dac;
        } else {
            fid9 => dac;
        }
    }else if(_fid == 10) {
        if (status == 0) { // DISCONNECTION
            fid10 =< dac;
        } else {
            fid10 => dac;
        }
    }else if(_fid == 11) {
        if (status == 0) { // DISCONNECTION
            fid11 =< dac;
        } else {
            fid11 => dac;
        }
    }else if(_fid == 12) {
        if (status == 0) { // DISCONNECTION
            fid12 =< dac;
        } else {
            fid12 => dac;
        }
    }else if(_fid == 13) {
        if (status == 0) { // DISCONNECTION
            fid13 =< dac;
        } else {
            fid13 => dac;
        }
    }else if(_fid == 14) {
        if (status == 0) { // DISCONNECTION
            fid14 =< dac;
        } else {
            fid14 => dac;
        }
    }else if(_fid == 15) {
        if (status == 0) { // DISCONNECTION
            fid15 =< dac;
        } else {
            fid15 => dac;
        }
    }else if(_fid == 16) {
        if (status == 0) { // DISCONNECTION
            fid16 =< dac;
        } else {
            fid16 => dac;
        }
    }else if(_fid == 17) {
        if (status == 0) { // DISCONNECTION
            fid17 =< dac;
        } else {
            fid17 => dac;
        }
    }else if(_fid == 18) {
        if (status == 0) { // DISCONNECTION
            fid18 =< dac;
        } else {
            fid18 => dac;
        }
    }else if(_fid == 19) {
        if (status == 0) { // DISCONNECTION
            fid19 =< dac;
        } else {
            fid19 => dac;
        }
    }else if(_fid == 20) {
        if (status == 0) { // DISCONNECTION
            fid20 =< dac;
        } else {
            fid20 => dac;
        }
    }
}


fun void handleFidConnection(int _from, int _to) {



/*  */ if (_from == 0 && _to == 1) {
        fid0 => fid1;
	}
else if (_from == 0 && _to == 2) {
        fid0 => fid2;
	}
else if (_from == 0 && _to == 3) {
        fid0 => fid3;
	}
else if (_from == 0 && _to == 4) {
        fid0 => fid4;
	}
else if (_from == 0 && _to == 5) {
        fid0 => fid5;
	}
else if (_from == 0 && _to == 6) {
        fid0 => fid6;
	}
else if (_from == 0 && _to == 7) {
        fid0 => fid7;
	}
else if (_from == 0 && _to == 8) {
        fid0 => fid8;
	}
else if (_from == 0 && _to == 9) {
        fid0 => fid9;
	}
else if (_from == 0 && _to == 10) {
        fid0 => fid10;
	}
else if (_from == 0 && _to == 11) {
        fid0 => fid11;
	}
else if (_from == 0 && _to == 12) {
        fid0 => fid12;
	}
else if (_from == 0 && _to == 13) {
        fid0 => fid13;
	}
else if (_from == 0 && _to == 14) {
        fid0 => fid14;
	}
else if (_from == 0 && _to == 15) {
        fid0 => fid15;
	}
else if (_from == 0 && _to == 16) {
        fid0 => fid16;
	}
else if (_from == 0 && _to == 17) {
        fid0 => fid17;
	}
else if (_from == 0 && _to == 18) {
        fid0 => fid18;
	}
else if (_from == 0 && _to == 19) {
        fid0 => fid19;
	}
else if (_from == 0 && _to == 20) {
        fid0 => fid20;
	}

else if (_from == 1 && _to == 0) {
        fid1 => fid0;
	}

else if (_from == 1 && _to == 2) {
        fid1 => fid2;
	}
else if (_from == 1 && _to == 3) {
        fid1 => fid3;
	}
else if (_from == 1 && _to == 4) {
        fid1 => fid4;
	}
else if (_from == 1 && _to == 5) {
        fid1 => fid5;
	}
else if (_from == 1 && _to == 6) {
        fid1 => fid6;
	}
else if (_from == 1 && _to == 7) {
        fid1 => fid7;
	}
else if (_from == 1 && _to == 8) {
        fid1 => fid8;
	}
else if (_from == 1 && _to == 9) {
        fid1 => fid9;
	}
else if (_from == 1 && _to == 10) {
        fid1 => fid10;
	}
else if (_from == 1 && _to == 11) {
        fid1 => fid11;
	}
else if (_from == 1 && _to == 12) {
        fid1 => fid12;
	}
else if (_from == 1 && _to == 13) {
        fid1 => fid13;
	}
else if (_from == 1 && _to == 14) {
        fid1 => fid14;
	}
else if (_from == 1 && _to == 15) {
        fid1 => fid15;
	}
else if (_from == 1 && _to == 16) {
        fid1 => fid16;
	}
else if (_from == 1 && _to == 17) {
        fid1 => fid17;
	}
else if (_from == 1 && _to == 18) {
        fid1 => fid18;
	}
else if (_from == 1 && _to == 19) {
        fid1 => fid19;
	}
else if (_from == 1 && _to == 20) {
        fid1 => fid20;
	}

else if (_from == 2 && _to == 0) {
        fid2 => fid0;
	}
else if (_from == 2 && _to == 1) {
        fid2 => fid1;
	}

else if (_from == 2 && _to == 3) {
        fid2 => fid3;
	}
else if (_from == 2 && _to == 4) {
        fid2 => fid4;
	}
else if (_from == 2 && _to == 5) {
        fid2 => fid5;
	}
else if (_from == 2 && _to == 6) {
        fid2 => fid6;
	}
else if (_from == 2 && _to == 7) {
        fid2 => fid7;
	}
else if (_from == 2 && _to == 8) {
        fid2 => fid8;
	}
else if (_from == 2 && _to == 9) {
        fid2 => fid9;
	}
else if (_from == 2 && _to == 10) {
        fid2 => fid10;
	}
else if (_from == 2 && _to == 11) {
        fid2 => fid11;
	}
else if (_from == 2 && _to == 12) {
        fid2 => fid12;
	}
else if (_from == 2 && _to == 13) {
        fid2 => fid13;
	}
else if (_from == 2 && _to == 14) {
        fid2 => fid14;
	}
else if (_from == 2 && _to == 15) {
        fid2 => fid15;
	}
else if (_from == 2 && _to == 16) {
        fid2 => fid16;
	}
else if (_from == 2 && _to == 17) {
        fid2 => fid17;
	}
else if (_from == 2 && _to == 18) {
        fid2 => fid18;
	}
else if (_from == 2 && _to == 19) {
        fid2 => fid19;
	}
else if (_from == 2 && _to == 20) {
        fid2 => fid20;
	}

else if (_from == 3 && _to == 0) {
        fid3 => fid0;
	}
else if (_from == 3 && _to == 1) {
        fid3 => fid1;
	}
else if (_from == 3 && _to == 2) {
        fid3 => fid2;
	}

else if (_from == 3 && _to == 4) {
        fid3 => fid4;
	}
else if (_from == 3 && _to == 5) {
        fid3 => fid5;
	}
else if (_from == 3 && _to == 6) {
        fid3 => fid6;
	}
else if (_from == 3 && _to == 7) {
        fid3 => fid7;
	}
else if (_from == 3 && _to == 8) {
        fid3 => fid8;
	}
else if (_from == 3 && _to == 9) {
        fid3 => fid9;
	}
else if (_from == 3 && _to == 10) {
        fid3 => fid10;
	}
else if (_from == 3 && _to == 11) {
        fid3 => fid11;
	}
else if (_from == 3 && _to == 12) {
        fid3 => fid12;
	}
else if (_from == 3 && _to == 13) {
        fid3 => fid13;
	}
else if (_from == 3 && _to == 14) {
        fid3 => fid14;
	}
else if (_from == 3 && _to == 15) {
        fid3 => fid15;
	}
else if (_from == 3 && _to == 16) {
        fid3 => fid16;
	}
else if (_from == 3 && _to == 17) {
        fid3 => fid17;
	}
else if (_from == 3 && _to == 18) {
        fid3 => fid18;
	}
else if (_from == 3 && _to == 19) {
        fid3 => fid19;
	}
else if (_from == 3 && _to == 20) {
        fid3 => fid20;
	}

else if (_from == 4 && _to == 0) {
        fid4 => fid0;
	}
else if (_from == 4 && _to == 1) {
        fid4 => fid1;
	}
else if (_from == 4 && _to == 2) {
        fid4 => fid2;
	}
else if (_from == 4 && _to == 3) {
        fid4 => fid3;
	}

else if (_from == 4 && _to == 5) {
        fid4 => fid5;
	}
else if (_from == 4 && _to == 6) {
        fid4 => fid6;
	}
else if (_from == 4 && _to == 7) {
        fid4 => fid7;
	}
else if (_from == 4 && _to == 8) {
        fid4 => fid8;
	}
else if (_from == 4 && _to == 9) {
        fid4 => fid9;
	}
else if (_from == 4 && _to == 10) {
        fid4 => fid10;
	}
else if (_from == 4 && _to == 11) {
        fid4 => fid11;
	}
else if (_from == 4 && _to == 12) {
        fid4 => fid12;
	}
else if (_from == 4 && _to == 13) {
        fid4 => fid13;
	}
else if (_from == 4 && _to == 14) {
        fid4 => fid14;
	}
else if (_from == 4 && _to == 15) {
        fid4 => fid15;
	}
else if (_from == 4 && _to == 16) {
        fid4 => fid16;
	}
else if (_from == 4 && _to == 17) {
        fid4 => fid17;
	}
else if (_from == 4 && _to == 18) {
        fid4 => fid18;
	}
else if (_from == 4 && _to == 19) {
        fid4 => fid19;
	}
else if (_from == 4 && _to == 20) {
        fid4 => fid20;
	}

else if (_from == 5 && _to == 0) {
        fid5 => fid0;
	}
else if (_from == 5 && _to == 1) {
        fid5 => fid1;
	}
else if (_from == 5 && _to == 2) {
        fid5 => fid2;
	}
else if (_from == 5 && _to == 3) {
        fid5 => fid3;
	}
else if (_from == 5 && _to == 4) {
        fid5 => fid4;
	}

else if (_from == 5 && _to == 6) {
        fid5 => fid6;
	}
else if (_from == 5 && _to == 7) {
        fid5 => fid7;
	}
else if (_from == 5 && _to == 8) {
        fid5 => fid8;
	}
else if (_from == 5 && _to == 9) {
        fid5 => fid9;
	}
else if (_from == 5 && _to == 10) {
        fid5 => fid10;
	}
else if (_from == 5 && _to == 11) {
        fid5 => fid11;
	}
else if (_from == 5 && _to == 12) {
        fid5 => fid12;
	}
else if (_from == 5 && _to == 13) {
        fid5 => fid13;
	}
else if (_from == 5 && _to == 14) {
        fid5 => fid14;
	}
else if (_from == 5 && _to == 15) {
        fid5 => fid15;
	}
else if (_from == 5 && _to == 16) {
        fid5 => fid16;
	}
else if (_from == 5 && _to == 17) {
        fid5 => fid17;
	}
else if (_from == 5 && _to == 18) {
        fid5 => fid18;
	}
else if (_from == 5 && _to == 19) {
        fid5 => fid19;
	}
else if (_from == 5 && _to == 20) {
        fid5 => fid20;
	}

else if (_from == 6 && _to == 0) {
        fid6 => fid0;
	}
else if (_from == 6 && _to == 1) {
        fid6 => fid1;
	}
else if (_from == 6 && _to == 2) {
        fid6 => fid2;
	}
else if (_from == 6 && _to == 3) {
        fid6 => fid3;
	}
else if (_from == 6 && _to == 4) {
        fid6 => fid4;
	}
else if (_from == 6 && _to == 5) {
        fid6 => fid5;
	}

else if (_from == 6 && _to == 7) {
        fid6 => fid7;
	}
else if (_from == 6 && _to == 8) {
        fid6 => fid8;
	}
else if (_from == 6 && _to == 9) {
        fid6 => fid9;
	}
else if (_from == 6 && _to == 10) {
        fid6 => fid10;
	}
else if (_from == 6 && _to == 11) {
        fid6 => fid11;
	}
else if (_from == 6 && _to == 12) {
        fid6 => fid12;
	}
else if (_from == 6 && _to == 13) {
        fid6 => fid13;
	}
else if (_from == 6 && _to == 14) {
        fid6 => fid14;
	}
else if (_from == 6 && _to == 15) {
        fid6 => fid15;
	}
else if (_from == 6 && _to == 16) {
        fid6 => fid16;
	}
else if (_from == 6 && _to == 17) {
        fid6 => fid17;
	}
else if (_from == 6 && _to == 18) {
        fid6 => fid18;
	}
else if (_from == 6 && _to == 19) {
        fid6 => fid19;
	}
else if (_from == 6 && _to == 20) {
        fid6 => fid20;
	}

else if (_from == 7 && _to == 0) {
        fid7 => fid0;
	}
else if (_from == 7 && _to == 1) {
        fid7 => fid1;
	}
else if (_from == 7 && _to == 2) {
        fid7 => fid2;
	}
else if (_from == 7 && _to == 3) {
        fid7 => fid3;
	}
else if (_from == 7 && _to == 4) {
        fid7 => fid4;
	}
else if (_from == 7 && _to == 5) {
        fid7 => fid5;
	}
else if (_from == 7 && _to == 6) {
        fid7 => fid6;
	}

else if (_from == 7 && _to == 8) {
        fid7 => fid8;
	}
else if (_from == 7 && _to == 9) {
        fid7 => fid9;
	}
else if (_from == 7 && _to == 10) {
        fid7 => fid10;
	}
else if (_from == 7 && _to == 11) {
        fid7 => fid11;
	}
else if (_from == 7 && _to == 12) {
        fid7 => fid12;
	}
else if (_from == 7 && _to == 13) {
        fid7 => fid13;
	}
else if (_from == 7 && _to == 14) {
        fid7 => fid14;
	}
else if (_from == 7 && _to == 15) {
        fid7 => fid15;
	}
else if (_from == 7 && _to == 16) {
        fid7 => fid16;
	}
else if (_from == 7 && _to == 17) {
        fid7 => fid17;
	}
else if (_from == 7 && _to == 18) {
        fid7 => fid18;
	}
else if (_from == 7 && _to == 19) {
        fid7 => fid19;
	}
else if (_from == 7 && _to == 20) {
        fid7 => fid20;
	}

else if (_from == 8 && _to == 0) {
        fid8 => fid0;
	}
else if (_from == 8 && _to == 1) {
        fid8 => fid1;
	}
else if (_from == 8 && _to == 2) {
        fid8 => fid2;
	}
else if (_from == 8 && _to == 3) {
        fid8 => fid3;
	}
else if (_from == 8 && _to == 4) {
        fid8 => fid4;
	}
else if (_from == 8 && _to == 5) {
        fid8 => fid5;
	}
else if (_from == 8 && _to == 6) {
        fid8 => fid6;
	}
else if (_from == 8 && _to == 7) {
        fid8 => fid7;
	}

else if (_from == 8 && _to == 9) {
        fid8 => fid9;
	}
else if (_from == 8 && _to == 10) {
        fid8 => fid10;
	}
else if (_from == 8 && _to == 11) {
        fid8 => fid11;
	}
else if (_from == 8 && _to == 12) {
        fid8 => fid12;
	}
else if (_from == 8 && _to == 13) {
        fid8 => fid13;
	}
else if (_from == 8 && _to == 14) {
        fid8 => fid14;
	}
else if (_from == 8 && _to == 15) {
        fid8 => fid15;
	}
else if (_from == 8 && _to == 16) {
        fid8 => fid16;
	}
else if (_from == 8 && _to == 17) {
        fid8 => fid17;
	}
else if (_from == 8 && _to == 18) {
        fid8 => fid18;
	}
else if (_from == 8 && _to == 19) {
        fid8 => fid19;
	}
else if (_from == 8 && _to == 20) {
        fid8 => fid20;
	}

else if (_from == 9 && _to == 0) {
        fid9 => fid0;
	}
else if (_from == 9 && _to == 1) {
        fid9 => fid1;
	}
else if (_from == 9 && _to == 2) {
        fid9 => fid2;
	}
else if (_from == 9 && _to == 3) {
        fid9 => fid3;
	}
else if (_from == 9 && _to == 4) {
        fid9 => fid4;
	}
else if (_from == 9 && _to == 5) {
        fid9 => fid5;
	}
else if (_from == 9 && _to == 6) {
        fid9 => fid6;
	}
else if (_from == 9 && _to == 7) {
        fid9 => fid7;
	}
else if (_from == 9 && _to == 8) {
        fid9 => fid8;
	}

else if (_from == 9 && _to == 10) {
        fid9 => fid10;
	}
else if (_from == 9 && _to == 11) {
        fid9 => fid11;
	}
else if (_from == 9 && _to == 12) {
        fid9 => fid12;
	}
else if (_from == 9 && _to == 13) {
        fid9 => fid13;
	}
else if (_from == 9 && _to == 14) {
        fid9 => fid14;
	}
else if (_from == 9 && _to == 15) {
        fid9 => fid15;
	}
else if (_from == 9 && _to == 16) {
        fid9 => fid16;
	}
else if (_from == 9 && _to == 17) {
        fid9 => fid17;
	}
else if (_from == 9 && _to == 18) {
        fid9 => fid18;
	}
else if (_from == 9 && _to == 19) {
        fid9 => fid19;
	}
else if (_from == 9 && _to == 20) {
        fid9 => fid20;
	}

else if (_from == 10 && _to == 0) {
        fid10 => fid0;
	}
else if (_from == 10 && _to == 1) {
        fid10 => fid1;
	}
else if (_from == 10 && _to == 2) {
        fid10 => fid2;
	}
else if (_from == 10 && _to == 3) {
        fid10 => fid3;
	}
else if (_from == 10 && _to == 4) {
        fid10 => fid4;
	}
else if (_from == 10 && _to == 5) {
        fid10 => fid5;
	}
else if (_from == 10 && _to == 6) {
        fid10 => fid6;
	}
else if (_from == 10 && _to == 7) {
        fid10 => fid7;
	}
else if (_from == 10 && _to == 8) {
        fid10 => fid8;
	}
else if (_from == 10 && _to == 9) {
        fid10 => fid9;
	}

else if (_from == 10 && _to == 11) {
        fid10 => fid11;
	}
else if (_from == 10 && _to == 12) {
        fid10 => fid12;
	}
else if (_from == 10 && _to == 13) {
        fid10 => fid13;
	}
else if (_from == 10 && _to == 14) {
        fid10 => fid14;
	}
else if (_from == 10 && _to == 15) {
        fid10 => fid15;
	}
else if (_from == 10 && _to == 16) {
        fid10 => fid16;
	}
else if (_from == 10 && _to == 17) {
        fid10 => fid17;
	}
else if (_from == 10 && _to == 18) {
        fid10 => fid18;
	}
else if (_from == 10 && _to == 19) {
        fid10 => fid19;
	}
else if (_from == 10 && _to == 20) {
        fid10 => fid20;
	}

else if (_from == 11 && _to == 0) {
        fid11 => fid0;
	}
else if (_from == 11 && _to == 1) {
        fid11 => fid1;
	}
else if (_from == 11 && _to == 2) {
        fid11 => fid2;
	}
else if (_from == 11 && _to == 3) {
        fid11 => fid3;
	}
else if (_from == 11 && _to == 4) {
        fid11 => fid4;
	}
else if (_from == 11 && _to == 5) {
        fid11 => fid5;
	}
else if (_from == 11 && _to == 6) {
        fid11 => fid6;
	}
else if (_from == 11 && _to == 7) {
        fid11 => fid7;
	}
else if (_from == 11 && _to == 8) {
        fid11 => fid8;
	}
else if (_from == 11 && _to == 9) {
        fid11 => fid9;
	}
else if (_from == 11 && _to == 10) {
        fid11 => fid10;
	}

else if (_from == 11 && _to == 12) {
        fid11 => fid12;
	}
else if (_from == 11 && _to == 13) {
        fid11 => fid13;
	}
else if (_from == 11 && _to == 14) {
        fid11 => fid14;
	}
else if (_from == 11 && _to == 15) {
        fid11 => fid15;
	}
else if (_from == 11 && _to == 16) {
        fid11 => fid16;
	}
else if (_from == 11 && _to == 17) {
        fid11 => fid17;
	}
else if (_from == 11 && _to == 18) {
        fid11 => fid18;
	}
else if (_from == 11 && _to == 19) {
        fid11 => fid19;
	}
else if (_from == 11 && _to == 20) {
        fid11 => fid20;
	}

else if (_from == 12 && _to == 0) {
        fid12 => fid0;
	}
else if (_from == 12 && _to == 1) {
        fid12 => fid1;
	}
else if (_from == 12 && _to == 2) {
        fid12 => fid2;
	}
else if (_from == 12 && _to == 3) {
        fid12 => fid3;
	}
else if (_from == 12 && _to == 4) {
        fid12 => fid4;
	}
else if (_from == 12 && _to == 5) {
        fid12 => fid5;
	}
else if (_from == 12 && _to == 6) {
        fid12 => fid6;
	}
else if (_from == 12 && _to == 7) {
        fid12 => fid7;
	}
else if (_from == 12 && _to == 8) {
        fid12 => fid8;
	}
else if (_from == 12 && _to == 9) {
        fid12 => fid9;
	}
else if (_from == 12 && _to == 10) {
        fid12 => fid10;
	}
else if (_from == 12 && _to == 11) {
        fid12 => fid11;
	}

else if (_from == 12 && _to == 13) {
        fid12 => fid13;
	}
else if (_from == 12 && _to == 14) {
        fid12 => fid14;
	}
else if (_from == 12 && _to == 15) {
        fid12 => fid15;
	}
else if (_from == 12 && _to == 16) {
        fid12 => fid16;
	}
else if (_from == 12 && _to == 17) {
        fid12 => fid17;
	}
else if (_from == 12 && _to == 18) {
        fid12 => fid18;
	}
else if (_from == 12 && _to == 19) {
        fid12 => fid19;
	}
else if (_from == 12 && _to == 20) {
        fid12 => fid20;
	}

else if (_from == 13 && _to == 0) {
        fid13 => fid0;
	}
else if (_from == 13 && _to == 1) {
        fid13 => fid1;
	}
else if (_from == 13 && _to == 2) {
        fid13 => fid2;
	}
else if (_from == 13 && _to == 3) {
        fid13 => fid3;
	}
else if (_from == 13 && _to == 4) {
        fid13 => fid4;
	}
else if (_from == 13 && _to == 5) {
        fid13 => fid5;
	}
else if (_from == 13 && _to == 6) {
        fid13 => fid6;
	}
else if (_from == 13 && _to == 7) {
        fid13 => fid7;
	}
else if (_from == 13 && _to == 8) {
        fid13 => fid8;
	}
else if (_from == 13 && _to == 9) {
        fid13 => fid9;
	}
else if (_from == 13 && _to == 10) {
        fid13 => fid10;
	}
else if (_from == 13 && _to == 11) {
        fid13 => fid11;
	}
else if (_from == 13 && _to == 12) {
        fid13 => fid12;
	}

else if (_from == 13 && _to == 14) {
        fid13 => fid14;
	}
else if (_from == 13 && _to == 15) {
        fid13 => fid15;
	}
else if (_from == 13 && _to == 16) {
        fid13 => fid16;
	}
else if (_from == 13 && _to == 17) {
        fid13 => fid17;
	}
else if (_from == 13 && _to == 18) {
        fid13 => fid18;
	}
else if (_from == 13 && _to == 19) {
        fid13 => fid19;
	}
else if (_from == 13 && _to == 20) {
        fid13 => fid20;
	}

else if (_from == 14 && _to == 0) {
        fid14 => fid0;
	}
else if (_from == 14 && _to == 1) {
        fid14 => fid1;
	}
else if (_from == 14 && _to == 2) {
        fid14 => fid2;
	}
else if (_from == 14 && _to == 3) {
        fid14 => fid3;
	}
else if (_from == 14 && _to == 4) {
        fid14 => fid4;
	}
else if (_from == 14 && _to == 5) {
        fid14 => fid5;
	}
else if (_from == 14 && _to == 6) {
        fid14 => fid6;
	}
else if (_from == 14 && _to == 7) {
        fid14 => fid7;
	}
else if (_from == 14 && _to == 8) {
        fid14 => fid8;
	}
else if (_from == 14 && _to == 9) {
        fid14 => fid9;
	}
else if (_from == 14 && _to == 10) {
        fid14 => fid10;
	}
else if (_from == 14 && _to == 11) {
        fid14 => fid11;
	}
else if (_from == 14 && _to == 12) {
        fid14 => fid12;
	}
else if (_from == 14 && _to == 13) {
        fid14 => fid13;
	}

else if (_from == 14 && _to == 15) {
        fid14 => fid15;
	}
else if (_from == 14 && _to == 16) {
        fid14 => fid16;
	}
else if (_from == 14 && _to == 17) {
        fid14 => fid17;
	}
else if (_from == 14 && _to == 18) {
        fid14 => fid18;
	}
else if (_from == 14 && _to == 19) {
        fid14 => fid19;
	}
else if (_from == 14 && _to == 20) {
        fid14 => fid20;
	}

else if (_from == 15 && _to == 0) {
        fid15 => fid0;
	}
else if (_from == 15 && _to == 1) {
        fid15 => fid1;
	}
else if (_from == 15 && _to == 2) {
        fid15 => fid2;
	}
else if (_from == 15 && _to == 3) {
        fid15 => fid3;
	}
else if (_from == 15 && _to == 4) {
        fid15 => fid4;
	}
else if (_from == 15 && _to == 5) {
        fid15 => fid5;
	}
else if (_from == 15 && _to == 6) {
        fid15 => fid6;
	}
else if (_from == 15 && _to == 7) {
        fid15 => fid7;
	}
else if (_from == 15 && _to == 8) {
        fid15 => fid8;
	}
else if (_from == 15 && _to == 9) {
        fid15 => fid9;
	}
else if (_from == 15 && _to == 10) {
        fid15 => fid10;
	}
else if (_from == 15 && _to == 11) {
        fid15 => fid11;
	}
else if (_from == 15 && _to == 12) {
        fid15 => fid12;
	}
else if (_from == 15 && _to == 13) {
        fid15 => fid13;
	}
else if (_from == 15 && _to == 14) {
        fid15 => fid14;
	}

else if (_from == 15 && _to == 16) {
        fid15 => fid16;
	}
else if (_from == 15 && _to == 17) {
        fid15 => fid17;
	}
else if (_from == 15 && _to == 18) {
        fid15 => fid18;
	}
else if (_from == 15 && _to == 19) {
        fid15 => fid19;
	}
else if (_from == 15 && _to == 20) {
        fid15 => fid20;
	}

else if (_from == 16 && _to == 0) {
        fid16 => fid0;
	}
else if (_from == 16 && _to == 1) {
        fid16 => fid1;
	}
else if (_from == 16 && _to == 2) {
        fid16 => fid2;
	}
else if (_from == 16 && _to == 3) {
        fid16 => fid3;
	}
else if (_from == 16 && _to == 4) {
        fid16 => fid4;
	}
else if (_from == 16 && _to == 5) {
        fid16 => fid5;
	}
else if (_from == 16 && _to == 6) {
        fid16 => fid6;
	}
else if (_from == 16 && _to == 7) {
        fid16 => fid7;
	}
else if (_from == 16 && _to == 8) {
        fid16 => fid8;
	}
else if (_from == 16 && _to == 9) {
        fid16 => fid9;
	}
else if (_from == 16 && _to == 10) {
        fid16 => fid10;
	}
else if (_from == 16 && _to == 11) {
        fid16 => fid11;
	}
else if (_from == 16 && _to == 12) {
        fid16 => fid12;
	}
else if (_from == 16 && _to == 13) {
        fid16 => fid13;
	}
else if (_from == 16 && _to == 14) {
        fid16 => fid14;
	}
else if (_from == 16 && _to == 15) {
        fid16 => fid15;
	}

else if (_from == 16 && _to == 17) {
        fid16 => fid17;
	}
else if (_from == 16 && _to == 18) {
        fid16 => fid18;
	}
else if (_from == 16 && _to == 19) {
        fid16 => fid19;
	}
else if (_from == 16 && _to == 20) {
        fid16 => fid20;
	}

else if (_from == 17 && _to == 0) {
        fid17 => fid0;
	}
else if (_from == 17 && _to == 1) {
        fid17 => fid1;
	}
else if (_from == 17 && _to == 2) {
        fid17 => fid2;
	}
else if (_from == 17 && _to == 3) {
        fid17 => fid3;
	}
else if (_from == 17 && _to == 4) {
        fid17 => fid4;
	}
else if (_from == 17 && _to == 5) {
        fid17 => fid5;
	}
else if (_from == 17 && _to == 6) {
        fid17 => fid6;
	}
else if (_from == 17 && _to == 7) {
        fid17 => fid7;
	}
else if (_from == 17 && _to == 8) {
        fid17 => fid8;
	}
else if (_from == 17 && _to == 9) {
        fid17 => fid9;
	}
else if (_from == 17 && _to == 10) {
        fid17 => fid10;
	}
else if (_from == 17 && _to == 11) {
        fid17 => fid11;
	}
else if (_from == 17 && _to == 12) {
        fid17 => fid12;
	}
else if (_from == 17 && _to == 13) {
        fid17 => fid13;
	}
else if (_from == 17 && _to == 14) {
        fid17 => fid14;
	}
else if (_from == 17 && _to == 15) {
        fid17 => fid15;
	}
else if (_from == 17 && _to == 16) {
        fid17 => fid16;
	}

else if (_from == 17 && _to == 18) {
        fid17 => fid18;
	}
else if (_from == 17 && _to == 19) {
        fid17 => fid19;
	}
else if (_from == 17 && _to == 20) {
        fid17 => fid20;
	}

else if (_from == 18 && _to == 0) {
        fid18 => fid0;
	}
else if (_from == 18 && _to == 1) {
        fid18 => fid1;
	}
else if (_from == 18 && _to == 2) {
        fid18 => fid2;
	}
else if (_from == 18 && _to == 3) {
        fid18 => fid3;
	}
else if (_from == 18 && _to == 4) {
        fid18 => fid4;
	}
else if (_from == 18 && _to == 5) {
        fid18 => fid5;
	}
else if (_from == 18 && _to == 6) {
        fid18 => fid6;
	}
else if (_from == 18 && _to == 7) {
        fid18 => fid7;
	}
else if (_from == 18 && _to == 8) {
        fid18 => fid8;
	}
else if (_from == 18 && _to == 9) {
        fid18 => fid9;
	}
else if (_from == 18 && _to == 10) {
        fid18 => fid10;
	}
else if (_from == 18 && _to == 11) {
        fid18 => fid11;
	}
else if (_from == 18 && _to == 12) {
        fid18 => fid12;
	}
else if (_from == 18 && _to == 13) {
        fid18 => fid13;
	}
else if (_from == 18 && _to == 14) {
        fid18 => fid14;
	}
else if (_from == 18 && _to == 15) {
        fid18 => fid15;
	}
else if (_from == 18 && _to == 16) {
        fid18 => fid16;
	}
else if (_from == 18 && _to == 17) {
        fid18 => fid17;
	}

else if (_from == 18 && _to == 19) {
        fid18 => fid19;
	}
else if (_from == 18 && _to == 20) {
        fid18 => fid20;
	}

else if (_from == 19 && _to == 0) {
        fid19 => fid0;
	}
else if (_from == 19 && _to == 1) {
        fid19 => fid1;
	}
else if (_from == 19 && _to == 2) {
        fid19 => fid2;
	}
else if (_from == 19 && _to == 3) {
        fid19 => fid3;
	}
else if (_from == 19 && _to == 4) {
        fid19 => fid4;
	}
else if (_from == 19 && _to == 5) {
        fid19 => fid5;
	}
else if (_from == 19 && _to == 6) {
        fid19 => fid6;
	}
else if (_from == 19 && _to == 7) {
        fid19 => fid7;
	}
else if (_from == 19 && _to == 8) {
        fid19 => fid8;
	}
else if (_from == 19 && _to == 9) {
        fid19 => fid9;
	}
else if (_from == 19 && _to == 10) {
        fid19 => fid10;
	}
else if (_from == 19 && _to == 11) {
        fid19 => fid11;
	}
else if (_from == 19 && _to == 12) {
        fid19 => fid12;
	}
else if (_from == 19 && _to == 13) {
        fid19 => fid13;
	}
else if (_from == 19 && _to == 14) {
        fid19 => fid14;
	}
else if (_from == 19 && _to == 15) {
        fid19 => fid15;
	}
else if (_from == 19 && _to == 16) {
        fid19 => fid16;
	}
else if (_from == 19 && _to == 17) {
        fid19 => fid17;
	}
else if (_from == 19 && _to == 18) {
        fid19 => fid18;
	}

else if (_from == 19 && _to == 20) {
        fid19 => fid20;
	}

else if (_from == 20 && _to == 0) {
        fid20 => fid0;
	}
else if (_from == 20 && _to == 1) {
        fid20 => fid1;
	}
else if (_from == 20 && _to == 2) {
        fid20 => fid2;
	}
else if (_from == 20 && _to == 3) {
        fid20 => fid3;
	}
else if (_from == 20 && _to == 4) {
        fid20 => fid4;
	}
else if (_from == 20 && _to == 5) {
        fid20 => fid5;
	}
else if (_from == 20 && _to == 6) {
        fid20 => fid6;
	}
else if (_from == 20 && _to == 7) {
        fid20 => fid7;
	}
else if (_from == 20 && _to == 8) {
        fid20 => fid8;
	}
else if (_from == 20 && _to == 9) {
        fid20 => fid9;
	}
else if (_from == 20 && _to == 10) {
        fid20 => fid10;
	}
else if (_from == 20 && _to == 11) {
        fid20 => fid11;
	}
else if (_from == 20 && _to == 12) {
        fid20 => fid12;
	}
else if (_from == 20 && _to == 13) {
        fid20 => fid13;
	}
else if (_from == 20 && _to == 14) {
        fid20 => fid14;
	}
else if (_from == 20 && _to == 15) {
        fid20 => fid15;
	}
else if (_from == 20 && _to == 16) {
        fid20 => fid16;
	}
else if (_from == 20 && _to == 17) {
        fid20 => fid17;
	}
else if (_from == 20 && _to == 18) {
        fid20 => fid18;
	}
else if (_from == 20 && _to == 19) {
        fid20 => fid19;
	}

}

fun void handleFidDisconnection(int _from, int _to) {



/*  */ if (_from == 0 && _to == 1) {
        fid0 =< fid1;
	}
else if (_from == 0 && _to == 2) {
        fid0 =< fid2;
	}
else if (_from == 0 && _to == 3) {
        fid0 =< fid3;
	}
else if (_from == 0 && _to == 4) {
        fid0 =< fid4;
	}
else if (_from == 0 && _to == 5) {
        fid0 =< fid5;
	}
else if (_from == 0 && _to == 6) {
        fid0 =< fid6;
	}
else if (_from == 0 && _to == 7) {
        fid0 =< fid7;
	}
else if (_from == 0 && _to == 8) {
        fid0 =< fid8;
	}
else if (_from == 0 && _to == 9) {
        fid0 =< fid9;
	}
else if (_from == 0 && _to == 10) {
        fid0 =< fid10;
	}
else if (_from == 0 && _to == 11) {
        fid0 =< fid11;
	}
else if (_from == 0 && _to == 12) {
        fid0 =< fid12;
	}
else if (_from == 0 && _to == 13) {
        fid0 =< fid13;
	}
else if (_from == 0 && _to == 14) {
        fid0 =< fid14;
	}
else if (_from == 0 && _to == 15) {
        fid0 =< fid15;
	}
else if (_from == 0 && _to == 16) {
        fid0 =< fid16;
	}
else if (_from == 0 && _to == 17) {
        fid0 =< fid17;
	}
else if (_from == 0 && _to == 18) {
        fid0 =< fid18;
	}
else if (_from == 0 && _to == 19) {
        fid0 =< fid19;
	}
else if (_from == 0 && _to == 20) {
        fid0 =< fid20;
	}

else if (_from == 1 && _to == 0) {
        fid1 =< fid0;
	}

else if (_from == 1 && _to == 2) {
        fid1 =< fid2;
	}
else if (_from == 1 && _to == 3) {
        fid1 =< fid3;
	}
else if (_from == 1 && _to == 4) {
        fid1 =< fid4;
	}
else if (_from == 1 && _to == 5) {
        fid1 =< fid5;
	}
else if (_from == 1 && _to == 6) {
        fid1 =< fid6;
	}
else if (_from == 1 && _to == 7) {
        fid1 =< fid7;
	}
else if (_from == 1 && _to == 8) {
        fid1 =< fid8;
	}
else if (_from == 1 && _to == 9) {
        fid1 =< fid9;
	}
else if (_from == 1 && _to == 10) {
        fid1 =< fid10;
	}
else if (_from == 1 && _to == 11) {
        fid1 =< fid11;
	}
else if (_from == 1 && _to == 12) {
        fid1 =< fid12;
	}
else if (_from == 1 && _to == 13) {
        fid1 =< fid13;
	}
else if (_from == 1 && _to == 14) {
        fid1 =< fid14;
	}
else if (_from == 1 && _to == 15) {
        fid1 =< fid15;
	}
else if (_from == 1 && _to == 16) {
        fid1 =< fid16;
	}
else if (_from == 1 && _to == 17) {
        fid1 =< fid17;
	}
else if (_from == 1 && _to == 18) {
        fid1 =< fid18;
	}
else if (_from == 1 && _to == 19) {
        fid1 =< fid19;
	}
else if (_from == 1 && _to == 20) {
        fid1 =< fid20;
	}

else if (_from == 2 && _to == 0) {
        fid2 =< fid0;
	}
else if (_from == 2 && _to == 1) {
        fid2 =< fid1;
	}

else if (_from == 2 && _to == 3) {
        fid2 =< fid3;
	}
else if (_from == 2 && _to == 4) {
        fid2 =< fid4;
	}
else if (_from == 2 && _to == 5) {
        fid2 =< fid5;
	}
else if (_from == 2 && _to == 6) {
        fid2 =< fid6;
	}
else if (_from == 2 && _to == 7) {
        fid2 =< fid7;
	}
else if (_from == 2 && _to == 8) {
        fid2 =< fid8;
	}
else if (_from == 2 && _to == 9) {
        fid2 =< fid9;
	}
else if (_from == 2 && _to == 10) {
        fid2 =< fid10;
	}
else if (_from == 2 && _to == 11) {
        fid2 =< fid11;
	}
else if (_from == 2 && _to == 12) {
        fid2 =< fid12;
	}
else if (_from == 2 && _to == 13) {
        fid2 =< fid13;
	}
else if (_from == 2 && _to == 14) {
        fid2 =< fid14;
	}
else if (_from == 2 && _to == 15) {
        fid2 =< fid15;
	}
else if (_from == 2 && _to == 16) {
        fid2 =< fid16;
	}
else if (_from == 2 && _to == 17) {
        fid2 =< fid17;
	}
else if (_from == 2 && _to == 18) {
        fid2 =< fid18;
	}
else if (_from == 2 && _to == 19) {
        fid2 =< fid19;
	}
else if (_from == 2 && _to == 20) {
        fid2 =< fid20;
	}

else if (_from == 3 && _to == 0) {
        fid3 =< fid0;
	}
else if (_from == 3 && _to == 1) {
        fid3 =< fid1;
	}
else if (_from == 3 && _to == 2) {
        fid3 =< fid2;
	}

else if (_from == 3 && _to == 4) {
        fid3 =< fid4;
	}
else if (_from == 3 && _to == 5) {
        fid3 =< fid5;
	}
else if (_from == 3 && _to == 6) {
        fid3 =< fid6;
	}
else if (_from == 3 && _to == 7) {
        fid3 =< fid7;
	}
else if (_from == 3 && _to == 8) {
        fid3 =< fid8;
	}
else if (_from == 3 && _to == 9) {
        fid3 =< fid9;
	}
else if (_from == 3 && _to == 10) {
        fid3 =< fid10;
	}
else if (_from == 3 && _to == 11) {
        fid3 =< fid11;
	}
else if (_from == 3 && _to == 12) {
        fid3 =< fid12;
	}
else if (_from == 3 && _to == 13) {
        fid3 =< fid13;
	}
else if (_from == 3 && _to == 14) {
        fid3 =< fid14;
	}
else if (_from == 3 && _to == 15) {
        fid3 =< fid15;
	}
else if (_from == 3 && _to == 16) {
        fid3 =< fid16;
	}
else if (_from == 3 && _to == 17) {
        fid3 =< fid17;
	}
else if (_from == 3 && _to == 18) {
        fid3 =< fid18;
	}
else if (_from == 3 && _to == 19) {
        fid3 =< fid19;
	}
else if (_from == 3 && _to == 20) {
        fid3 =< fid20;
	}

else if (_from == 4 && _to == 0) {
        fid4 =< fid0;
	}
else if (_from == 4 && _to == 1) {
        fid4 =< fid1;
	}
else if (_from == 4 && _to == 2) {
        fid4 =< fid2;
	}
else if (_from == 4 && _to == 3) {
        fid4 =< fid3;
	}

else if (_from == 4 && _to == 5) {
        fid4 =< fid5;
	}
else if (_from == 4 && _to == 6) {
        fid4 =< fid6;
	}
else if (_from == 4 && _to == 7) {
        fid4 =< fid7;
	}
else if (_from == 4 && _to == 8) {
        fid4 =< fid8;
	}
else if (_from == 4 && _to == 9) {
        fid4 =< fid9;
	}
else if (_from == 4 && _to == 10) {
        fid4 =< fid10;
	}
else if (_from == 4 && _to == 11) {
        fid4 =< fid11;
	}
else if (_from == 4 && _to == 12) {
        fid4 =< fid12;
	}
else if (_from == 4 && _to == 13) {
        fid4 =< fid13;
	}
else if (_from == 4 && _to == 14) {
        fid4 =< fid14;
	}
else if (_from == 4 && _to == 15) {
        fid4 =< fid15;
	}
else if (_from == 4 && _to == 16) {
        fid4 =< fid16;
	}
else if (_from == 4 && _to == 17) {
        fid4 =< fid17;
	}
else if (_from == 4 && _to == 18) {
        fid4 =< fid18;
	}
else if (_from == 4 && _to == 19) {
        fid4 =< fid19;
	}
else if (_from == 4 && _to == 20) {
        fid4 =< fid20;
	}

else if (_from == 5 && _to == 0) {
        fid5 =< fid0;
	}
else if (_from == 5 && _to == 1) {
        fid5 =< fid1;
	}
else if (_from == 5 && _to == 2) {
        fid5 =< fid2;
	}
else if (_from == 5 && _to == 3) {
        fid5 =< fid3;
	}
else if (_from == 5 && _to == 4) {
        fid5 =< fid4;
	}

else if (_from == 5 && _to == 6) {
        fid5 =< fid6;
	}
else if (_from == 5 && _to == 7) {
        fid5 =< fid7;
	}
else if (_from == 5 && _to == 8) {
        fid5 =< fid8;
	}
else if (_from == 5 && _to == 9) {
        fid5 =< fid9;
	}
else if (_from == 5 && _to == 10) {
        fid5 =< fid10;
	}
else if (_from == 5 && _to == 11) {
        fid5 =< fid11;
	}
else if (_from == 5 && _to == 12) {
        fid5 =< fid12;
	}
else if (_from == 5 && _to == 13) {
        fid5 =< fid13;
	}
else if (_from == 5 && _to == 14) {
        fid5 =< fid14;
	}
else if (_from == 5 && _to == 15) {
        fid5 =< fid15;
	}
else if (_from == 5 && _to == 16) {
        fid5 =< fid16;
	}
else if (_from == 5 && _to == 17) {
        fid5 =< fid17;
	}
else if (_from == 5 && _to == 18) {
        fid5 =< fid18;
	}
else if (_from == 5 && _to == 19) {
        fid5 =< fid19;
	}
else if (_from == 5 && _to == 20) {
        fid5 =< fid20;
	}

else if (_from == 6 && _to == 0) {
        fid6 =< fid0;
	}
else if (_from == 6 && _to == 1) {
        fid6 =< fid1;
	}
else if (_from == 6 && _to == 2) {
        fid6 =< fid2;
	}
else if (_from == 6 && _to == 3) {
        fid6 =< fid3;
	}
else if (_from == 6 && _to == 4) {
        fid6 =< fid4;
	}
else if (_from == 6 && _to == 5) {
        fid6 =< fid5;
	}

else if (_from == 6 && _to == 7) {
        fid6 =< fid7;
	}
else if (_from == 6 && _to == 8) {
        fid6 =< fid8;
	}
else if (_from == 6 && _to == 9) {
        fid6 =< fid9;
	}
else if (_from == 6 && _to == 10) {
        fid6 =< fid10;
	}
else if (_from == 6 && _to == 11) {
        fid6 =< fid11;
	}
else if (_from == 6 && _to == 12) {
        fid6 =< fid12;
	}
else if (_from == 6 && _to == 13) {
        fid6 =< fid13;
	}
else if (_from == 6 && _to == 14) {
        fid6 =< fid14;
	}
else if (_from == 6 && _to == 15) {
        fid6 =< fid15;
	}
else if (_from == 6 && _to == 16) {
        fid6 =< fid16;
	}
else if (_from == 6 && _to == 17) {
        fid6 =< fid17;
	}
else if (_from == 6 && _to == 18) {
        fid6 =< fid18;
	}
else if (_from == 6 && _to == 19) {
        fid6 =< fid19;
	}
else if (_from == 6 && _to == 20) {
        fid6 =< fid20;
	}

else if (_from == 7 && _to == 0) {
        fid7 =< fid0;
	}
else if (_from == 7 && _to == 1) {
        fid7 =< fid1;
	}
else if (_from == 7 && _to == 2) {
        fid7 =< fid2;
	}
else if (_from == 7 && _to == 3) {
        fid7 =< fid3;
	}
else if (_from == 7 && _to == 4) {
        fid7 =< fid4;
	}
else if (_from == 7 && _to == 5) {
        fid7 =< fid5;
	}
else if (_from == 7 && _to == 6) {
        fid7 =< fid6;
	}

else if (_from == 7 && _to == 8) {
        fid7 =< fid8;
	}
else if (_from == 7 && _to == 9) {
        fid7 =< fid9;
	}
else if (_from == 7 && _to == 10) {
        fid7 =< fid10;
	}
else if (_from == 7 && _to == 11) {
        fid7 =< fid11;
	}
else if (_from == 7 && _to == 12) {
        fid7 =< fid12;
	}
else if (_from == 7 && _to == 13) {
        fid7 =< fid13;
	}
else if (_from == 7 && _to == 14) {
        fid7 =< fid14;
	}
else if (_from == 7 && _to == 15) {
        fid7 =< fid15;
	}
else if (_from == 7 && _to == 16) {
        fid7 =< fid16;
	}
else if (_from == 7 && _to == 17) {
        fid7 =< fid17;
	}
else if (_from == 7 && _to == 18) {
        fid7 =< fid18;
	}
else if (_from == 7 && _to == 19) {
        fid7 =< fid19;
	}
else if (_from == 7 && _to == 20) {
        fid7 =< fid20;
	}

else if (_from == 8 && _to == 0) {
        fid8 =< fid0;
	}
else if (_from == 8 && _to == 1) {
        fid8 =< fid1;
	}
else if (_from == 8 && _to == 2) {
        fid8 =< fid2;
	}
else if (_from == 8 && _to == 3) {
        fid8 =< fid3;
	}
else if (_from == 8 && _to == 4) {
        fid8 =< fid4;
	}
else if (_from == 8 && _to == 5) {
        fid8 =< fid5;
	}
else if (_from == 8 && _to == 6) {
        fid8 =< fid6;
	}
else if (_from == 8 && _to == 7) {
        fid8 =< fid7;
	}

else if (_from == 8 && _to == 9) {
        fid8 =< fid9;
	}
else if (_from == 8 && _to == 10) {
        fid8 =< fid10;
	}
else if (_from == 8 && _to == 11) {
        fid8 =< fid11;
	}
else if (_from == 8 && _to == 12) {
        fid8 =< fid12;
	}
else if (_from == 8 && _to == 13) {
        fid8 =< fid13;
	}
else if (_from == 8 && _to == 14) {
        fid8 =< fid14;
	}
else if (_from == 8 && _to == 15) {
        fid8 =< fid15;
	}
else if (_from == 8 && _to == 16) {
        fid8 =< fid16;
	}
else if (_from == 8 && _to == 17) {
        fid8 =< fid17;
	}
else if (_from == 8 && _to == 18) {
        fid8 =< fid18;
	}
else if (_from == 8 && _to == 19) {
        fid8 =< fid19;
	}
else if (_from == 8 && _to == 20) {
        fid8 =< fid20;
	}

else if (_from == 9 && _to == 0) {
        fid9 =< fid0;
	}
else if (_from == 9 && _to == 1) {
        fid9 =< fid1;
	}
else if (_from == 9 && _to == 2) {
        fid9 =< fid2;
	}
else if (_from == 9 && _to == 3) {
        fid9 =< fid3;
	}
else if (_from == 9 && _to == 4) {
        fid9 =< fid4;
	}
else if (_from == 9 && _to == 5) {
        fid9 =< fid5;
	}
else if (_from == 9 && _to == 6) {
        fid9 =< fid6;
	}
else if (_from == 9 && _to == 7) {
        fid9 =< fid7;
	}
else if (_from == 9 && _to == 8) {
        fid9 =< fid8;
	}

else if (_from == 9 && _to == 10) {
        fid9 =< fid10;
	}
else if (_from == 9 && _to == 11) {
        fid9 =< fid11;
	}
else if (_from == 9 && _to == 12) {
        fid9 =< fid12;
	}
else if (_from == 9 && _to == 13) {
        fid9 =< fid13;
	}
else if (_from == 9 && _to == 14) {
        fid9 =< fid14;
	}
else if (_from == 9 && _to == 15) {
        fid9 =< fid15;
	}
else if (_from == 9 && _to == 16) {
        fid9 =< fid16;
	}
else if (_from == 9 && _to == 17) {
        fid9 =< fid17;
	}
else if (_from == 9 && _to == 18) {
        fid9 =< fid18;
	}
else if (_from == 9 && _to == 19) {
        fid9 =< fid19;
	}
else if (_from == 9 && _to == 20) {
        fid9 =< fid20;
	}

else if (_from == 10 && _to == 0) {
        fid10 =< fid0;
	}
else if (_from == 10 && _to == 1) {
        fid10 =< fid1;
	}
else if (_from == 10 && _to == 2) {
        fid10 =< fid2;
	}
else if (_from == 10 && _to == 3) {
        fid10 =< fid3;
	}
else if (_from == 10 && _to == 4) {
        fid10 =< fid4;
	}
else if (_from == 10 && _to == 5) {
        fid10 =< fid5;
	}
else if (_from == 10 && _to == 6) {
        fid10 =< fid6;
	}
else if (_from == 10 && _to == 7) {
        fid10 =< fid7;
	}
else if (_from == 10 && _to == 8) {
        fid10 =< fid8;
	}
else if (_from == 10 && _to == 9) {
        fid10 =< fid9;
	}

else if (_from == 10 && _to == 11) {
        fid10 =< fid11;
	}
else if (_from == 10 && _to == 12) {
        fid10 =< fid12;
	}
else if (_from == 10 && _to == 13) {
        fid10 =< fid13;
	}
else if (_from == 10 && _to == 14) {
        fid10 =< fid14;
	}
else if (_from == 10 && _to == 15) {
        fid10 =< fid15;
	}
else if (_from == 10 && _to == 16) {
        fid10 =< fid16;
	}
else if (_from == 10 && _to == 17) {
        fid10 =< fid17;
	}
else if (_from == 10 && _to == 18) {
        fid10 =< fid18;
	}
else if (_from == 10 && _to == 19) {
        fid10 =< fid19;
	}
else if (_from == 10 && _to == 20) {
        fid10 =< fid20;
	}

else if (_from == 11 && _to == 0) {
        fid11 =< fid0;
	}
else if (_from == 11 && _to == 1) {
        fid11 =< fid1;
	}
else if (_from == 11 && _to == 2) {
        fid11 =< fid2;
	}
else if (_from == 11 && _to == 3) {
        fid11 =< fid3;
	}
else if (_from == 11 && _to == 4) {
        fid11 =< fid4;
	}
else if (_from == 11 && _to == 5) {
        fid11 =< fid5;
	}
else if (_from == 11 && _to == 6) {
        fid11 =< fid6;
	}
else if (_from == 11 && _to == 7) {
        fid11 =< fid7;
	}
else if (_from == 11 && _to == 8) {
        fid11 =< fid8;
	}
else if (_from == 11 && _to == 9) {
        fid11 =< fid9;
	}
else if (_from == 11 && _to == 10) {
        fid11 =< fid10;
	}

else if (_from == 11 && _to == 12) {
        fid11 =< fid12;
	}
else if (_from == 11 && _to == 13) {
        fid11 =< fid13;
	}
else if (_from == 11 && _to == 14) {
        fid11 =< fid14;
	}
else if (_from == 11 && _to == 15) {
        fid11 =< fid15;
	}
else if (_from == 11 && _to == 16) {
        fid11 =< fid16;
	}
else if (_from == 11 && _to == 17) {
        fid11 =< fid17;
	}
else if (_from == 11 && _to == 18) {
        fid11 =< fid18;
	}
else if (_from == 11 && _to == 19) {
        fid11 =< fid19;
	}
else if (_from == 11 && _to == 20) {
        fid11 =< fid20;
	}

else if (_from == 12 && _to == 0) {
        fid12 =< fid0;
	}
else if (_from == 12 && _to == 1) {
        fid12 =< fid1;
	}
else if (_from == 12 && _to == 2) {
        fid12 =< fid2;
	}
else if (_from == 12 && _to == 3) {
        fid12 =< fid3;
	}
else if (_from == 12 && _to == 4) {
        fid12 =< fid4;
	}
else if (_from == 12 && _to == 5) {
        fid12 =< fid5;
	}
else if (_from == 12 && _to == 6) {
        fid12 =< fid6;
	}
else if (_from == 12 && _to == 7) {
        fid12 =< fid7;
	}
else if (_from == 12 && _to == 8) {
        fid12 =< fid8;
	}
else if (_from == 12 && _to == 9) {
        fid12 =< fid9;
	}
else if (_from == 12 && _to == 10) {
        fid12 =< fid10;
	}
else if (_from == 12 && _to == 11) {
        fid12 =< fid11;
	}

else if (_from == 12 && _to == 13) {
        fid12 =< fid13;
	}
else if (_from == 12 && _to == 14) {
        fid12 =< fid14;
	}
else if (_from == 12 && _to == 15) {
        fid12 =< fid15;
	}
else if (_from == 12 && _to == 16) {
        fid12 =< fid16;
	}
else if (_from == 12 && _to == 17) {
        fid12 =< fid17;
	}
else if (_from == 12 && _to == 18) {
        fid12 =< fid18;
	}
else if (_from == 12 && _to == 19) {
        fid12 =< fid19;
	}
else if (_from == 12 && _to == 20) {
        fid12 =< fid20;
	}

else if (_from == 13 && _to == 0) {
        fid13 =< fid0;
	}
else if (_from == 13 && _to == 1) {
        fid13 =< fid1;
	}
else if (_from == 13 && _to == 2) {
        fid13 =< fid2;
	}
else if (_from == 13 && _to == 3) {
        fid13 =< fid3;
	}
else if (_from == 13 && _to == 4) {
        fid13 =< fid4;
	}
else if (_from == 13 && _to == 5) {
        fid13 =< fid5;
	}
else if (_from == 13 && _to == 6) {
        fid13 =< fid6;
	}
else if (_from == 13 && _to == 7) {
        fid13 =< fid7;
	}
else if (_from == 13 && _to == 8) {
        fid13 =< fid8;
	}
else if (_from == 13 && _to == 9) {
        fid13 =< fid9;
	}
else if (_from == 13 && _to == 10) {
        fid13 =< fid10;
	}
else if (_from == 13 && _to == 11) {
        fid13 =< fid11;
	}
else if (_from == 13 && _to == 12) {
        fid13 =< fid12;
	}

else if (_from == 13 && _to == 14) {
        fid13 =< fid14;
	}
else if (_from == 13 && _to == 15) {
        fid13 =< fid15;
	}
else if (_from == 13 && _to == 16) {
        fid13 =< fid16;
	}
else if (_from == 13 && _to == 17) {
        fid13 =< fid17;
	}
else if (_from == 13 && _to == 18) {
        fid13 =< fid18;
	}
else if (_from == 13 && _to == 19) {
        fid13 =< fid19;
	}
else if (_from == 13 && _to == 20) {
        fid13 =< fid20;
	}

else if (_from == 14 && _to == 0) {
        fid14 =< fid0;
	}
else if (_from == 14 && _to == 1) {
        fid14 =< fid1;
	}
else if (_from == 14 && _to == 2) {
        fid14 =< fid2;
	}
else if (_from == 14 && _to == 3) {
        fid14 =< fid3;
	}
else if (_from == 14 && _to == 4) {
        fid14 =< fid4;
	}
else if (_from == 14 && _to == 5) {
        fid14 =< fid5;
	}
else if (_from == 14 && _to == 6) {
        fid14 =< fid6;
	}
else if (_from == 14 && _to == 7) {
        fid14 =< fid7;
	}
else if (_from == 14 && _to == 8) {
        fid14 =< fid8;
	}
else if (_from == 14 && _to == 9) {
        fid14 =< fid9;
	}
else if (_from == 14 && _to == 10) {
        fid14 =< fid10;
	}
else if (_from == 14 && _to == 11) {
        fid14 =< fid11;
	}
else if (_from == 14 && _to == 12) {
        fid14 =< fid12;
	}
else if (_from == 14 && _to == 13) {
        fid14 =< fid13;
	}

else if (_from == 14 && _to == 15) {
        fid14 =< fid15;
	}
else if (_from == 14 && _to == 16) {
        fid14 =< fid16;
	}
else if (_from == 14 && _to == 17) {
        fid14 =< fid17;
	}
else if (_from == 14 && _to == 18) {
        fid14 =< fid18;
	}
else if (_from == 14 && _to == 19) {
        fid14 =< fid19;
	}
else if (_from == 14 && _to == 20) {
        fid14 =< fid20;
	}

else if (_from == 15 && _to == 0) {
        fid15 =< fid0;
	}
else if (_from == 15 && _to == 1) {
        fid15 =< fid1;
	}
else if (_from == 15 && _to == 2) {
        fid15 =< fid2;
	}
else if (_from == 15 && _to == 3) {
        fid15 =< fid3;
	}
else if (_from == 15 && _to == 4) {
        fid15 =< fid4;
	}
else if (_from == 15 && _to == 5) {
        fid15 =< fid5;
	}
else if (_from == 15 && _to == 6) {
        fid15 =< fid6;
	}
else if (_from == 15 && _to == 7) {
        fid15 =< fid7;
	}
else if (_from == 15 && _to == 8) {
        fid15 =< fid8;
	}
else if (_from == 15 && _to == 9) {
        fid15 =< fid9;
	}
else if (_from == 15 && _to == 10) {
        fid15 =< fid10;
	}
else if (_from == 15 && _to == 11) {
        fid15 =< fid11;
	}
else if (_from == 15 && _to == 12) {
        fid15 =< fid12;
	}
else if (_from == 15 && _to == 13) {
        fid15 =< fid13;
	}
else if (_from == 15 && _to == 14) {
        fid15 =< fid14;
	}

else if (_from == 15 && _to == 16) {
        fid15 =< fid16;
	}
else if (_from == 15 && _to == 17) {
        fid15 =< fid17;
	}
else if (_from == 15 && _to == 18) {
        fid15 =< fid18;
	}
else if (_from == 15 && _to == 19) {
        fid15 =< fid19;
	}
else if (_from == 15 && _to == 20) {
        fid15 =< fid20;
	}

else if (_from == 16 && _to == 0) {
        fid16 =< fid0;
	}
else if (_from == 16 && _to == 1) {
        fid16 =< fid1;
	}
else if (_from == 16 && _to == 2) {
        fid16 =< fid2;
	}
else if (_from == 16 && _to == 3) {
        fid16 =< fid3;
	}
else if (_from == 16 && _to == 4) {
        fid16 =< fid4;
	}
else if (_from == 16 && _to == 5) {
        fid16 =< fid5;
	}
else if (_from == 16 && _to == 6) {
        fid16 =< fid6;
	}
else if (_from == 16 && _to == 7) {
        fid16 =< fid7;
	}
else if (_from == 16 && _to == 8) {
        fid16 =< fid8;
	}
else if (_from == 16 && _to == 9) {
        fid16 =< fid9;
	}
else if (_from == 16 && _to == 10) {
        fid16 =< fid10;
	}
else if (_from == 16 && _to == 11) {
        fid16 =< fid11;
	}
else if (_from == 16 && _to == 12) {
        fid16 =< fid12;
	}
else if (_from == 16 && _to == 13) {
        fid16 =< fid13;
	}
else if (_from == 16 && _to == 14) {
        fid16 =< fid14;
	}
else if (_from == 16 && _to == 15) {
        fid16 =< fid15;
	}

else if (_from == 16 && _to == 17) {
        fid16 =< fid17;
	}
else if (_from == 16 && _to == 18) {
        fid16 =< fid18;
	}
else if (_from == 16 && _to == 19) {
        fid16 =< fid19;
	}
else if (_from == 16 && _to == 20) {
        fid16 =< fid20;
	}

else if (_from == 17 && _to == 0) {
        fid17 =< fid0;
	}
else if (_from == 17 && _to == 1) {
        fid17 =< fid1;
	}
else if (_from == 17 && _to == 2) {
        fid17 =< fid2;
	}
else if (_from == 17 && _to == 3) {
        fid17 =< fid3;
	}
else if (_from == 17 && _to == 4) {
        fid17 =< fid4;
	}
else if (_from == 17 && _to == 5) {
        fid17 =< fid5;
	}
else if (_from == 17 && _to == 6) {
        fid17 =< fid6;
	}
else if (_from == 17 && _to == 7) {
        fid17 =< fid7;
	}
else if (_from == 17 && _to == 8) {
        fid17 =< fid8;
	}
else if (_from == 17 && _to == 9) {
        fid17 =< fid9;
	}
else if (_from == 17 && _to == 10) {
        fid17 =< fid10;
	}
else if (_from == 17 && _to == 11) {
        fid17 =< fid11;
	}
else if (_from == 17 && _to == 12) {
        fid17 =< fid12;
	}
else if (_from == 17 && _to == 13) {
        fid17 =< fid13;
	}
else if (_from == 17 && _to == 14) {
        fid17 =< fid14;
	}
else if (_from == 17 && _to == 15) {
        fid17 =< fid15;
	}
else if (_from == 17 && _to == 16) {
        fid17 =< fid16;
	}

else if (_from == 17 && _to == 18) {
        fid17 =< fid18;
	}
else if (_from == 17 && _to == 19) {
        fid17 =< fid19;
	}
else if (_from == 17 && _to == 20) {
        fid17 =< fid20;
	}

else if (_from == 18 && _to == 0) {
        fid18 =< fid0;
	}
else if (_from == 18 && _to == 1) {
        fid18 =< fid1;
	}
else if (_from == 18 && _to == 2) {
        fid18 =< fid2;
	}
else if (_from == 18 && _to == 3) {
        fid18 =< fid3;
	}
else if (_from == 18 && _to == 4) {
        fid18 =< fid4;
	}
else if (_from == 18 && _to == 5) {
        fid18 =< fid5;
	}
else if (_from == 18 && _to == 6) {
        fid18 =< fid6;
	}
else if (_from == 18 && _to == 7) {
        fid18 =< fid7;
	}
else if (_from == 18 && _to == 8) {
        fid18 =< fid8;
	}
else if (_from == 18 && _to == 9) {
        fid18 =< fid9;
	}
else if (_from == 18 && _to == 10) {
        fid18 =< fid10;
	}
else if (_from == 18 && _to == 11) {
        fid18 =< fid11;
	}
else if (_from == 18 && _to == 12) {
        fid18 =< fid12;
	}
else if (_from == 18 && _to == 13) {
        fid18 =< fid13;
	}
else if (_from == 18 && _to == 14) {
        fid18 =< fid14;
	}
else if (_from == 18 && _to == 15) {
        fid18 =< fid15;
	}
else if (_from == 18 && _to == 16) {
        fid18 =< fid16;
	}
else if (_from == 18 && _to == 17) {
        fid18 =< fid17;
	}

else if (_from == 18 && _to == 19) {
        fid18 =< fid19;
	}
else if (_from == 18 && _to == 20) {
        fid18 =< fid20;
	}

else if (_from == 19 && _to == 0) {
        fid19 =< fid0;
	}
else if (_from == 19 && _to == 1) {
        fid19 =< fid1;
	}
else if (_from == 19 && _to == 2) {
        fid19 =< fid2;
	}
else if (_from == 19 && _to == 3) {
        fid19 =< fid3;
	}
else if (_from == 19 && _to == 4) {
        fid19 =< fid4;
	}
else if (_from == 19 && _to == 5) {
        fid19 =< fid5;
	}
else if (_from == 19 && _to == 6) {
        fid19 =< fid6;
	}
else if (_from == 19 && _to == 7) {
        fid19 =< fid7;
	}
else if (_from == 19 && _to == 8) {
        fid19 =< fid8;
	}
else if (_from == 19 && _to == 9) {
        fid19 =< fid9;
	}
else if (_from == 19 && _to == 10) {
        fid19 =< fid10;
	}
else if (_from == 19 && _to == 11) {
        fid19 =< fid11;
	}
else if (_from == 19 && _to == 12) {
        fid19 =< fid12;
	}
else if (_from == 19 && _to == 13) {
        fid19 =< fid13;
	}
else if (_from == 19 && _to == 14) {
        fid19 =< fid14;
	}
else if (_from == 19 && _to == 15) {
        fid19 =< fid15;
	}
else if (_from == 19 && _to == 16) {
        fid19 =< fid16;
	}
else if (_from == 19 && _to == 17) {
        fid19 =< fid17;
	}
else if (_from == 19 && _to == 18) {
        fid19 =< fid18;
	}

else if (_from == 19 && _to == 20) {
        fid19 =< fid20;
	}

else if (_from == 20 && _to == 0) {
        fid20 =< fid0;
	}
else if (_from == 20 && _to == 1) {
        fid20 =< fid1;
	}
else if (_from == 20 && _to == 2) {
        fid20 =< fid2;
	}
else if (_from == 20 && _to == 3) {
        fid20 =< fid3;
	}
else if (_from == 20 && _to == 4) {
        fid20 =< fid4;
	}
else if (_from == 20 && _to == 5) {
        fid20 =< fid5;
	}
else if (_from == 20 && _to == 6) {
        fid20 =< fid6;
	}
else if (_from == 20 && _to == 7) {
        fid20 =< fid7;
	}
else if (_from == 20 && _to == 8) {
        fid20 =< fid8;
	}
else if (_from == 20 && _to == 9) {
        fid20 =< fid9;
	}
else if (_from == 20 && _to == 10) {
        fid20 =< fid10;
	}
else if (_from == 20 && _to == 11) {
        fid20 =< fid11;
	}
else if (_from == 20 && _to == 12) {
        fid20 =< fid12;
	}
else if (_from == 20 && _to == 13) {
        fid20 =< fid13;
	}
else if (_from == 20 && _to == 14) {
        fid20 =< fid14;
	}
else if (_from == 20 && _to == 15) {
        fid20 =< fid15;
	}
else if (_from == 20 && _to == 16) {
        fid20 =< fid16;
	}
else if (_from == 20 && _to == 17) {
        fid20 =< fid17;
	}
else if (_from == 20 && _to == 18) {
        fid20 =< fid18;
	}
else if (_from == 20 && _to == 19) {
        fid20 =< fid19;
	}

}

fun void setOscFreq(int _id, float _freq) {

    if(_id == 0) {
        _freq => fid0.freq;
    }
else if(_id == 1) {
        _freq => fid1.freq;
    }
else if(_id == 2) {
        _freq => fid2.freq;
    }
else if(_id == 3) {
        _freq => fid3.freq;
    }
else if(_id == 4) {
        _freq => fid4.freq;
    }
else if(_id == 5) {
        _freq => fid5.freq;
    }
else if(_id == 6) {
        _freq => fid6.freq;
    }
else if(_id == 7) {
        _freq => fid7.freq;
    }

else if(_id == 9) {
        _freq => fid9.freq;
    }
else if(_id == 10) {
        _freq => fid10.freq;
    }
else if(_id == 11) {
        _freq => fid11.freq;
    }
else if(_id == 12) {
        _freq => fid12.freq;
    }
else if(_id == 13) {
        _freq => fid13.freq;
    }
else if(_id == 14) {
        _freq => fid14.freq;
    }
else if(_id == 15) {
        _freq => fid15.freq;
    }
else if(_id == 16) {
        _freq => fid16.freq;
    }

else if(_id == 18) {
        _freq => fid18.freq;
    }
else if(_id == 19) {
        _freq => fid19.freq;
    }

}

fun void setOscGain(int _id, float _gain) {

    if(_id == 0) {
        _gain*25 => fid0.gain;
    }
else if(_id == 1) {
        _gain*25 => fid1.gain;
    }
else if(_id == 2) {
        _gain*25 => fid2.gain;
    }
else if(_id == 3) {
        _gain*25 => fid3.gain;
    }
else if(_id == 4) {
        _gain*25 => fid4.gain;
    }
else if(_id == 5) {
        _gain*25 => fid5.gain;
    }
else if(_id == 6) {
        _gain*25 => fid6.gain;
    }
else if(_id == 7) {
        _gain*25 => fid7.gain;
    }

else if(_id == 9) {
        _gain*25 => fid9.gain;
    }
else if(_id == 10) {
        _gain*25 => fid10.gain;
    }
else if(_id == 11) {
        _gain*25 => fid11.gain;
    }
else if(_id == 12) {
        _gain*25 => fid12.gain;
    }
else if(_id == 13) {
        _gain*25 => fid13.gain;
    }
else if(_id == 14) {
        _gain*25 => fid14.gain;
    }
else if(_id == 15) {
        _gain*25 => fid15.gain;
    }
else if(_id == 16) {
        _gain*25 => fid16.gain;
    }

else if(_id == 18) {
        _gain*25 => fid18.gain;
    }
else if(_id == 19) {
        _gain*25 => fid19.gain;
    }
 else if (_id == -440) {
        _gain => dac.gain;
    }
}


OscRecv recv;

4444 => recv.port;

recv.listen();

recv.event( "/smurf/connection/add, i, i, i" ) @=> OscEvent connAddListener;
recv.event( "/smurf/connection/update, i, i, i, f" ) @=> OscEvent connUpdateListener;
recv.event( "/smurf/connection/remove, i, i, i" ) @=> OscEvent connRemoveListener;

recv.event( "/smurf/beat" ) @=> OscEvent beat;


recv.event( "/smurf/fid/0/bang, f, f, f, f" ) @=> OscEvent fidBang0;
recv.event( "/smurf/fid/0/add, f, f, f" ) @=> OscEvent fidAdd0;
recv.event( "/smurf/fid/0/update, f, f, f, f" ) @=> OscEvent fidUpdate0;
recv.event( "/smurf/fid/0/remove, f, f, f" ) @=> OscEvent fidRemove0;

recv.event( "/smurf/fid/1/bang, f, f, f, f" ) @=> OscEvent fidBang1;
recv.event( "/smurf/fid/1/add, f, f, f" ) @=> OscEvent fidAdd1;
recv.event( "/smurf/fid/1/update, f, f, f, f" ) @=> OscEvent fidUpdate1;
recv.event( "/smurf/fid/1/remove, f, f, f" ) @=> OscEvent fidRemove1;

recv.event( "/smurf/fid/2/bang, f, f, f, f" ) @=> OscEvent fidBang2;
recv.event( "/smurf/fid/2/add, f, f, f" ) @=> OscEvent fidAdd2;
recv.event( "/smurf/fid/2/update, f, f, f, f" ) @=> OscEvent fidUpdate2;
recv.event( "/smurf/fid/2/remove, f, f, f" ) @=> OscEvent fidRemove2;

recv.event( "/smurf/fid/3/bang, f, f, f, f" ) @=> OscEvent fidBang3;
recv.event( "/smurf/fid/3/add, f, f, f" ) @=> OscEvent fidAdd3;
recv.event( "/smurf/fid/3/update, f, f, f, f" ) @=> OscEvent fidUpdate3;
recv.event( "/smurf/fid/3/remove, f, f, f" ) @=> OscEvent fidRemove3;

recv.event( "/smurf/fid/4/bang, f, f, f, f" ) @=> OscEvent fidBang4;
recv.event( "/smurf/fid/4/add, f, f, f" ) @=> OscEvent fidAdd4;
recv.event( "/smurf/fid/4/update, f, f, f, f" ) @=> OscEvent fidUpdate4;
recv.event( "/smurf/fid/4/remove, f, f, f" ) @=> OscEvent fidRemove4;

recv.event( "/smurf/fid/5/bang, f, f, f, f" ) @=> OscEvent fidBang5;
recv.event( "/smurf/fid/5/add, f, f, f" ) @=> OscEvent fidAdd5;
recv.event( "/smurf/fid/5/update, f, f, f, f" ) @=> OscEvent fidUpdate5;
recv.event( "/smurf/fid/5/remove, f, f, f" ) @=> OscEvent fidRemove5;

recv.event( "/smurf/fid/6/bang, f, f, f, f" ) @=> OscEvent fidBang6;
recv.event( "/smurf/fid/6/add, f, f, f" ) @=> OscEvent fidAdd6;
recv.event( "/smurf/fid/6/update, f, f, f, f" ) @=> OscEvent fidUpdate6;
recv.event( "/smurf/fid/6/remove, f, f, f" ) @=> OscEvent fidRemove6;

recv.event( "/smurf/fid/7/bang, f, f, f, f" ) @=> OscEvent fidBang7;
recv.event( "/smurf/fid/7/add, f, f, f" ) @=> OscEvent fidAdd7;
recv.event( "/smurf/fid/7/update, f, f, f, f" ) @=> OscEvent fidUpdate7;
recv.event( "/smurf/fid/7/remove, f, f, f" ) @=> OscEvent fidRemove7;

recv.event( "/smurf/fid/8/bang, f, f, f, f" ) @=> OscEvent fidBang8;
recv.event( "/smurf/fid/8/add, f, f, f" ) @=> OscEvent fidAdd8;
recv.event( "/smurf/fid/8/update, f, f, f, f" ) @=> OscEvent fidUpdate8;
recv.event( "/smurf/fid/8/remove, f, f, f" ) @=> OscEvent fidRemove8;

recv.event( "/smurf/fid/9/bang, f, f, f, f" ) @=> OscEvent fidBang9;
recv.event( "/smurf/fid/9/add, f, f, f" ) @=> OscEvent fidAdd9;
recv.event( "/smurf/fid/9/update, f, f, f, f" ) @=> OscEvent fidUpdate9;
recv.event( "/smurf/fid/9/remove, f, f, f" ) @=> OscEvent fidRemove9;

recv.event( "/smurf/fid/10/bang, f, f, f, f" ) @=> OscEvent fidBang10;
recv.event( "/smurf/fid/10/add, f, f, f" ) @=> OscEvent fidAdd10;
recv.event( "/smurf/fid/10/update, f, f, f, f" ) @=> OscEvent fidUpdate10;
recv.event( "/smurf/fid/10/remove, f, f, f" ) @=> OscEvent fidRemove10;

recv.event( "/smurf/fid/11/bang, f, f, f, f" ) @=> OscEvent fidBang11;
recv.event( "/smurf/fid/11/add, f, f, f" ) @=> OscEvent fidAdd11;
recv.event( "/smurf/fid/11/update, f, f, f, f" ) @=> OscEvent fidUpdate11;
recv.event( "/smurf/fid/11/remove, f, f, f" ) @=> OscEvent fidRemove11;

recv.event( "/smurf/fid/12/bang, f, f, f, f" ) @=> OscEvent fidBang12;
recv.event( "/smurf/fid/12/add, f, f, f" ) @=> OscEvent fidAdd12;
recv.event( "/smurf/fid/12/update, f, f, f, f" ) @=> OscEvent fidUpdate12;
recv.event( "/smurf/fid/12/remove, f, f, f" ) @=> OscEvent fidRemove12;

recv.event( "/smurf/fid/13/bang, f, f, f, f" ) @=> OscEvent fidBang13;
recv.event( "/smurf/fid/13/add, f, f, f" ) @=> OscEvent fidAdd13;
recv.event( "/smurf/fid/13/update, f, f, f, f" ) @=> OscEvent fidUpdate13;
recv.event( "/smurf/fid/13/remove, f, f, f" ) @=> OscEvent fidRemove13;

recv.event( "/smurf/fid/14/bang, f, f, f, f" ) @=> OscEvent fidBang14;
recv.event( "/smurf/fid/14/add, f, f, f" ) @=> OscEvent fidAdd14;
recv.event( "/smurf/fid/14/update, f, f, f, f" ) @=> OscEvent fidUpdate14;
recv.event( "/smurf/fid/14/remove, f, f, f" ) @=> OscEvent fidRemove14;

recv.event( "/smurf/fid/15/bang, f, f, f, f" ) @=> OscEvent fidBang15;
recv.event( "/smurf/fid/15/add, f, f, f" ) @=> OscEvent fidAdd15;
recv.event( "/smurf/fid/15/update, f, f, f, f" ) @=> OscEvent fidUpdate15;
recv.event( "/smurf/fid/15/remove, f, f, f" ) @=> OscEvent fidRemove15;

recv.event( "/smurf/fid/16/bang, f, f, f, f" ) @=> OscEvent fidBang16;
recv.event( "/smurf/fid/16/add, f, f, f" ) @=> OscEvent fidAdd16;
recv.event( "/smurf/fid/16/update, f, f, f, f" ) @=> OscEvent fidUpdate16;
recv.event( "/smurf/fid/16/remove, f, f, f" ) @=> OscEvent fidRemove16;

recv.event( "/smurf/fid/17/bang, f, f, f, f" ) @=> OscEvent fidBang17;
recv.event( "/smurf/fid/17/add, f, f, f" ) @=> OscEvent fidAdd17;
recv.event( "/smurf/fid/17/update, f, f, f, f" ) @=> OscEvent fidUpdate17;
recv.event( "/smurf/fid/17/remove, f, f, f" ) @=> OscEvent fidRemove17;

recv.event( "/smurf/fid/18/bang, f, f, f, f" ) @=> OscEvent fidBang18;
recv.event( "/smurf/fid/18/add, f, f, f" ) @=> OscEvent fidAdd18;
recv.event( "/smurf/fid/18/update, f, f, f, f" ) @=> OscEvent fidUpdate18;
recv.event( "/smurf/fid/18/remove, f, f, f" ) @=> OscEvent fidRemove18;

recv.event( "/smurf/fid/19/bang, f, f, f, f" ) @=> OscEvent fidBang19;
recv.event( "/smurf/fid/19/add, f, f, f" ) @=> OscEvent fidAdd19;
recv.event( "/smurf/fid/19/update, f, f, f, f" ) @=> OscEvent fidUpdate19;
recv.event( "/smurf/fid/19/remove, f, f, f" ) @=> OscEvent fidRemove19;

recv.event( "/smurf/fid/20/bang, f, f, f, f" ) @=> OscEvent fidBang20;
recv.event( "/smurf/fid/20/add, f, f, f" ) @=> OscEvent fidAdd20;
recv.event( "/smurf/fid/20/update, f, f, f, f" ) @=> OscEvent fidUpdate20;
recv.event( "/smurf/fid/20/remove, f, f, f" ) @=> OscEvent fidRemove20;


//recv.event( "/smurf/fid/11/bang, f, f, f, f" ) @=> OscEvent fidBang10;
//recv.event( "/smurf/fid/11/add, f, f, f" ) @=> OscEvent fidAdd10;
//recv.event( "/smurf/fid/11/update, f, f, f, f" ) @=> OscEvent fidUpdate10;
//recv.event( "/smurf/fid/11/remove, f, f, f" ) @=> OscEvent fidRemove10;
//recv.event( "/smurf/fid/11/tic, f, f, f" ) @=> OscEvent fidRemove10;
//recv.event( "/smurf/fid/11/tic/0, f, f, f" ) @=> OscEvent fidRemove10;
//recv.event( "/smurf/fid/11/tic/1, f, f, f" ) @=> OscEvent fidRemove10;
//recv.event( "/smurf/fid/11/tic/2, f, f, f" ) @=> OscEvent fidRemove10;
//recv.event( "/smurf/fid/11/tic/3, f, f, f" ) @=> OscEvent fidRemove10;
//recv.event( "/smurf/fid/11/tic/4, f, f, f" ) @=> OscEvent fidRemove10;
//recv.event( "/smurf/fid/11/tic/5, f, f, f" ) @=> OscEvent fidRemove10;
//recv.event( "/smurf/fid/11/tic/6, f, f, f" ) @=> OscEvent fidRemove10;
//recv.event( "/smurf/fid/11/tic/7, f, f, f" ) @=> OscEvent fidRemove10;
//recv.event( "/smurf/fid/11/tic/8, f, f, f" ) @=> OscEvent fidRemove10;
//recv.event( "/smurf/fid/11/tic/9, f, f, f" ) @=> OscEvent fidRemove10;
//recv.event( "/smurf/fid/11/tic/10, f, f, f" ) @=> OscEvent fidRemove10;
//recv.event( "/smurf/fid/11/tic/11, f, f, f" ) @=> OscEvent fidRemove10;
//recv.event( "/smurf/fid/11/tic/12, f, f, f" ) @=> OscEvent fidRemove10;
//recv.event( "/smurf/fid/11/tic/13, f, f, f" ) @=> OscEvent fidRemove10;
//recv.event( "/smurf/fid/11/tic/14, f, f, f" ) @=> OscEvent fidRemove10;
//recv.event( "/smurf/fid/11/tic/15, f, f, f" ) @=> OscEvent fidRemove10;

recv.event( "/smurf/fid/-440/update, f, f, f, f" ) @=> OscEvent dacUpdate;
recv.event( "/smurf/fid/-440/bang, f, f, f, f" ) @=> OscEvent dacBang;

//
// Connection add event listener
//
fun void connAdd(OscEvent _connAdd) {
    while ( true )
    {
        _connAdd => now;
        while(_connAdd.nextMsg() != 0) 
        {
            _connAdd.getInt() => int from;
            _connAdd.getInt() => int to;
            _connAdd.getInt() => int status;
            <<< "got ADD connection [" + from + " -> " + to + "] from (via OSC):" >>>;

            if (to == -440) {
                handleDACConnection(from, 1);
            } else {
                handleFidConnection(from, to);
            }
        }            
    }
}

//
// Connection update OSC listener
//
fun void connUpdate(OscEvent _connUpdate) {
    while ( true )
    {
        _connUpdate => now;
        while(_connUpdate.nextMsg() != 0) 
        {
            _connUpdate.getInt() => int from;
            _connUpdate.getInt() => int to;
            _connUpdate.getInt() => int status;
            _connUpdate.getFloat() => float dist;
            <<< "got UPDATE connection [" + from + " -> " + to + " (" + dist + ")] (via OSC):" >>>;
            
            handlerConnectionUpdate(from, to, dist);
        }            
    }
}

//
// Connection remove event listener
//
fun void connRemove(OscEvent _connRemove) {
    while ( true )
    {
        _connRemove => now;
        while(_connRemove.nextMsg() != 0) 
        {
            _connRemove.getInt() => int from;
            _connRemove.getInt() => int to;
            _connRemove.getInt() => int status;
            <<< "got REMOVE connection [" + from + " -> " + to + "] from (via OSC):" >>>;
            if (to == -440) {
                handleDACConnection(from, 0);
            } else {
                handleFidDisconnection(from, to);
           }
        }            
    }
}

//
// Fiducial add event listener
//
fun void add(OscEvent _fidAdd, int _fid) {
    while ( true )
    {
        _fidAdd => now;
        while(_fidAdd.nextMsg() != 0) 
        {
            _fidAdd.getFloat() => float fX;
            _fidAdd.getFloat() => float fY;
            _fidAdd.getFloat() => float fAngle;
            <<< "got ADD fid #" + _fid + " (via OSC):" >>>;

    if(_fid == 0) {
        		fAngle => fid0.freq;
    		}
else if(_fid == 1) {
        		fAngle => fid1.freq;
    		}
else if(_fid == 2) {
        		fAngle => fid2.freq;
    		}
else if(_fid == 3) {
        		fAngle => fid3.freq;
    		}
else if(_fid == 4) {
        		fAngle => fid4.freq;
    		}
else if(_fid == 5) {
        		fAngle => fid5.freq;
    		}
else if(_fid == 6) {
        		fAngle => fid6.freq;
    		}
else if(_fid == 7) {
        		fAngle => fid7.freq;
    		}

else if(_fid == 9) {
        		fAngle => fid9.freq;
    		}
else if(_fid == 10) {
        		fAngle => fid10.freq;
    		}
else if(_fid == 11) {
        		fAngle => fid11.freq;
    		}
else if(_fid == 12) {
        		fAngle => fid12.freq;
    		}
else if(_fid == 13) {
        		fAngle => fid13.freq;
    		}
else if(_fid == 14) {
        		fAngle => fid14.freq;
    		}
else if(_fid == 15) {
        		fAngle => fid15.freq;
    		}
else if(_fid == 16) {
        		fAngle => fid16.freq;
    		}

else if(_fid == 18) {
        		fAngle => fid18.freq;
    		}
else if(_fid == 19) {
        		fAngle => fid19.freq;
    		}

        }            
    }
}

//
// Fiducial update event listener
//
fun void update(OscEvent _fidUpdate, int _fid) {
    while ( true )
    {
        _fidUpdate => now;
        while(_fidUpdate.nextMsg() != 0) 
        {
            _fidUpdate.getFloat() => float fX;
            _fidUpdate.getFloat() => float fY;
            _fidUpdate.getFloat() => float fAngle;
            _fidUpdate.getFloat() => float fLevel;
            <<< "got UPDATE fid #" + _fid + " (via OSC):" >>>;

    if(_fid == 0) {
        		setOscFreq(_fid, 500 * fAngle);
    		}
else if(_fid == 1) {
        		setOscFreq(_fid, 500 * fAngle);
    		}
else if(_fid == 2) {
        		setOscFreq(_fid, 500 * fAngle);
    		}
else if(_fid == 3) {
        		setOscFreq(_fid, 500 * fAngle);
    		}
else if(_fid == 4) {
        		setOscFreq(_fid, 500 * fAngle);
    		}
else if(_fid == 5) {
        		setOscFreq(_fid, 500 * fAngle);
    		}
else if(_fid == 6) {
        		setOscFreq(_fid, 500 * fAngle);
    		}
else if(_fid == 7) {
        		setOscFreq(_fid, 500 * fAngle);
    		}

else if(_fid == 9) {
        		setOscFreq(_fid, 500 * fAngle);
    		}
else if(_fid == 10) {
        		setOscFreq(_fid, 500 * fAngle);
    		}
else if(_fid == 11) {
        		setOscFreq(_fid, 500 * fAngle);
    		}
else if(_fid == 12) {
        		setOscFreq(_fid, 500 * fAngle);
    		}
else if(_fid == 13) {
        		setOscFreq(_fid, 500 * fAngle);
    		}
else if(_fid == 14) {
        		setOscFreq(_fid, 500 * fAngle);
    		}
else if(_fid == 15) {
        		setOscFreq(_fid, 500 * fAngle);
    		}
else if(_fid == 16) {
        		setOscFreq(_fid, 500 * fAngle);
    		}

else if(_fid == 18) {
        		setOscFreq(_fid, 500 * fAngle);
    		}
else if(_fid == 19) {
        		setOscFreq(_fid, 500 * fAngle);
    		}

            setOscGain(_fid, fLevel);
         }            
    }
}

//
// Fiducial remove event listener
//
fun void remove(OscEvent _fidRemove, int _fid) {
    while ( true )
    {
        _fidRemove => now;
        while(_fidRemove.nextMsg() != 0) 
        {
//            _fidRemove.getFloat() => float fX;
//            _fidRemove.getFloat() => float fY;
//            _fidRemove.getFloat() => float fAngle;
              <<< "got REMOVE fid #" + _fid + " (via OSC):" >>>;
//            <<< "got remove fid #0 X (via OSC):", fX >>>;
//            <<< "got remove fid #0 Y (via OSC):", fY >>>;
//            <<< "got remove fid #0 Angle (via OSC):", fAngle >>>;
            //0.0 => fiducials["fid"+_fid.id].osc.gain;
             
        }            
    }
}

//
// Fiducial bang event listener 
//
fun void bang(OscEvent _fidBang, int _fid) {
    while ( true )
    {
        _fidBang => now;
        while(_fidBang.nextMsg() != 0) 
        {
            _fidBang.getFloat() => float fX;
            _fidBang.getFloat() => float fY;
            _fidBang.getFloat() => float fAngle;
            _fidBang.getFloat() => float fLevel;
            <<< "got BANG fid #" + _fid + " (via OSC):" >>>;
    		if (_fid == 0) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }    		if (_fid == 1) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }    		if (_fid == 2) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }    		if (_fid == 3) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }    		if (_fid == 4) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }    		if (_fid == 5) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }    		if (_fid == 6) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }    		if (_fid == 7) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }    		if (_fid == 9) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }    		if (_fid == 10) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }    		if (_fid == 11) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }    		if (_fid == 12) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }    		if (_fid == 13) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }    		if (_fid == 14) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }    		if (_fid == 15) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }    		if (_fid == 16) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }    		if (_fid == 18) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }    		if (_fid == 19) {
                setOscFreq(_fid, 0.9*500 * fAngle);
            }  
            




















 
                                    
            50::ms => now;

    		if (_fid == 0) {
                setOscFreq(_fid, 500 * fAngle);
            }    		if (_fid == 1) {
                setOscFreq(_fid, 500 * fAngle);
            }    		if (_fid == 2) {
                setOscFreq(_fid, 500 * fAngle);
            }    		if (_fid == 3) {
                setOscFreq(_fid, 500 * fAngle);
            }    		if (_fid == 4) {
                setOscFreq(_fid, 500 * fAngle);
            }    		if (_fid == 5) {
                setOscFreq(_fid, 500 * fAngle);
            }    		if (_fid == 6) {
                setOscFreq(_fid, 500 * fAngle);
            }    		if (_fid == 7) {
                setOscFreq(_fid, 500 * fAngle);
            }    		if (_fid == 9) {
                setOscFreq(_fid, 500 * fAngle);
            }    		if (_fid == 10) {
                setOscFreq(_fid, 500 * fAngle);
            }    		if (_fid == 11) {
                setOscFreq(_fid, 500 * fAngle);
            }    		if (_fid == 12) {
                setOscFreq(_fid, 500 * fAngle);
            }    		if (_fid == 13) {
                setOscFreq(_fid, 500 * fAngle);
            }    		if (_fid == 14) {
                setOscFreq(_fid, 500 * fAngle);
            }    		if (_fid == 15) {
                setOscFreq(_fid, 500 * fAngle);
            }    		if (_fid == 16) {
                setOscFreq(_fid, 500 * fAngle);
            }    		if (_fid == 18) {
                setOscFreq(_fid, 500 * fAngle);
            }    		if (_fid == 19) {
                setOscFreq(_fid, 500 * fAngle);
            }  
            




















 
            
            //setOscGain(_fid, fLevel);
        }            
    }
}

//
// Fiducial bang event handler
//
fun void handleBeat(OscEvent _beat) {

}

//
// Listeners threads sporking
//

spork ~ connAdd(connAddListener);
spork ~ connUpdate(connUpdateListener);
spork ~ connRemove(connRemoveListener);

spork ~ add(fidAdd0, 0);
spork ~ update(fidUpdate0, 0);
spork ~ remove(fidRemove0, 0);
spork ~ bang(fidBang0, 0);
spork ~ computeFlux(0);

spork ~ add(fidAdd1, 1);
spork ~ update(fidUpdate1, 1);
spork ~ remove(fidRemove1, 1);
spork ~ bang(fidBang1, 1);
spork ~ computeFlux(1);

spork ~ add(fidAdd2, 2);
spork ~ update(fidUpdate2, 2);
spork ~ remove(fidRemove2, 2);
spork ~ bang(fidBang2, 2);
spork ~ computeFlux(2);

spork ~ add(fidAdd3, 3);
spork ~ update(fidUpdate3, 3);
spork ~ remove(fidRemove3, 3);
spork ~ bang(fidBang3, 3);
spork ~ computeFlux(3);

spork ~ add(fidAdd4, 4);
spork ~ update(fidUpdate4, 4);
spork ~ remove(fidRemove4, 4);
spork ~ bang(fidBang4, 4);
spork ~ computeFlux(4);

spork ~ add(fidAdd5, 5);
spork ~ update(fidUpdate5, 5);
spork ~ remove(fidRemove5, 5);
spork ~ bang(fidBang5, 5);
spork ~ computeFlux(5);

spork ~ add(fidAdd6, 6);
spork ~ update(fidUpdate6, 6);
spork ~ remove(fidRemove6, 6);
spork ~ bang(fidBang6, 6);
spork ~ computeFlux(6);

spork ~ add(fidAdd7, 7);
spork ~ update(fidUpdate7, 7);
spork ~ remove(fidRemove7, 7);
spork ~ bang(fidBang7, 7);
spork ~ computeFlux(7);

spork ~ add(fidAdd8, 8);
spork ~ update(fidUpdate8, 8);
spork ~ remove(fidRemove8, 8);
spork ~ bang(fidBang8, 8);
spork ~ computeFlux(8);

spork ~ add(fidAdd9, 9);
spork ~ update(fidUpdate9, 9);
spork ~ remove(fidRemove9, 9);
spork ~ bang(fidBang9, 9);
spork ~ computeFlux(9);

spork ~ add(fidAdd10, 10);
spork ~ update(fidUpdate10, 10);
spork ~ remove(fidRemove10, 10);
spork ~ bang(fidBang10, 10);
spork ~ computeFlux(10);

spork ~ add(fidAdd11, 11);
spork ~ update(fidUpdate11, 11);
spork ~ remove(fidRemove11, 11);
spork ~ bang(fidBang11, 11);
spork ~ computeFlux(11);

spork ~ add(fidAdd12, 12);
spork ~ update(fidUpdate12, 12);
spork ~ remove(fidRemove12, 12);
spork ~ bang(fidBang12, 12);
spork ~ computeFlux(12);

spork ~ add(fidAdd13, 13);
spork ~ update(fidUpdate13, 13);
spork ~ remove(fidRemove13, 13);
spork ~ bang(fidBang13, 13);
spork ~ computeFlux(13);

spork ~ add(fidAdd14, 14);
spork ~ update(fidUpdate14, 14);
spork ~ remove(fidRemove14, 14);
spork ~ bang(fidBang14, 14);
spork ~ computeFlux(14);

spork ~ add(fidAdd15, 15);
spork ~ update(fidUpdate15, 15);
spork ~ remove(fidRemove15, 15);
spork ~ bang(fidBang15, 15);
spork ~ computeFlux(15);

spork ~ add(fidAdd16, 16);
spork ~ update(fidUpdate16, 16);
spork ~ remove(fidRemove16, 16);
spork ~ bang(fidBang16, 16);
spork ~ computeFlux(16);

spork ~ add(fidAdd17, 17);
spork ~ update(fidUpdate17, 17);
spork ~ remove(fidRemove17, 17);
spork ~ bang(fidBang17, 17);
spork ~ computeFlux(17);

spork ~ add(fidAdd18, 18);
spork ~ update(fidUpdate18, 18);
spork ~ remove(fidRemove18, 18);
spork ~ bang(fidBang18, 18);
spork ~ computeFlux(18);

spork ~ add(fidAdd19, 19);
spork ~ update(fidUpdate19, 19);
spork ~ remove(fidRemove19, 19);
spork ~ bang(fidBang19, 19);
spork ~ computeFlux(19);

spork ~ add(fidAdd20, 20);
spork ~ update(fidUpdate20, 20);
spork ~ remove(fidRemove20, 20);
spork ~ bang(fidBang20, 20);
spork ~ computeFlux(20);

spork ~ handleBeat(beat);

spork ~ bang(dacBang, -440);
spork ~ update(dacUpdate, -440);
spork ~ computeFlux(-440);

while(true) {
    50::ms => now;
}
