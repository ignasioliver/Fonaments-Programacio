void setup() {
  pinMode(12, INPUT);
  
}

void loop() {
  digitalWrite (12, LOW);

  if (digitalRead(12)){
    digitalWrite (12, HIGH);
  }
}
