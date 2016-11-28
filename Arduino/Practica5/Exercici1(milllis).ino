const int led =  5; // el nombre del pin, hem seleccionat el 5

// La variable canviara, pero comencem amb el led apagat
int estatDelLed = LOW;

// Es recomana utilitzar "unsigned long" per variables que treballin amb temps,
// tot i que en el nostre cas, mai es passara de 300, de manera que amb "int" va be
unsigned int t1 = 0;


void setup() {
  pinMode(led, OUTPUT);
}

void loop() {

  unsigned int t2 = millis();
  if (t2 - t1 >= 300) {
    
    // guardem l'ultim cop de canvi d'estat
    t1 = t2;

    // si el led esta apagat l'encenem; si esta ences, l'apaguem
    if (estatDelLed == LOW) {
      estatDelLed = HIGH;
    } else {
      estatDelLed = LOW;
    }

    // encenem o iluminem el led
    digitalWrite(led, estatDelLed);
  }
} 
