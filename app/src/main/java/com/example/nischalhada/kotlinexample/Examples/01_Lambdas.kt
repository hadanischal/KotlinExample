package com.example.nischalhada.kotlinexample.Examples

import com.example.nischalhada.kotlinexample.Utilities.Threading

object Lambdas {
    fun asyncNetworkCall(finished: (Boolean)->Unit) {
        Threading.async(task = {
            println("asyncNetworkCall starting...")
            Thread.sleep(2000)
            println("asyncNetworkCall finished")

            finished(true)
        })
    }

    fun localDBCall(authenticationBlock: (String)->Boolean) {
        //do some local work
        val userName = "Naruto Uzumaki"
        val isAuthorized = authenticationBlock(userName)
     }

}