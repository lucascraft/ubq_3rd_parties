#include <SoftwareSerial.h>
#include <LivingColors.h>

/* 
  This example assumes
  
- A button & led module on Digital port D3
- A Rotary sensor on Analog port A1 (analog pin 2)
- Optionally a lightsensor on A5 (analog pin 1)

1. Use the button to turn the lamp on or off
2. Turn the rotary sensor to change the lamp color

IMPORTANT: To control your living colors lamp you must first determine the lamp ID assign it to the variable below */

unsigned char lamp1[9] = { 0x70, 0x3D, 0xF3, 0x3C, 0x23, 0xC8, 0x2D, 0x43, 0x11 }; // Lamp ID

#define MOSI   11    // SPI master data out pin
#define MISO   12    // SPI master data in pin
#define SCK    13    // SPI clock pin
#define CS     9    // SPI slave select pin

LivingColors livcol(CS, SCK, MOSI, MISO);

unsigned char adress[9] = { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
int red = 255;
int green = 1;
int blue = 1;
unsigned int i = 0;
boolean lampOn = false;
boolean echo = true;
unsigned int t = 0;
bool livColIsOn = true;
bool buttonPressed = false;
int prevPot = 0;
int prevLight = 0;
int pot = 0;
int lightCorrection = 0;


#define BufSize 25
char SerBuf[BufSize];

void setup()
{
  pinMode(3, INPUT);
  digitalWrite(3, HIGH);

  pinMode(4, OUTPUT);
  digitalWrite(4, HIGH);

  pinMode(10, OUTPUT);
  digitalWrite(10, HIGH);
  Serial.begin(9600);
  
    livcol.init();
    livcol.clearLamps();
    livcol.addLamp(lamp1);
    livcol.turnLampOnRGB(0, 255, 0, 0);
}

void printValues(int lc, int red, int green, int blue)
{
   Serial.print("Lightcorrection : ");
   Serial.print(lc);
   Serial.print(", Red : ");
   Serial.print(red);
   Serial.print(", Blue : ");
   Serial.print(blue);
   Serial.print(", Green : ");
   Serial.println(green);
}

void setLampOn()
{
        livcol.turnLampOnRGB(0, red, green, blue);
        digitalWrite(4, HIGH);
        livColIsOn = true;
        Serial.println("Lamp turned on");
}

void setLampOff()
{
        livcol.turnLampOff(0);
        digitalWrite(4, LOW);
        livColIsOn = false;
        Serial.println("Lamp turned off");
}

void checkButton()
{
    int buttonRead = digitalRead(3);

  if (buttonPressed && buttonRead == HIGH || !buttonPressed && buttonRead == LOW)
  {
//    Serial.println(buttonRead);
    
    if (buttonRead == LOW)
    {
      if (livColIsOn)
        setLampOff();
      else
        setLampOn();
    }
    
  if (buttonRead == HIGH)
    buttonPressed = false;
  else
    buttonPressed = true;
  
    Serial.println(livColIsOn);
  }

}

void updateColor()
{
 Serial.println("Send command");

 if (lightCorrection == 0) {lightCorrection=1;}
 
 if (pot < 128)
 {
   green = (pot*2) / lightCorrection;
   red  = 255 / lightCorrection;
   blue = 0;
   livcol.setLampColourRGB(0, red, green, blue);
 }
 else if (pot < 255)
 {
   green = 255 / lightCorrection;
   red  = (255-((pot-128)*2)) / lightCorrection;
   blue = 0;
   livcol.setLampColourRGB(0, red, green, blue);
 }
 else if (pot < 393)
 {
   green = 255 / lightCorrection;
   red  = 0;
   blue = ((pot-255)*2) / lightCorrection;
   livcol.setLampColourRGB(0, red, green, blue);
 }
 else if (pot < 512)
 {
   blue = 255 / lightCorrection;
   green  = (255-((pot-393)*2)) / lightCorrection;
   red = 0;
   livcol.setLampColourRGB(0, red, green, blue);
 }
}

void HandleLightSensor()
{
    if (lightCorrection > 2 && livColIsOn)
  {
    setLampOff();
  }
  
  if (lightCorrection < 3 && !livColIsOn)
  {
    setLampOn();
  }
}

void loop()
{
  checkButton();

  // Read sensors
  pot = analogRead(2)/2;
  lightCorrection = analogRead(1)/255;
  
  if (livColIsOn && (pot != prevPot || lightCorrection != prevLight))
  {
    updateColor();
  }
  
  prevPot = pot;
  prevLight = lightCorrection;

 delay(100);
}
