char a;
boolean estat = false;

void setup() {
	pinMode (8,OUTPUT);
	Serial.begin(9600);
}

void loop() {
	if(Serial.available()>0){
		a = Serial.read();
		Serial.println(a);
		if (a == 'A'){
			if (estat == false){
				digitalWrite(8,HIGH);
				estat = true;
				Serial.println("ences");
			}else if(estat == true){
				digitalWrite(8,LOW);
				estat = false;
				Serial.println("apagat");
			}
		}
	}
}
