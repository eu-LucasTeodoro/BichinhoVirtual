class BichinhoVirtual(val nome: String) {

    var nivelDeFome = 30
    var nivelFelicidade = 60
    var nivelcansaco = 20
    var nivelBanheiro = 0
    var nivelSujeira = 0
    var idade = 10

    fun alimentar(){
        nivelDeFome = (nivelDeFome - 20).coerceIn(0, 100)
        nivelBanheiro = (nivelBanheiro + 15).coerceIn(0, 100)
        println("$nome comeu! 🍖")

    }
    fun brincar(){
        nivelFelicidade = (nivelFelicidade + 15).coerceIn(0, 100)
        nivelcansaco = (nivelcansaco + 15).coerceIn(0, 100)
        nivelSujeira = (nivelSujeira + 15).coerceIn(0, 100)
        println("$nome brincou! 🎾")
    }
    fun descansar(horas: Int){
        val h = horas.coerceAtMost(8)
        nivelcansaco = (nivelcansaco - (100 * h / 8)).coerceIn(0, 100)
        println("$nome descansou por $h hora(s). 😴")
    }
    fun verificarStatus(){
        println("----- Status -----")
        println("Nome: $nome")
        println("Fome: $nivelDeFome")
        println("Felicidade: $nivelFelicidade")
        println("Cansaço: $nivelcansaco")
        println("Banheiro: $nivelBanheiro")
        println("Sujeira: $nivelSujeira")
        println("Idade: $idade")
        println("------------------")
    }
    fun passarTempo(){
        nivelDeFome = (nivelDeFome + 3).coerceIn(0, 100)
        nivelFelicidade = (nivelFelicidade - 3).coerceIn(0, 100)
        nivelcansaco = (nivelcansaco + 10).coerceIn(0, 100)
        idade += 1
    }
    fun perdeu(): Boolean =
        nivelDeFome >= 100 || nivelcansaco >= 100 || nivelFelicidade <= 0 ||
                nivelBanheiro >= 100 || nivelSujeira >= 100

    fun motivoDerrota(): String = when {
        nivelDeFome >= 100 -> "fome demais"
        nivelcansaco >= 100 -> "cansaço demais"
        nivelFelicidade <= 0 -> "infelicidade"
        nivelBanheiro >= 100 -> "não aguentou a vontade de ir ao banheiro"
        nivelSujeira >= 100 -> "sujeira demais"
        else -> ""
    }

    fun venceu(): Boolean = idade >= 50
}




