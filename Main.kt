fun main(){
    println("Simulador de Animal de Estimação Virtual")
    println("===========Bem-vindo===========")


    print("Digite o nome do seu pet: ")
    val nomePet = readln()
    val pet = BichinhoVirtual(nomePet)

    while (true) {
        println("Escolha uma ação: ")
        println("1. Alimentar $nomePet")
        println("2. Brincar com $nomePet")
        println("3. Descansar com $nomePet")
        println("4. Verficar o status de $nomePet")
        println("5. Sair")

        val escolha = readln().toIntOrNull() ?: continue

        when (escolha) {
            1 -> pet.alimentar()
            2 -> pet.brincar()
            3 -> {
                print("Por quantas horas $nomePet vai descansar (1 a 8)? ")
                val horas = readln().toIntOrNull()
                if (horas == null || horas <= 0) {
                    println("Valor inválido!")
                    continue
            }
                pet.descansar(horas)
            }
            4 -> pet.verificarStatus()
            5 -> {
                println("Saindo do simulador de Animal de Estimação Virtual. Adeus!")
                return
            }
            else -> println("Escolha invalida!. Tente novamente!")
        }
        pet.passarTempo()
    }
}