/**
 * 1. Replacing characters in place:
Given an array of characters, write a method to replace all the spaces with “&32”.
You may assume that the array has sufficient slots at the end to hold the additional
characters, and that you are given the “true” length of the array. (Please perform this
operation in place with no other auxiliary structure).
Example:
Input: “User is not allowed “, 19
Output: “User&32is&32not&32allowed”
 */


package challenge_01

fun main() {
    val input = "User is not allowed      "

    println(replaceWhiteCharacters(input))
}


fun replaceWhiteCharacters(stringToBeReplaced: String): String {

    var result = ""

    // check array and replace when needed
    for ((index, value) in stringToBeReplaced.withIndex()) {

        // check if it is the first position of array to avoid error
        if (index == 0) {
            if (value == ' ') {
                result = result.plus("")
            } else {
                result = result.plus(value.toString())
            }
        } else {
            // check the value after and before of array position
            if (stringToBeReplaced[index - 1] != ' ' && stringToBeReplaced[index + 1] != ' ' && value == ' ') {
                result = result.plus("&32")
            } else if (value == ' ') {
                result = result.plus("")
            } else {
                result = result.plus(value.toString())
            }
        }

    }

    return result
}