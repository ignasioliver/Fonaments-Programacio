void setup() {
pinMode(8, INPUT);
}

void loop() {
  
if((digitalRead(8)==HIGH)){
  digitalWrite(8,HIGH);
}
}
