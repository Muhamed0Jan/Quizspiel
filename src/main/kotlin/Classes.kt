class Quizfrage(val fragen: String, val antwortmoeglichkeiten: List<String>, var richtigeAntwort: String, var zeitLimit: Boolean) {
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
fun starteQuiz(fragenListe: List<Quizfrage>) {
    var richtigeAntwort = 0
    var gestellteFragen = 0
    var punkte = 0

//aktuelleFrageArray het kein konkrete funktion und es ist nur für die defenition im restlichen code notwendig
    for (aktuelleFrageArray in fragenListe) {

        println(aktuelleFrageArray.fragen)
        println(aktuelleFrageArray.gemischterAntworten)
        //der eingabe vom spieler wird mit readln gelesen und dann mit der Parameter in der if funktion
        //die antwort geprüft und vergelichen, dass das kleinGroß schreiben kein problem dargestellaber mit distanzen bleibt ein problem
        //und habe versucht dies zu beheben, aber auch mit Ki die beispiele waren mir zu kompliziert
        val spielerAntwort = readln()

            if (aktuelleFrageArray.pruefeAntwort(spielerAntwort)) {
                richtigeAntwort++

                if (aktuelleFrageArray.zeitLimit) {
                    punkte += 10
                } else {
                    punkte += 5
                }
                //ich habe es versucht eine var mit color zu defenieren wie die Dozenten erklärt haben nähmlich, dass man mit (.farbe) die farbe bestimmt
                //aber für die lesbarkeit war für mich auch schwer, deswegen habe ich mir diese methoden aus den beispielen online geholt.
                println("\u001B[32mRichtiger Antwort, du hast jetzt $punkte Punkte geschafft\u001B[0m")
                gestellteFragen++
            } else {
                println("\u001B[31m" + "Leider Falsch, die richtige antwort ist: ${aktuelleFrageArray.richtigeAntwort} du hast jetzt $punkte Punkte" + "\u001B[0m")
                gestellteFragen++
            }
    }
    println("Das Quiz ist zu ende, du hast von $gestellteFragen Fragen $richtigeAntwort richtige Antworten, du hast jetzt $punkte Punkte geschaft!")
}







//
//
//
//
//
//            }
//
//}
//
//
//class Timer (var timeOver: Long) {
//    var timer: Timer? = null
//    timeOver = 20000L
//}
//
//    fun Timer.starten(fragen: Quizfrage) {
//        timer = javax.management.timer.Timer()
//        timer?.schedule(timerTask { fragen.frageSkippen() }, timeOver)
//    }
//    fun Timer.cancelTimer(){
//        timer?.cancel()
//    }
//
//}


//fun frageSkip() {
//    val zeitDauer = Long
//    val zeitLimit = zeitDauer
//    var timer = Timer(20000).Long
//    if () {
//        println("Die Zeit ist abgelaufen. Frage wird übersprungen")
//
//
//    fun stelleFrage(quizfrage: Quizfrage) {
//    println(quizfrage.fragen)
//    println(quizfrage.gemischterAntworten.joinToString { "," })
//    return}



