package fr.flo504.tagname;

import org.bukkit.plugin.java.JavaPlugin;

public class TagNamePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        TagAPI.load();
    }
}
