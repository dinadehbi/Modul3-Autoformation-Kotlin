package com.example.kotlin_advance_concept

// Enum class pour la difficulté
enum class Difficulty {
    EASY, MEDIUM, HARD
}

// Classe générique Question
class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    println("${question1.questionText} (Difficulty: ${question1.difficulty}) Answer: ${question1.answer}")

    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    println("${question2.questionText} (Difficulty: ${question2.difficulty}) Answer: ${question2.answer}")

    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    println("${question3.questionText} (Difficulty: ${question3.difficulty}) Answer: ${question3.answer}")
}
