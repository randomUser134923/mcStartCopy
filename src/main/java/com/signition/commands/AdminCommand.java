package com.signition.commands;

import org.mineacademy.fo.Common;
import org.mineacademy.fo.command.SimpleCommand;
import org.mineacademy.fo.plugin.SimplePlugin;
import org.mineacademy.fo.settings.SimpleLocalization;

import java.util.ArrayList;
import java.util.List;

public class AdminCommand extends SimpleCommand {

    public AdminCommand() {
        super("chatadmin");
        setPermission("op.op");
    }

    @Override
    protected void onCommand() {
        if ( "reload".equals(args[0])) {
            try {
                SimplePlugin.getInstance().reload();
                Common.tell(getPlayer(), "&aReload Success");
            } catch (final Throwable t) {
                t.printStackTrace();
                tell(SimpleLocalization.Commands.RELOAD_FAIL.replace("{error}", t.toString()));
            }
        }
    }

    @Override
    protected List<String> tabComplete() {
        switch(args.length) {
            case 1:
                return completeLastWord("reload");

        }
        return new ArrayList<>();
    }

}
