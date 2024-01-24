

class QuizSport(val sport: String, val antwortmoeglichkeiten: List<String>, var richtigeAntwort: String, var zeitLimit: Boolean) {
    //hier die antwortmöglichkeiten werden geschuffelt, weil in der liste, immer die erste Option die richtige Antwort ist
    //und deswegen ist die val antwortmoeglichkleiten in den Parameter keine funktion mehr hat, weil ich ihn durch gemischterAntworten ersetzt habe, damit die shuffled funktion mit ienbauen kann.
    var gemischterAntworten = antwortmoeglichkeiten.shuffled()

    fun pruefeAntwort(spielerAntwort: String): Boolean {
        return spielerAntwort.lowercase() == richtigeAntwort.lowercase()
        //hier wird die Eingabe von der Spieler mit den antwortmöglichkeiten verglichen
        //Ich habe ein neuer Wert gesetzt "spielerAntwort" und die durch == um mit der Antwort, die
        // der Spieler eingegeben hat, mit der richtigen Antwort aus der liste, zu vergleichen
    }



}
class QuizGeschichte(val geschichte: String, val richtigeAntwort: Boolean){
    fun pruefeGeschcihte(spielerGeschichte: Boolean): Boolean{
        return spielerGeschichte == richtigeAntwort
    }
}

class QuizKotlin(val kotlin: String, val antwortmoeglichkeiten: List<String>, var richtigeAntwort: String) {
    var gemischterAntworten = antwortmoeglichkeiten.shuffled()
    fun pruefeKotlin(spielerKotlin: String): Boolean {
        return spielerKotlin.lowercase() == richtigeAntwort.lowercase()

    }
}

class Spieler(var name: String, var alter: Int){
    fun spielerEingabe(): Spieler {
        val name = readln()
        println("Bitte geben sioe ihren namen ein: $name")

        if(alter < 12) {
            println("Entschuldigung, du musst älter als 12 Jahre alt")
        }else{
            println("Lass das Spiel beginnen!")
        }
        return Spieler(name, alter)
    }

}



