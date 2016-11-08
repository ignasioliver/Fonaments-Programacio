char a = 0, b = 0;
char x;

void setup() {
pinMode(8, INPUT);
pinMode(9, OUTPUT);
pinMode(10, INPUT);
Serial.begin(9600);
}

void loop() {
//x = Serial.read();

if(digitalRead(8) == HIGH){
	a = 1;
	Serial.println(a);
	Serial.println(b);
}
// Perquè es mantingui encès farem un while
while (a == 1){
	digitalWrite(9, HIGH);

if(digitalRead(10) == HIGH){
	a = 0;
	Serial.println(a);
	Serial.println(b);
}
// Un altre while perquè es mantingui apagat
while (a == 0){
digitalWrite(9,LOW);
}
}
}
