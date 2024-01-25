package Class

import java.util.*

class QuizKotlin(val kotlin: String, val antwortmoeglichkeiten: List<String>, var richtigeAntwort: String) {
    //Die variante antwortmöglichkeiten habe ich gemischterAntworten neu defeniert, genau wei bei dem Class QuizSport
    //ein Random zwischen den klammern könnte auch eingefügt werden.
    var gemischterAntworten = antwortmoeglichkeiten.shuffled(random = Random())
    fun pruefeKotlin(spielerKotlin: String): Boolean {
        return spielerKotlin.lowercase() == richtigeAntwort.lowercase()

    }
}
