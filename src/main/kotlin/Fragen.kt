
val fragen = listOf(
        Quizfrage(
            "Welche Verein hat die Saison 2020-2021 Bundesliga gewonnen?",
            listOf("Bayern München", "Borussia Dortmund", "RB Leipzig"), "Bayern München", false
        ),
        Quizfrage(
            "Wer ist der Ewige Torschützkönig der Bundesliga-Geschcihte?",
            listOf("Gerd Müller", "Robert Lewandowski", "Klaus Fischer"), "Gerd Müller", false
        ),
        Quizfrage(
            "Welcher Verein hat die meisten Bundesliga Titel gewonnen?",
            listOf("Bayern München", "Borussia Dortmund", "Bayern Leverkusen"), "Bayern München", false
        ),
        Quizfrage(
            "Wer ist der derzeitige Trainer von bayern München?",
            listOf("Hans Dieter Flick", "Julian Nagelsmann", "Jürgen Klopp"), "Hans Dieter Flick", false
        ),
        Quizfrage(
            "Welcher Verein wurde in der saison 2020-2021 aus der Bundesliga abgestiegen?",
            listOf("Schalke 04", "Werder Bremen", "FC Köln"), "Schalke 04", false
        ),
        Quizfrage(
            "Welcher Verin hat den DFB-Pokal 2021 gewonnen?",
            listOf("Borussia Dortmund", "RB Leipzig", "Bayern München"), "Borussia Dortmund", false
        ),
        Quizfrage(
            "Welcher Verein hat die meisten Siege in der Bundesliga Geschichte?",
            listOf("Bayern München", "Borussia Dortmund", "Bayer Leverkusen"), "Bayern München", false
        ),
        Quizfrage(
            "Wer ist der derzeitige Kapitan von Borussia Dortmund?",
            listOf("Marco Reus", "Mats Hummels", "Emre Can"), "Marco Reus", false),
        Quizfrage(
            "Welcher Verein hat die längsten Sieg liste in der Bundesliga Geschichte?",
            listOf("Bayern München", "Borussia Dortmund", "Hamburger SV"), "Bayern München", false
        ),
        Quizfrage(
            "Wer ist der jüngste Spieler, der ein Tor in der Bundesliga erzielt hat?",
            listOf("Youssoufa Moukoko", "Nuri Sahin", "Kai Havertz"), "Youssoufa Moukoko", false
        )
)

    //Zweite kategorie
