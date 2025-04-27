package com.vasifgumbatov.androidbootcamp.odev_2

//1

fun selsiToFarenheit(selsi: Double): Double {
    return (selsi * 1.8) + 32
}

//2
fun dortkenPerimetr(shortEdge: Int, longEdge: Int): Int {
    return 2 * (shortEdge + longEdge)
}

//3
fun factorial(number: Int): Int {
    var result = 1
    for (i in 1..number) {
        result *= i
    }
    return result
}

//4
fun countLetterA(word: String): Int {
    return word.count { it == 'a' || it == 'A' }
}

//5
fun sumOfInteriorAngles(numberOfSides: Int): Int {
    return (numberOfSides - 2) * 180
}

//6
fun calculateSalary(daysWorked: Int): Int {
    val totalHours = daysWorked * 8
    return if (totalHours <= 160) {
        totalHours * 10
    } else {
        (160 * 10) + ((totalHours - 160) * 20)
    }
}

//7
fun calculateQuotaFee(kota: Int): Int {
    return if (kota <= 50) {
        100
    } else {
        100 + ((kota - 50) * 4)
    }
}
