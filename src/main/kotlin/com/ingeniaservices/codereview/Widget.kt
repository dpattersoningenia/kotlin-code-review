package com.ingeniaservices.codereview

class Widget {

    fun a(s: String): String {
        val words = s.split(" ").count()
        val lines = s.split("\n").count()
        var letters = 0

        s.forEach {
            if (it.isLetter())
                letters++
        }

        return "There are $lines lines, $words words, and $letters letters."
    }
}
