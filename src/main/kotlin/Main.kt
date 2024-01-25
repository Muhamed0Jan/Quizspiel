import Class.QuizGeschichte
import Class.QuizKotlin
import Class.QuizSport

var richtigeAntwort = 0
var gestellteFragen = 0
var punkte = 0
var weiterspielen: Boolean = true

//weil diese drei variable für die berechnung der richtigen Fragen und dazu die prunkte für die drei funktionen habe ich die als global variable
//gesetzt, dass man die in allen funktionen mitnehmen kann
fun main() {
//mit shuffled werden zufällig aus fragen ausgegeben aber musste toList mit einbauen sonst ergibt sich ein fehler, weil die frageliste in arrayOf ist
    val sport = sport.shuffled()
    val kotlin = kotlin.shuffled()
    val geschichte = geschichte.shuffled()
//„QuizWith” in einer künstlerischen und Weise darzustellen.
    println("   ___   _   _   _____   _   _   _____   _   _   _____\n" +
            "  / _ \\ | | | | |_   _| | | | | /  ___| | \\ | | /  __ \\\n" +
            " / /_\\ \\| |_| |   | |   | |_| | \\ `--.  |  \\| | | /  \\/\n" +
            " |  _  ||  _  |   | |   |  _  |  `--. \\ | . ` | | |\n" +
            " | | | || | | |  _| |_  | | | | /\\__/ / | |\\  | | \\__/\\\n" +
            " \\_| |_/\\_| |_/  \\___/  \\_| |_/ \\____/  \\_| \\_/  \\____/\n" +
            "\n")

    while (weiterspielen){println("       HERZLICH WILLKOMMEN  bei QuizWith      \n"+


            "Wählen Sie eine Kategorie für das Spiel aus, " +
            "in den Kategorien gibt es sowohl Multiple-Choice als auch kategorie in dem man true or false eingeben soll:\n" +

            "1.   Programmieren\n" +
            "2.     Geschichte\n" +
            "3.       Sport \n")
        val kategorie = readln()

//    fun pruefeEingabe():Boolean{
//        return eingabe.toIntOrNull() == kategorie.toIntOrNull()
//    }

        when(kategorie) {
            "1" -> starteQuizKotlin(kotlin)
            "2" -> starteQuizGeschichte(geschichte)
            "3" -> starteQuizSport(sport)}
        print("Viel Glück!")
        println()
        println()
        println("Das Quiz ist zu ende, du hast von $gestellteFragen Fragen $richtigeAntwort richtige Antworten, du hast jetzt $punkte Punkte geschaft!")

        println("Möchten Sie weiter Spielen? antworten Sie mit ja oder nein")
        val neunSpielen = readln()
        if(neunSpielen.lowercase() != "ja")
            print(weiterspielen)
    }

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
            println("Richtiger Antwort, du hast jetzt $punkte Punkte geschafft")
            richtigeAntwort++
            gestellteFragen++
            punkte += 10
        } else {
            punkte -= 5
            println("Leider Falsch, die richtige antwort ist: ${aktuelleFrageKotlin.richtigeAntwort} du hast jetzt $punkte Punkte")
            gestellteFragen++
        }
    }
}

