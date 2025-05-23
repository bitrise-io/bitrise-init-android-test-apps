package io.bitrise.sample

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
}