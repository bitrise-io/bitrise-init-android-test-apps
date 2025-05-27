package io.bitrise.sample

import android.content.Context
import java.io.File

class Sample {
    fun successfulFunctionality() {
        println("I'm doing things")
    }

    fun flakyLocalFunctionality() {
        try {
            val marker = java.nio.file.Paths.get("marker.file")
            if (!java.nio.file.Files.exists(marker)) {
                java.nio.file.Files.write(marker, "mark".toByteArray())
                throw RuntimeException("fail me!")
            }
            java.nio.file.Files.write(marker, "again".toByteArray())
        } catch (e: java.io.IOException) {
            throw java.io.UncheckedIOException(e)
        }
    }

    fun flakyEmulatorFunctionality(context: Context) {
        val file = File(context.filesDir, "testfile.txt")
        if (!file.exists()) {
            file.writeText("marker")
            throw RuntimeException("fail me!")
        }
    }
}