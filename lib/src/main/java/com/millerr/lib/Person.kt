package com.millerr.lib

fun main(){
    var p = Person()
    p.weight = 49f
    p.height = 1.52f
    println("your bmi is ${p.getBmi()}")
}

class Person {
    var weight: Float = 0f
    var height: Float = 0f

    public fun sayHello(){
        println("Hello!")
    }
    public fun getBmi(): Float{
        var bmi = weight / (height * height)
        return bmi
    }

}