fun main() {
    
    //Declarando variáveis
    val nota1 = 5.0
    val nota2 = 5.0
    val nota3 = 5.0

    val media = (nota1 + nota2 + nota3) / 3
    val mediaFormatada = String.format("%.2f", media)

    
    println("A media das notas e: $mediaFormatada")
}

