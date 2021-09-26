package com.signition.settings;

import org.mineacademy.fo.settings.SimpleSettings;

public class Settings extends SimpleSettings {

    @Override
    protected int getConfigVersion() {
        return 1;
    }

    @Override
    protected boolean saveComments() {
        return super.saveComments();
    }

    private static void init() {

    }

}
