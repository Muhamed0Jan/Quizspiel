var richtigeAntwort = 0
var gestellteFragen = 0
var punkte = 0
//weil diese drei variable für die berechnung der richtigen Fragen und dazu die prunkte für die drei funktionen habe ich die als global variable
//gesetzt, dass man die in allen funktionen mitnehmen kann
fun main() {
//mit shuffled werden zufällig aus fragen ausgegeben aber musste toList mit einbauen sonst ergibt sich ein fehler, weil die frageliste in arrayOf ist
    val sport = sport.shuffled()
    val kotlin = kotlin.shuffled()
    val geschichte = geschichte.shuffled()

    var spieler1: Spieler
    var spieler2: Spieler
    var runden: Int = 5





    println("Wählen Sie eine Kategorie für das Spiel aus:\n" +
           "1.   Programmieren\n" +
           "2.     Geschichte\n" +
            "3.       Sport \n")
    val kategorie = readln()
    val eingabe: String = kategorie

    fun pruefeEingabe():Boolean{
        return eingabe.lowercase() == kategorie.lowercase()
    }

    when(kategorie) {
        "1" -> starteQuizKotlin(kotlin)
        "2" -> starteQuizGeschichte(geschichte)
        "3" -> starteQuizSport(sport)}

    pruefeEingabe()
    print("Viel Glück!")
    println()
    println()

}

fun starteQuizKotlin(kotlin: List<QuizKotlin>) {


    for (aktuelleFrageKotlin in kotlin) {

        println(aktuelleFrageKotlin.kotlin)
        println(aktuelleFrageKotlin.gemischterAntworten)
        //der eingabe vom spieler wird mit readln gelesen und dann mit der Parameter in der if funktion
        //die antwort geprüft und vergelichen, dass das kleinGroß schreiben kein problem dargestellaber mit distanzen bleibt ein problem
        //und habe versucht dies zu beheben, aber auch mit Ki die beispiele waren mir zu kompliziert
        val kotlinSpieler = readln()

        if (aktuelleFrageKotlin.pruefeKotlin(kotlinSpieler)) {
            println("\u001B[32mRichtiger Antwort, du hast jetzt $punkte Punkte geschafft\u001B[0m")
            richtigeAntwort++
            gestellteFragen++
            punkte += 10
        } else {
            println("\u001B[31m" + "Leider Falsch, die richtige antwort ist: ${aktuelleFrageKotlin.richtigeAntwort} du hast jetzt $punkte Punkte" + "\u001B[0m")
            punkte -= 5
            gestellteFragen++
        }

        println("Das Quiz ist zu ende, du hast von $gestellteFragen Fragen $richtigeAntwort richtige Antworten, du hast jetzt $punkte Punkte geschaft!")
    }
}

fun starteQuizGeschichte(geschichte: List<QuizGeschichte>): Boolean {
    for (aktuelleFrageGeschichte in geschichte){
        println(aktuelleFrageGeschichte.geschichte)
        val geschichteSpieler = readln().toBoolean()

        if (aktuelleFrageGeschichte.pruefeGeschcihte(geschichteSpieler)) {
            println("\u001B[32m"+"Richtig!\u001B[0m")
            println()
            gestellteFragen++
            punkte +=10
        }else{
            println("\u001B[31m" + "Leider flasch!\u001B[0m")
            println()
            gestellteFragen++
            punkte += 5
        }
        aktuelleFrageGeschichte.richtigeAntwort
    }
    return false
}

fun starteQuizSport(sport: List<QuizSport>) {

//aktuelleFrageArray het kein konkrete funktion und es ist nur für die defenition im restlichen code notwendig
    for (aktuelleFrageArray in sport) {

        println(aktuelleFrageArray.sport)
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
                punkte -= 5
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

