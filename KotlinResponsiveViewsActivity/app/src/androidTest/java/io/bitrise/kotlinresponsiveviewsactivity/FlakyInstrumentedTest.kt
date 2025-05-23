package io.bitrise.kotlinresponsiveviewsactivity

import androidx.test.ext.junit.runners.AndroidJUnit4
import io.bitrise.sample.Sample
import junit.framework.TestCase.fail
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class FlakyInstrumentedTest {

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