fun starteQuizGeschichte(geschichte: List<QuizGeschichte>): Boolean {
    for (aktuelleFrageGeschichte in geschichte) {
        println(aktuelleFrageGeschichte.geschichte)
        val geschichteSpieler = readln()
        if (geschichteSpieler == "true" || geschichteSpieler == "false") {
            if (aktuelleFrageGeschichte.pruefeGeschcihte(geschichteSpieler.toBoolean())) {
                println("\u001B[32m" + "Richtig!\u001B[0m")
                println()
                gestellteFragen++
                punkte += 10
            } else {
                println("\u001B[31m" + "Leider falsch!\u001B[0m")
                println()
                gestellteFragen++
                punkte -= 1
            }//Um zu prüfen wie man verhindert sowohl die leere Eingabe als auch andere String oder Int statt true und false,
            //habe ich mir beispiele geholt wie mann es schreibt und isEmpty püruft, ob die Eingabe leer ist prüft aber nicht die falsche eingabe.
            //Und mit length kann man die eingabe nur beschränken!
            aktuelleFrageGeschichte.richtigeAntwort
        }else if (geschichteSpieler.isEmpty())
            println("Bitte geben Sie entwerder true oder false ein! Die frage wird übersprungen und Sie haben 1 Punkt verloren")
        punkte -=1
    }
    //return true war eine Vorschlage von der Ki dass wenn die kategorie zu ende ist kommt man zum Anfang,
    //weil man mit return main() kommt man nicht direkt und wird ein fehler aufgetaucht, sodass, glaube, die schleife umgeschrieben werden soll.
    return weiterspielen
}

fun starteQuizSport(sport: List<QuizSport>) {
    var spielerAntwort = readln()
    val joker: String = "joker"
//aktuelleFrageArray het kein konkrete funktion und es ist nur für die defenition im restlichen code notwendig
    for (aktuelleFrageArray in sport) {
        println(aktuelleFrageArray.sport)
        println(aktuelleFrageArray.gemischterAntworten)
        if (spielerAntwort.lowercase() == joker) {
            aktuelleFrageArray.antwortmoeglichkeiten = aktuelleFrageArray.jokerKarte()
            println(aktuelleFrageArray.gemischterAntworten)
            spielerAntwort = readln()
        }
        //der eingabe vom spieler wird mit readln gelesen und dann mit der Parameter in der if funktion
        //die antwort geprüft und vergelichen, dass das kleinGroß schreiben kein problem dargestellaber mit distanzen bleibt ein problem
        //und habe versucht dies zu beheben, aber auch mit Ki die beispiele waren mir zu kompliziert
        if (aktuelleFrageArray.pruefeAntwort(spielerAntwort)) {
            richtigeAntwort++
            //if (aktuelleFrageArray.zeitLimit) {
            punkte += 10
            println("\u001B[32mRichtiger Antwort, du hast jetzt $punkte Punkte geschafft\u001B[0m")
            gestellteFragen++
        } else {
            punkte -= 3
            println("\u001B[31m" + "Leider Falsch, die richtige antwort ist: ${aktuelleFrageArray.richtigeAntwort} du hast jetzt $punkte Punkte" + "\u001B[0m")
            gestellteFragen++

            //ich habe es versucht eine var mit color zu defenieren wie die Dozenten erklärt haben nähmlich, dass man mit (.farbe) die farbe bestimmt
            //aber für die lesbarkeit war für mich auch schwer, deswegen habe ich mir diese methoden aus den beispielen online geholt.
        }
    }
    println("Das Quiz ist zu ende, du hast von $gestellteFragen Fragen $richtigeAntwort richtige Antworten, du hast jetzt $punkte Punkte geschaft!")
    return main()
}

/*
Generell habe ich mir viele Online recherche gemacht, weil ich immer zurückmusste zu den Tabellen,
ich habe es mir gemerkt wenn man sich auf die lösungen von Ki verlässt funktioniert letztendlich das gesamte code gar nicht,
Es fehlt nach den anforderungen noch zwei Spieler zu definieren. und ein Joker richtig mit einzubauen.
die Funktion farbe habe ich mir raus genommen weil zuwenig text gibt in der main funktion aber würde das noch ausbauen,
sodass die Schriftgröße und unterschiedliche Farben für die jeweiligen Kategorien festlegen.
Und dass die Punkte für die einzelnen Kategorien extra berechnet werden, und zum schluss eine Tabelle ausgegeben wird.
im Readme sind auch für das Spiel andere anforderungen definiert, aber bin ich die nicht gänzlich nachgegangen. und weichen davon ab.
*/

