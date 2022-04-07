package me.kodysimpson;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class DiscordBot {

    public static void main(String[] args) throws LoginException {

        JDA bot = JDABuilder.createDefault("NjQzOTI3MTQ4MTcxODg2NjIz.Xcsl4w.nhG77Y8Cks_NuAUFpy4fC782usk")
                .setActivity(Activity.playing("python merda"))
                .build();
    }
}
