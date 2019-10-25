package com.simonsays

import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.entities.Activity
import kotlin.io.*

fun main(args: Array<String>) {
    println("Hello, World")
    var activity = Activity.watching("PornHub");
    var jda = JDABuilder("NDQyMzQ0NjQ0NzUyNDQxMzY1.XbNKIw.kEi2zWwQ9EC2vfQnj-zaJjDDnto")
        .setActivity(activity)
        .build()
}

fun getGreeting() : String {
    return "Hello"
}