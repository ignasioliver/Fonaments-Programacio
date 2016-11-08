// Entrada analogica a la que esta connectada el potenciometre
// Com que el seu valor no canviara, el fem constant
const int potenciometre = A0;
// Entrada analogica a la que esta connectada el led
const int led = A5;

int valorin = 0; // value read from the pot
int valorsortida = 0; // value output to the PWM (analog out)

void setup() {
    // initialize serial communications at 9600 bps:
    Serial.begin(9600);
    //pinMode(led, OUTPUT); No cal ja que es analogic
}

void loop() {
    // llegim el valor analogic del potenciometre
    valorin = analogRead(potenciometre);
    // ho mapegem al rang demanat
    valorsortida = map(valorin, 0, 1023, 0, 255);
    // canviem el valor de la sortida analogica
    analogWrite(led, valorsortida);
    
    // imprimim els resultats al monitor en serie
    Serial.print("Valor del sensor = " );
    Serial.print(valorin);
    Serial.print("\t Valor de sortida = ");
    Serial.println(valorsortida);
    
    // esperem els 100 ms requerits:
    delay(100);
}