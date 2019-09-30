package model

class BaseAsync<T>(
    val quandoIncia: () -> T,
    val quandoFinaliza: (resultado: T) -> Unit
) {

    fun onBackground(): T {
        return quandoIncia()
    }

    fun onPostExecute(resultado: T): Unit {
        quandoFinaliza(resultado)
    }

    fun execute() {
        val result = onBackground()
        onPostExecute(result)
    }


}