package com.mouredev.weeklychallenge2022

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Fecha publicación enunciado: 03/01/22
 * Fecha publicación resolución: 10/01/22
 * Dificultad: MEDIA
 *
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

// Solution

/*fun main() {
    println(isAnagram("amor", "roma"))
}

private fun isAnagram(wordOne: String, wordTwo: String): Boolean {
    if (wordOne.lowercase() == wordTwo.lowercase()) {
        return false
    }
    return wordOne.lowercase().toCharArray().sortedArray().contentEquals(wordTwo.lowercase().toCharArray().sortedArray())
}*/

// My solution

fun main() {
    println(if (isAnAnagram("Pagar", "praga")) "Is an anagram" else "Is not an anagram")

}

fun isAnAnagram(firstWord: String, secondWord: String): Boolean {

    if (firstWord.length != secondWord.length || firstWord.lowercase() == secondWord.lowercase()) return false

    val lettersFirstWord = mutableMapOf<Char, Int>()
    val lettersSecondWord = mutableMapOf<Char, Int>()

    /*firstWord.lowercase().forEach {

        if (lettersFirstWord.contains(it)) {
            lettersFirstWord[it] = lettersFirstWord[it]!! + 1
        } else {
            lettersFirstWord[it] = 1
        }
    }

    secondWord.lowercase().forEach {

        if (lettersSecondWord.contains(it)) {
            lettersSecondWord[it] = lettersSecondWord[it]!! + 1
        } else {
            lettersSecondWord[it] = 1
        }
    }*/

    firstWord.lowercase().zip(secondWord.lowercase()).forEach {

        if (lettersFirstWord.contains(it.component1())) {
            lettersFirstWord[it.component1()] = lettersFirstWord[it.component1()]!! + 1
        } else {
            lettersFirstWord[it.component1()] = 1
        }

        if (lettersSecondWord.contains(it.component2())) {
            lettersSecondWord[it.component2()] = lettersSecondWord[it.component2()]!! + 1
        } else {
            lettersSecondWord[it.component2()] = 1
        }
    }

    println(lettersFirstWord)
    println(lettersSecondWord)

    return lettersFirstWord == lettersSecondWord

}