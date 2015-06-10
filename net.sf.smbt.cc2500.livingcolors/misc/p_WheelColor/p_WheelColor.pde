/**
 * Subtractive Color Wheel 
 * by Ira Greenberg. 
 * 
 * The primaries are red, yellow, and blue. The
 * secondaries are green, purple, and orange. The 
 * tertiaries are  yellow-orange, red-orange, red-purple, 
 * blue-purple, blue-green, and yellow-green.
 * 
 * Create a shade or tint of the 
 * subtractive color wheel using
 * SHADE or TINT parameters.
 */

import processing.serial.*;

Serial port;
CLiCo myLiCo;

int segs = 12;
int steps = 12;
float rotAdjust = radians(360.0/segs/2.0);
float radius = 380.0;
float segWidth = radius/steps;
float interval = TWO_PI/segs;
int SHADE = 0;
int TINT = 1;

void setup(){
  size(400, 400);
  background(127);
  smooth();
//  ellipseMode(CENTER_RADIUS);
  noStroke();
 // you can substitue TINT for SHADE argument
 createWheel(width/2, height/2, SHADE);
 // Uses the first port in this list (number 0).  Change this to
  // select the port corresponding to your Arduino board.  The last
  // parameter (e.g. 9600) is the speed of the communication.  It
  // has to correspond to the value passed to Serial.begin() in your
  // Arduino sketch.
  port = new Serial(this, Serial.list()[3], 9600);  
 
  // If you know the name of the port used by the Arduino board, you
  // can specify it directly like this.
  //port = new Serial(this, "COM1", 9600);

  myLiCo = new CLiCo(port);
  println("Resync");
  myLiCo.resync();
  while (!myLiCo.canSend())
  {
    delay(1000);
  }

  myLiCo.setState(0,true,10,10,10);
  myLiCo.setState(1,true,10,10,10);

  while (!myLiCo.allDone())
  {
    myLiCo.work();
    delay(100);
  }    
}

void draw() {
  color cp = get(mouseX,mouseY);
  int a = (cp >> 24) & 0xFF;
  int r = (cp >> 16) & 0xFF;  // Faster way of getting red(argb)
  int g = (cp >> 8) & 0xFF;   // Faster way of getting green(argb)
  int b = cp & 0xFF;          // Faster way of getting blue(argb)
  myLiCo.setState(0,true,r,g,b);
  myLiCo.work();
  myLiCo.setState(1,true,r,g,b);
  myLiCo.work();  
}

void createWheel(int x, int y, int valueShift){
  if (valueShift == SHADE){
    for (int j=0; j<steps; j++){
      color[]cols = { 
        color(255-(255/steps)*j, 255-(255/steps)*j, 0), 
        color(255-(255/steps)*j, (255/1.5)-((255/1.5)/steps)*j, 0), 
        color(255-(255/steps)*j, (255/2)-((255/2)/steps)*j, 0), 
        color(255-(255/steps)*j, (255/2.5)-((255/2.5)/steps)*j, 0), 
        color(255-(255/steps)*j, 0, 0), 
        color(255-(255/steps)*j, 0, (255/2)-((255/2)/steps)*j), 
        color(255-(255/steps)*j, 0, 255-(255/steps)*j), 
        color((255/2)-((255/2)/steps)*j, 0, 255-(255/steps)*j), 
        color(0, 0, 255-(255/steps)*j),
        color(0, 255-(255/steps)*j, (255/2.5)-((255/2.5)/steps)*j), 
        color(0, 255-(255/steps)*j, 0), 
        color((255/2)-((255/2)/steps)*j, 255-(255/steps)*j, 0) };
      for (int i=0; i< segs; i++){
        fill(cols[i]);
        arc(x, y, radius, radius, interval*i+rotAdjust, interval*(i+1)+rotAdjust);
      }
      radius -= segWidth;
    }
  } else  if (valueShift == TINT){
    for (int j=0; j<steps; j++){
      color[]cols = { 
        color((255/steps)*j, (255/steps)*j, 0), 
        color((255/steps)*j, ((255/1.5)/steps)*j, 0), 
        color((255/steps)*j, ((255/2)/steps)*j, 0), 
        color((255/steps)*j, ((255/2.5)/steps)*j, 0), 
        color((255/steps)*j, 0, 0), 
        color((255/steps)*j, 0, ((255/2)/steps)*j), 
        color((255/steps)*j, 0, (255/steps)*j), 
        color(((255/2)/steps)*j, 0, (255/steps)*j), 
        color(0, 0, (255/steps)*j),
        color(0, (255/steps)*j, ((255/2.5)/steps)*j), 
        color(0, (255/steps)*j, 0), 
        color(((255/2)/steps)*j, (255/steps)*j, 0) };
      for (int i=0; i< segs; i++){
        fill(cols[i]);
        arc(x, y, radius, radius, interval*i+rotAdjust, interval*(i+1)+rotAdjust);
      }
      radius -= segWidth;
    }
  } 
}

