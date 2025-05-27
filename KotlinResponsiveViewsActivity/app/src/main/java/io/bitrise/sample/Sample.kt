package io.bitrise.sample

import android.content.Context
import android.content.Context.MODE_PRIVATE

class Sample {
    fun functionality() {
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

    fun otherFunctionality() {
        println("I'm doing things")
    }

    fun anotherFunctionality(context: Context) {
        val sharedPreferences = context.getSharedPreferences("UserPreferences", MODE_PRIVATE)
        val marker = sharedPreferences.getInt("marker", 0)
        if (marker == 0) {
            val editor = sharedPreferences.edit()
            editor.putInt("marker", 1)
            editor.apply()
            throw RuntimeException("fail me!")
        }
    }
}