//        Quizfrage(
//            "Wie heißt die Entwicklungsmethode, die von JetBrains für kotlin empfohlen wird?",
//            listOf("Eclips", "IntelliJ", "NetBeans"), "IntelliJ", true
//        ),
//        Quizfrage(
//            "Wie kann man in Kotlin eine Liste von Zahlen sortieren?",
//            listOf("Mit der Funktion: sort()", "sorted()", "order()"), "sorted()", true,
//        ),
//        Quizfrage(
//            "Wie kann man in Kotlin eine bedienung schreiben?",
//            listOf("mit if..else", "if...then...else", "if...elif...else"), "mit if..else", true
//        ),
//        Quizfrage(
//            "Was ist der Hauptvorteil von Kotlin gegenüber Java?",
//            listOf("Kürzerer und sauberer Code", "Bessere Performance", "Mehr Bibliotheken"), "Kürzerer und sauberer Code", true),
//        Quizfrage(
//            "Wie deklariert man eine Variable in Kotlin?",
//            listOf("val oder var", "let oder const", "int oder String"), "val oder var", true),
//        Quizfrage(
//            "Was ist der Hauptvorteil von Kotlin gegenüber Java?",
//            listOf("Kürzerer und sauberer Code", "Bessere Performance", "Mehr Bibliotheken"),
//            "Kürzerer und sauberer Code",
//            true
//        ),
//        Quizfrage(
//            "Wie deklariert man eine Variable in Kotlin?",
//            listOf("val oder var", "let oder const", "int oder String"),
//            "val oder var",
//            true
//        ),
//        Quizfrage(
//            "Wie erstellt man eine Liste in Kotlin?",
//            listOf("listOf()", "List()", "new List()"),
//            "listOf()",
//            true
//        ),
//        Quizfrage(
//            "Wie kann man in Kotlin eine Funktion definieren?",
//            listOf("fun", "function", "def"),
//            "fun",
//            true
//        ),
//        Quizfrage(
//            "Wie lautet der Befehl zum Ausgeben einer Zeichenkette in Kotlin?",
//            listOf("println()", "print()", "console.log()"),
//            "println()",
//            true
//        ),
//        Quizfrage(
//            "Wie wird in Kotlin eine Klasse erstellt?",
//            listOf("class", "Class", "new Class"),
//            "class",
//            true
//        ),
//        Quizfrage(
//            "Wie wird in Kotlin eine bedingte Anweisung geschrieben?",
//            listOf("if", "when", "switch"),
//            "if",
//            true
//        ),
//        Quizfrage(
//            "Wie wird in Kotlin eine Schleife geschrieben?",
//            listOf("for", "while", "loop"),
//            "for",
//            true
//        ),
//        Quizfrage(
//            "Wie wird in Kotlin ein Array erstellt?",
//            listOf("arrayOf()", "Array()", "new Array()"),
//            "arrayOf()",
//            true
//        ),
//        Quizfrage(
//            "Wie wird in Kotlin ein Nullwert zugewiesen?",
//            listOf("null", "None", "nil"),
//            "null",
//            true
//        ),
//        Quizfrage(
//            "Wie wird in Kotlin eine Ausnahme behandelt?",
//            listOf("try/catch", "throw", "error"),
//            "try/catch",
//            true
//        ),
//        Quizfrage(
//            "Wie wird in Kotlin ein Datenobjekt erstellt?",
//            listOf("data class", "class", "new class"),
//            "data class",
//            true
//        ),
//        Quizfrage(
//            "Wie wird in Kotlin eine abstrakte Klasse definiert?",
//            listOf("abstract class", "class", "new class"),
//            "abstract class",
//            true
//        ),
//        Quizfrage(
//            "Wie wird in Kotlin eine Schnittstelle definiert?",
//            listOf("interface", "class", "new class"),
//            "interface",
//            true
//        ),
//        Quizfrage(
//            "Wie wird in Kotlin ein Lambda-Ausdruck geschrieben?",
//            listOf("{}","()","[]"),
//            "{}",
//            true
//        ),
//    Quizfrage(
//        "Wie deklariert man in Kotlin eine unveränderliche Variable?",
//        listOf("var", "val", "const"),
//        "val",
//        true
//    ),
//    Quizfrage(
//        "Wie deklariert man in Kotlin eine veränderliche Variable?",
//        listOf("var", "val", "const"),
//        "var",
//        true
//    ),
//    Quizfrage("Wie erstellt man in Kotlin ein Array?",
//        listOf("arrayOf()", "Array()", "ArrayList()"),
//        "arrayOf()",
//        true
//    ),
//    Quizfrage(
//        "Wie wird in Kotlin eine if-Anweisung geschrieben?",
//        listOf("if (Bedingung) {}", "if Bedingung: {}", "if: Bedingung {}"),
//        "if (Bedingung) {}",
//        true
//    ),
//    Quizfrage(
//        "Wie wird in Kotlin eine Schleife geschrieben?",
//        listOf("for (i in range) {}", "for i in range: {}", "for: i in range {}"),
//        "for (i in range) {}",
//        true
//    ),
//    Quizfrage(
//        "Wie wird in Kotlin eine if-Anweisung geschrieben?",
//        listOf("if (Bedingung) {}", "if Bedingung: {}", "if: Bedingung {}"),
//        "if (Bedingung) {}",
//        true
//    ),
//
//
//
//
//