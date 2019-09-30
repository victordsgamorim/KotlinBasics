import model.BaseAsync
import model.Test

val test = Test("Victor")
val test2 = Test("Victor")

fun main() {
    hashCodeAndEquals()
    primeraFuncao()
}

private fun hashCodeAndEquals() {
    val list = listOf<Test>(test)

    for (item in list) {
        if (list.contains(test) && list.contains((test2))) {
            println("Yes")
        } else {
            println("No")
        }
    }
}

private fun HOF() {
    val lista = listOf<String>("Victor", "Amorim")
    val baseAsync = BaseAsync(quandoIncia = { lista }, quandoFinaliza = { it })

    val onBackground: List<String> = baseAsync.onBackground()
    val onPostExecute = baseAsync.onPostExecute(onBackground)


}

private fun primeraFuncao() {
    segundaFuncao {
        for (item in it) {
            println(item)
        }
    }
}

private fun segundaFuncao(executar: (List<String>) -> Unit) {
    val lista = listOf("Victor", "Amorim")
    val baseAsync = BaseAsync(
        quandoIncia = { lista },
        quandoFinaliza = { executar }
    ).execute()
}

private fun terceiraFuncao(quandoInicia: () -> Any, quandoFinaliza: (any: Any?) -> Unit) {
    quandoInicia()
    quandoFinaliza(quandoInicia())
}



