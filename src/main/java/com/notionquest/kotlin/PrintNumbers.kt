package com.notionquest.kotlin

fun main(args : Array<String>) {
    for (i in 1..3) {
        println(i)
    }
    val x: IntArray = intArrayOf(1, 2, 3)

    x.forEach { println() }

}