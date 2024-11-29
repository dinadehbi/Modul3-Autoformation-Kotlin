package com.example.advanced_concept_kotlin

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)
val cookies = listOf(
    Cookie(
        name = "Chocolate Chips" ,
        softBaked = false ,
        hasFilling = false ,
        price = 1.69
    ),
    Cookie(
        name = "Banan Walnut" ,
        softBaked = true ,
        hasFilling = false ,
        price = 1.49
    ),
    Cookie(
        name = "Chocolate Peanut Butter" ,
        softBaked = false ,
        hasFilling = true ,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)
fun main(){
    val alphabetMenu = cookies.sortedBy {
        it.name
    }
    alphabetMenu.forEach {
        println(it.name)
    }
}