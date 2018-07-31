package com.example.nischalhada.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        runChallenge()
    }

    private fun runChallenge() {
        val names = listOf("Schultz", "Cuevas", "Rhodes", "Mckenzie", "Taylor", "Glenn", "Reilly", "Morris", "Herman", "Beltran", "Swanson", "Roth")
        val challenge = Challenge()
        val result = challenge.process(names)

        println(result)
    }

}
