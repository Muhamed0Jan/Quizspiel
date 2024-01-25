package Class

import java.util.*
class QuizSport(val sport: String, var antwortmoeglichkeiten: List<String>, var richtigeAntwort: String, var zeitLimit: Boolean) {
    //hier die antwortmöglichkeiten werden geschuffelt, weil in der liste, immer die erste Option die richtige Antwort ist
    //und deswegen ist die val antwortmoeglichkleiten in den Parameter keine funktion mehr hat, weil ich ihn durch gemischterAntworten ersetzt habe,
    // damit die shuffled funktion mit einbauen kann.
    var gemischterAntworten = antwortmoeglichkeiten.shuffled(random = Random())

    fun pruefeAntwort(spielerAntwort: String): Boolean {
        return spielerAntwort.lowercase() == richtigeAntwort.lowercase()
        //hier wird die Eingabe von der Spieler mit den antwortmöglichkeiten verglichen
        //Ich habe ein neuer Wert gesetzt "spielerAntwort" und die durch == um mit der Antwort, die
        // der Spieler eingegeben hat, mit der richtigen Antwort aus der liste, zu vergleichen
    }

//Dieser Joker funktion habe ich mir mit hilfe von Youtube und Ki raus implementiert, es soll die falschen antworten
    //was sie bei der Gategorie 4 antwortmöglichkeiten gibt also 3 falsch und davon sollen 2 entfernt. mit take funktion sollte es funktionieren, aber
    //bei der Ausgabe muss ich das Wort Joker zwei mal eingeben und dann taucht die richtige antwort!
    fun jokerKarte(): List<String> {
        val falscheAntworten = gemischterAntworten.filter { it != richtigeAntwort }
        val zweientfernen = falscheAntworten.take(falscheAntworten.size / 2)
        println(zweientfernen)
        return gemischterAntworten
    }

}