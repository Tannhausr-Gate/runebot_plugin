package com.example.runebotconnect;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("runebotconnect")
public interface RuneBotConnectConfig extends Config
{
    @ConfigItem(
            keyName = "linkToken",
            name = "Discord Link Token",
            description = "The link token given to you by RuneBot or a clan leader."
    )
    default String linkToken()
    {
        return "";
    }
}