class CLiCo {
  private class CState
  {
    int iLamp;
    boolean bEmpty;
    boolean bRGB;
    int iRH;
    int iGS;
    int iBI;
  }

  int SLOTS = 10;

  CState[] statesqueue;

  int iCurrentSlot = 0;
  boolean bCanSend = false;
  int iLastSync;
  Serial port;

  CLiCo(Serial aPort)
  {
    statesqueue = new CState[SLOTS];    
    port = aPort;
  }

  public boolean canSend()
  {
    boolean CanSend = false;
    while (port.available() > 0)
    {
      int iTmp = port.read();
      print(char(iTmp));
      if (char(iTmp) == '!')
      {
        print('*');
        CanSend = true;
        iLastSync = millis();
      }
    }
    return CanSend;
  }

  public void resync()
  {
    print("-R-");
    send("?");
    iLastSync = millis();
    bCanSend = false;
  }

  public void send(String sSend)
  {
    println(sSend);
    port.write(sSend + "\r\n");
    bCanSend = false;
  }

  private void sendState(CState aState)
  {
    if (!(aState.bEmpty))
    {
      aState.bEmpty = true;
      if (aState.bRGB)
      {
        print('s');
        send("w"+nf(aState.iLamp,1)+"-"+nf(aState.iRH,3)+"-"+nf(aState.iGS,3)+"-"+nf(aState.iBI,3));
      }
      else
      {
        print('s');        
        send("h"+nf(aState.iLamp,1)+"-"+nf(aState.iRH,3)+"-"+nf(aState.iGS,3)+"-"+nf(aState.iBI,3));
      }
    }
  }

  public void setState(int iLamp, boolean bRGB,int iRH, int iGS, int iBI )
  {
    if (statesqueue[iLamp] == null) statesqueue[iLamp] = new CState();
    statesqueue[iLamp].iLamp = iLamp;
    statesqueue[iLamp].bEmpty = false;
    statesqueue[iLamp].bRGB = bRGB;
    statesqueue[iLamp].iRH = iRH;
    statesqueue[iLamp].iGS = iGS;
    statesqueue[iLamp].iBI = iBI;
  }

  public boolean allDone()
  {
    boolean bAllDone = true;
    for(int iSlot = 0; iSlot < SLOTS; iSlot++)
    { 
      if (statesqueue[iSlot] != null)
        if (!statesqueue[iSlot].bEmpty) bAllDone = false;
    }
    return bAllDone; 
  }

  public void work()
  {
    if (!bCanSend)
    {
      bCanSend = canSend();
    }
    if (bCanSend)
    {
      if (statesqueue[iCurrentSlot]!=null)
        if (!statesqueue[iCurrentSlot].bEmpty)
        {
          sendState(statesqueue[iCurrentSlot]);
        }
      iCurrentSlot++;
      if (iCurrentSlot>=SLOTS) iCurrentSlot=0;
    }
    else
    {
      if ((millis() - iLastSync) > 3000)
        resync();
    }
  } 
}

