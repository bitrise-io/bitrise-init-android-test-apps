package io.bitrise.kotlinresponsiveviewsactivity

import io.bitrise.sample.Sample
import junit.framework.TestCase.fail
import org.junit.Test

class UniTest {

    @Test
    fun successful() {
        Sample().successfulFunctionality()
    }

    @Test
    fun flaky() {
        Sample().flakyLocalFunctionality()
    }

//    @Test
//    fun failing() {
//        fail()
//    }
}