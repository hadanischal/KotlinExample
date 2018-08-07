package com.example.nischalhada.kotlinexample.Examples

object Examples {
    fun run() {
        runLambdaExamples()
        runExceptionExamples()
        runInterfaceExamples()
        runInheritanceExamples()
        runEnumClassesExamples()
        runGenericsExamples()
        runExtensionExamples()
        runJavaInteropExamples()
    }
}

//region Examples

private fun runLambdaExamples(){
    println("~~NetworkCall~~")
    Lambdas.asyncNetworkCall { successful ->
        val message = if(successful) "success" else "failure"

        println("message: $message")
    }
    println("~~LocalDBCall~~")
    Lambdas.localDBCall { authenticate(it) }

    println("~~runLambdaExamples finished~~")
}

private fun runExceptionExamples() {

}

private fun runInterfaceExamples() {

}

private fun runInheritanceExamples() {
}

private fun runEnumClassesExamples() {

}


private fun runGenericsExamples() {

}

private fun runExtensionExamples() {

}

private fun runJavaInteropExamples() {

}

//endregion

//region helper methods
fun authenticate(result: String): Boolean = result == "Naruto Uzumaki"
//endregion
