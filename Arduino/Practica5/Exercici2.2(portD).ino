void setup() {
  
  DDRD = B11111100;
}

void loop() {

  PORTD = B00000100;
  delay(500);
  PORTD = B00001000;
  delay(500);
  PORTD = B00010000;
  delay(500);
  PORTD = B00100000;
  delay(500);
  PORTD = B01000000;
  delay(500);
  PORTD = B10000000;
  delay(500);

}