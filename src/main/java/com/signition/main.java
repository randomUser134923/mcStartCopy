package com.signition;

import com.signition.commands.AdminCommand;
import com.signition.listener.ChatListener;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;

public class main extends SimplePlugin {

    @Override
    protected void onPluginStart() {
        Common.log("&aEnabling Signition Startcopy");
        registerCommand(new AdminCommand());

        registerEvents(new ChatListener());
    }


}
