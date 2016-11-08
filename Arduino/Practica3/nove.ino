int potenciometre;

void setup() {
	pinMode(8, OUTPUT);
	pinMode(9, OUTPUT);
	pinMode(10, OUTPUT);
	pinMode(11, OUTPUT);
	pinMode(12, OUTPUT);
	Serial.begin(9600);
}

void loop() {
	int potenciometre = analogRead(A0);

	if(potenciometre > 0 && potenciometre < 50){
	        digitalWrite(8, HIGH);
                digitalWrite(9, LOW);
		digitalWrite(10,LOW);
		digitalWrite(11, LOW);
		digitalWrite(12, LOW);
	}else if (potenciometre < 100){
		digitalWrite(8, HIGH);
		digitalWrite(9, HIGH);
                digitalWrite(10,LOW);
		digitalWrite(11, LOW);
		digitalWrite(12, LOW);
	}else if (potenciometre < 150){
		digitalWrite(8, HIGH);
		digitalWrite(9, HIGH);
		digitalWrite(10,HIGH);
                digitalWrite(11, LOW);
		digitalWrite(12, LOW);
	}else if (potenciometre < 200){
		digitalWrite(8, HIGH);
		digitalWrite(9, HIGH);
		digitalWrite(10,HIGH);
		digitalWrite(11, HIGH);
                digitalWrite(12, LOW);
	}else if (potenciometre < 250){
		digitalWrite(8, HIGH);
		digitalWrite(9, HIGH);
		digitalWrite(10,HIGH);
		digitalWrite(11, HIGH);
		digitalWrite(12, HIGH);
	}
}
