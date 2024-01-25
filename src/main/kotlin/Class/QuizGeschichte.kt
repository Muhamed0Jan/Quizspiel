package Class

class QuizGeschichte(val geschichte: String, val richtigeAntwort: Boolean){
    fun pruefeGeschcihte(spielerGeschichte: Boolean): Boolean{
        return spielerGeschichte == richtigeAntwort
    }
}
