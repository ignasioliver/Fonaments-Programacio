//Opening three LEDs
void setup() {
  pinMode(2, OUTPUT);
  pinMode(3, OUTPUT);
  pinMode(4, OUTPUT);
}

void loop() {
  digitalWrite(2, HIGH); // HIGH = 5 Volts
  delay(1000); // delay = parada. parametre = en milisegons
  digitalWrite(2, LOW);

  digitalWrite(3, HIGH); // HIGH = 5 Volts
  delay(200); // delay = parada. parametre = en milisegons
  digitalWrite(3, LOW);

  digitalWrite(4, HIGH); // HIGH = 5 Volts
  delay(500); // delay = parada. parametre = en milisegons
  digitalWrite(4, LOW);
}
