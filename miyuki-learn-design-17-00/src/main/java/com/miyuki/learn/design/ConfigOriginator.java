package com.miyuki.learn.design;

/**
 * @author: miyuki
 * @description: 记录者类
 * @date: 2023/9/17 21:04
 * @version: 1.0
 */
public class ConfigOriginator {

    private ConfigFile configFile;

    public ConfigFile getConfigFile() {
        return configFile;
    }

    public void setConfigFile(ConfigFile configFile) {
        this.configFile = configFile;
    }

    public ConfigMemento saveMemento() {
        return new ConfigMemento(configFile);
    }

    public void getMemento(ConfigMemento memento) {
        this.configFile = memento.getConfigFile();
    }
}
