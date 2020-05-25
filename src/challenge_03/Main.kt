package challenge_03

/**
 * There are three types of typos that can be performed on strings: insert a character, remove a character, or replace a character.
 * Given two strings, write a function to check if they are one typo (or zero typos) away.
    Examples:
        pale, ple -> true
        pales, pale -> true
        pale, bale -> true
        pale, bake -> false
 */

fun main() {

    checkTypos("pale", "ple")
    checkTypos("pales", "pale")
    checkTypos("pale", "bale")
    checkTypos("pale", "bake")

}

fun checkTypos(baseSequence: String, validationSequence: String){


    if (baseSequence.length == validationSequence.length){
        println(checkTyposSameLengthChar(baseSequence,validationSequence))
    }else{
        println(checkTyposDiffLengthChar(baseSequence,validationSequence))
    }

}

/**
 * This function verify character's  errors of sequences with same amount of characters
 */
fun checkTyposSameLengthChar(baseSequence: String, validationSequence: String): Boolean {
    var differences = 0

    if (baseSequence.length == validationSequence.length) {
        for (char in baseSequence) {
            if (char !in validationSequence) {
                differences++
            }
        }
    }

    return when {
        differences == 1 -> true // digit error
        differences != 1 -> false // no digit error
        else -> true // digit error
    }

}

/**
 * This function evaluates based on number of different characters
 */
fun checkTyposDiffLengthChar(baseSequence: String, validationSequence: String): Boolean{
    var differences = 0

    if (baseSequence.length > validationSequence.length) {
        for (char in baseSequence) {
            if (char !in validationSequence) {
                differences++
            }
        }
    }

    if (baseSequence.length < validationSequence.length) {
        for (char in baseSequence) {
            if (char !in validationSequence) {
                differences++
            }
        }
    }

    return when {
        differences == 1 -> true // digit error
        differences > 1 -> false // no digit error
        else -> true // digit error
    }

}