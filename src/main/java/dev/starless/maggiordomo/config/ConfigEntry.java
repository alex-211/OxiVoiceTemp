package dev.starless.maggiordomo.config;

import dev.starless.maggiordomo.Main;

public enum ConfigEntry {

    CONFIG_VERSION("config_version", Main.getVersion()), // Config version needs to be decided, I have no idea yet, will read documentation 
    TOKEN("MTExNDY5NzE1OTgwMDAwODg4NA.GeVqrD.geq19m7PKSLw4aKZWnNgwMBgJHlyh5IR5eNzR8", "discord-bot-token"),
    MONGO("mongo", "mongodb://");

    private final String path;
    private final Object defaultValue;

    ConfigEntry(String path, Object defaultValue) {
        this.path = path;
        this.defaultValue = defaultValue;
    }

    public String getPath() {
        return path;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }
}

