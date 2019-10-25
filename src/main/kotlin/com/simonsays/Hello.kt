package com.simonsays

import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.entities.Activity

fun main(args: Array<String>) {
    var jda = JDABuilder("NDQyMzQ0NjQ0NzUyNDQxMzY1.XbNaXA.qgvMIrgOLgd2Nq4ZC196sDEYq8k").setActivity(Activity.watching("PornHub")).build()

    jda.addEventListener(MessageListener())
}
