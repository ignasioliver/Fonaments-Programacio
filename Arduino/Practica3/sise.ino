char a,b,c;
int x = 0;
boolean estata = false,estatb = false,estatc = false;

void setup() {

pinMode (8,OUTPUT);
pinMode (9,OUTPUT);
pinMode (10,OUTPUT);

Serial.begin(9600);
}

void loop() {
	
	a = Serial.read();

if((a == 'A') && (estata == false)){
	Serial.print("Estat actual: A");
	digitalWrite(8, HIGH);
	digitalWrite(9, HIGH);
	digitalWrite(10, HIGH);
	estatb=false;
	estatc=false;
}

else if((a == 'B')&&(estatb == false)){
	Serial.print("Estat actual: B");
		if (a != 'B') x = 1;
	digitalWrite(8, HIGH);
		delay(1000);
	digitalWrite(9, HIGH);
		delay(1000);
	digitalWrite(10, HIGH);
		delay(1000);
	digitalWrite(8, LOW);
		delay(1000);
	digitalWrite(9, LOW);
		delay(1000);
	digitalWrite(10, LOW);
		delay(1000);

}
else if((a == 'C')&&(estatc == false)){
	digitalWrite(8 ,LOW);
	digitalWrite(9, LOW);
	digitalWrite(10, LOW);
	estata = false;
	estatb = false;
	Serial.print("Estat actual: C");
}

}
