import Class.QuizGeschichte
import Class.QuizKotlin
import Class.QuizSport

val sport = listOf(
    QuizSport(
        "Welche Verein hat die Saison 2020-2021 Bundesliga gewonnen?",
        listOf("   Bayern München   " +
                "  Borussia Dortmund  " +
                "  RB Leipzig  " +
                "  Stuttgart SV "
        ), "Bayern München", false
    ),
    QuizSport(
        "Wer ist der Ewige Torschutzkönig der Bundesliga-Geschichte?",
        listOf("    Gerd Müller   " +
                "   Robert Lewandowski  " +
                "  Klaus Fischer  " +
                "   Bernard Hobs  "
        ), "Gerd Müller", false
    ),
    QuizSport(
        "Welcher Verein hat die meisten Bundesliga Titel gewonnen?",
        listOf("   Bayern München  " +
                "  Borussia Dortmund" +
                "  Bayern Leverkusen " +
                "   Hamburger SV   "
        ), "Bayern München", false
    ),
    QuizSport(
        "Wer ist der derzeitige Trainer von bayern München?",
        listOf("   Hans Dieter Flick  " +
                "  Julian Nagelsmann  " +
                "  Jürgen Klopp   " +
                " Mark Dehner  "
        ), "Hans Dieter Flick", false
    ),
    QuizSport(
        "Welcher Verein wurde in der saison 2020-2021 aus der Bundesliga abgestiegen?",
        listOf("   Schalke 04   " +
                "  Werder Bremen   " +
                "  FC Köln   " +
                "  Hans Klöster  "
        ), "Schalke 04", false
    ),
    QuizSport(
        "Welcher Verin hat den DFB-Pokal 2021 gewonnen?",
        listOf("  Borussia Dortmund  " +
                "  RB Leipzig  " +
                "  Bayern München  " +
                "  Bayern Leverkusen  "
        ), "Borussia Dortmund", false
    ),
    QuizSport(
        "Welcher Verein hat die meisten Siege in der Bundesliga Geschichte?",
        listOf("  Bayern München  " +
                "  Borussia Dortmund  " +
                "  Bayer Leverkusen  " +
                " FC Erfurt "
        ), "Bayern München", false
    ),
    QuizSport(
        "Wer ist der derzeitige Kapitan von Borussia Dortmund?",
        listOf( "  Marco Reus  " +
                "  Mats Hummels  " +
                "  Emre Can  " +
                "   Jürgen Hohlmann "), "Marco Reus", false),
    QuizSport(
        "Welcher Verein hat die längsten Sieg liste in der Bundesliga Geschichte?",
        listOf("  Bayern München  " +
                "  Borussia Dortmund  " +
                "  Hamburger SV  " +
                " VfB Stuttgart "), "Bayern München", false
    ),
    QuizSport(
        "Wer ist der jüngste Spieler, der ein Tor in der Bundesliga erzielt hat?",
        listOf("  Youssoufa Moukoko  " +
                "  Nuri Sahin  " +
                "  Nathan Kriotores " +
                "  Kai Havertz  "), "Youssoufa Moukoko", false
    )
)
val kotlin = listOf(
    QuizKotlin(
        "Wie heißt die Entwicklungsmethode, die von JetBrains für kotlin empfohlen wird?",
        listOf( "  Eclips  " +
                "  IntelliJ  " +
                "  NetBeans  " +
                "  Java Brain  "
        ), "IntelliJ"
    ),
    QuizKotlin(
        "Wie kann man in Kotlin eine Liste von Zahlen sortieren?",
        listOf("  Mit der Funktion: sort()  " +
                "  sorted()  " +
                "  order()  " +
                "  Oder sorted {}  "
        ), "sorted()"
    ),
    QuizKotlin(
        "Wie kann man in Kotlin eine bedienung schreiben?",
        listOf("  mit if..else  " +
                "  if...then...else  " +
                "  if...elif...else  " +
                "  if...do...else  "
        ), "mit if..else"
    ),
    QuizKotlin("Was ist der Hauptvorteil von Kotlin gegenüber Java?",
        listOf("  Kürzerer und sauberer Code  " +
                "  Bessere Performance  " +
                "  Mehr Bibliotheken  " +
                "  Bessere Lesbarkeit  "
        ), "Kürzerer und sauberer Code"
    ),
    QuizKotlin("Wie deklariert man eine Variable in Kotlin?",
        listOf("  val oder var  " +
                "  let oder const  " +
                "  int oder String  " +
                "  fun oder class  "
        ), "val oder var"
    ),
    QuizKotlin(
        "Was ist der Hauptvorteil von Kotlin gegenüber Java?",
        listOf("  Kürzerer und sauberer Code  " +
                "  Bessere Performance  " +
                "  Mehr Bibliotheken  " +
                "   Mehr classes  "
        ),
        "Kürzerer und sauberer Code"
    ),
    QuizKotlin(
        "Wie erstellt man eine Liste in Kotlin?",
        listOf("  listOf()  " + "  List()  " + "  new List()  "),
        "listOf()"
    ),
    QuizKotlin(
        "Wie kann man in Kotlin eine Funktion definieren?",
        listOf("  fun  " + "  function  " + "  def  "),
        "fun"
    ),
    QuizKotlin(
        "Wie lautet der Befehl zum Ausgeben einer Zeichenkette in Kotlin?",
        listOf("  println()  " + "  print()  " + "  console.log()  "),
        "println()"
    ),
    QuizKotlin(
        "Wie wird in Kotlin eine Klasse erstellt?",
        listOf("  class  " + "  Class  " + "  new Class  "),
        "class"
    ),
    QuizKotlin(
        "Wie wird in Kotlin eine bedingte Anweisung geschrieben?",
        listOf("  if  " + "  when  " + "  switch  "),
        "if"
    )
)

val geschichte = listOf(
    QuizGeschichte(
        "War Karl der Große der erste Kaiser des Heiligen Römischen Reiches?",
        true
    ),
    QuizGeschichte(
        "Fand die Französische Revolution im 18. Jahrhundert statt?",
        false
    ),
    QuizGeschichte(
        "War Napoleon Bonaparte ein britischer General?",
        false
    ),
    QuizGeschichte(
        "War der Erste Weltkrieg von 1914 bis 1918?",
        true
    ),
    QuizGeschichte(
        "War Alexander der Große ein ägyptischer Pharao?",
        false
    ),
    QuizGeschichte(
        "War Julius Caesar der erste römische Kaiser?",
        false
    ),
    QuizGeschichte(
        "War die Berliner Mauer bis 1989 intakt?",
        true
    ),
    QuizGeschichte(
        "War Otto von Bismarck ein US-Präsident?",
        false
    ),
    QuizGeschichte(
        "War die Renaissance eine Periode des kulturellen Aufschwungs in Europa?",
        false
    ),
    QuizGeschichte(
        "War Leonardo da Vinci ein bekannter Wissenschaftler während der Aufklärung?",
        true
    ),
    QuizGeschichte(
        "War die Magna Carta ein wichtiges Dokument in der Geschichte Englands?",
        true
    )
)