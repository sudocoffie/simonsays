package com.simonsays

import net.dv8tion.jda.api.events.message.MessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

class MessageListener  : ListenerAdapter() {
    override fun onMessageReceived(event : MessageReceivedEvent) {
        if (!event.isFromGuild) return;
        if (!event.message.contentRaw.startsWith("!join")) return;

        // Get voice channel and audio manager
        var vc = event.guild.getVoiceChannelsByName("music", true).get(0);
        var am = event.guild.audioManager

        event.guild.textChannels?.get(0).sendMessage("OlltardBot has joined the party!").queue()
        am.openAudioConnection(vc);
    }
}
