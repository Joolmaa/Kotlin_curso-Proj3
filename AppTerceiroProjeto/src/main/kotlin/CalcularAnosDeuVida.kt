fun main() {

    var anoDeNascimento = 1978
    var anoAtual = 2021
    var nomeDaPessoa = "José Luiz"
    var melhorAmiga = "Raafaela"
     var resultadoDoCalculo = calcularAnosDeVida(anoDeNascimento,anoAtual)
     imprimirResultados(anoDeNascimento,anoAtual,nomeDaPessoa, resultadoDoCalculo)

    print("Como calcular quantos anos de vida uma pessoa tem?: \n\n")
    print("Ano de Nascimento: $anoDeNascimento\n")
    print("Ano Atual...: $anoAtual\n")
    print("Resutado...: ${calcularAnosDeVida(anoDeNascimento, anoAtual)}\n")
    print("$nomeDaPessoa tem ${calcularAnosDeVida(anoDeNascimento, anoAtual)} anos de vida e sua melhor amiga/o é o/a $melhorAmiga")
}

fun calcularAnosDeVida(anoDeNascimento: Int, anoAtual: Int): Int {

    var anosDeVida = anoAtual - anoDeNascimento

    return anosDeVida

}

fun imprimirResultados(
     anoDeNascimento: Int,
     anoAtual: Int, nomeDaPessoa: String, resultadoDoCalculo: Int
){

    print("Como calcular quantos anos de vida uma pessoa tem?: \n\n")
    print("Ano de Nascimento: $anoDeNascimento\n")
    print("Ano Atual...: $anoAtual\n")
    print("Resutado...: ${(resultadoDoCalculo)}\n")
    print("$nomeDaPessoa você tem ${calcularAnosDeVida(anoDeNascimento, anoAtual)} anos de vida")


}