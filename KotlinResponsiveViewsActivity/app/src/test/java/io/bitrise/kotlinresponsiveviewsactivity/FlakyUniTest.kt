package io.bitrise.kotlinresponsiveviewsactivity

import io.bitrise.sample.Sample
import junit.framework.TestCase.fail
import org.junit.Test

class FlakyUniTest {

    @Test
    fun successful() {
        Sample().otherFunctionality()
    }

    @Test
    fun flaky() {
        Sample().functionality()
    }

    @Test
    fun failing() {
        fail()
    }
}