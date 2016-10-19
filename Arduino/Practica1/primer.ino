//Opening a led
void setup() {
  pinMode(13, OUTPUT);

}

void loop() {
  digitalWrite(13, HIGH); // HIGH = 5 Volts
  delay(1000); // delay = parada. parametre = en milisegons
  digitalWrite(13, LOW);
  delay(1000);

}
