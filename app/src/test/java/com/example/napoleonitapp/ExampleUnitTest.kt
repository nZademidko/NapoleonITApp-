package com.example.napoleonitapp

import com.example.napoleonitapp.data.dataClass.Event
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun start() {

        runBlocking {
            launch {
                print("Hello")
                testFunc()
            }
        }
    }

    suspend fun testFunc(){
        delay(1000)
        print("Hello")
    }
}