package io.bitrise.kotlinresponsiveviewsactivity

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import io.bitrise.sample.Sample
import junit.framework.TestCase.fail
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class InstrumentedTest {

    @Test
    fun successful() {
        Sample().successfulFunctionality()
    }

    @Test
    fun flaky() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Sample().flakyEmulatorFunctionality(appContext)
    }

//    @Test
//    fun failing() {
//        fail()
//    }
}